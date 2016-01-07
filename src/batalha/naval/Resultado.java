/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import Model.Cenario;
import Model.Jogador;
import batalha.naval.BemVindo;
import batalha.naval.Dificuldade;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Cat
 */
public class Resultado extends javax.swing.JFrame {
    Jogador jogador = new Jogador();
    int termJogo;
   

    /**
     * Creates new form Rank
     */
    public Resultado(Jogador jogador, int termJogo) {
        this.jogador = jogador;
        this.termJogo = termJogo;
        initComponents();
        setLabels();
    }

    public Resultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabelGameOver = new javax.swing.JLabel();
        jLabelMotivo = new javax.swing.JLabel();
        jButtonNovoJogo = new javax.swing.JButton();
        jButtonSairRank = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabelGameOver.setFont(new java.awt.Font("Tekton Pro Cond", 1, 46)); // NOI18N
        jLabelGameOver.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGameOver.setText("(ganhou ou não)");

        jLabelMotivo.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabelMotivo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMotivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMotivo.setText("(Motivo)");
        jLabelMotivo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButtonNovoJogo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonNovoJogo.setText("Novo Jogo");
        jButtonNovoJogo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoJogoActionPerformed(evt);
            }
        });

        jButtonSairRank.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonSairRank.setText("Sair");
        jButtonSairRank.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonSairRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairRankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGameOver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButtonNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonSairRank, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelGameOver)
                .addGap(30, 30, 30)
                .addComponent(jLabelMotivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonSairRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
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

    private void jButtonSairRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairRankActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairRankActionPerformed

    private void jButtonNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoJogoActionPerformed
        dispose();
        BemVindo novojogo = new BemVindo();
        novojogo.setVisible(true);
    }//GEN-LAST:event_jButtonNovoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNovoJogo;
    private javax.swing.JButton jButtonSairRank;
    private javax.swing.JLabel jLabelGameOver;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    //Método que permite definir o texto que aparece nas labels
    private void setLabels() {
        
        if(termJogo == 0){
            jLabelGameOver.setText("Parabéns! Ganhou!!!!");
            jLabelMotivo.setText("Afundou todos os navios militares com " + jogador.getPontuacao() + " pontos");
        }
        if(termJogo == 1){
            jLabelGameOver.setText("Game Over");
            jLabelMotivo.setText("Esgotou o número de jogadas.");
        }else if(termJogo == 2){
            jLabelGameOver.setText("Game Over");
            jLabelMotivo.setText("Afundou um navio civil.");
        }
    }
}
