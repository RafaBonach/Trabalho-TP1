/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

public class Desenvolvedor extends Usuario {
    private int id;
    private String website;
    private String descricao;

    public Desenvolvedor() {
    }
    
    
    public Desenvolvedor(String email, String nomeUsuario, String senha){
        super(nomeUsuario, email, senha);
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    @Override
    public String toString(){
        return super.toSting() + 
                "\nID: " + id +
                "\nWebsite: " + website + 
                "\nDescrição: " + descricao;
    }
}
