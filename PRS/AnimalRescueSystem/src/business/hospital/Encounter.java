/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

/**
 *
 * @author sinchanakumar
 */
public class Encounter extends VitalSigns{
    String id;
    String patientId;
    String desc;
    String prescription;

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDesc() {
        return desc;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    
}
