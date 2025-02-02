package backend;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    
    private String dataNascimento;
    private double saldoCarteira;
    private String endereco = "";
    private List<Jogo> listaJogos;

    // Construtores
    public Cliente() {
        this.listaJogos = new ArrayList<>();
    }
    
    
    public Cliente(String nomeUsuario, String email, String senha, String dataNascimento){
        super(nomeUsuario, email, senha);
        this.listaJogos = new ArrayList<>();
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSaldoCarteira() {
        return this.saldoCarteira;
    }

    public boolean setSaldoCarteira(double saldoCarteira) {
        if(saldoCarteira >= 0){
            this.saldoCarteira = saldoCarteira;
            return true;
        }
        return false;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Jogo> getListaJogos() {
        return this.listaJogos;
    }

    public void setListaJogos(List<Jogo> listaJogos) {
        this.listaJogos = listaJogos;
    }
    
    // Coloca mais saldo na conta
    public boolean somaSaldo(double valor){
        if(valor >= 0){
            this.saldoCarteira += valor;
            return true;
        }
        return false;
    }
    
    // Retira saldo da conta
    public boolean subtraiSaldo(double valor){
        if(valor >= 0 && (this.saldoCarteira-valor) >= 0){
            this.saldoCarteira -= valor;
            return true;
        }
        return false;   
    }
    
    // Adiciona jogo a lista de jogos do cliente
    public void adicionaJogo(Jogo jogo){
        this.listaJogos.add(jogo);
    }
    
    // Remove jogo da lista de jogos do cliente pelo ID ou pelo tipo
    public void removeJogo(Jogo jogo){
        this.listaJogos.remove(jogo);
    }
    
    public void removeJogo(int Id){
        this.listaJogos.remove(Id);
    }
    
    // Mostra as informações do cliente para serem salvas no banco de dados
    @Override
    public String toString() {
        String jogos = "";
        for (Jogo j:this.listaJogos){
            jogos = "|" + j.getNome();
        }
        return super.toString() + "|" + this.dataNascimento + "|" + this.saldoCarteira + "|" + this.endereco + jogos;
    }
}
