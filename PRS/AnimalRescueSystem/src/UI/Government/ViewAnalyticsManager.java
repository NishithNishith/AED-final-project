/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Government;

import business.Government.AnalyticsManager;
import business.db4O.DatabaseUtils;
import business.distribution.DeliveryAssociate;
import business.ecosystem.Business;
import business.ecosystem.UserAccount;
import business.shelter.ShelterStaff;
import business.validations.Validations;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nishi
 */
public class ViewAnalyticsManager extends javax.swing.JPanel {

    /**
     * Creates new form ViewAnalyticsManager
     */
    Business system;
    Validations validations;
    javax.swing.JSplitPane splitpane;
    AnalyticsManager updateProfile;
    
    public ViewAnalyticsManager(javax.swing.JSplitPane splitpane,Business system) {
        initComponents();
        this.splitpane = splitpane;
        this.system = system;
        this.validations = new Validations();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtLastname = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtSalary = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        txtExp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtPhno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        btnSelect2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Analytics Managers");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Password");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 53, 81));
        jLabel9.setText("Firstname");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last Name", "Age", "Experience", "Phone Number", "Salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtLastname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSelect.setBackground(new java.awt.Color(17, 53, 81));
        btnSelect.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("View");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        txtExp.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 53, 81));
        jLabel8.setText("Gender");

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 53, 81));
        jLabel7.setText("Lastname");

        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPhno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 53, 81));
        jLabel10.setText("Phone Number");

        btnDelete.setBackground(new java.awt.Color(138, 10, 20));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 53, 81));
        jLabel4.setText("Salary");

        btnUpdate.setBackground(new java.awt.Color(17, 53, 81));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 53, 81));
        jLabel3.setText("Experience");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 53, 81));
        jLabel5.setText("Email");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("Age");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 53, 81));
        jLabel11.setText("Search");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Gov copy.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        btnSelect2.setBackground(new java.awt.Color(17, 53, 81));
        btnSelect2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSelect2.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect2.setText("Back");
        btnSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSalary)
                                .addComponent(txtLastname)
                                .addComponent(txtFirstname)
                                .addComponent(txtExp)
                                .addComponent(txtPhno)
                                .addComponent(txtPassword)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(139, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnSelect2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelect2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel12)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(btnSelect)
                            .addComponent(btnDelete)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed

        int selectRowIndex = jTable1.getSelectedRow();

        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        AnalyticsManager selectedProfile = (AnalyticsManager)model.getValueAt(selectRowIndex,0  );

        txtFirstname.setText(String.valueOf(selectedProfile.getFirstName()));
        txtLastname.setText(String.valueOf(selectedProfile.getLastName()));
        txtAge.setText(String.valueOf(selectedProfile.getAge()));
        cboGender.setSelectedItem(String.valueOf(selectedProfile.getGender()));
        txtExp.setText(String.valueOf(selectedProfile.getYearsOfExperience()));
        txtSalary.setText(String.valueOf(selectedProfile.getSalary()));

        txtPhno.setText(String.valueOf(selectedProfile.getPhoneNumber()));
        
        UserAccount userAccount = system.getUserAccountDirectory().findAccount(selectedProfile.getAnalyticsManagerId());

        if(userAccount!=null){
            txtPassword.setText(userAccount.getPassword());
        }
        
        updateProfile = selectedProfile;

    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectRowIndex = jTable1.getSelectedRow();

        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        AnalyticsManager selectedProfile = (AnalyticsManager)model.getValueAt(selectRowIndex,0  );

        //        shelterStaffList.removeShelterStaff(selectedProfile);
        system.getAnalyticsManagerDirectory().removeAnalyticsManager(selectedProfile);
        JOptionPane.showMessageDialog(this, "Analytics has been deleted");

        populate();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            String exp = txtExp.getText();
            String phonenumber = txtPhno.getText();
            String salary = txtSalary.getText();
            String password = txtPassword.getText();

            if(!validations.lengthCheck(firstname) ||!validations.lengthCheck(lastname) ||
                !validations.lengthCheck(age) ||!validations.lengthCheck(gender)
                || !validations.lengthCheck(exp) || !validations.lengthCheck(phonenumber)
                || !validations.lengthCheck(salary)
                || !validations.lengthCheck(password))
            {
                JOptionPane.showMessageDialog(this, "Enter valid details for Analytics");
                return;
            }

            if(!validations.numberCheck(age) || !validations.numberCheck(exp) || !validations.numberCheck(salary) ){
                JOptionPane.showMessageDialog(this, "Enter valid details for Analytics");
                return;
            }
            
            if(!validations.passwordCheck(password)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Password");
                return;
            }

            //Unique Check

            UserAccount userAccount = system.getUserAccountDirectory().findAccount(updateProfile.getAnalyticsManagerId());

            if(userAccount!=null){
                userAccount.setPassword(password);
            }

            updateProfile.setFirstName(firstname);
            updateProfile.setLastName(lastname);
            updateProfile.setAge(Integer.parseInt(age));
            updateProfile.setGender(gender);
            updateProfile.setYearsOfExperience(Integer.parseInt(exp));
            updateProfile.setPhoneNumber(phonenumber);
            updateProfile.setSalary(Integer.parseInt(salary));

            JOptionPane.showMessageDialog(this, "Analytics updated");

            populate();
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Issue while updating Analytics, try again");
        }
  

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
                        String searchString = txtSearch.getText();
        Search(searchString);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSelect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect2ActionPerformed
        // TODO add your handling code here:
                                 GovernmentAdmin panel = new GovernmentAdmin(splitpane, system);
            splitpane.setRightComponent(panel);
    }//GEN-LAST:event_btnSelect2ActionPerformed

      private void populate(){
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
                
     
            for(AnalyticsManager da : system.getAnalyticsManagerDirectory().getanalyticsManagerList()) {

                Object[] row = new Object[6];
                row[0] = da;
                row[1] = da.getLastName();
                row[2] = da.getAge();
                row[3] = da.getYearsOfExperience();
                row[4] = da.getPhoneNumber();
                row[5] = da.getSalary();
                

                model.addRow(row);           
            }
    }
      
          private void Search(String str){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSelect2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhno;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
