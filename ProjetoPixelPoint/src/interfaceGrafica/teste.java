/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import javax.swing.text.DefaultFormatterFactory;

/**
 *
 * @author rafaelb
 */
public class teste {
    public static void main(String[] args) {
        // Criando o frame principal
        JFrame frame = new JFrame("Exemplo de JFormattedTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        
        try {
            // Criando uma máscara para o formato de data
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_'); // Substitui espaços em branco por "_"
            
            JButton salvar = new JButton("Salvar");


            // Aplicando a máscara ao JFormattedTextField
            JFormattedTextField campoData = new JFormattedTextField(mascaraData);
            campoData.setColumns(10); // Largura do campo

            // Adicionando o campo ao frame
            frame.add(new JLabel("Digite uma data:"));
            frame.add(campoData);
            frame.add(salvar);
            
            salvar.addActionListener(l -> {
            try {
                System.out.println(campoData.getText());
            } catch (Exception e){
                System.err.println(e);
            }
        });
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
        

        // Tornando o frame visível
        frame.setVisible(true);
    }

}
