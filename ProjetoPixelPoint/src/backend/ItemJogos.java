/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
/**
 *
 * @author rafaelb
 */
public class ItemJogos {
    private double valorTotal = 0.00;
    private ArrayList<Jogo> jogos;
    private ArrayList<DLC> DLCs;
    
    public void adicionarJogo(Jogo jogo){
        jogos.add(jogo);
    }
    
    public void retirarJogo(Jogo jogo){
        jogos.remove(jogo);
    }
    
    public void adicionarDLC(DLC dlc){
        DLCs.add(dlc);
    }
    
    public void retirarDLC(DLC dlc){
        DLCs.remove(dlc);
    }
    
    public double calcularValorTotal(){
        for (int i=0; i<jogos.size(); i++){
            valorTotal += jogos[i].getPreco();
        }
        for (int i=0; i<DLCs.size(); i++){
            valorTotal += DLCs[i].getPreco();
        }
    }
    public String mostraLista(){
        String listaJogos = "Preço | Nome\n";
        for (int i = 0; i<jogos.size(); i++){
            listaJogos += String.format("R$%.2f", jogos[i].getPreco);
            listaJogos += " " + jogos[i].getNome() + "\n\n";
        }
        for (int i = 0; i<DLCs.size(); i++){
            listaJogos += String.format("R$%.2f", DLCs[i].getPreco);
            listaJogos += " " + DLCs[i].getNome() + "\n\n";
        }
    }
    
    
}
