/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.*;
import java.util.*;
import java.util.List;

/**
 *
 * @author yuria
 */
public class BancoDeDados {
    private static final String NOME_ARQUIVO = "banco de dados.txt";
    
    public static void atualizaBD(List<Jogo> jogos) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
        for (Jogo jogo : jogos){
            writer.write(jogo.getNome() + "|" + String.valueOf(jogo.getId()) + "|" + 
                    String.valueOf(jogo.getPreco()) + "|" + String.valueOf(jogo.getVersao()) + "|" + 
                    jogo.getGenero() + "|" + jogo.getRequisitos());
            writer.newLine();
        }
        writer.close();
    }

    public static List<Jogo> leBD() throws IOException {
        List<Jogo> jogos = new ArrayList();
        
        BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
        
        String linha;
        while ((linha = reader.readLine()) != null) {
                // Divide a linha com base no símbolo "|"
                String[] parts = linha.split("\\|");

            Jogo jogo = new Jogo (parts[0], Integer.parseInt(parts[1]), Float.parseFloat(parts[2]), Float.parseFloat(parts[3]), parts[4], parts[5]);
            jogos.add(jogo);
        }
        
        reader.close();
        return jogos;
    }

}
