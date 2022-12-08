/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.validations;

/**
 *
 * @author nishi
 */
public class Validations {
    
    public boolean lengthCheck(String val){
        
        
        if(val.length()<=0 || val.length()>30){
            return false;
        }
        
        return true;
    }
    
    public boolean numberCheck(String val) {

        try {
            int temp = Integer.parseInt(val);
        } catch (Exception err) {
            return false;
        }

        return true;
    }
    
    public boolean emailCheck(String val) {

        

        return true;
    }
    
    public boolean passwordCheck(String val) {

        

        return true;
    }
    
}
