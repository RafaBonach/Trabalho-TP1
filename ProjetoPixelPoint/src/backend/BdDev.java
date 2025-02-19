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
public class BdDev {

    public BdDev() {
    }
    
    private static final String NOME_ARQUIVO = "banco de dados desenvolvedores.txt";
    
    public static void atualizaBD(List<Desenvolvedor> desenvolvedores) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
        for (Desenvolvedor d : desenvolvedores){
            writer.write(d.toString());
            writer.newLine();
        }
        writer.close();
    }

    public static List<Desenvolvedor> leBD(List<Jogo> jogos) throws IOException {
        List<Jogo> jogosCriados = new ArrayList<>();
        List<Desenvolvedor> desenvolvedores = new ArrayList<>();
        Desenvolvedor d;
        
        BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
        
        String linha;
        while ((linha = reader.readLine()) != null) {
            // Divide a linha com base no símbolo "|"
            String[] parts = linha.split("\\|");
            d = new Desenvolvedor (parts[0], parts[1], parts[2]);
            d.setId(Integer.parseInt(parts[3]));
            try{
                d.setWebsite(parts[4]);
                d.setDescricao(parts[5]);
            } catch(Exception e){
                System.err.println(e);
            }
            desenvolvedores.add(d);
        }
        reader.close();
        return desenvolvedores;
    }
}
