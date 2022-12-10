/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

/**
 *
 * @author sinchanakumar
 */
public class Encounter {
    String id;
    String patientId;
    String desc;
    String prescription;
    int heartRate;
    int respiratoryRate;
    int Temperature;
    int weight;
    int height;
    int bloodPressure;

    public int getHeartRate() {
        return heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public int getTemperature() {
        return Temperature;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    

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
