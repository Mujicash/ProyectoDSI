/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author USER
 */
public class FrmRegistrarGuiaRemision extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarGuiaRemision
     */
    public FrmRegistrarGuiaRemision() {
        initComponents();
        setTitle("REGISTRAR GUÍA DE REMISIÓN");
        setSize(906, 657);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBaseRegGuiaRemision = new javax.swing.JPanel();
        jPanelRetPrincipal5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBaseRegGuiaRemision.setBackground(new java.awt.Color(204, 204, 255));
        jPanelBaseRegGuiaRemision.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRetPrincipal5.setBackground(new java.awt.Color(0, 0, 51));
        jPanelRetPrincipal5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRetPrincipal5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRetPrincipal5Layout = new javax.swing.GroupLayout(jPanelRetPrincipal5);
        jPanelRetPrincipal5.setLayout(jPanelRetPrincipal5Layout);
        jPanelRetPrincipal5Layout.setHorizontalGroup(
            jPanelRetPrincipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelRetPrincipal5Layout.setVerticalGroup(
            jPanelRetPrincipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelRetPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegGuiaRemision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegGuiaRemision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRetPrincipal5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRetPrincipal5MouseClicked
        FrmPrincipal ret5 = new FrmPrincipal();
        ret5.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanelRetPrincipal5MouseClicked

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
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarGuiaRemision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBaseRegGuiaRemision;
    private javax.swing.JPanel jPanelRetPrincipal5;
    // End of variables declaration//GEN-END:variables
}
