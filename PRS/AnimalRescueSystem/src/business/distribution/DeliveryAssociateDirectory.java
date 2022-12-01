/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.distribution;
import business.population.Person;
import java.util.ArrayList;

/**
 *
 * @author adity
 */

public class DeliveryAssociateDirectory {
    
    public ArrayList<DeliveryAssociate> deliveryAssociateDirectory;
    
    public DeliveryAssociateDirectory() {
    deliveryAssociateDirectory = new ArrayList<DeliveryAssociate>();
    }
    
    public ArrayList<DeliveryAssociate> getDeliveryAssociate() {
        return  deliveryAssociateDirectory;
    }
    
    public void setDeliveryAssociate(ArrayList<DeliveryAssociate> deliveryAssociateDirectory){
        this.deliveryAssociateDirectory = deliveryAssociateDirectory; 
    }
    
    public void deleteDeliveryAsociate (DeliveryAssociate deliveryAssociate) {
        
        deliveryAssociateDirectory.remove(deliveryAssociate);
    }
    
    public DeliveryAssociate addDeliveryAssociate(String personID, String name, int age, String gender, String dateOfBirth, int deliveryAssociateID, String phoneNumber, String workStatus, String nameOfDA){
        DeliveryAssociate deliveryAssociate = new DeliveryAssociate(personID, name, age, gender, dateOfBirth, deliveryAssociateID, phoneNumber, workStatus, nameOfDA);
        deliveryAssociateDirectory.add(deliveryAssociate);
        return deliveryAssociate;
    }
    
}
