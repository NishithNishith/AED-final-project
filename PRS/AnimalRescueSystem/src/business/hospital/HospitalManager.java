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
public class HospitalManager extends Person{
    
    String hospitalManagerId;
    int yearsOfExperience;
    int phoneNumber;
    float salary;
    String userName;
    //public Object getUserName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
   
    public String getHospitalManagerId() {
        return hospitalManagerId;
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

    public void setHospitalManagerId(String hospitalManagerId) {
        this.hospitalManagerId = hospitalManagerId;
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
