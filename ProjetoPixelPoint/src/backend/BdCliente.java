/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yuria
 */
public class BdCliente {
    private static final String NOME_ARQUIVO = "banco de dados clientes.txt";

    public static void atualizaBD(List<Cliente> clientes) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
        for (Cliente c  : clientes){
            writer.write(c.toString());
            writer.newLine();
        }
        writer.close();
    }
    
    public static List<Cliente> leBD(List<Jogo> jogos) throws IOException {
        List<Jogo> Biblioteca = new ArrayList();
        List<Cliente> clientes = new ArrayList();
        Cliente c;
        
        BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
        
        String linha;
        while ((linha = reader.readLine()) != null) {
            // Divide a linha com base no símbolo "|"
            String[] parts = linha.split("\\|");
                
            //Cria uma lista de jogos pegando os nomes dos jogos no banco de dados do cliente e comparando com os nomes dos jogos na lista de jogos
            for (int i = 6; i < parts.length; i++){
                for (Jogo jogo : jogos){
                    if (parts[i].equals(jogo.getNome())){
                        Biblioteca.add(jogo);
                    }
                }
            }
            //Cria um novo cliente usando uma linha do banco de dados.
            //String nomeUsuario, String email, String senha, String dataNascimento
            c = new Cliente (parts[0], parts[1], parts[2], parts[4]);
            // int id
            c.setId(Integer.parseInt(parts[3]));
            // double saldoCarteira
            c.setSaldoCarteira(Double.parseDouble(parts[5]));
            //List<Jogo> listaJogos
            c.setListaJogos(Biblioteca);
            clientes.add(c);
        }
        reader.close();
        return clientes;
    }
}

/*
public BancoDeDadosDesenvolvedor() {
    }
    
    private static final String NOME_ARQUIVO = "banco de dados desenvolvedores.txt";
    
    public static void atualizaBD(List<Desenvolvedor> desenvolvedores) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
        for (Desenvolvedor desenvolvedor : desenvolvedores){
            writer.write(desenvolvedor.toString());
            writer.newLine();
        }
        writer.close();
    }

    public static List<Desenvolvedor> leBD(List<Jogo> jogos) throws IOException {
        List<Jogo> jogosCriados = new ArrayList();
        List<Desenvolvedor> desenvolvedores = new ArrayList();
        
        BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
        
        String linha;
        while ((linha = reader.readLine()) != null) {
                // Divide a linha com base no símbolo "|"
                String[] parts = linha.split("\\|");

            Desenvolvedor desenvolvedor = new Desenvolvedor (parts[0], parts[1], parts[2]);
            desenvolvedor.setId(Integer.valueOf(parts[3]));
            desenvolvedor.setWebsite(parts[4]);
            desenvolvedor.setDescricao(parts[5]);
            for (int i = 6; i < parts.length; i++){
                for (Jogo jogo : jogos){
                    if (parts[i].equals(jogo.getNome())){
                        jogosCriados.add(jogo);
                    }
                }
            }
            desenvolvedor.setJogosCriados(jogosCriados);
            desenvolvedores.add(desenvolvedor);
        }
        reader.close();
        return desenvolvedores;
    }
}
*/