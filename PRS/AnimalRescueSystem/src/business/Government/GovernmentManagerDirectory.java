/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Government;

import business.hospital.Doctor;
import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class GovernmentManagerDirectory {
    ArrayList<GovernmentManager> governmentManagerrList;
    
    public GovernmentManagerDirectory(){
        governmentManagerrList = new ArrayList<GovernmentManager>();
    }

    public ArrayList<GovernmentManager> getGovernmentManagerList() {
        return governmentManagerrList;
    }

    public void setGovernmentManagerList(ArrayList<GovernmentManager> governmentManagerrList) {
        this.governmentManagerrList = governmentManagerrList;
    }
    
    public GovernmentManager addNewGovernmentManager(){
        GovernmentManager governmentManager = new GovernmentManager();
        governmentManagerrList.add(governmentManager);
        return governmentManager;
    }
    
    public void removeGovernmentManager(GovernmentManager governmentManager){
        governmentManagerrList.remove(governmentManager);
    }
    
}
