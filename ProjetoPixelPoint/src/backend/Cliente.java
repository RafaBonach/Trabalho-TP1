package backend;

public class Cliente extends Usuario {
    
    private String dataNascimento;
    private double saldoCarteira;
    private String endereco;

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

    public void setSaldoCarteira(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return super.toSting() + 
                "\nData de Nascimento: " + dataNascimento +
                "\nSaldo na Carteira: " + saldoCarteira +
                "\nEndereco: " + endereco;
    }
}
