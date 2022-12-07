/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ecosystem;

/**
 *
 * @author nishi
 */
public class ConfigSystem {
    public static Business configure(){
        
        Business system = Business.getInstance();
       
        UserAccount user = system.userAccountDirectory.addNewUserAccount();
        user.setEmail("email");
        user.setPassword("pass");
        user.setRole("Manager");
        
        
//        Business employee = system.getEmployeeDirectory().createEmployee("RRH");
//        
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        
        return system;
    }
    
}
