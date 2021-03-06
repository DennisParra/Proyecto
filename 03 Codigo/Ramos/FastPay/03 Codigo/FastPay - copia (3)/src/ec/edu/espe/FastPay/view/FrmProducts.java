/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.view;

/**
 *
 * @author HP
 */
public class FrmProducts extends javax.swing.JFrame {

    /**
     * Creates new form FrmProducts
     */
    public FrmProducts() {
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

        cmbxCanned = new javax.swing.JComboBox<>();
        cmbxBar = new javax.swing.JComboBox<>();
        cmbxDiary = new javax.swing.JComboBox<>();
        cmbxFruitsVegetables = new javax.swing.JComboBox<>();
        txtComment = new javax.swing.JLabel();
        labBar = new javax.swing.JLabel();
        labCanned = new javax.swing.JLabel();
        labDiary = new javax.swing.JLabel();
        labFruitsVegetables = new javax.swing.JLabel();
        labConfectionery = new javax.swing.JLabel();
        cmbxConfectionery = new javax.swing.JComboBox<>();
        labDrinks = new javax.swing.JLabel();
        cmbxDrinks = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        labBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbxCanned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceitunas", "Champiñones", "Frijóles", "Sardinas", "Atún", "Granos" }));
        getContentPane().add(cmbxCanned, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, 30));

        cmbxBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceite", "Aderezos", "Avena", "Azúcar", "Café", "Cereales", "Gelatinas", "Harina", "Sal", "Mayonesa", "Katsup" }));
        getContentPane().add(cmbxBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 140, 30));

        cmbxDiary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leche condensada", "Leche", "Yogurt", "Mantequilla", "Queso", " " }));
        getContentPane().add(cmbxDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 30));

        cmbxFruitsVegetables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguacates", "Cebollas", "Tomate", "Papas (lb)", "Limones", "Manzanas", "Naranjas", "Plátanos" }));
        getContentPane().add(cmbxFruitsVegetables, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 150, 30));

        txtComment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtComment.setText("Elige el tipo de producto que desees comprar: ");
        getContentPane().add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labBar.setForeground(new java.awt.Color(153, 255, 255));
        labBar.setText("Abarrotes:");
        getContentPane().add(labBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        labCanned.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labCanned.setForeground(new java.awt.Color(102, 255, 255));
        labCanned.setText("Enlatados:");
        getContentPane().add(labCanned, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        labDiary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labDiary.setForeground(new java.awt.Color(102, 255, 255));
        labDiary.setText("Lácteos:");
        getContentPane().add(labDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        labFruitsVegetables.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labFruitsVegetables.setForeground(new java.awt.Color(102, 255, 255));
        labFruitsVegetables.setText("Frutas y Verduras:");
        getContentPane().add(labFruitsVegetables, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        labConfectionery.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labConfectionery.setForeground(new java.awt.Color(102, 255, 255));
        labConfectionery.setText("Confitería:");
        getContentPane().add(labConfectionery, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        cmbxConfectionery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caramelos", "Chocolates", "Chicles", "Chupetes", "Malvaviscos" }));
        getContentPane().add(cmbxConfectionery, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, 30));

        labDrinks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labDrinks.setForeground(new java.awt.Color(102, 255, 255));
        labDrinks.setText("Bebidas:");
        getContentPane().add(labDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        cmbxDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua", "Jugos/Néctares", "Energizantes", "Refrescos", "Gaseosas", "Cerveza", "Whiskey", "Vodka" }));
        getContentPane().add(cmbxDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 150, 30));

        btnSave.setText("Guardar");
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        labBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/tienda-productos.jpg"))); // NOI18N
        getContentPane().add(labBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 570, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrameMenu back = new JFrameMenu();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
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
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbxBar;
    private javax.swing.JComboBox<String> cmbxCanned;
    private javax.swing.JComboBox<String> cmbxConfectionery;
    private javax.swing.JComboBox<String> cmbxDiary;
    private javax.swing.JComboBox<String> cmbxDrinks;
    private javax.swing.JComboBox<String> cmbxFruitsVegetables;
    private javax.swing.JLabel labBack;
    private javax.swing.JLabel labBar;
    private javax.swing.JLabel labCanned;
    private javax.swing.JLabel labConfectionery;
    private javax.swing.JLabel labDiary;
    private javax.swing.JLabel labDrinks;
    private javax.swing.JLabel labFruitsVegetables;
    private javax.swing.JLabel txtComment;
    // End of variables declaration//GEN-END:variables
}
