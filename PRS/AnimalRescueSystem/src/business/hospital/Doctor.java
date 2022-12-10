/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import business.population.Person;

/**
 *
 * @author sinchanakumar
 */
public class Doctor extends Person {
    
    String doctorId;
    int yearsOfExperience;
    int phoneNumber;
    float salary;
    String userName;
    String Specilization;

    public String getSpecilization() {
        return Specilization;
    }

    public void setSpecilization(String Specilization) {
        this.Specilization = Specilization;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    

    public String getDoctorId() {
        return doctorId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    
}
