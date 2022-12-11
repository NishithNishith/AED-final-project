/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Distribution;

import business.distribution.Inventory;
import business.distribution.Order;
import business.ecosystem.Business;
import business.ecosystem.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class DeliveryAssociateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAssociateJPanel
     */
               Business system;
           javax.swing.JSplitPane splitpane;
           UserAccount userAccount;
    public DeliveryAssociateJPanel(javax.swing.JSplitPane splitpane,Business system,UserAccount userAccount) {
        initComponents();
                this.system = system;
        this.splitpane = splitpane;
        this.userAccount = userAccount;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Reciever", "Sender", "Status", "Quantity", "OrderId"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Delivered");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                         int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table");
        }
        Order placedOrder = null;
        String orderId = jTable1.getValueAt(selectedRow,5).toString();
        for(Order o : system.getOrderDirectory().getOrder()){
            Order order = o;              
            if(o.getOrderID().equals(orderId) ){
                order.setOrderStatus("Completed");
                placedOrder = order;
            }
        }
        
        int count = 0;
        for(Inventory inv : system.getInventoryDirectory().getInventory()){
            if(inv.name.equals(placedOrder.getMedicineName()) && placedOrder.getOrderStatus().equals("Completed")){
               count = inv.getQuantity();
               inv.setQuantity(count - placedOrder.getQuantity());
            }
            else
                JOptionPane.showMessageDialog(null, "The following medicine does not exist");
        }
        
        populateTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

       private void populateTable(){
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
            
       
  
            for(Order inv : system.getOrderDirectory().getOrder()) {
                Order order = inv;
               if(order.getDeliveryAssociate() == userAccount){
                Object[] row = new Object[6];
                row[0] = inv;
    //          row[1] = e.getPatientName();
                row[1] = inv.getReciever();
                row[2] = inv.getSender();
                
                row[3] = inv.getOrderStatus();
                row[4] = inv.getQuantity();
                row[5] = inv.getOrderID();

                model.addRow(row);           
            }
            }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
