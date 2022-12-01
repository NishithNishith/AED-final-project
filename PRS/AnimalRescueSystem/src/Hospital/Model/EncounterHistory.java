/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Model;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class EncounterHistory {
    
    String patientId;
    ArrayList<Encounter> encounterHistory ;
    
    public EncounterHistory(){
        encounterHistory = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterList() {
        return encounterHistory;
    }

    public void setEncounterList(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(){
        Encounter enc = new Encounter();
        encounterHistory.add(enc);
        return enc;
    }
    
    public void removeEncounter(Encounter enc){
        encounterHistory.remove(enc);
    }
    
    
}
