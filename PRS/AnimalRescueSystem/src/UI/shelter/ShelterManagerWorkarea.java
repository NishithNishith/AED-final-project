/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.shelter;

import business.ecosystem.Business;

/**
 *
 * @author nishi
 */
public class ShelterManagerWorkarea extends javax.swing.JPanel {

    /**
     * Creates new form ShelterManagerWorkarea
     */
    
    javax.swing.JSplitPane splitpane;
    Business system;
    public ShelterManagerWorkarea(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        this.splitpane = splitpane;
        this.system = system;
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
        txtStaff = new javax.swing.JButton();
        txtDonations = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtShelter = new javax.swing.JButton();
        txtStaff1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtShelter1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shelter Manager");

        txtStaff.setBackground(new java.awt.Color(17, 53, 81));
        txtStaff.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtStaff.setForeground(new java.awt.Color(255, 255, 255));
        txtStaff.setText("Manage Staff");
        txtStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffActionPerformed(evt);
            }
        });

        txtDonations.setBackground(new java.awt.Color(17, 53, 81));
        txtDonations.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDonations.setForeground(new java.awt.Color(255, 255, 255));
        txtDonations.setText("Manage Donations");
        txtDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonationsActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(17, 53, 81));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Request Funds");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtShelter.setBackground(new java.awt.Color(17, 53, 81));
        txtShelter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtShelter.setForeground(new java.awt.Color(255, 255, 255));
        txtShelter.setText("View Shelter");
        txtShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShelterActionPerformed(evt);
            }
        });

        txtStaff1.setBackground(new java.awt.Color(17, 53, 81));
        txtStaff1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtStaff1.setForeground(new java.awt.Color(255, 255, 255));
        txtStaff1.setText("Manage Accountant");
        txtStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaff1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Shelter.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        txtShelter1.setBackground(new java.awt.Color(17, 53, 81));
        txtShelter1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtShelter1.setForeground(new java.awt.Color(255, 255, 255));
        txtShelter1.setText("View Adoption");
        txtShelter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShelter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtShelter1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDonations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtDonations, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(txtShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(txtShelter1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShelterActionPerformed
        // TODO add your handling code here:
        ViewCaseHistory panel = new ViewCaseHistory(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtShelterActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ManageStaffWorkarea panel = new ManageStaffWorkarea(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffActionPerformed
        // TODO add your handling code here:
        RequestFunds panel = new RequestFunds(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtStaffActionPerformed

    private void txtDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonationsActionPerformed
        // TODO add your handling code here:
        ManageDonationsWorkarea panel = new ManageDonationsWorkarea(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtDonationsActionPerformed

    private void txtStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaff1ActionPerformed
        // TODO add your handling code here:
        ManageAccountantWorkarea panel = new ManageAccountantWorkarea(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtStaff1ActionPerformed

    private void txtShelter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShelter1ActionPerformed
        // TODO add your handling code here:
        ViewAdoption panel = new ViewAdoption(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtShelter1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton txtDonations;
    private javax.swing.JButton txtShelter;
    private javax.swing.JButton txtShelter1;
    private javax.swing.JButton txtStaff;
    private javax.swing.JButton txtStaff1;
    // End of variables declaration//GEN-END:variables
}
