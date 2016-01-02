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
public class Navio {
    public String tipo;
    public Boolean militar;
    public ArrayList<int []> posicao = new ArrayList<>();
    public Boolean afundado;
    public int numCoord;
    public ArrayList<int []> posicoesAtingidas = new ArrayList<>();
    
    

    
    
    public Navio (String tipo,  Boolean militar, ArrayList posicao, int numCoord){
        this.tipo = tipo;
        this.militar = militar;
        this.posicao = posicao;
        this.numCoord = numCoord;
        afundado = false;
    }
    
    /**
     * Método que retorna o tipo de navio
     * @return String com o tipo
     */
    public String getTipo(){
        return tipo;
    }
    
    /**
     * Método que permite alterar o tipo de navio
     * @param novoTipo String com o tipo
     */
    public void setTipo(String novoTipo){
        tipo = novoTipo;
    }
    
    /**
     * Método que retorna se o navio é militar ou não
     * @return Boolean true = militar
     */
    public Boolean getMilitar(){
        return militar;
    }
    
    /**
     * Método que permite alterar o atributo militar
     * @param militar Boolean
     */
    public void setMilitar(Boolean militar){
        this.militar = militar;
    }
    
    /**
     * Método que retorna se o navio está afundado ou não
     * @return Boolean true = afundado
     */
    public Boolean getAfundado(){
        return afundado;
    }
    
    /**
     * Método que permite alterar o atributo afundado
     * @param afundado Boolean
     */
    public void setAfundado(Boolean afundado){
        this.afundado = afundado;
    }
    
    /**
     * Método que retorna o número de pares de coordenadas
     * @return int número de coordenadas
     */
    public int getNumCoord(){
        return numCoord;
    }
    
    /**
     * Método que permite alterar o atributo numCoord
     * @param novoNumCoord inteiro número de coordenadas
     */
    public void setNumCoord(int novoNumCoord){
        numCoord = novoNumCoord;
    }
    
    /**
     * Método que permite adicionar pares de coordenadas ao arraylist posicao
     * @param coord array de inteiros com coordenadas X e y
     */
    public void addCoodenadas(int coord []){
        posicao.add(coord);
    }

    
    /**
     * Método que permite saber as coordenadas de determinado navio
     * @return ArrayList com as coordenadas do navio
     */
    public ArrayList<int[]> getPosicao() {
        return posicao;
    }
    
    
    /**
     * Método que permite saber que coordenadas de um navio já foram atingidas
     * @return ArrayList com coordenadas já atingidas
     */
    public ArrayList<int[]> getPosicoesAtingidas() {
        return posicoesAtingidas;
    }
    
    
    /**
     * Método que permite adicionar coordenadas ao ArrayList posicoesAtingidas
     * @param x coordenada x
     * @param y coordenada y
     */
    public void adicionaPosicoesAtingidas(int x, int y){
        int[] arrayTemp = null;
        arrayTemp[0] = x;
        arrayTemp[1] = y;
        
        posicoesAtingidas.add(arrayTemp);
        verificaSeAfundado();
    }
    
    
    /**
     * Método que permite verificar se um determinado navio já foi afundado
     */
    public void verificaSeAfundado(){
        if(posicao.size() == posicoesAtingidas.size()){
            setAfundado(true);
        }
    }

    
    
    
    
}
