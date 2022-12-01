/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ecosystem;

import business.hospital.DoctorDirectory;
import business.hospital.EncounterHistory;
import business.hospital.HospitalManagerDirectory;
import business.population.PersonDirectory;
import business.population.ReportDirectory;
import business.population.UserAccountDirectory;

/**
 *
 * @author nishi
 */
public class Business {
    
    Business business;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    HospitalManagerDirectory hospitalManagerDirectory;
    EncounterHistory encounterHistory;
    UserAccountDirectory userAccountDirectory;
    ReportDirectory reportDirectory;

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public HospitalManagerDirectory getHospitalManagerDirectory() {
        return hospitalManagerDirectory;
    }

    public void setHospitalManagerDirectory(HospitalManagerDirectory hospitalManagerDirectory) {
        this.hospitalManagerDirectory = hospitalManagerDirectory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public ReportDirectory getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ReportDirectory reportDirectory) {
        this.reportDirectory = reportDirectory;
    }
    
    
    
    
}
