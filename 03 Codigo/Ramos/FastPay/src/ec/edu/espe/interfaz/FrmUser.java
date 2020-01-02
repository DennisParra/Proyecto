/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FrmUser extends javax.swing.JFrame {

    /**
     * Creates new form FrmUser
     */
    public FrmUser() {
        initComponents();
        this.TablaUser.setModel(modelo);
        this.modelo.addColumn("ID");
        this.modelo.addColumn("Name");
        this.modelo.addColumn("User");
        this.modelo.addColumn("Password");
        this.modelo.addColumn("TypeUser");
        
        
        
        this.setTitle("User Registration");
        this.setLocation(400, 220);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    DefaultTableModel modelo = new DefaultTableModel(); 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtPwd = new javax.swing.JPasswordField();
        combocargo = new javax.swing.JComboBox<>();
        btGrabar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaUser);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 100));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 70, -1));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, -1));

        jLabel4.setText("User");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        getContentPane().add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, -1));

        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel6.setText("TypeUser");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        TxtPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPwdActionPerformed(evt);
            }
        });
        getContentPane().add(TxtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 100, -1));

        combocargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invitado ", "Administrador" }));
        combocargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocargoActionPerformed(evt);
            }
        });
        getContentPane().add(combocargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btGrabar.setText("Guardar");
        btGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 120, -1));

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 120, -1));

        btEdit.setText("Editar (Modificar)");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 120, -1));

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPwdActionPerformed

    private void combocargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocargoActionPerformed

    private void btGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGrabarActionPerformed
        // TODO add your handling code here:
        this.modelo.addRow(new Object[]{this.txtcodigo.getText(),this.txtName.getText(),
        this.combocargo.getSelectedItem(),this.TxtUser.getText(),this.TxtPwd.getText()});
        this.txtcodigo.setText("");
        this.txtName.setText("");
        this.combocargo.setSelectedIndex(0);
        this.TxtUser.setText("");
        this.TxtPwd.setText("");
        txtcodigo.grabFocus();
        
        
    }//GEN-LAST:event_btGrabarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        // TODO add your handling code here:
        this.txtcodigo.setText("");
        this.txtName.setText("");
        this.combocargo.setSelectedIndex(0);
        this.TxtUser.setText("");
        this.TxtPwd.setText("");
        
    }//GEN-LAST:event_btNuevoActionPerformed
    int filas;
    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        String []datos=new String[5];
        datos[0]=txtcodigo.getText();
        datos[1]=txtName.getText();
        datos[2]=this.combocargo.getSelectedItem().toString();
        datos[3]=TxtUser.getText();
        datos[4]=TxtPwd.getText();
        
        for(int i=0;i<TablaUser.getColumnCount();i++){
            modelo.setValueAt(datos[i], filas, i);
        }
       
    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        int fila_selecionada=TablaUser.getSelectedRow();
       if(fila_selecionada>=0){
           modelo.removeRow(fila_selecionada);
           
       }else{
           JOptionPane.showMessageDialog(null, "Select one row plis");
           
       }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void TablaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUserMouseClicked
        // TODO add your handling code here:
        int fila_seleccionada=TablaUser.getSelectedRow();
        txtcodigo.setText(TablaUser.getValueAt(fila_seleccionada,0).toString());
        txtName.setText(TablaUser.getValueAt(fila_seleccionada,1).toString());
        combocargo.setSelectedItem(TablaUser.getValueAt(fila_seleccionada,2).toString());
        TxtUser.setText(TablaUser.getValueAt(fila_seleccionada,3).toString());
        TxtPwd.setText(TablaUser.getValueAt(fila_seleccionada,4).toString());
        filas=fila_seleccionada;
    }//GEN-LAST:event_TablaUserMouseClicked

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUser;
    private javax.swing.JPasswordField TxtPwd;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btGrabar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<String> combocargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
