/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import business.population.Person;

/**
 *
 * @author nishi
 */
public class Doctor extends Person {
    
    String doctorId;
    int yearsOfExperience;
    int phoneNumber;
    float salary;
    String UserName;
    String Specilization;

    public String getUserName() {
        return UserName;
    }

    public String getSpecilization() {
        return Specilization;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setSpecilization(String Specilization) {
        this.Specilization = Specilization;
    }
    

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
}
