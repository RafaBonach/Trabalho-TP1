package backend;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private String dataNascimento;
    private double saldoCarteira;
    private String endereco;
    private ArrayList<Jogo> listaJogos;

    // Construtores

    public Cliente() {
    }
    
    
    public Cliente(String nomeUsuario, String email, String senha, String dataNascimento){
        super(nomeUsuario, email, senha);
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSaldoCarteira(String senha) {
        if(super.getSenha().equals(senha)){
            return saldoCarteira;
        }
        return -1;
    }

    public boolean setSaldoCarteira(double saldoCarteira, String senha) {
        if(super.getSenha().equals(senha) && saldoCarteira >= 0){
            this.saldoCarteira = saldoCarteira;
            return true;
        }
        return false;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Jogo> getListaJogos() {
        return listaJogos;
    }

    public void setListaJogos(ArrayList<Jogo> listaJogos) {
        this.listaJogos = listaJogos;
    }
    
    public boolean somaSaldo(double valor, String senha){
        try{
            if(super.getSenha().equals(senha) && valor >= 0){
                this.saldoCarteira += valor;
                return true;
            }
            return false;
        }catch (Exception e){
            return this.setSaldoCarteira(valor, senha);
        }
    }
    
    public boolean subtraiSaldo(double valor, String senha){
        try{
            if(super.getSenha().equals(senha) && valor >= 0 && this.saldoCarteira-valor >= 0){
                this.saldoCarteira -= valor;
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }
    
    @Override
    public String toString() {
        return super.toSting() + 
                "\nData de Nascimento: " + dataNascimento +
                "\nSaldo na Carteira: " + saldoCarteira +
                "\nEndereco: " + endereco;
    }
}
