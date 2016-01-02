/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author apple
 */
public class Jogador {
    public String nome;
    public int pontuacao;
   
    
    public Jogador(){
   
    }

    /**
     * Método que retorna o nome
     * @return String nome do jogador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que permite alterar o atributo nome do jogador
     * @param nome String nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método quer retorna a pontuação do jogador
     * @return int pontuação
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Método que permite alterar a pontução do jogador
     * @param pontuacao 
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    
}
