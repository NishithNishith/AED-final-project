/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    
    public boolean checkStringAndNumber(String toCheck){
        var PATTERN = "^[a-zA-Z0-9]+$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(toCheck);
 
        if(!match.matches()){
            return false;
        }
        else
         return true;
    }
    
    public boolean checkNumber(String toCheck){
                        var PATTERN = "[0-9]+";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(toCheck);
        if(!match.matches()){
            return false;
        }
        else
         return true;
    } 
    
}
