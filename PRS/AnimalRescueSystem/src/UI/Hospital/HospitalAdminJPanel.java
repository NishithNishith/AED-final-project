/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;


/**
 *
 * @author sinchanakumar
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form HospitalAdminJPanel
     */
    javax.swing.JSplitPane splitpane;
    public HospitalAdminJPanel() {
        initComponents();
        this.splitpane = splitpane;
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
        btnManageDoc = new javax.swing.JButton();
        btnManageEncounter = new javax.swing.JButton();
        btnManageManager = new javax.swing.JButton();
        BackgroundIcon = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        btnManageDoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageDoc.setForeground(new java.awt.Color(17, 53, 81));
        btnManageDoc.setText("Manage Doctors");
        btnManageDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDocActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageDoc);
        btnManageDoc.setBounds(140, 270, 320, 70);

        btnManageEncounter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageEncounter.setForeground(new java.awt.Color(17, 53, 81));
        btnManageEncounter.setText("Manage Encounters");
        btnManageEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEncounterActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageEncounter);
        btnManageEncounter.setBounds(140, 370, 320, 70);

        btnManageManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageManager.setForeground(new java.awt.Color(17, 53, 81));
        btnManageManager.setText("Manage Managers");
        jPanel1.add(btnManageManager);
        btnManageManager.setBounds(140, 470, 320, 70);

        BackgroundIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/doc.png"))); // NOI18N
        BackgroundIcon.setText("jLabel2");
        jPanel1.add(BackgroundIcon);
        BackgroundIcon.setBounds(0, 0, 1300, 860);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEncounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEncounterActionPerformed

    private void btnManageDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDocActionPerformed
//        ManageDoctorsJPanel panel = new ManageDoctorsJPanel(splitpane, system);
//        splitpane.setRightComponent(panel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundIcon;
    private javax.swing.JButton btnManageDoc;
    private javax.swing.JButton btnManageEncounter;
    private javax.swing.JButton btnManageManager;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
