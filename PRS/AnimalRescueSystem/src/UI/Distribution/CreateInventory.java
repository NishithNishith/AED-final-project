/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Distribution;

import business.db4O.DatabaseUtils;
import business.distribution.Inventory;
import business.distribution.InventoryDirectory;
import business.ecosystem.Business;
import business.validations.Validations;
import com.db4o.*;
import com.db4o.query.Predicate;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
/**
 *
 * @author adity
 */
public class CreateInventory extends javax.swing.JPanel {

    Business system;
    
    Validations validations;
            javax.swing.JSplitPane splitpane;
    
    /**
     * Creates new form CreateInventory
     */
    public CreateInventory(javax.swing.JSplitPane splitpane,Business system) {
        initComponents();
        this.system = system; 
        validations = new Validations();
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

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Name:");

        jLabel2.setText("Quanity:");

        jLabel3.setText("Status:");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtQuantity)
                            .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButton1)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(jButton1)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String name;

        Integer quantity;
        String status;
        
        
        if(!validations.checkStringAndNumber(txtName.getText()) || txtName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Enter valid name ");
                return;
            }
        else
                 name = txtName.getText();
        
        if(!validations.checkStringAndNumber(txtStatus.getText()) || txtStatus.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Enter valid status ");
                return;
            }
        else
                status = txtStatus.getText();
        
        if(!validations.checkNumber(txtQuantity.getText()) || txtQuantity.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Enter valid quanity ");
                return;
            }
        else
                
                quantity = Integer.valueOf(txtQuantity.getText());
        
        

        Inventory existingInventory = system.getInventoryDirectory().checkInventory(name, quantity);
        
        if(existingInventory != null){
            system.getInventoryDirectory().deleteInventory(existingInventory);
            Inventory i = system.getInventoryDirectory().addInventory();
     
        i.setName(name);
        i.setQuantity(quantity);
        i.setStatus(status);
            
        }
        else{
            
        Inventory i = system.getInventoryDirectory().addInventory();

        i.setName(name);
        i.setQuantity(quantity);
        i.setStatus(status);
            
        }


      
          
       
          

         
         
        txtName.setText("");
        txtQuantity.setText("");
        txtStatus.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
