/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.view;

/**
 *
 * @author Usuario
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    public JFrameMenu() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verUser = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtUsers = new javax.swing.JLabel();
        txtProducts = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/user.jpg"))); // NOI18N
        verUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUserActionPerformed(evt);
            }
        });
        getContentPane().add(verUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 250));

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/dining-room.png"))); // NOI18N
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 145, 96));

        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/dinero.png"))); // NOI18N
        getContentPane().add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 135, 115));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 145, 89));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 153, 89));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/exit.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 412, 70, 50));
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, 153, 87));
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 153, 89));

        txtUsers.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        txtUsers.setForeground(new java.awt.Color(51, 51, 51));
        txtUsers.setText("Usuario");
        getContentPane().add(txtUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtProducts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts.setText("1. Productos");
        getContentPane().add(txtProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("5. Factura");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        labBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/FondoTienda.jpg"))); // NOI18N
        labBack.setText("jLabel1");
        getContentPane().add(labBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 1460, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verUserActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        FrmProducts product = new FrmProducts();
        product.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labBack;
    private javax.swing.JLabel txtProducts;
    private javax.swing.JLabel txtUsers;
    private javax.swing.JButton verUser;
    // End of variables declaration//GEN-END:variables
}