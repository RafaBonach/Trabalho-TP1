/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author rafaelb
 */
public class Teste {
    public static void main(String[] args) {
        // Criando o frame
        JFrame frame = new JFrame("Saldo no JFormattedTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Configurando o formato de número para moeda
        NumberFormat formatoMonetario = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormatter formatter = new NumberFormatter(formatoMonetario);
        formatter.setValueClass(Double.class); // Define o tipo de valor
        formatter.setMinimum(0.0); // Define o valor mínimo permitido
        formatter.setMaximum(Double.MAX_VALUE); // Define o valor máximo permitido
        formatter.setAllowsInvalid(false); // Evita entradas inválidas
        formatter.setCommitsOnValidEdit(true); // Atualiza o valor ao editar

        // Criando o JFormattedTextField com o formatter
        JFormattedTextField campoSaldo = new JFormattedTextField(formatter);
        campoSaldo.setColumns(15); // Define a largura do campo
        campoSaldo.setValue(0.0); // Valor inicial (opcional)
        campoSaldo.setText("13");
        String saldo = campoSaldo.getText().substring(3);
        saldo = saldo.replace(',', '.');
        double novoSaldo = Double.parseDouble(saldo);
        System.out.println(novoSaldo);

        // Adicionando os componentes ao frame
        frame.add(new JLabel("Saldo:"));
        frame.add(campoSaldo);

        // Tornando o frame visível
        frame.setVisible(true);
    }
}
