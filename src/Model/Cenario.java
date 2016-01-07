/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author apple
 */
public class Cenario {
    public ArrayList<Navio> naviosColocados = new ArrayList<>(); //Lista dos navios colocados
    public Boolean orientacao = null; //variável de orientação do navio True= horizontal
    public int nivel;
    public int nJogadas;
    public int nTirosDados;
    public Jogador jogador;
    
    
    
    public Cenario(Jogador jogador){
        this.jogador = jogador;
        nTirosDados = 0;
    }
    
    //método para gerar um número aleatório
    /**
     * Método para gerar um número aleatório dentro de um intervalo
     * @param min valor mínimo do intervalo
     * @param max valor máximo do intervalo
     * @return int número gerado aleatoriamente
     */
    public static int randInt(int min, int max) {

        Random rn = new Random();
        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;
        return randomNum;
    }
    
    /**
     * Método para gerar as coordenadas dos navios
     * @param tipo tipo de navio
     * @return lista de coordenadas de um navio
     */
    public ArrayList<int []> gerarCoord(String tipo){
        int x1, x2, x3, x4; //coordenada x
        int y1, y2, y3, y4;// coordenada y
        int [] arraycoord1 = {0,0};
        int [] arraycoord2 = {0,0};
        int [] arraycoord3 = {0,0};
        int [] arraycoord4 = {0,0};
        ArrayList<int []> arrayTemp = new ArrayList<>();//Lista de coordenadas de um navio
        orientacao = true;
        if(tipo.equals("sub")){ //lógica para submarino
            do {      // repete a lógica caso as coordenadas coincidam com navios já existentes          
               x1 = randInt(1,20);
               y1 = randInt(1,20);
            
               arraycoord1[0] = x1;
               arraycoord1[1] = y1; 
            } while (checkCoord(arraycoord1, null, null, null) //verifica se coordenadas já existem noutros navios
                    || checkLimites(arraycoord1, null, null, null));//verifica se coordenadas dos navios estão dentro dos limites
            
            arrayTemp.add(arraycoord1);// adiciona par de coordenadas à lista de coordenadas de um navio
        }
        if(tipo.equals("cruz")){ // lógica para cruzador
            orientacao = gerarOrient();
            do{         // repete a lógica caso as coordenadas coincidam com navios já existentes
               x1 = randInt(1,20);
               y1 = randInt(1,20);
            
               arraycoord1[0] = x1;
               arraycoord1[1] = y1;
               
               if(orientacao){
                   x2 = x1 + 1;
                   y2 = y1;
               } else{
                   x2 = x1;
                   y2 = y1 + 1;
               }
               arraycoord2[0] = x2;
               arraycoord2[1] = y2;
            } while (checkCoord(arraycoord1, arraycoord2, null, null) //verifica se coordenadas já existem noutros navios
                    || checkLimites(arraycoord1, arraycoord2, null, null));//verifica se coordenadas dos navios estão dentro dos limites
            
            arrayTemp.add(arraycoord1);// adiciona par de coordenadas à lista de coordenadas de um navio
            arrayTemp.add(arraycoord2);
            
        }
        if(tipo.equals("pAvioes")){ // lógica para porta-aviões
            orientacao = gerarOrient();
            do{         // repete a lógica caso as coordenadas coincidam com navios já existentes
               x1 = randInt(1,20);
               y1 = randInt(1,20);
            
               arraycoord1[0] = x1;
               arraycoord1[1] = y1;
               
               if(orientacao){
                   x2 = x1 + 1;
                   y2 = y1;
                   x3 = x1 + 2;
                   y3 = y1;
                   x4 = x1 + 3;
                   y4 = y1;
               } else{
                   x2 = x1;
                   y2 = y1 + 1;
                   x3 = x1;
                   y3 = y1 + 2;
                   x4 = x1;
                   y4 = y1 + 3;
               }
               arraycoord2[0] = x2;
               arraycoord2[1] = y2;
               arraycoord3[0] = x3;
               arraycoord3[1] = y3;
               arraycoord4[0] = x4;
               arraycoord4[1] = y4;
            } while (checkCoord(arraycoord1, arraycoord2, arraycoord3, arraycoord4) //verifica se coordenadas já existem noutros navios
                    || checkLimites(arraycoord1, arraycoord2, arraycoord3, arraycoord4));//verifica se coordenadas dos navios estão dentro dos limites
            
            arrayTemp.add(arraycoord1);// adiciona par de coordenadas à lista de coordenadas de um navio
            arrayTemp.add(arraycoord2);
            arrayTemp.add(arraycoord3);
            arrayTemp.add(arraycoord4);
        }
        if(tipo.equals("paquete")){ // lógica para paquete
            orientacao = gerarOrient();
            do{         // repete a lógica caso as coordenadas coincidam com navios já existentes
               x1 = randInt(1,20);
               y1 = randInt(1,20);
            
               arraycoord1[0] = x1;
               arraycoord1[1] = y1;
               
               if(orientacao){
                   x2 = x1 + 1;
                   y2 = y1;
                   x3 = x1 + 2;
                   y3 = y1;
               } else{
                   x2 = x1;
                   y2 = y1 + 1;
                   x3 = x1;
                   y3 = y1 + 2;
               }
               arraycoord2[0] = x2;
               arraycoord2[1] = y2;
               arraycoord3[0] = x3;
               arraycoord3[1] = y3;
            } while (checkCoord(arraycoord1, arraycoord2, arraycoord3, null) //verifica se coordenadas já existem noutros navios
                    || checkLimites(arraycoord1, arraycoord2, arraycoord3, null));//verifica se coordenadas dos navios estão dentro dos limites
            
            arrayTemp.add(arraycoord1);// adiciona par de coordenadas à lista de coordenadas de um navio
            arrayTemp.add(arraycoord2);
            arrayTemp.add(arraycoord3);
        }
        if(tipo.equals("pContentores")){ // lógica para porta-contentores
            do{         // repete a lógica caso as coordenadas coincidam com navios já existentes
               x1 = randInt(1,20);
               y1 = randInt(1,20);
               
               x2 = x1 + 1;
               y2 = y1;
               x3 = x1;
               y3 = y1 + 1;
               x4 = x1 +1;
               y4 = y1 + 1;
            
               arraycoord1[0] = x1;
               arraycoord1[1] = y1;
               arraycoord2[0] = x2;
               arraycoord2[1] = y2;
               arraycoord3[0] = x3;
               arraycoord3[1] = y3;
               arraycoord4[0] = x4;
               arraycoord4[1] = y4;
            } while (checkCoord(arraycoord1, arraycoord2, arraycoord3, arraycoord4) //verifica se coordenadas já existem noutros navios
                    || checkLimites(arraycoord1, arraycoord2, arraycoord3, arraycoord4));//verifica se coordenadas dos navios estão dentro dos limites
            
            arrayTemp.add(arraycoord1);// adiciona par de coordenadas à lista de coordenadas de um navio
            arrayTemp.add(arraycoord2);
            arrayTemp.add(arraycoord3);
            arrayTemp.add(arraycoord4);
        }
        
        return arrayTemp;
    }
    

    /**
     * Método para gerar todos navios
     */
    public void gerarNavios(){
        
        gerarSubmarinos(); 
        gerarCruzadores();
        gerarPAvioes();
        gerarPaquete();
        gerarPContentores();
    }
    
   
    
/**
 * Método que compara as coordenadas geradas com as coordenadas dos navios já existentes
 * @param x coordenada x gerada
 * @param y coordenada y gerada
 * @return Boolean true se as coordenadas coincidirem com navio já existente
 */
    private boolean checkCoord(int [] ar1, int [] ar2, int [] ar3, int [] ar4) {
        ArrayList<int []> coordTemp = new ArrayList<>(); // lista temporária de coordenadas de um navio já existente
         for (Navio navioColocado : naviosColocados) { //método que percorre todos os navios colocados e compara as suas coordenadas com o x e y gerados aleatoriamente
            coordTemp = navioColocado.getPosicao();
             for (int[] array : coordTemp) {
                 if(ar4 != null){
                     if(ar4[0] == array[0] && ar4[1] == array[1]){
                         return true;
                     }
                 }
                 if(ar3 != null){
                     if(ar3[0] == array[0] && ar3[1] == array[1]){
                         return true;
                     }
                 }
                 if(ar2 != null){
                     if(ar2[0] == array[0] && ar2[1] == array[1]){
                         return true;
                     }
                 }
                 if(ar1[0] == array[0] && ar1[1] == array[1]){
                     return true;
                 }
             }
        }
        return false;
    }

    /**
     * Método que gera aleatoriamente a orientação (horizontal ou vertical) de um navio
     * @return Boolean true = horizontal
     */
    private Boolean gerarOrient() { // TODO: criar método random boolean que retorna true ou false
        int z;
        z = randInt(0, 1);
        if(z == 0){
            return true;
        } else{
            return false;
        }
    }

    

    /**
     * Método que retorna se as coordenadas estão dentro dos limites da grelha
     * @param ar1 array com par de coordenadas
     * @param ar2 array com par de coordenadas
     * @param ar3 array com par de coordenadas
     * @param ar4 array com par de coordenadas
     * @return Boolean true se fora dos limites da grelha
     */
    private boolean checkLimites(int[] ar1, int[] ar2, int[] ar3, int[] ar4) {
        if(ar4 != null){
            if ((ar4[0] < 1 || ar4[0] > 20) || (ar4[1] < 1 || ar4[1] > 20)){
                return true;
            }
        }
        if(ar3 != null){
            if ((ar3[0] < 1 || ar3[0] > 20) || (ar3[1] < 1 || ar3[1] > 20)){
                return true;
            }
        }
        if(ar2 != null){
            if ((ar2[0] < 1 || ar2[0] > 20) || (ar2[1] < 1 || ar2[1] > 20)){
                return true;
            }
        }
        if(ar1 != null){
            if ((ar1[0] < 1 || ar1[0] > 20) || (ar1[1] < 1 || ar1[1] > 20)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método para gerar todos os submarinos
     */
    private void gerarSubmarinos() {
        Submarino sub1 = new Submarino("sub", Boolean.TRUE, gerarCoord("sub"), 1);
        naviosColocados.add(sub1); // adiciona navio à lista de navios colocados
        Submarino sub2 = new Submarino("sub", Boolean.TRUE, gerarCoord("sub"), 1);
        naviosColocados.add(sub2); // adiciona navio à lista de navios colocados
        Submarino sub3 = new Submarino("sub", Boolean.TRUE, gerarCoord("sub"), 1);
        naviosColocados.add(sub3); // adiciona navio à lista de navios colocados
    }
    
    /**
     * Método para gerar todos os cruzadores
     */
    private void gerarCruzadores() {
        Cruzador cruz1 = new Cruzador("cruz", Boolean.TRUE, gerarCoord("cruz"), 2, orientacao);
        naviosColocados.add(cruz1);
        Cruzador cruz2 = new Cruzador("cruz", Boolean.TRUE, gerarCoord("cruz"), 2, orientacao);
        naviosColocados.add(cruz2);
        Cruzador cruz3 = new Cruzador("cruz", Boolean.TRUE, gerarCoord("cruz"), 2, orientacao);
        naviosColocados.add(cruz3);
        Cruzador cruz4 = new Cruzador("cruz", Boolean.TRUE, gerarCoord("cruz"), 2, orientacao);
        naviosColocados.add(cruz4);
        Cruzador cruz5 = new Cruzador("cruz", Boolean.TRUE, gerarCoord("cruz"), 2, orientacao);
        naviosColocados.add(cruz5);
        Cruzador cruz6 = new Cruzador("cruz", Boolean.TRUE, gerarCoord("cruz"), 2, orientacao);
        naviosColocados.add(cruz6);
    }

    /**
     * Método para gerar todos os porta-aviões
     */
    private void gerarPAvioes() {
        PortaAvioes pAvioes1 = new PortaAvioes("pAvioes", Boolean.TRUE, gerarCoord("pAvioes"), 4, orientacao);
        naviosColocados.add(pAvioes1);
        PortaAvioes pAvioes2 = new PortaAvioes("pAvioes", Boolean.TRUE, gerarCoord("pAvioes"), 4, orientacao);
        naviosColocados.add(pAvioes2);
    }

    /**
     * Método para gerar paquete
     */
    private void gerarPaquete() {
        Paquete paq1 = new Paquete("paquete", Boolean.FALSE, gerarCoord("paquete"), 3, orientacao);
        naviosColocados.add(paq1);
    }

    /**
     * Método para gerar todos os porta-contentores
     */
    private void gerarPContentores() {
        PortaContentores pCont1 = new PortaContentores("pContentores", Boolean.FALSE, gerarCoord("pContentores"), 4);
        naviosColocados.add(pCont1);
        PortaContentores pCont2 = new PortaContentores("pContentores", Boolean.FALSE, gerarCoord("pContentores"), 4);
        naviosColocados.add(pCont2);
    }
    
    
    
    /**
     * Método que compara o tiro dado pelo jogador com as coordenadas dos navios, incrementa o número de tiros dados, penaliza se o tiro acertar num navio civil e dá pontuação se se afundar um navio militar
     * @param x coordenada x
     * @param y coordenada y
     * @return Navio caso o tiro seja certeiro
     */
    public Navio checkTiro(int x, int y) {
        ArrayList<int []> coordTemp = new ArrayList<>(); // lista temporária de coordenadas de um navio já existente
            for (Navio navioColocado : naviosColocados) { //método que percorre todos os navios colocados e compara com o tiro do jogador
                coordTemp = navioColocado.getPosicao();
                    for (int[] array : coordTemp) {
                        if(x == array[0] && y == array[1]){
                            navioColocado.adicionaPosicoesAtingidas(x, y);
                            penalizacaoCivil(navioColocado); // penaliza por acertar num navio civil
                            darBonusSeMilitarAfundado(navioColocado);//dá bónus se acertar num navio militar
                            nTirosDados++;
                            return navioColocado;
                        } 
                    }
                }
        nTirosDados++; // incrementa tiros dados       
        return null; 
    }
    
    
    /**
     * Método que gera um novo cenário em função o nível de dificuldade escolhido
     */
    public void gerarCenario(){
        if(nivel == 1){
            nJogadas = 350;
        }
        if(nivel == 2){
            nJogadas = 250;
        }
        if(nivel == 3){
            nJogadas = 200;
        }
        gerarNavios();
    }
    
    
    /**
     * Método para determinar o número de jogadas restantes
     * @return inteiro número de jogadas restantes
     */
    public int nJogadasRest(){
        return (nJogadas - nTirosDados);
    }
    
    /**
     * Método que determina se o jogo termina e calcula a pontuação final
     * @return int em função do motivo do fim do jogo ou da sua continuação
     */
    public int terminarJogo(){
        
        if(terminaSeTerminaJog()){
            return 1;
        }
                
        if(terminaSeNMilAfundado()){
            return 2;
        }
        
        if(terminaSeMilAfundados()){
            int pontTemp = jogador.getPontuacao();
            jogador.setPontuacao(pontTemp + nJogadasRest());// determina a pontuação final do jogador no caso de afundar todos os navios militares
            return 0;
        }
        return 3; // Continuar o jogo
    }
    
    /**
     * Método que determina se todos os navios militares foram afundados
     * @return Boolean true = todos os navios militares foram afundados
     */
    public Boolean terminaSeMilAfundados(){
        int nMilitares = 0;
        int nMilAfundados = 0;
        Boolean milTemp;
        Boolean afundTemp;
        
        for (Navio navioColocado : naviosColocados){ //termina o jogo se todos os navios militares forem afundados
            milTemp = navioColocado.getMilitar();
            
            if(milTemp){
                nMilitares++;
                afundTemp = navioColocado.getAfundado();
            
                if(afundTemp){
                    nMilAfundados++;
                }
            }
        }
        if(nMilitares == nMilAfundados){
                return true;
        }
        return false;
    }
    
    /**
     * Método que determina se o número de jogadas terminou
     * @return Boolean true = terminaram as jogadas
     */
    public Boolean terminaSeTerminaJog(){
        if(nJogadas == nTirosDados){ // termina o jogo se terminar o número de jogadas
            return true;
        }
        return false;
    }
    
    /**
     * Método que determina se um navio civil foi afundado
     * @return Boolean true = navio civil afundado
     */
    public Boolean terminaSeNMilAfundado(){
         int nNMilAfundados = 0;
        Boolean milTemp;
        Boolean afundTemp;
        
        for (Navio navioColocado : naviosColocados) { // termina o jogo se for afundado um navio não militar
            milTemp = navioColocado.getMilitar();
            if(milTemp == false){
                afundTemp = navioColocado.getAfundado();
                if(afundTemp){
                    nNMilAfundados++;
                }
            }
        }
        if(nNMilAfundados == 1){
                return true;
        }
        return false;
    }
    
    /**
     * Método que dá bónus ou penalização em função do tipo de navio atingido
     * @param navioColocado 
     */
    public void darBonus(Navio navioColocado){
        int pontTemp = jogador.getPontuacao();
        if(navioColocado.getTipo() == "sub"){
           pontTemp += ((Submarino)navioColocado).getBonus();
           jogador.setPontuacao(pontTemp);
        }
        if(navioColocado.getTipo() == "cruz"){
           pontTemp += ((Cruzador)navioColocado).getBonus();
           jogador.setPontuacao(pontTemp);
        }
        if(navioColocado.getTipo() == "pAvioes"){
           pontTemp += ((PortaAvioes)navioColocado).getBonus();
           jogador.setPontuacao(pontTemp);
        }
        if(navioColocado.getTipo() == "paquete"){
           pontTemp += ((Paquete)navioColocado).getBonus();
           jogador.setPontuacao(pontTemp);
        }
        if(navioColocado.getTipo() == "pContentores"){
           pontTemp += ((PortaContentores)navioColocado).getBonus();
           jogador.setPontuacao(pontTemp);
        }
        
    }

    /**
     * Método que penaliza se se acertar num navio civil
     * @param navioColocado 
     */
    private void penalizacaoCivil(Navio navioColocado) {
        if(!navioColocado.getMilitar()){
            darBonus(navioColocado);
        }
    }

    /**
     * Método que retorna o nivel de dificuldade do jogo
     * @return int nivel
     */
    public int getNivel() {
        return nivel;
    }
    
/**
 * Método que permite definir o nível de dificuldade do jogo
 * @param nivel 
 */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Método que permite verificar se o navio militar foi afundado e, em função disso, dar bónus
     * @param navioColocado 
     */
    private void darBonusSeMilitarAfundado(Navio navioColocado) {
        if(navioColocado.getMilitar()){
            if(navioColocado.getAfundado()){
                darBonus(navioColocado);
            }
        }
    }
    
    
}
