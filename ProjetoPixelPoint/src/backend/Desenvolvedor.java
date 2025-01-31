/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor extends Usuario {
    private String website = "";
    private String descricao = "";
    private List<Jogo> jogosCriados;

    public Desenvolvedor() {
        this.jogosCriados = new ArrayList<>();
    }
    
    
    public Desenvolvedor(String nomeUsuario, String email, String senha){
        super(nomeUsuario, email, senha);
        this.jogosCriados = new ArrayList<>();
    }

    // Getters e Setters
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Jogo> getJogosCriados() {
        return jogosCriados;
    }

    public void setJogosCriados(List<Jogo> jogosCriados) {
        this.jogosCriados = jogosCriados;
    }
    
    public void adicionaJogo(String nome, int id, double preco, int versao, String genero, String requisitos){
        Jogo jogo = new Jogo(nome, id, preco, versao, genero, requisitos);
        jogosCriados.add(jogo);
    }
    
    public void excluirJogo(int id){
        jogosCriados.remove(id);
    }
    
    @Override
    public String toString(){
        String jogos = "";
        for (Jogo j:jogosCriados){
            jogos = "\\|" + j.getId();
        }
        return super.toSting() + "\\|" + website + "\\|" + descricao + jogos;
    }
}
