/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

public class Desenvolvedor extends Usuario {
    private String website = "";
    private String descricao = "";

    //Construtores
    public Desenvolvedor() {
    }
    
    public Desenvolvedor(String nomeUsuario, String email, String senha){
        super(nomeUsuario, email, senha);
    }

    // Getters e Setters
    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return super.toString() + "|" + this.website + "|" + this.descricao;
    }
}
