/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Distribution;

import business.db4O.DatabaseUtils;
import business.distribution.Inventory;
import business.distribution.Order;
import business.ecosystem.Business;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class ManageOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    
           Business system;
           javax.swing.JSplitPane splitpane;
    public ManageOrders(javax.swing.JSplitPane splitpane,Business system) {
        initComponents();
        this.system = system;
        this.splitpane = splitpane;
        
//        System.out.println("system"+system);
//        
//        Order o  = system.getOrderDirectory().addOrder();
//
//       
//        o.setMedicineName("Remdezvir");
//        o.setSender("da");
//        o.setReciever("asasma@gmail.com");
//        o.setQuantity(5);
//        o.setOrderStatus("Pending");
//        o.setOrderID("2");
//        
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

        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(206, 229, 242));

        txtStock.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        orderTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Sender", "Reciever", "Status", "Quantity", "Order ID"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        jButton1.setBackground(new java.awt.Color(17, 53, 81));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Assign to Delivery Associate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(17, 53, 81));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ready to Deliver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(138, 10, 20));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Deny Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(17, 53, 81));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Avaliable Stock:");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(17, 53, 81));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Orders");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Staff.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton5)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table");
        }
        Order placedOrder = null;
        String orderId = orderTable.getValueAt(selectedRow,5).toString();
        for(Order o : system.getOrderDirectory().getOrder()){
            Order order = o;              
            if(o.getOrderID().equals(orderId)){
                placedOrder = o;
            }
        }
        
        if(placedOrder.getOrderStatus().equals("Work In Progress"))
            JOptionPane.showMessageDialog(null, "Order will be assigned to delivery associate and will be dispatched for delivery");
        else if(placedOrder.getOrderStatus().equals("Pending") || placedOrder.getOrderStatus().equals("Cancelled"))
            placedOrder.setOrderStatus("Work In Progress");
        else{
            JOptionPane.showMessageDialog(null, "Order in progress");
        }
        
        for(Order o : system.getOrderDirectory().getOrder()){
            Order order = o;              
            if(o.getOrderID().equals(placedOrder.getOrderID()) ){
                order.setOrderStatus("Work In Progress");
            }
        }
        populateTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
                 int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table");
        }
        Order placedOrder = null;
        String orderId = orderTable.getValueAt(selectedRow,5).toString();
        for(Order o : system.getOrderDirectory().getOrder()){
            Order order = o;              
            if(o.getOrderID().equals(orderId) ){
                placedOrder = o;
            }
        }
        
        if(placedOrder.getOrderStatus().equals("Work In Progress"))
            JOptionPane.showMessageDialog(null, "Order cannot be denied");
        else if(placedOrder.getOrderStatus().equals("Pending") || placedOrder.getOrderStatus().equals("Cancelled"))
            placedOrder.setOrderStatus("Canceled");
        else{
            JOptionPane.showMessageDialog(null, "Order in progress");
        }
        
//        for(Order o : system.getOrderDirectory().getOrder()){
//            Order order = o;              
//            if(o.getOrderID() == placedOrder.getOrderID() ){
//                order.setOrderStatus("Canceled");
//            }
//        }
        populateTable();
      

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table");
        }
        String medicineName  = orderTable.getValueAt(selectedRow,0).toString();
        int count = 0;
        for(Inventory inv : system.getInventoryDirectory().getInventory()){
            if(inv.name.equals(medicineName)){
               count = count + inv.getQuantity();
            }
            else
                JOptionPane.showMessageDialog(null, "The following medicine does not exist");
        }
        
        txtStock.setText(String.valueOf(count));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table");
        }
        Order placedOrder = null;
        String orderId = orderTable.getValueAt(selectedRow,5).toString();
        for(Order o : system.getOrderDirectory().getOrder()){
            Order order = o;              
            if(o.getOrderID().equals(orderId) ){
                placedOrder = o;
            }
        }
        
        if(placedOrder.getOrderStatus().equals("Work In Progress"))
            JOptionPane.showMessageDialog(null, "Order is already assigned");
        else if( placedOrder.getOrderStatus().equals("Cancelled"))
            JOptionPane.showMessageDialog(null, "Cancelled order cannot be assigned to Delivery Associate");
        else if (placedOrder.getOrderStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "Cancelled order cannot be assigned to Delivery Associate");
        }
        else{
                    AssignDeliveryAssociatePanel da = new AssignDeliveryAssociatePanel(splitpane,system,placedOrder);
        splitpane.setRightComponent(da);
        }


        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                                 AdminDistribution panel = new AdminDistribution(splitpane, system);
            splitpane.setRightComponent(panel);
    }//GEN-LAST:event_jButton5ActionPerformed


       private void populateTable(){
        
         DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        
        model.setRowCount(0);
            
       
  
            for(Order inv : system.getOrderDirectory().getOrder()) {

                Object[] row = new Object[6];
                row[0] = inv;
    //          row[1] = e.getPatientName();
                row[1] = inv.getSender();
                row[2] = inv.getReciever();
                row[3] = inv.getOrderStatus();
                row[4] = inv.getQuantity();
                row[5] = inv.getOrderID();

                model.addRow(row);           
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
