/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author rafaelb
 */
public class Transacao {
    private int idTransacao;
    private String data;
    private String metodoPagamento;
    private ItemJogos itemJogos;

    // Construtor
    public Transacao(int idTransacao, String data, String metodoPagamento, ItemJogos itemJogos) {
        this.idTransacao = idTransacao;
        this.data = data;
        this.metodoPagamento = metodoPagamento;
        this.itemJogos = itemJogos;
        this.itemJogos = new ItemJogos();
    }

    // Getters e Setters
    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public ItemJogos getItemJogos() {
        return itemJogos;
    }

    public void setItemJogos(ItemJogos itemJogos) {
        this.itemJogos = itemJogos;
    }
    
    //Metodos
    public void processarTransacao()
}
