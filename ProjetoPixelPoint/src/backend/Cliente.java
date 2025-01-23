package backend;

public class Cliente extends Usuario {
    
    private String dataNascimento;
    private String nacionalidade;
    private String idioma;
    private double saldoCarteira;
    private String endereco;

    // Construtores
    public Cliente(String nomeUsuario, String email, String senha, String dataNascimento){
        super(nomeUsuario, email, senha);
        this.dataNascimento = dataNascimento;
    }
    public Cliente(String nomeUsuario, String email, String senha, String dataRegistro, String dataNascimento, String nacionalidade, String idioma, double saldoCarteira, String endereco) {
        super(nomeUsuario, email, senha, dataRegistro);
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.idioma = idioma;
        this.saldoCarteira = saldoCarteira;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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
                "\nNacionalidade: " + nacionalidade +
                "\nIdioma: " + idioma +
                "\nSaldo na Carteira: " + saldoCarteira +
                "\nEndereco: " + endereco;
    }
}
