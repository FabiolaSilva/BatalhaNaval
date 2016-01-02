/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class PortaAvioes extends Navio{
    public Boolean rotacao;
    public int bonus;

    public PortaAvioes(String tipo, Boolean militar, ArrayList posicao, int numCoord, Boolean rotacao) {
        super(tipo, militar, posicao, numCoord);
        this.rotacao = rotacao; 
        bonus = 10;
    }

    /**
     * Método que retorna a rotação (horizontal ou vertical)
     * @return Boolean rotação do navio
     */
    public Boolean getRotacao() {
        return rotacao;
    }

   /**
    * Método que permite alterar o atributo rotacao
    * @param rotacao Boolean 
    */
    public void setRotacao(Boolean rotacao) {
        this.rotacao = rotacao;
    }

    
    /**
     * Método que retorna o bónus de cada navio
     * @return int bónus
     */
    public int getBonus() {
        return bonus;
    }
    
    
    
}
