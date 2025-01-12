package backend;

abstract class Usuario {
    private String nomeUsuario;
    private String email;
    private String senha;
    private String dataRegistro;

    // Construtores
    public Usuario(String nomeUsuario, String email, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
    }
    public Usuario(String nomeUsuario, String email, String senha, String dataRegistro) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.dataRegistro = dataRegistro;
    }

    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
    public String toSting(){
        return "Usuario: " + nomeUsuario +
                "\nEmail: " + email +
                "\nData de Registro: "+ dataRegistro;
    }
}
