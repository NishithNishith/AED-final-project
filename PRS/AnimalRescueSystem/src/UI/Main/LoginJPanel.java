/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Main;

import UI.Hospital.ManageEncounterJPanel;
import UI.Population.ReportJPanel;
import UI.shelter.ManageStaffWorkarea;
import UI.shelter.ShelterAdmin;
import UI.shelter.StaffWorkarea;
import business.db4O.DatabaseUtils;
import business.ecosystem.Business;
import business.ecosystem.ConfigSystem;
import business.ecosystem.UserAccount;
import business.ecosystem.UserAccountDirectory;
import business.population.Reporter;
import business.validations.Validations;
import java.util.UUID;
import javax.swing.JOptionPane;


/**
 *
 * @author nishi
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    javax.swing.JSplitPane splitpane;
    Validations validations;
    UserAccountDirectory userAccountDirectory;
    Business system;
    DatabaseUtils dB4OUtil = DatabaseUtils.getInstance();
    ConfigSystem config;
    
    public LoginJPanel(javax.swing.JSplitPane splitpane) {
        initComponents();
        this.splitpane = splitpane;
//        this.dB4OUtil
        this.system = dB4OUtil.retrieveSystem();    
        this.validations = new Validations();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtShelterAdmin3 = new javax.swing.JButton();

        jLabel1.setText("Login");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtShelterAdmin3.setText("Shelter Admin");
        txtShelterAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShelterAdmin3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(txtPassword))))
                .addGap(28, 28, 28)
                .addComponent(txtShelterAdmin3)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtShelterAdmin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            
            if(!validations.lengthCheck(email) ||!validations.lengthCheck(password))
            {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
                return;
            }

            
          UserAccount userAccount = system.getUserAccountDirectory().userCheck(email, password);
      
            if(userAccount == null){
                System.out.println("User not found");
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
                return;
                
            } 
            else 
            {
                String role = userAccount.getRole();
                
                if(role.equals("Doctor")){
//                    ManageEncounterJPanel panel = new ManageEncounterJPanel(splitpane);
//                    splitpane.setRightComponent(panel);
                }
                else if(role.equals("ShelterStaff")){
                    StaffWorkarea panel = new StaffWorkarea(splitpane, system);
                    splitpane.setRightComponent(panel);
                }
                else if(role.equals("Accountant")){
                    
                }
                else if(role.equals("Reporter")){
                    ReportJPanel panel = new ReportJPanel(splitpane, system);
                    splitpane.setRightComponent(panel);
                    
                }
                else if(role.equals("ShelterManager")){
                    ManageStaffWorkarea panel = new ManageStaffWorkarea(splitpane, system);
                    splitpane.setRightComponent(panel);
                }
                else if(role.equals("ShelterAdmin")){
                    ShelterAdmin panel = new ShelterAdmin(splitpane, system);
                    splitpane.setRightComponent(panel);
                }
                else if(role.equals("HospitalAdmin")){
                     
                }
                else if(role.equals("DistributionAdmin")){
                    
                }
                
                
            }

            
        }
        catch(Exception e){
            System.out.println("Login Error, try again "+e);
            JOptionPane.showMessageDialog(this, "Login Error, try again");
            return;
        }
           
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtShelterAdmin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShelterAdmin3ActionPerformed
        // TODO add your handling code here:
        ShelterAdmin panel = new ShelterAdmin(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtShelterAdmin3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JButton txtShelterAdmin3;
    // End of variables declaration//GEN-END:variables
}
