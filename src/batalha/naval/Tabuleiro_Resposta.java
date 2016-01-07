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
public class Tabuleiro_Resposta extends javax.swing.JFrame {
    
    Jogador jogador = new Jogador();
    int nivel = 0;

    /**
     * Creates new form Tabuleiro
     */
    public Tabuleiro_Resposta(Jogador jogador, int nivel) {
        this.nivel = nivel;
        this.jogador = jogador;
        initComponents();
        setLabels(nivel);
    }

    private Tabuleiro_Resposta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent. WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabelDif = new javax.swing.JLabel();
        jButtonResponder = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelJogador1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSairTab = new javax.swing.JButton();
        jLabelPontos = new javax.swing.JLabel();
        jLabelPontuacao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Batalha Naval");
        setBackground(new java.awt.Color(0, 102, 102));
        setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        setForeground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabelDif.setFont(new java.awt.Font("Tekton Pro Cond", 0, 16)); // NOI18N
        jLabelDif.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDif.setText("(dificuldade)");

        jButtonResponder.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonResponder.setText("Responder à Ameaça");
        jButtonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResponderActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Batalha Naval");

        jLabelJogador1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jLabelJogador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJogador1.setText("(nomeJog)");

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalha/naval/cenario_gif/barquinho.gif"))); // NOI18N

        jButtonSairTab.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButtonSairTab.setText("Sair");
        jButtonSairTab.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonSairTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairTabActionPerformed(evt);
            }
        });

        jLabelPontos.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabelPontos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontos.setText("0");
        jLabelPontos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabelPontuacao.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        jLabelPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontuacao.setText("PONTUAÇÃO :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPontuacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSairTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(719, 719, 719)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJogador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonResponder)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDif, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonResponder)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(406, 406, 406)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(jLabelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButtonSairTab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairTabActionPerformed
        // TODO add your handling code here:
        close();
        BemVindo s = new BemVindo();
        s.setVisible(true);
        
    }//GEN-LAST:event_jButtonSairTabActionPerformed

    private void jButtonResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResponderActionPerformed
        // TODO add your handling code here:
        close();
        Tabuleiro j = new Tabuleiro(jogador, nivel);
        j.setVisible(true);
    }//GEN-LAST:event_jButtonResponderActionPerformed

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
            java.util.logging.Logger.getLogger(Tabuleiro_Resposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro_Resposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro_Resposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro_Resposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro_Resposta().setVisible(true);
            }
        });
    }

 
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResponder;
    private javax.swing.JButton jButtonSairTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDif;
    private javax.swing.JLabel jLabelJogador1;
    private javax.swing.JLabel jLabelPontos;
    private javax.swing.JLabel jLabelPontuacao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

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
        jLabelJogador1.setText(jogador.getNome());
    }
}
