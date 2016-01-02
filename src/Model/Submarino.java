/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author appleOLA
 */
public class Submarino extends Navio{
    public int bonus;
   
    public Submarino(String tipo, Boolean militar, ArrayList posicao, int numCoord) {
        super(tipo, militar, posicao, numCoord);
        bonus = 20;
    }

    /**
     * Método que permite retornar o valor do bónus referente a cada navio
     * @return int bónus
     */
    public int getBonus() {
        return bonus;
    }

    

    
    
    
    
    
}
