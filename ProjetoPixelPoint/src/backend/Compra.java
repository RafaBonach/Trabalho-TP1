package backend;

public class Compra {
    private Jogo jogo;
    private Cliente cliente;
    
    public Compra(Jogo jogo, Cliente cliente){
        this.jogo = jogo;
        this.cliente = cliente;
    }
    
    public double precoJogo(){
        return jogo.getPreco();
    }
    
    public double clienteSaldo(){
        return cliente.getSaldoCarteira(cliente.getSenha());
    }
    
    public void efetuaCompra(){
        cliente.subtraiSaldo(jogo.getPreco(), cliente.getSenha());
    }
    
    public void cancelaCompra(){
        cliente.somaSaldo(jogo.getPreco(), cliente.getSenha());
    }
}
