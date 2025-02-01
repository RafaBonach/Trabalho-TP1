package backend;

import java.util.List;

public class Compra {
    private Jogo jogo;
    private Cliente cliente;
    private static double saldoOriginal;

    // Construtores
    public Compra() {
    }
    
    public Compra(Jogo jogo, Cliente cliente){
        this.jogo = jogo;
        this.cliente = cliente;
        saldoOriginal = cliente.getSaldoCarteira();
    }
    
    // mostra o Preço do jogo
    public double precoJogo(){
        return jogo.getPreco();
    }
    
    // Mostra saldo do cliente
    public double clienteSaldo(){
        return cliente.getSaldoCarteira();
    }
    
    // Realiza a compra
    public int efetuaCompra(){
        // A compra já foi realizada
        if (cliente.getSaldoCarteira() != saldoOriginal){
            return 2;
        }
        // Compra Realizada com sucesso
        else if(cliente.subtraiSaldo(jogo.getPreco())){
            cliente.adicionaJogo(jogo);
            return 0;
        }
        // Saldo insuficiente
        else{
            return 1;
        }
    }
    
    // Cancela a compra
    public int cancelaCompra(){
        // O estorno já foi realizado
        if (cliente.getSaldoCarteira() == saldoOriginal){
            return 2;
        }
        // Cancelamento da compra realizado com sucesso
        else if(cliente.somaSaldo(jogo.getPreco())){
            cliente.removeJogo(jogo);
            return 0;
        }
        // Preço de jogo invalido
        else{
            return 1;
        }
    }
    
    // Verifica se o cliente já possui o jogo
    public boolean possui(){
        List<Jogo> listaJogosCliente = cliente.getListaJogos();
        return listaJogosCliente.contains(jogo);
    }
}
