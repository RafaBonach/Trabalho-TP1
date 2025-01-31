package backend;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yuria
 */

public class Jogo {
    private String nome;
    private int id;
    private float preco;
    private float versao;
    private String genero;
    private String requisitos;
    
    public Jogo (String nome, int id, float preco, float versao, String genero, String requisitos){
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.versao = versao;
        this.genero = genero;
        this.requisitos = requisitos;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getId(){
        return this.id;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public float getVersao(){
        return this.versao;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getRequisitos(){
        return this.requisitos;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void setVersao(float versao){
        this.versao = versao;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setRequisitos(String requisitos){
        this.requisitos = requisitos;
    }

    @Override
    public String toString() {
        return nome + "\\|" + id + "\\|" + preco + "\\|" + versao + "\\|" + genero + "\\|" + requisitos;
    }
    
}
