/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastpaymenu;

/**
 *
 * @author HP
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFastPay = new javax.swing.JMenu();
        mnuItemShow = new javax.swing.JMenu();
        mnuProducts = new javax.swing.JMenuItem();
        mnuStock = new javax.swing.JMenuItem();
        mnuPrice = new javax.swing.JMenuItem();
        mnuPromotions = new javax.swing.JMenuItem();
        mnuExitShow = new javax.swing.JMenuItem();
        mnuItemExit = new javax.swing.JMenuItem();
        mnuForms = new javax.swing.JMenu();
        mnuElectronicMoney = new javax.swing.JMenuItem();
        mnuWireTransfer = new javax.swing.JMenuItem();
        mnuCreditCard = new javax.swing.JMenuItem();
        mnuExitForms = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuUserManual = new javax.swing.JMenuItem();
        mnuTechnicalService = new javax.swing.JMenuItem();
        mnuExitHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuFastPay.setText("FastPay");

        mnuItemShow.setText("Mostrar");

        mnuProducts.setText("Productos");
        mnuItemShow.add(mnuProducts);

        mnuStock.setText("Stock");
        mnuItemShow.add(mnuStock);

        mnuPrice.setText("Precios");
        mnuItemShow.add(mnuPrice);

        mnuPromotions.setText("Promociones");
        mnuItemShow.add(mnuPromotions);

        mnuExitShow.setText("Salir");
        mnuItemShow.add(mnuExitShow);

        mnuFastPay.add(mnuItemShow);

        mnuItemExit.setText("Salir");
        mnuFastPay.add(mnuItemExit);

        jMenuBar1.add(mnuFastPay);

        mnuForms.setText("Formas de pago");

        mnuElectronicMoney.setText("Dinero electrónico");
        mnuForms.add(mnuElectronicMoney);

        mnuWireTransfer.setText("Transferencia bancaria");
        mnuForms.add(mnuWireTransfer);

        mnuCreditCard.setText("Tarjeta de crédito");
        mnuForms.add(mnuCreditCard);

        mnuExitForms.setText("Salir");
        mnuForms.add(mnuExitForms);

        jMenuBar1.add(mnuForms);

        mnuHelp.setText("Ayuda");

        mnuUserManual.setText("Manual de uso");
        mnuHelp.add(mnuUserManual);

        mnuTechnicalService.setText("Servicio técnico");
        mnuHelp.add(mnuTechnicalService);

        mnuExitHelp.setText("Salir");
        mnuHelp.add(mnuExitHelp);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCreditCard;
    private javax.swing.JMenuItem mnuElectronicMoney;
    private javax.swing.JMenuItem mnuExitForms;
    private javax.swing.JMenuItem mnuExitHelp;
    private javax.swing.JMenuItem mnuExitShow;
    private javax.swing.JMenu mnuFastPay;
    private javax.swing.JMenu mnuForms;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuItemExit;
    private javax.swing.JMenu mnuItemShow;
    private javax.swing.JMenuItem mnuPrice;
    private javax.swing.JMenuItem mnuProducts;
    private javax.swing.JMenuItem mnuPromotions;
    private javax.swing.JMenuItem mnuStock;
    private javax.swing.JMenuItem mnuTechnicalService;
    private javax.swing.JMenuItem mnuUserManual;
    private javax.swing.JMenuItem mnuWireTransfer;
    // End of variables declaration//GEN-END:variables
}
