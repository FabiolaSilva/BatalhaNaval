/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import Model.Jogador;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author Cat
 */
public class Pre_Tabuleiro extends javax.swing.JFrame {

    Jogador jogador = new Jogador();
    int nivel = 0;
            
    /**
     * Creates new form Tabuleiro
     * @param jogador
     */
    public Pre_Tabuleiro(Jogador jogador, int nivel) {
        this.jogador = jogador;
        this.nivel = nivel;
        initComponents();
        setLabels(nivel);
    }

    private Pre_Tabuleiro() {
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
        jLabelJogador = new javax.swing.JLabel();
        jLabelDif = new javax.swing.JLabel();
        jButtonResponder = new javax.swing.JButton();
        jButtonSairTab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        setForeground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(189, 707));

        jLabelJogador.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jLabelJogador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJogador.setText("NomJog");

        jLabelDif.setFont(new java.awt.Font("Tekton Pro Cond", 0, 16)); // NOI18N
        jLabelDif.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDif.setText("(dificuldade)");

        jButtonResponder.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonResponder.setText("Gerar Cenário");
        jButtonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResponderActionPerformed(evt);
            }
        });

        jButtonSairTab.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonSairTab.setText("Sair");
        jButtonSairTab.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonSairTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSairTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDif, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonResponder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(jButtonSairTab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jButtonResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResponderActionPerformed
        // TODO add your handling code here:
        dispose();
        Tabuleiro_Resposta r = new Tabuleiro_Resposta(jogador, nivel);
        r.setVisible(true);
        
    }//GEN-LAST:event_jButtonResponderActionPerformed

    private void jButtonSairTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairTabActionPerformed
        // TODO add your handling code here:
        BemVindo s = new BemVindo();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSairTabActionPerformed

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
            java.util.logging.Logger.getLogger(Pre_Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pre_Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pre_Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pre_Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
                            

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pre_Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResponder;
    private javax.swing.JButton jButtonSairTab;
    private javax.swing.JLabel jLabelDif;
    private javax.swing.JLabel jLabelJogador;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    //Método que permite definir o texto que aparece nas labels
    private void setLabels(int nivel) {
        if(nivel == 1){
            jLabelDif.setText("Fácil");
        }
        if(nivel == 2){
            jLabelDif.setText("Médio");
        }
        if(nivel == 3){
            jLabelDif.setText("Difícil");
        }
        jLabelJogador.setText(jogador.getNome());
    }
}
