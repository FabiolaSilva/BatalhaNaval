/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author Cat
 */
public class BemVindo extends javax.swing.JFrame {

    /**
     * Creates new form BemVindo
     */
    public BemVindo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelBV = new javax.swing.JLabel();
        jButtonManualBV = new javax.swing.JButton();
        jButtonIniciarBV = new javax.swing.JButton();
        jButtonSairBV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabelBV.setFont(new java.awt.Font("Tekton Pro Cond", 1, 46)); // NOI18N
        jLabelBV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bemvindo.jpg"))); // NOI18N

        jButtonManualBV.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonManualBV.setText("Manual");
        jButtonManualBV.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonManualBV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonManualBVMouseClicked(evt);
            }
        });
        jButtonManualBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManualBVActionPerformed(evt);
            }
        });

        jButtonIniciarBV.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonIniciarBV.setText("Iniciar");
        jButtonIniciarBV.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonIniciarBV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIniciarBVMouseClicked(evt);
            }
        });
        jButtonIniciarBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarBVActionPerformed(evt);
            }
        });

        jButtonSairBV.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonSairBV.setText("Sair");
        jButtonSairBV.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonSairBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairBVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelBV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonManualBV, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonIniciarBV, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSairBV, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelBV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonIniciarBV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSairBV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonManualBV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManualBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManualBVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonManualBVActionPerformed

    private void jButtonSairBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairBVActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairBVActionPerformed

    private void jButtonManualBVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonManualBVMouseClicked
        // TODO add your handling code here:
        dispose();
        Manual p = new Manual();
        p.setVisible(true);
                
    }//GEN-LAST:event_jButtonManualBVMouseClicked

    private void jButtonIniciarBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarBVActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonIniciarBVActionPerformed

    private void jButtonIniciarBVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarBVMouseClicked
        // TODO add your handling code here:
        Dificuldade j = new Dificuldade();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonIniciarBVMouseClicked

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
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BemVindo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarBV;
    private javax.swing.JButton jButtonManualBV;
    private javax.swing.JButton jButtonSairBV;
    private javax.swing.JLabel jLabelBV;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
