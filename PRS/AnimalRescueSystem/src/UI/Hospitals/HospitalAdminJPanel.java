/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospitals;

import business.ecosystem.Business;

/**
 *
 * @author sinchanakumar
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {
 
    Business system;
    javax.swing.JSplitPane splitpane;
    /**
     * Creates new form HospitalAdminJPanel
     */
    public HospitalAdminJPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnManageDoc = new javax.swing.JButton();
        btnManageEncounter = new javax.swing.JButton();
        btnManageManager = new javax.swing.JButton();
        BackgroundIcon = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        btnManageDoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageDoc.setForeground(new java.awt.Color(17, 53, 81));
        btnManageDoc.setText("Manage Doctors");
        btnManageDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDocActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageDoc);
        btnManageDoc.setBounds(140, 270, 320, 70);

        btnManageEncounter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageEncounter.setForeground(new java.awt.Color(17, 53, 81));
        btnManageEncounter.setText("Manage Encounters");
        btnManageEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEncounterActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEncounter);
        btnManageEncounter.setBounds(140, 370, 320, 70);

        btnManageManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageManager.setForeground(new java.awt.Color(17, 53, 81));
        btnManageManager.setText("Manage Managers");
        jPanel2.add(btnManageManager);
        btnManageManager.setBounds(140, 470, 320, 70);

        BackgroundIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/doc.png"))); // NOI18N
        BackgroundIcon.setText("jLabel2");
        jPanel2.add(BackgroundIcon);
        BackgroundIcon.setBounds(0, 0, 1300, 860);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDocActionPerformed
        //ManageDoctorsJPanel panel = new ManageDoctorsJPanel(splitpane);
       // splitpane.setRightComponent(panel);
//       CreateDoctorJPanel panel = new CreateDoctorJPanel(splitpane, system);
//        splitpane.setRightComponent(panel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageDocActionPerformed

    private void btnManageEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEncounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundIcon;
    private javax.swing.JButton btnManageDoc;
    private javax.swing.JButton btnManageEncounter;
    private javax.swing.JButton btnManageManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}