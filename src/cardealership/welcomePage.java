/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership;

/**
 *
 * @author rjnkr
 */
public class welcomePage extends javax.swing.JFrame {

    /**
     * Creates new form welcomePage
     */
    public welcomePage() {
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

        lblVolkswagenIcon = new javax.swing.JLabel();
        lblVolkswagenSpecial = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuViewCars = new javax.swing.JMenu();
        jMenuBuyCar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVolkswagenIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volkswagen.jpg"))); // NOI18N

        lblVolkswagenSpecial.setText("<html>\n<h1><center>Volkswagen Special Offers</center></h1></br>\n<center>Join the biggest family in South Africa with these finely turned finance plans. Volkswagen</center><br>\n<center>Special Offers have been designed to ensure that joining South Africa's biggest</center><br>\n<center>family is nowmore affordable tham ever before</center><br>\n</html>");

        jMenuFile.setText("File");
        jMenuBar1.add(jMenuFile);

        jMenuViewCars.setText("View Cars");
        jMenuViewCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuViewCarsMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuViewCars);

        jMenuBuyCar.setText("Buy a car");
        jMenuBuyCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBuyCarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuBuyCar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVolkswagenIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVolkswagenSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVolkswagenIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVolkswagenSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuViewCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuViewCarsMouseClicked
        this.dispose();
        new viewCars().setVisible(true);
    }//GEN-LAST:event_jMenuViewCarsMouseClicked

    private void jMenuBuyCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBuyCarMouseClicked
        this.dispose();
        new finance().setVisible(true);
    }//GEN-LAST:event_jMenuBuyCarMouseClicked

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
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBuyCar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuViewCars;
    private javax.swing.JLabel lblVolkswagenIcon;
    private javax.swing.JLabel lblVolkswagenSpecial;
    // End of variables declaration//GEN-END:variables
}
