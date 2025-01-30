package backend;

import java.util.List;

public class Cliente extends Usuario {
    
    private String dataNascimento;
    private double saldoCarteira;
    private String endereco;
    private List<Jogo> listaJogos;

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

    public double getSaldoCarteira() {
        return saldoCarteira;
    }

    public boolean setSaldoCarteira(double saldoCarteira) {
        if(saldoCarteira >= 0){
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

    public List<Jogo> getListaJogos() {
        return listaJogos;
    }

    public void setListaJogos(List<Jogo> listaJogos) {
        this.listaJogos = listaJogos;
    }
    
    public boolean somaSaldo(double valor){
        if(valor >= 0){
            this.saldoCarteira += valor;
            return true;
        }
        return false;
    }
    
    public boolean subtraiSaldo(double valor){
        if(valor >= 0 && (this.saldoCarteira-valor) >= 0){
            this.saldoCarteira -= valor;
            return true;
        }
        return false;
        
    }
    
    @Override
    public String toString() {
        return super.toSting() + 
                "\nData de Nascimento: " + dataNascimento +
                "\nSaldo na Carteira: " + saldoCarteira +
                "\nEndereco: " + endereco;
    }
}
