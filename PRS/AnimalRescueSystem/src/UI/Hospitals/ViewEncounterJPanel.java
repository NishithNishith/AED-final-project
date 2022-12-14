/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospitals;

import business.ecosystem.Business;
import business.ecosystem.UserAccount;
import business.hospital.Encounter;
import business.shelter.CaseFile;
import business.validations.Validations;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class ViewEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounterJPanel
     */
        Encounter updateProfile;
    Business system;
    javax.swing.JSplitPane splitpane;
    Validations validations;
    public ViewEncounterJPanel(javax.swing.JSplitPane splitpane,Business system) {
        initComponents();
                this.system = system;
        this.splitpane = splitpane;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPrescription = new javax.swing.JTextField();
        txtEncounterID = new javax.swing.JTextField();
        txtCaseID = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtRecepient = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        txtRespirationRate = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(206, 229, 242));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(17, 53, 81));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Prescription Name", "EncounterID", "CaseID", "Quantity", "Status", "Recipient", "Heart Rate", "Respiration Rate", "Temperatur", "Weight", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtPrescription.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtEncounterID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtCaseID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtRecepient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtHeartRate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtRespirationRate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtTemperature.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtWeight.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtBloodPressure.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("EncounterID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 53, 81));
        jLabel3.setText("CaseID:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 53, 81));
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 53, 81));
        jLabel5.setText("Status:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Weight:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 53, 81));
        jLabel7.setText("Recipient:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 53, 81));
        jLabel8.setText("Heart Rate:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 53, 81));
        jLabel9.setText("Resp Rate:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 53, 81));
        jLabel10.setText("Temperature:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 53, 81));
        jLabel11.setText("Blood Pressure:");

        jButton1.setBackground(new java.awt.Color(17, 53, 81));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(138, 10, 20));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(17, 53, 81));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(17, 53, 81));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 53, 81));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Encounter");

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "critical", "non-critical" }));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCaseID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtQuantity)
                                    .addComponent(txtStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtHeartRate)
                            .addComponent(txtRespirationRate)
                            .addComponent(txtTemperature)
                            .addComponent(txtRecepient)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecepient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            int selectRowIndex = jTable1.getSelectedRow();

        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter selectedProfile = (Encounter)model.getValueAt(selectRowIndex,0  );

        txtPrescription.setText(String.valueOf(selectedProfile.getPrescriptionName()));
        txtEncounterID.setText(String.valueOf(selectedProfile.getEncounterID()));
        txtCaseID.setText(String.valueOf(selectedProfile.getCaseID()));
        txtQuantity.setText(String.valueOf(selectedProfile.getQuantity()));
        txtStatus.setSelectedItem(String.valueOf(selectedProfile.getCaseStatus()));
        txtRecepient.setText(String.valueOf(selectedProfile.getRecipient()));
        txtHeartRate.setText(String.valueOf(selectedProfile.getHeartrate()));
        txtRespirationRate.setText(String.valueOf(selectedProfile.getRespiratoryRate()));
        txtTemperature.setText(String.valueOf(selectedProfile.getTemperature()));
        txtWeight.setText(String.valueOf(selectedProfile.getWeight()));
        txtBloodPressure.setText(String.valueOf(selectedProfile.getBloodPressure()));

        updateProfile = selectedProfile;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
               int selectRowIndex = jTable1.getSelectedRow();
        
        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter selectedProfile = (Encounter)model.getValueAt(selectRowIndex,0  );

        system.getEncounterHistory().removeEncounter(selectedProfile);
        JOptionPane.showMessageDialog(this, "Doctor has been deleted");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                 if(system.getCurrentRole().equals("HospitalAdmin")){
            HospitalAdminSelectCaseJPanel panel = new HospitalAdminSelectCaseJPanel(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else{
            DoctorJPanel panel = new DoctorJPanel(splitpane, system);
            splitpane.setRightComponent(panel);
        }
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        // System.out.println("doctor "+hospitalManagerDirectory);

         for(Encounter pro: system.getEncounterHistory().getEncounterList()){

            if(system.getCurrentRole().equals("Doctor") && pro.getCreatedByID().equals(system.getCurrentUserId())) {
             Object[] row = new Object[11];
             row[0] = pro;
             row[1] = pro.getEncounterID();
             row[2] = pro.getCaseID();
             row[3] = pro.getQuantity();
             row[4] = pro.getCaseStatus();
             row[5] = pro.getHeartrate();
             row[6] = pro.getRespiratoryRate();
             row[7] = pro.getTemperature();
             row[8] = pro.getWeight();
             row[9] = pro.getWeight();
             row[10] = pro.getBloodPressure();
             
             model.addRow(row );
             break;
            }
            else{
                             Object[] row = new Object[11];
             row[0] = pro;
             row[1] = pro.getEncounterID();
             row[2] = pro.getCaseID();
             row[3] = pro.getQuantity();
             row[4] = pro.getCaseStatus();
             row[5] = pro.getHeartrate();
             row[6] = pro.getRespiratoryRate();
             row[7] = pro.getTemperature();
             row[8] = pro.getWeight();
             row[9] = pro.getWeight();
             row[10] = pro.getBloodPressure();
             
             model.addRow(row );
            }
             
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtCaseID;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPrescription;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRecepient;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JComboBox<String> txtStatus;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
