package ec.edu.espe.FastPay.view;

import javax.swing.JOptionPane;
import ec.edu.espe.FastPay.controller.Usercontrol;
import ec.edu.espe.FastPay.model.user1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGreeting = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        txtPasswordText = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnNewUser = new javax.swing.JButton();
        txtComment = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGreeting.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtGreeting.setText("Bienvenido a FastPay!");
        getContentPane().add(txtGreeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 13, -1, -1));

        txtUser.setText("Usuario:");
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 88, -1, -1));

        txtPasswordText.setText("Contraseña");
        getContentPane().add(txtPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 128, -1, -1));

        txtUserName.setToolTipText("Only Characters");
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 85, 130, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 125, 130, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 30));

        btnNewUser.setText(" New User");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 220, -1, -1));

        txtComment.setText("Inicia sesión para disfrutar de los beneficios que te da FastPay");
        getContentPane().add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, -1, -1));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 10, 10));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 10, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        /*String userName = txtUserName.getText();
        String password = txtPassword.getText();
        Usercontrol userC = new Usercontrol();
        user1 user = userC.Validate(userName, password);

        if (txtUserName.getText().equals(userName)&&txtPassword.getText().equals(password)){
            JOptionPane.showMessageDialog(this, "Login Correcto");
            JFrameMenu menu = new JFrameMenu();
            menu.setVisible(true);
            dispose();

        } else {
            /*JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrecto");
            txtPassword.setText("");
            txtUserName.setFocusable(true);
        }*/
<<<<<<< HEAD
        JFrameMenu o = new JFrameMenu();
        o.setVisible(true);
        dispose();
=======

        JFrameMenu o = new JFrameMenu();
        o.setVisible(true);
        dispose();

>>>>>>> b7a303204113e6be467943598c489c7eb83c12b8
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if (!Character.isAlphabetic(inputChar)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:

        JframeNewUser newU = new JframeNewUser();
        newU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmAdmin admin = new FrmAdmin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel txtComment;
    private javax.swing.JLabel txtGreeting;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtPasswordText;
    private javax.swing.JLabel txtUser;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    class idUser {

        public idUser() {
        }
    }

    class passwordUser {

        public passwordUser() {
        }
    }
}
