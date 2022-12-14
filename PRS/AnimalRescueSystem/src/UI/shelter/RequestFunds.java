/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.shelter;

import business.ecosystem.Business;
import business.population.Report;
import business.shelter.FundRequest;
import business.shelter.FundRequestDirectory;
import business.validations.Validations;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author nishi
 */
public class RequestFunds extends javax.swing.JPanel {

    /**
     * Creates new form RequestFunds
     */
    Validations validations;

    javax.swing.JSplitPane splitpane;
    Business system;
    
    public RequestFunds(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        this.splitpane = splitpane;
        this.system = system;
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
        txtAmount = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request funds");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("Amount:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 53, 81));
        jLabel3.setText("Description:");

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        txtDesc.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtSubmit.setBackground(new java.awt.Color(17, 53, 81));
        txtSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSubmit.setForeground(new java.awt.Color(255, 255, 255));
        txtSubmit.setText("Submit");
        txtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubmitActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/donate.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        btnBack2.setBackground(new java.awt.Color(17, 53, 81));
        btnBack2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAmount)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addContainerGap(291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubmitActionPerformed
        // TODO add your handling code here:


        try{
            String amount = txtAmount.getText();
            String desc = txtDesc.getText();
 

            if(!validations.lengthCheck(amount) || !validations.lengthCheck(desc)){
                JOptionPane.showMessageDialog(this, "Enter valid details for Report");
                return;
            }
            
            if(!validations.numberCheck(amount)){
                JOptionPane.showMessageDialog(this, "Enter valid amount value");
                return;
            }

            FundRequest fundRequest = system.getFundRequestDirectory().addFundRequest();
            
            String uniqueField = UUID.randomUUID().toString();
            
            fundRequest.setFundRequestId(uniqueField);
            fundRequest.setAmount(Integer.parseInt(amount));
            fundRequest.setDescription(desc);
            fundRequest.setStatus("PENDING");
            
            //save report directory in the db

            JOptionPane.showMessageDialog(this, "Funds requested");
            txtAmount.setText("");
            txtDesc.setText("");
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Issue while submitting request, try again");
            return;
        }
        
    }//GEN-LAST:event_txtSubmitActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JButton txtSubmit;
    // End of variables declaration//GEN-END:variables
}
