/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Population;

import business.ecosystem.Business;
import business.ecosystem.UserAccount;
import business.population.Reporter;
import business.shelter.ShelterStaff;
import business.validations.Validations;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishi
 */
public class ViewUsers extends javax.swing.JPanel {

    /**
     * Creates new form ViewUsers
     */
    Business system;
    javax.swing.JSplitPane splitpane;
    Validations validations;
    
    Reporter updateProfile;
    public ViewUsers(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        this.validations = new Validations();
        this.splitpane = splitpane;
        this.system = system;
        
        this.updateProfile = null;
        populate();
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
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        txtPhno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Users");

        btnBack.setBackground(new java.awt.Color(17, 53, 81));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(138, 10, 20));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSelect.setBackground(new java.awt.Color(17, 53, 81));
        btnSelect.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        txtPhno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("Age");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 53, 81));
        jLabel9.setText("Firstname");

        txtLastname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 53, 81));
        jLabel10.setText("Phone Number");

        btnUpdate.setBackground(new java.awt.Color(17, 53, 81));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Password");

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 53, 81));
        jLabel8.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 53, 81));
        jLabel7.setText("Lastname");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Male User.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        cboGender.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 53, 81));
        jLabel11.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLastname)
                                    .addComponent(txtFirstname)
                                    .addComponent(txtAge)
                                    .addComponent(txtPhno)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 233, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(system.getCurrentRole().equals("PopulationAdmin")){
            PopulationAdmin panel = new PopulationAdmin(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else if(system.getCurrentRole().equals("Reporter")){
            ReportJPanel panel = new ReportJPanel(splitpane, system);
            splitpane.setRightComponent(panel);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectRowIndex = jTable1.getSelectedRow();

        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Reporter selectedProfile = (Reporter)model.getValueAt(selectRowIndex,0  );

        //        shelterStaffList.removeShelterStaff(selectedProfile);
        system.getReporterDirectory().removeReporter(selectedProfile);
        JOptionPane.showMessageDialog(this, "User has been deleted");

        populate();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed

        int selectRowIndex = jTable1.getSelectedRow();

        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Reporter selectedProfile = (Reporter)model.getValueAt(selectRowIndex,0  );

        txtFirstname.setText(String.valueOf(selectedProfile.getFirstName()));
        txtLastname.setText(String.valueOf(selectedProfile.getLastName()));
        txtAge.setText(String.valueOf(selectedProfile.getAge()));
        cboGender.setSelectedItem(String.valueOf(selectedProfile.getGender()));

        txtPhno.setText(String.valueOf(selectedProfile.getPhoneNumber()));

        UserAccount userAccount = system.getUserAccountDirectory().findAccount(selectedProfile.getReporterId());

        if(userAccount!=null){
            txtPassword.setText(userAccount.getPassword());
            txtEmail.setText(userAccount.getEmail());
        }

        updateProfile = selectedProfile;
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        if(updateProfile == null){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated");
            return;
        }

        try{
            String firstname = txtFirstname.getText();
            String lastname = txtLastname.getText();
            String age = txtAge.getText();
            String gender = cboGender.getSelectedItem()+"";
            String phonenumber = txtPhno.getText();
            String password = txtPassword.getText();
            String email = txtEmail.getText();
            
            String orgEmail = email;

            if(!validations.lengthCheck(firstname) ||!validations.lengthCheck(lastname) ||
                !validations.lengthCheck(age) ||!validations.lengthCheck(gender)
                || !validations.lengthCheck(phonenumber)
                || !validations.lengthCheck(password))
            {
                JOptionPane.showMessageDialog(this, "Enter valid details for user");
                return;
            }

            if(!validations.numberCheck(age) ){
                JOptionPane.showMessageDialog(this, "Enter valid details for user");
                return;
            }

            if(!validations.passwordCheck(password)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Password");
                return;
            }
            
             if(!validations.emailCheck(email)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Email");
                return;
            }

            //Unique Check
           

            for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()){
                if (user.getEmail().equals(email)){
                    if(user.getEmail().equals(orgEmail)){
                        continue;
                    }
                    
                    JOptionPane.showMessageDialog(this, "Email is present, please choose another one");
                    return;
                    
                }
            }
            
             UserAccount userAccount = system.getUserAccountDirectory().findAccount(updateProfile.getReporterId());
            
            if(userAccount!=null){
                userAccount.setPassword(password);
                userAccount.setEmail(email);
            }

            //Unique Check

            updateProfile.setFirstName(firstname);
            updateProfile.setLastName(lastname);
            updateProfile.setAge(Integer.parseInt(age));
            updateProfile.setGender(gender);
            updateProfile.setPhoneNumber(phonenumber);


            JOptionPane.showMessageDialog(this, "user updated");

            populate();
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Issue while updating user, try again");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhno;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);

         for(Reporter pro: system.getReporterDirectory().getReporterList()){

             Object[] row = new Object[4];
             row[0] = pro;
             row[1] = pro.getFirstName();
             row[2] = pro.getAge();
             row[3] = pro.getPhoneNumber();
             
             model.addRow(row );
             
         }
    }
}
