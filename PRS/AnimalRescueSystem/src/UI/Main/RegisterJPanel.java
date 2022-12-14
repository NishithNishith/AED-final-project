/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Main;

import UI.shelter.StaffWorkarea;
import business.db4O.DatabaseUtils;
import business.ecosystem.Business;
import business.ecosystem.Mail;
import business.ecosystem.UserAccount;
import business.ecosystem.UserAccountDirectory;
import business.population.ReportDirectory;
import business.population.Reporter;
import business.population.ReporterDirectory;
import business.validations.Validations;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import javax.mail.Session;
import javax.swing.JOptionPane;

/**
 *
 * @author nishi
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    
    Validations validations;
    ReporterDirectory reporterDirectory;
//    UserAccountDirectory userAccountDirectory;
    javax.swing.JSplitPane splitpane;
    
    Business system;
    DatabaseUtils dB4OUtil = DatabaseUtils.getInstance();
    String code;
    int registerFlag;
    UserAccount user;
    Reporter rep;
    
    public RegisterJPanel(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        validations = new Validations();
        this.splitpane = splitpane;
        this.system = system;
//        this.system = dB4OUtil.retrieveSystem();
        this.code = "";
        this.registerFlag = 0;
        this.user = null;
        this.rep = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPhno = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        cboGender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCode = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnOtp = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 53, 81));
        jLabel3.setText("Lastname");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 53, 81));
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 53, 81));
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Phone Number");

        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtLastname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPhno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnRegister.setBackground(new java.awt.Color(17, 53, 81));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 53, 81));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 53, 81));
        jLabel8.setText("Password");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cboGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        cboGender.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("Firstname");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/pawprints.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/pawprints.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 53, 81));
        jLabel11.setText("Enter Code");

        btnOtp.setBackground(new java.awt.Color(17, 53, 81));
        btnOtp.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnOtp.setForeground(new java.awt.Color(255, 255, 255));
        btnOtp.setText("Submit OTP");
        btnOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(1, 1, 1)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtPhno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOtp, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))))
                .addGap(123, 123, 123)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addComponent(btnOtp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        // TODO add your handling code here:
        
        try{
            String firstname = txtFirstname.getText();
            String lastname = txtLastname.getText();
            String age = txtAge.getText();
            String gender = cboGender.getSelectedItem()+"";
            String phonenumber = txtPhno.getText();
            String email = txtEmail.getText();
            String password = txtPassword.getText();
//            String role = txtRole.getText();
            
            //Validations
            
            if(!validations.lengthCheck(firstname) ||!validations.lengthCheck(lastname) ||
                    !validations.lengthCheck(age) ||!validations.lengthCheck(gender)
                     || !validations.lengthCheck(phonenumber) || !validations.lengthCheck(email) 
                    || !validations.lengthCheck(password))
            {
                JOptionPane.showMessageDialog(this, "Enter valid details ");
                return;
            }
            
            if(!validations.numberCheck(age) ){
                JOptionPane.showMessageDialog(this, "Enter valid details for age");
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
            else{
                System.out.println("User Account is not present");
                
                String uniqueField = UUID.randomUUID().toString();
                
                UserAccount userAccount = system.getUserAccountDirectory().addNewUserAccount();
                userAccount.setEmail(email);
                userAccount.setPassword(password);
                userAccount.setRole("Reporter");
                userAccount.setUserAccountId(uniqueField);
                
                Reporter reporter = system.getReporterDirectory().addNewReporter();
                reporter.setReporterId(uniqueField);
                reporter.setFirstName(firstname);
                reporter.setLastName(lastname);
                reporter.setAge(Integer.parseInt(age));
                reporter.setGender(gender);
                reporter.setPhoneNumber(phonenumber);
                
                rep = reporter;
                user = userAccount;
                
                JOptionPane.showMessageDialog(this, "OTP sent");
                System.out.println(email+" "+password);
//                dB4OUtil.storeSystem(system);
                
                Random random = new Random();
                
                int x = random.nextInt(500);

                
                code = String.valueOf(x);
                
                System.out.println("random "+code);
                
                Mail mail = new Mail();
                mail.mail(email, String.valueOf(code));

                registerFlag = 1;

//                LoginJPanel panel = new LoginJPanel(splitpane,system);
//                splitpane.setRightComponent(panel);
            }
             
            
        }
        catch(Exception e){
            System.out.println("Register Error, enter valid values "+e);
            JOptionPane.showMessageDialog(this, "Registration Error, try again");
            return;
            
        }
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtpActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if(registerFlag == 0){
                JOptionPane.showMessageDialog(this, "Register first");
                return;
            }

            String enteredCode = txtCode.getText();

            if(enteredCode.equals(code)){

                System.out.println("Code match");
                
                
                
                dB4OUtil.storeSystem(system);
                LoginJPanel panel = new LoginJPanel(splitpane,system);
                splitpane.setRightComponent(panel);

                registerFlag =0;
                JOptionPane.showMessageDialog(this, "User Registered");
            }
            else{
                
                JOptionPane.showMessageDialog(this, "Wrong code, try again");
                
                system.getReporterDirectory().removeReporter(rep);
                system.getUserAccountDirectory().removeUserAccount(user);
                registerFlag = 0;
                return;
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error in accepting code, try again");
            return;
        }
        
        
    }//GEN-LAST:event_btnOtpActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtp;
    private javax.swing.JButton btnRegister;
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
    private javax.swing.JPasswordField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhno;
    // End of variables declaration//GEN-END:variables
}
