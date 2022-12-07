/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.db4O;

/**
 *
 * @author nishi
 */

import business.ecosystem.Business;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

public class DatabaseUtils {
    
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DatabaseUtils dB4OUtil;
    
     public synchronized static DatabaseUtils getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DatabaseUtils();
        }
        return dB4OUtil;
    }
    
    private ObjectContainer createConnection() {

        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().add(new TransparentPersistenceSupport());
        //Controls the number of objects in memory
        config.common().activationDepth(Integer.MAX_VALUE);
        //Controls the depth/level of updation of Object
        config.common().updateDepth(Integer.MAX_VALUE);

        //Register your top most Class here
        config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save
        try {
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }
    
    
    public synchronized void storeSystem(Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Business retrieveSystem() {
        ObjectContainer conn = null;
        try {
            conn = createConnection();
            Business proto = Business.getInstance();
            ObjectSet<Business> systems = conn.queryByExample(proto); // Change to the object you want to save
            Business system = null;
            if (systems.size() == 0) {
//                system = ConfigureABusiness.configure();  // If there's no System in the record, create a new one
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            conn.close();
        }
        return null;
    }
    
}