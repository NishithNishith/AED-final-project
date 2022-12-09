/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.distribution;
import business.population.Person;

/**
 *
 * @author adity
 */
public class DeliveryAssociate extends Person{
    
    public int deliveryAssociateID;
    public String phoneNumber;
    public String workStatus;
    public String nameOfDA;    

    public int getDeliveryAssociateID() {
        return deliveryAssociateID;
    }

    public void setDeliveryAssociateID(int deliveryAssociateID) {
        this.deliveryAssociateID = deliveryAssociateID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getNameOfDA() {
        return nameOfDA;
    }

    public void setNameOfDA(String nameOfDA) {
        this.nameOfDA = nameOfDA;
    }
    
            @Override
    public String toString(){
        return nameOfDA;
    }
    

}
