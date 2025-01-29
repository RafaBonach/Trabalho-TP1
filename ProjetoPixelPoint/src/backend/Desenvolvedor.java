/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;

public class Desenvolvedor extends Usuario {
    private String website;
    private String descricao;
    private ArrayList<Jogo> jogosCriados;

    public Desenvolvedor() {
    }
    
    
    public Desenvolvedor(String nomeUsuario, String email, String senha){
        super(nomeUsuario, email, senha);
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

    public ArrayList<Jogo> getJogosCriados() {
        return jogosCriados;
    }

    public void setJogosCriados(ArrayList<Jogo> jogosCriados) {
        this.jogosCriados = jogosCriados;
    }
    
    @Override
    public String toString(){
        return super.toSting() + 
                "\nWebsite: " + website + 
                "\nDescrição: " + descricao;
    }
}
