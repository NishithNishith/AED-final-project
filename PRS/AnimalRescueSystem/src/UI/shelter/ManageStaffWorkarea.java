/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.shelter;

import business.ecosystem.Business;
import business.ecosystem.UserAccount;
import business.ecosystem.UserAccountDirectory;
import business.shelter.ShelterManager;
import business.shelter.ShelterManagerDirectory;
import business.shelter.ShelterStaff;
import business.shelter.ShelterStaffDirectory;
import business.validations.Validations;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author nishi
 */
public class ManageStaffWorkarea extends javax.swing.JPanel {

    /**
     * Creates new form ManageStaffWorkarea
     */
    
    Validations validations;

    javax.swing.JSplitPane splitpane;
    Business system;
    
    public ManageStaffWorkarea(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        this.splitpane = splitpane;
        this.system = system;
        this.validations = new Validations();
//        this.shelterStaffDirectory = system.getShelterStaffDirectory();

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtExp = new javax.swing.JTextField();
        txtPhno = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtViewStaff = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnBack2 = new javax.swing.JButton();
        cboGender = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage staff");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create staff");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 53, 81));
        jLabel3.setText("Firstname:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 53, 81));
        jLabel4.setText("Lastname:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 53, 81));
        jLabel5.setText("Age:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 53, 81));
        jLabel7.setText("Experience:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 53, 81));
        jLabel8.setText("Phone Number:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 53, 81));
        jLabel9.setText("Salary:");

        txtLastname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtExp.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPhno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSave.setBackground(new java.awt.Color(17, 53, 81));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtViewStaff.setBackground(new java.awt.Color(17, 53, 81));
        txtViewStaff.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtViewStaff.setForeground(new java.awt.Color(255, 255, 255));
        txtViewStaff.setText("View Staff");
        txtViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewStaffActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 53, 81));
        jLabel10.setText("Email:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 53, 81));
        jLabel11.setText("Password:");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnBack2.setBackground(new java.awt.Color(17, 53, 81));
        btnBack2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        cboGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        cboGender.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(538, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword)
                                    .addComponent(txtPhno)
                                    .addComponent(txtSalary)
                                    .addComponent(txtEmail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtLastname)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(176, 176, 176)
                .addComponent(txtViewStaff)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewStaff)
                    .addComponent(btnBack2))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
            String firstname = txtFirstname.getText();
            String lastname = txtLastname.getText();
            String age = txtAge.getText();
            String gender = cboGender.getSelectedItem()+"";
            String exp = txtExp.getText();
            String phonenumber = txtPhno.getText();
            String salary = txtSalary.getText();
            String email = txtEmail.getText();
            String password = txtPassword.getText();

            if(!validations.lengthCheck(firstname) ||!validations.lengthCheck(lastname) ||
                    !validations.lengthCheck(age) ||!validations.lengthCheck(gender)
                    || !validations.lengthCheck(exp) || !validations.lengthCheck(phonenumber)
                    || !validations.lengthCheck(salary) || !validations.lengthCheck(email) 
                    || !validations.lengthCheck(password))
            {
                JOptionPane.showMessageDialog(this, "Enter valid details for Manager");
                return;
            }
            
            if(!validations.numberCheck(age) || !validations.numberCheck(exp) || !validations.numberCheck(salary) ){
                JOptionPane.showMessageDialog(this, "Enter valid details for Manager");
                return;
            }
            
            if(!validations.emailCheck(email)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Email");
                return;
            }
            
            if(!validations.passwordCheck(password)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Password");
                return;
            }
            
            if(!validations.ageCheck(age)){
                JOptionPane.showMessageDialog(this, "Enter valid details for age");
                return;
            }
            
            if(!validations.phoneCheck(phonenumber)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Phone Number");
                return;
            }

             //Unique check
            int uniqueFlag = 0;
            UserAccount ua = system.getUserAccountDirectory().userCheck(email, password);
            if(ua != null){
                uniqueFlag = 1;
            }

            if(uniqueFlag == 1){
                System.out.println("User Account is present");
                JOptionPane.showMessageDialog(this, "Email already present");
                return;

            }
            //Unique Check

            

            ShelterStaff shelterStaff = system.getShelterStaffDirectory().addShelterStaff();

            String uniqueField = UUID.randomUUID().toString();
            
            UserAccount userAccount = system.getUserAccountDirectory().addNewUserAccount();
            userAccount.setEmail(email);
            userAccount.setPassword(password);
            userAccount.setRole("ShelterStaff");
            userAccount.setUserAccountId(uniqueField);
            
            shelterStaff.setShelterStaffId(uniqueField);
            shelterStaff.setFirstName(firstname);
            shelterStaff.setLastName(lastname);
            shelterStaff.setAge(Integer.parseInt(age));
            shelterStaff.setGender(gender);
            shelterStaff.setYearsOfExperience(Integer.parseInt(exp));
            shelterStaff.setPhoneNumber(phonenumber);
            shelterStaff.setSalary(Integer.parseInt(salary));

            JOptionPane.showMessageDialog(this, "Staff created"+ shelterStaff);
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Issue while creating staff, try again "+err);
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewStaffActionPerformed
        // TODO add your handling code here:
        ViewStaffJPanel panel = new ViewStaffJPanel(splitpane, system);
        splitpane.setRightComponent(panel);
        
    }//GEN-LAST:event_txtViewStaffActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:

        if(system.getCurrentRole().equals("ShelterAdmin")){
            ShelterAdmin panel = new ShelterAdmin(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else if(system.getCurrentRole().equals("ShelterManager")){
            ShelterManagerWorkarea panel = new ShelterManagerWorkarea(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else if(system.getCurrentRole().equals("Accountant")){
            AccountingWorkarea panel = new AccountingWorkarea(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else{
            StaffWorkarea panel = new StaffWorkarea(splitpane, system);
            splitpane.setRightComponent(panel);
        }

        
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhno;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JButton txtViewStaff;
    // End of variables declaration//GEN-END:variables
}
