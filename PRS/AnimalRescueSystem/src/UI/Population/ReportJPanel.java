/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Population;

import UI.Main.LoginJPanel;
import UI.shelter.AdoptionWorkarea;
import UI.shelter.ShelterAdmin;
import UI.shelter.ViewAdoption;
import business.ecosystem.Business;
import business.population.Report;
import business.population.ReportDirectory;
import business.validations.Validations;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.UUID;

/**
 *
 * @author nishi
 */
public class ReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form reportJPanel
     */
    
    Validations validations;
    ReportDirectory reportDirectory;
    javax.swing.JSplitPane splitpane;
    Business system;
    
    public ReportJPanel(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        validations = new Validations();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAnimal = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtCondition = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        txtDonate = new javax.swing.JButton();
        txtHistory = new javax.swing.JButton();
        btnDonateHistory = new javax.swing.JButton();
        txtHistory1 = new javax.swing.JButton();
        txtHistory2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtHistory3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(206, 229, 242));
        setForeground(new java.awt.Color(231, 250, 254));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Report");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("Animal:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 53, 81));
        jLabel3.setText("Description:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 53, 81));
        jLabel4.setText("Condition:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Location");

        txtAnimal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalActionPerformed(evt);
            }
        });

        txtDesc.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtCondition.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtCommunity.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSubmit.setBackground(new java.awt.Color(17, 53, 81));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtDonate.setBackground(new java.awt.Color(17, 53, 81));
        txtDonate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDonate.setForeground(new java.awt.Color(255, 255, 255));
        txtDonate.setText("Donate");
        txtDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonateActionPerformed(evt);
            }
        });

        txtHistory.setBackground(new java.awt.Color(17, 53, 81));
        txtHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtHistory.setForeground(new java.awt.Color(255, 255, 255));
        txtHistory.setText("View Report History");
        txtHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistoryActionPerformed(evt);
            }
        });

        btnDonateHistory.setBackground(new java.awt.Color(17, 53, 81));
        btnDonateHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDonateHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnDonateHistory.setText("Donation History");
        btnDonateHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateHistoryActionPerformed(evt);
            }
        });

        txtHistory1.setBackground(new java.awt.Color(17, 53, 81));
        txtHistory1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtHistory1.setForeground(new java.awt.Color(255, 255, 255));
        txtHistory1.setText("Adopt");
        txtHistory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistory1ActionPerformed(evt);
            }
        });

        txtHistory2.setBackground(new java.awt.Color(17, 53, 81));
        txtHistory2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtHistory2.setForeground(new java.awt.Color(255, 255, 255));
        txtHistory2.setText("Profile");
        txtHistory2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistory2ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(17, 53, 81));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtHistory3.setBackground(new java.awt.Color(17, 53, 81));
        txtHistory3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtHistory3.setForeground(new java.awt.Color(255, 255, 255));
        txtHistory3.setText("View Adoptions");
        txtHistory3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistory3ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Report.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCondition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHistory3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDonateHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDonate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHistory1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHistory2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(203, 203, 203))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCondition)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(54, 54, 54)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDonateHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHistory2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHistory3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        
        try{
            String animal = txtAnimal.getText();
            String desc = txtDesc.getText();
            String condition = txtCondition.getText();
            String community = txtCommunity.getText();

            if(!validations.lengthCheck(animal)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Report");
                return;
            }

            Report report = system.getReportDirectory().addNewReport();
            
            String uniqueField = UUID.randomUUID().toString();
            report.setId(uniqueField);
            report.setAnimal(animal);
            report.setDescription(desc);
            report.setCondition(condition);
            report.setCity("");
            report.setCommunity(community);
            report.setLocation("");
            report.setStatus("PENDING");
            report.setUser(system.getCurrentUserId());
            report.setDate(new Date());
            
            //save report directory in the db

            JOptionPane.showMessageDialog(this, "Incident reported ");
            txtAnimal.setText("");
            txtDesc.setText("");
            txtCondition.setText("");
            txtCommunity.setText("");
            
        }
        catch(Exception err){
            System.out.print("ReportJPanel error "+err);
            JOptionPane.showMessageDialog(this, "Issue while submitting report, try again");
            return;
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonateActionPerformed
        // TODO add your handling code here:
        DonateFundsJPanel panel = new DonateFundsJPanel(splitpane, system);
        splitpane.setRightComponent(panel);

    }//GEN-LAST:event_txtDonateActionPerformed

    private void txtHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistoryActionPerformed
        // TODO add your handling code here:
        ReportHistoryJPanel panel = new ReportHistoryJPanel(splitpane, system);
        splitpane.setRightComponent(panel);

    }//GEN-LAST:event_txtHistoryActionPerformed

    private void btnDonateHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateHistoryActionPerformed
        // TODO add your handling code here:
        DonationHistory panel = new DonationHistory(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_btnDonateHistoryActionPerformed

    private void txtHistory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistory1ActionPerformed
        // TODO add your handling code here:
        AdoptionWorkarea panel = new AdoptionWorkarea(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtHistory1ActionPerformed

    private void txtHistory2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistory2ActionPerformed
        // TODO add your handling code here:
        Profile panel = new Profile(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtHistory2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(system.getCurrentRole().equals("PopulationAdmin")){
            PopulationAdmin panel = new PopulationAdmin(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else if(system.getCurrentRole().equals("Reporter")){
            LoginJPanel panel = new LoginJPanel(splitpane, system);
            splitpane.setRightComponent(panel);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtHistory3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistory3ActionPerformed
        // TODO add your handling code here:
        ViewAdoption panel = new ViewAdoption(splitpane, system);
        splitpane.setRightComponent(panel);
    }//GEN-LAST:event_txtHistory3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDonateHistory;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAnimal;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JButton txtDonate;
    private javax.swing.JButton txtHistory;
    private javax.swing.JButton txtHistory1;
    private javax.swing.JButton txtHistory2;
    private javax.swing.JButton txtHistory3;
    // End of variables declaration//GEN-END:variables
}
