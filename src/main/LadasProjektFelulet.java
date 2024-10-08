/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

// import java.awt.Event;
import javax.swing.JOptionPane;
// import java.util.Random;

/**
 *
 * @author KosztolányiÁkos(SZF_
 */
public class LadasProjektFelulet extends javax.swing.JFrame {
    String tippeles;
    String szoveg;
    String joValasztas;
    String rosszValasztas;
    
    
    public LadasProjektFelulet() {
        joValasztas = "Gratulálok, sikerült megtalálnod a kincset.";
        rosszValasztas = "Nem sikerült megtalálnod a kincset.";
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeirasLabel = new javax.swing.JLabel();
        CimLabel = new javax.swing.JLabel();
        AranyLadaPanel = new javax.swing.JPanel();
        AranyLadaKep = new javax.swing.JLabel();
        AranyLadaGomb = new javax.swing.JButton();
        AranyLadaLabel = new javax.swing.JLabel();
        EzustLadaPanel = new javax.swing.JPanel();
        EzustLadaLabel = new javax.swing.JLabel();
        EzustLadaGomb = new javax.swing.JButton();
        EzustLadaKep = new javax.swing.JLabel();
        BronzLadaPanel = new javax.swing.JPanel();
        BronzLadaLabel = new javax.swing.JLabel();
        BronzLadaKep = new javax.swing.JLabel();
        BronzLadaGomb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        setResizable(false);

        LeirasLabel.setText("A három ládából az egyik kincset rejt. Mindegyik ládán van egy felirat, melyből csak az egyik igaz.");

        CimLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CimLabel.setText("Melyik láda rejti a kincset?");

        AranyLadaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AranyLadaKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/arany_lada.jpg"))); // NOI18N

        AranyLadaGomb.setText("Arany láda");
        AranyLadaGomb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AranyLadaGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AranyLadaGombActionPerformed(evt);
            }
        });

        AranyLadaLabel.setText("Én rejtem a kincset");

        javax.swing.GroupLayout AranyLadaPanelLayout = new javax.swing.GroupLayout(AranyLadaPanel);
        AranyLadaPanel.setLayout(AranyLadaPanelLayout);
        AranyLadaPanelLayout.setHorizontalGroup(
            AranyLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AranyLadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AranyLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AranyLadaGomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AranyLadaKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AranyLadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        AranyLadaPanelLayout.setVerticalGroup(
            AranyLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AranyLadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AranyLadaKep)
                .addGap(18, 18, 18)
                .addComponent(AranyLadaLabel)
                .addGap(13, 13, 13)
                .addComponent(AranyLadaGomb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EzustLadaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EzustLadaLabel.setText("Nem én rejtem a kincset");

        EzustLadaGomb.setText("Ezüst láda");
        EzustLadaGomb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EzustLadaGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EzustLadaGombActionPerformed(evt);
            }
        });

        EzustLadaKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ezust_lada.jpg"))); // NOI18N

        javax.swing.GroupLayout EzustLadaPanelLayout = new javax.swing.GroupLayout(EzustLadaPanel);
        EzustLadaPanel.setLayout(EzustLadaPanelLayout);
        EzustLadaPanelLayout.setHorizontalGroup(
            EzustLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EzustLadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EzustLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EzustLadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EzustLadaKep)
                    .addComponent(EzustLadaGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        EzustLadaPanelLayout.setVerticalGroup(
            EzustLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EzustLadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EzustLadaKep)
                .addGap(18, 18, 18)
                .addComponent(EzustLadaLabel)
                .addGap(13, 13, 13)
                .addComponent(EzustLadaGomb)
                .addContainerGap())
        );

        BronzLadaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BronzLadaLabel.setText("Az arany láda hazudik");

        BronzLadaKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bronz_lada.jpg"))); // NOI18N

        BronzLadaGomb.setText("Bronz láda");
        BronzLadaGomb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BronzLadaGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BronzLadaGombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BronzLadaPanelLayout = new javax.swing.GroupLayout(BronzLadaPanel);
        BronzLadaPanel.setLayout(BronzLadaPanelLayout);
        BronzLadaPanelLayout.setHorizontalGroup(
            BronzLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BronzLadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BronzLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BronzLadaKep)
                    .addComponent(BronzLadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BronzLadaGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        BronzLadaPanelLayout.setVerticalGroup(
            BronzLadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BronzLadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BronzLadaKep)
                .addGap(18, 18, 18)
                .addComponent(BronzLadaLabel)
                .addGap(13, 13, 13)
                .addComponent(BronzLadaGomb)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(AranyLadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(EzustLadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(BronzLadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeirasLabel)
                    .addComponent(CimLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LeirasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CimLabel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EzustLadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AranyLadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BronzLadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EzustLadaGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EzustLadaGombActionPerformed
        //JOptionPane.showMessageDialog(rootPane, "Nem jó a válasz, próbáld újra!");
        tippeles = "Ezüst:";
        JOptionPane.showMessageDialog(rootPane, tippeles + "\n" + rosszValasztas);
    }//GEN-LAST:event_EzustLadaGombActionPerformed

    private void BronzLadaGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BronzLadaGombActionPerformed
        //JOptionPane.showMessageDialog(rootPane, "Nem jó a válasz, próbáld újra!");
        tippeles = "Bronz:";
        JOptionPane.showMessageDialog(rootPane, tippeles + "\n" + rosszValasztas);
    }//GEN-LAST:event_BronzLadaGombActionPerformed

    private void AranyLadaGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AranyLadaGombActionPerformed
        tippeles = "Arany:";
        JOptionPane.showMessageDialog(rootPane, tippeles + "\n" + joValasztas);
    }//GEN-LAST:event_AranyLadaGombActionPerformed

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
            java.util.logging.Logger.getLogger(LadasProjektFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LadasProjektFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LadasProjektFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LadasProjektFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LadasProjektFelulet().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AranyLadaGomb;
    private javax.swing.JLabel AranyLadaKep;
    private javax.swing.JLabel AranyLadaLabel;
    private javax.swing.JPanel AranyLadaPanel;
    private javax.swing.JButton BronzLadaGomb;
    private javax.swing.JLabel BronzLadaKep;
    private javax.swing.JLabel BronzLadaLabel;
    private javax.swing.JPanel BronzLadaPanel;
    private javax.swing.JLabel CimLabel;
    private javax.swing.JButton EzustLadaGomb;
    private javax.swing.JLabel EzustLadaKep;
    private javax.swing.JLabel EzustLadaLabel;
    private javax.swing.JPanel EzustLadaPanel;
    private javax.swing.JLabel LeirasLabel;
    // End of variables declaration//GEN-END:variables
}
