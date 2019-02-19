/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybill;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Shivam-PC
 */
public class editProduct extends javax.swing.JFrame {

    /**
     * Creates new form addProduct
     */
    public editProduct() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        barcode_textField = new javax.swing.JTextField();
        productName_textField = new javax.swing.JTextField();
        productDesc_textField = new javax.swing.JTextField();
        mrp_textField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        disount_textField = new javax.swing.JTextField();
        totalUnits_textField = new javax.swing.JTextField();
        editProduct_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Edit Product");

        jLabel2.setText("Barcode ID");

        jLabel3.setText("Product Name");

        jLabel4.setText("Product Description");

        jLabel5.setText("MRP");

        barcode_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcode_textFieldActionPerformed(evt);
            }
        });
        barcode_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcode_textFieldKeyPressed(evt);
            }
        });

        productName_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productName_textFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Discount");

        jLabel8.setText("Total Units");

        disount_textField.setText("0");
        disount_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disount_textFieldActionPerformed(evt);
            }
        });

        totalUnits_textField.setText("1");

        editProduct_button.setText("Update");
        editProduct_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProduct_buttonActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productName_textField)
                            .addComponent(barcode_textField)
                            .addComponent(productDesc_textField)
                            .addComponent(mrp_textField)
                            .addComponent(disount_textField)
                            .addComponent(totalUnits_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(editProduct_button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(barcode_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productName_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(productDesc_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mrp_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(disount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(totalUnits_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editProduct_button)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barcode_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcode_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcode_textFieldActionPerformed

    private void productName_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productName_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productName_textFieldActionPerformed

    private void disount_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disount_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disount_textFieldActionPerformed

    private void editProduct_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProduct_buttonActionPerformed
        // TODO add your handling code here:
        try{
        String barcode_id=barcode_textField.getText().trim();
	String productName=productName_textField.getText().trim();
	String productDesc=productDesc_textField.getText().trim();
	int mrp=Integer.parseInt(mrp_textField.getText().trim());
	int discount=Integer.parseInt(disount_textField.getText().trim());
	int total_quantity=Integer.parseInt(totalUnits_textField.getText().trim());
        
			
	int i=ProductDao.update(barcode_id, productName, productDesc, mrp, discount, total_quantity);
			if(i>0){
				JOptionPane.showMessageDialog(editProduct.this,"Product edited successfully!");
				clearText();
				
			}else{
				JOptionPane.showMessageDialog(editProduct.this,"Sorry, unable to save!");
			}
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(editProduct.this,"Sorry Product not fount");
            clearText();
        }
                       
    }//GEN-LAST:event_editProduct_buttonActionPerformed

    private void clearText(){
        barcode_textField.setText("");
	productName_textField.setText("");
	productDesc_textField.setText("");
	mrp_textField.setText("");
	disount_textField.setText("0");
        totalUnits_textField.setText("1");
        barcode_textField.requestFocusInWindow();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clearText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
	this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void barcode_textFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcode_textFieldKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String barcode = barcode_textField.getText().trim();
            product pro = ProductDao.selectAll(barcode);
            if (pro==null){
                JOptionPane.showMessageDialog(editProduct.this,"Sorry product not found");
            }
            productName_textField.setText(pro.getProduct_name());
            productDesc_textField.setText(pro.getProduct_desc());
            mrp_textField.setText(String.valueOf(pro.getMrp()));
            totalUnits_textField.setText(String.valueOf(pro.getTotal_unit()));
            disount_textField.setText(String.valueOf(pro.getDiscount()));
           
        }
    }//GEN-LAST:event_barcode_textFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcode_textField;
    private javax.swing.JTextField disount_textField;
    private javax.swing.JButton editProduct_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mrp_textField;
    private javax.swing.JTextField productDesc_textField;
    private javax.swing.JTextField productName_textField;
    private javax.swing.JTextField totalUnits_textField;
    // End of variables declaration//GEN-END:variables
}
