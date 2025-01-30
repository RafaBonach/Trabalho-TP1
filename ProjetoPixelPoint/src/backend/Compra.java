package backend;

public class Compra {
    private Jogo jogo;
    private Cliente cliente;
    private static double saldoOriginal;
    
    public Compra(Jogo jogo, Cliente cliente){
        this.jogo = jogo;
        this.cliente = cliente;
        saldoOriginal = cliente.getSaldoCarteira();
    }
    
    public double precoJogo(){
        return jogo.getPreco();
    }
    
    public double clienteSaldo(){
        return cliente.getSaldoCarteira();
    }
    
    public int efetuaCompra(){
        // A compra já foi realizada
        if (cliente.getSaldoCarteira() != saldoOriginal){
            return 2;
        }
        // Compra Realizada com sucesso
        else if(cliente.subtraiSaldo(jogo.getPreco())){
            return 0;
        }
        // Saldo insuficiente
        else{
            return 1;
        }
    }
    
    public int cancelaCompra(){
        // O estorno já foi realizado
        if (cliente.getSaldoCarteira() == saldoOriginal){
            return 2;
        }
        // Cancelamento da compra realizado com sucesso
        else if(cliente.somaSaldo(jogo.getPreco())){
            return 0;
        }
        // Preço de jogo invalido
        else{
            return 1;
        }
    }
}
