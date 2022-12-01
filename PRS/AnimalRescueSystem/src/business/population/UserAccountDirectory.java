/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.population;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount addNewUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void removeUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
    
    
}
