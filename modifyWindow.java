/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class modifyWindow extends javax.swing.JFrame {

   
    private shoppingSystem inputWindow;
    /**
     * Creates new form modifyWindow
     */
    public modifyWindow() {
        initComponents();
    }
    
    //public modifyWindow(shoppingSystem inputWindow, String name, String id, String age) {
    public modifyWindow(shoppingSystem inputWindow) {    
        initComponents();

        this.inputWindow = inputWindow;
        modifyDeleteButton.setVisible(false);
        modifyModifyButton.setVisible(false);
        
      //  modifyNameField.setText(name);
      //  modifyIdField.setText(id);
      //  modifyAgeField.setText(age);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        nameSearchButton = new javax.swing.JButton();
        numberSearchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modifyTextArea = new javax.swing.JTextArea();
        modifyModifyButton = new javax.swing.JButton();
        modifyDeleteButton = new javax.swing.JButton();
        modifyCancelButton = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search By Name");

        jLabel2.setText("Search by Order Number");

        nameSearchButton.setText("Search");
        nameSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchButtonActionPerformed(evt);
            }
        });

        numberSearchButton.setText("Search");
        numberSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSearchButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Result");

        modifyTextArea.setColumns(20);
        modifyTextArea.setRows(5);
        jScrollPane1.setViewportView(modifyTextArea);

        modifyModifyButton.setText("Modify");
        modifyModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyModifyButtonActionPerformed(evt);
            }
        });

        modifyDeleteButton.setText("Delete");
        modifyDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyDeleteButtonActionPerformed(evt);
            }
        });

        modifyCancelButton.setText("Cancel");
        modifyCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCancelButtonActionPerformed(evt);
            }
        });

        label1.setText("label1");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("*Modify/Delete buttons appear after successful search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameSearchButton)
                            .addComponent(numberSearchButton))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifyModifyButton)
                            .addComponent(modifyDeleteButton))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(modifyCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberSearchButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(modifyModifyButton)
                        .addGap(18, 18, 18)
                        .addComponent(modifyDeleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(modifyCancelButton)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCancelButtonActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_modifyCancelButtonActionPerformed

    private void modifyModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyModifyButtonActionPerformed

        checkoutWindow window2 = new checkoutWindow(this);
        window2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyModifyButtonActionPerformed

    private void modifyDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyDeleteButtonActionPerformed

        JOptionPane.showMessageDialog(null, "Order Number " + " ORDERNUMBER"+ " *** Delete.", "Delete Order", JOptionPane.INFORMATION_MESSAGE);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyDeleteButtonActionPerformed

    private void nameSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSearchButtonActionPerformed
      //if (positive search found)
      modifyDeleteButton.setVisible(true);
      modifyModifyButton.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSearchButtonActionPerformed

    private void numberSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSearchButtonActionPerformed
//if (positive search found)
      modifyDeleteButton.setVisible(true); 
      modifyModifyButton.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_numberSearchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(modifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifyWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private javax.swing.JButton modifyCancelButton;
    private javax.swing.JButton modifyDeleteButton;
    private javax.swing.JButton modifyModifyButton;
    private javax.swing.JTextArea modifyTextArea;
    private javax.swing.JButton nameSearchButton;
    private javax.swing.JButton numberSearchButton;
    // End of variables declaration//GEN-END:variables
}
