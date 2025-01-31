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
    private double preco;
    private int versao;
    private String genero;
    private String requisitos;
    
    public Jogo (String nome, int id, double preco, int versao, String genero, String requisitos){
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
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getVersao(){
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
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setVersao(int versao){
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
