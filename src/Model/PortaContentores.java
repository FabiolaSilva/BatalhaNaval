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
public class PortaContentores extends Navio{
    public int bonus;
    
    public PortaContentores(String tipo, Boolean militar, ArrayList posicao, int numCoord) {
        super(tipo, militar, posicao, numCoord);
        bonus = -20;
    }

    /**
     * Método que retorna o bónus de cada navio
     * @return int bónus
     */
    public int getBonus() {
        return bonus;
    }
    
    
    
}
