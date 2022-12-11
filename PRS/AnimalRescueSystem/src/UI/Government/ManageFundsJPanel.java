/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Government;

import UI.shelter.RequestFunds;
import business.ecosystem.Business;
import business.shelter.FundRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishi
 */
public class ManageFundsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFundsJPanel
     */
    javax.swing.JSplitPane splitpane;
    Business system;
    FundRequest updateProfile;
    
    public ManageFundsJPanel(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAccept1 = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtMessage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Funds");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Amount", "Status", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAccept1.setBackground(new java.awt.Color(17, 53, 81));
        btnAccept1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAccept1.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept1.setText("Accept");
        btnAccept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccept1ActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(138, 10, 20));
        btnReject.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/charity.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtMessage.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jButton1.setBackground(new java.awt.Color(17, 53, 81));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 53, 81));
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 53, 81));
        jLabel4.setText("Amount:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 53, 81));
        jLabel5.setText("Status:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 53, 81));
        jLabel6.setText("Description:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStatus)
                            .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnAccept1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAccept1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccept1ActionPerformed
        // TODO add your handling code here:

        if(updateProfile == null){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        try{

            if(updateProfile.getStatus().equals("PENDING")){
                updateProfile.setStatus("ACCEPTED");

                int updateAmt = updateProfile.getAmount();
                int curAmt = system.getCurAmount();
                int newAmt = updateAmt + curAmt;
                system.setCurAmount(newAmt);
                
                JOptionPane.showMessageDialog(this, "This request was accepted");
                

                populate();
            }
            else{
                JOptionPane.showMessageDialog(this, "This request has already been served");
                return;
            }

        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Issue while Accepting Amount, try again");
        }
    }//GEN-LAST:event_btnAccept1ActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        if(updateProfile == null){
            JOptionPane.showMessageDialog(this, "Please select a row to be Accepted");
            return;
        }

        try{

            if(updateProfile.getStatus().equals("PENDING")){
                updateProfile.setStatus("REJECTED");
                JOptionPane.showMessageDialog(this, "This request was rejected");
                
                populate();
            }
            else{
                JOptionPane.showMessageDialog(this, "This request has already been served");
                return;
            }

        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Issue while Accepting Amount, try again");
        }

    }//GEN-LAST:event_btnRejectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectRowIndex = jTable1.getSelectedRow();

        if(selectRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        FundRequest selectedProfile = (FundRequest)model.getValueAt(selectRowIndex,0  );

        txtId.setText(String.valueOf(selectedProfile.getFundRequestId()));
        txtAmount.setText(String.valueOf(selectedProfile.getAmount()));
        txtStatus.setText(String.valueOf(selectedProfile.getStatus()));
        txtMessage.setText(String.valueOf(selectedProfile.getDescription()));

        updateProfile = selectedProfile;

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept1;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);

         for(FundRequest pro: system.getFundRequestDirectory().getFundRequest()){

             Object[] row = new Object[4];
             row[0] = pro;
             row[1] = pro.getAmount();
             row[2] = pro.getStatus();
             row[3] = pro.getDescription();
             
             model.addRow(row );
             
         }
    }
}
