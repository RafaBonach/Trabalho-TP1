/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.BdCliente;
import backend.BdJogos;
import backend.Cliente;
import backend.Compra;
import backend.Jogo;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author rafaelb
 */
public class TelaComprar extends javax.swing.JFrame {
    
    static List<Cliente> listaClientes = new ArrayList<>();
    static Cliente cliente = TelaLoginCliente.cliente;
    static Jogo jogo = TelaLoja.jogo;
    static Compra transferencia = new Compra(jogo, cliente);

    
    /**
     * Creates new form comprar
     */
    public TelaComprar() {
        initComponents();
        if(transferencia.possui()){
            JOptionPane.showMessageDialog(null,"Este jogo já foi adquirido, escolha outro jogo da loja para comprar", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            new TelaLoja().setVisible(true);
            this.dispose();
        }else{
            // Aplica a mascara em todos os JFormattedTextField
            aplicaMascara();

            // Inicializa botões
            btnCancelar.setEnabled(true);
            btnConfirmar.setEnabled(true);

            // Desabilita campos de texto
            txtNomeJogo.setEnabled(false);
            ftxtSaldo.setEnabled(false);
            ftxtSaldoRestante.setEnabled(false);
            ftxtPreco.setEnabled(false);

            // Inicializa os valores nos campos de texto
            txtNomeJogo.setText(TelaLoja.jogo.getNome());
            ftxtSaldo.setValue(transferencia.clienteSaldo());
            ftxtPreco.setValue(transferencia.precoJogo());
            ftxtSaldoRestante.setValue((double) ftxtSaldo.getValue() - (double) ftxtPreco.getValue());
        }
    }
    
    private void aplicaMascara(){
        try{
            // Configurando o formato de número para moeda
            NumberFormat formatoMonetario = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
            NumberFormatter formatter = new NumberFormatter(formatoMonetario);
            formatter.setMinimum(0.0); // Define o valor mínimo permitido
            formatter.setMaximum(Double.MAX_VALUE); // Define o valor máximo permitido
            formatter.setAllowsInvalid(false); // Evita entradas inválidas
            
            // Criando o JFormattedTextField com o formatter
            ftxtSaldo.setFormatterFactory(new DefaultFormatterFactory(formatter));
            ftxtSaldo.setValue(0);
            
            ftxtSaldoRestante.setFormatterFactory(new DefaultFormatterFactory(formatter));
            ftxtSaldoRestante.setValue(0);
            
            ftxtPreco.setFormatterFactory(new DefaultFormatterFactory(formatter));
            ftxtPreco.setValue(0);
            
        } catch (Exception e){
            System.err.println(e);
        }   
    }
    
    private void alteraBanco(){
        try{
            BdCliente.atualizaBD(listaClientes);
        }catch (IOException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeJogo = new javax.swing.JTextField();
        lbSaldo = new javax.swing.JLabel();
        ftxtSaldo = new javax.swing.JFormattedTextField();
        lbPreco = new javax.swing.JLabel();
        ftxtPreco = new javax.swing.JFormattedTextField();
        lbSaldoRestante1 = new javax.swing.JLabel();
        lbSaldoRestante2 = new javax.swing.JLabel();
        ftxtSaldoRestante = new javax.swing.JFormattedTextField();
        lbLinha = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomeJogo.setEditable(false);
        txtNomeJogo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        txtNomeJogo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeJogo.setText("Nome do Jogo");
        txtNomeJogo.setBorder(null);
        txtNomeJogo.setDisabledTextColor(new java.awt.Color(0, 0, 51));
        txtNomeJogo.setSelectedTextColor(new java.awt.Color(242, 242, 242));

        lbSaldo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbSaldo.setText("Saldo:");

        ftxtSaldo.setEditable(false);
        ftxtSaldo.setBorder(null);
        ftxtSaldo.setForeground(new java.awt.Color(51, 51, 255));
        ftxtSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        ftxtSaldo.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        ftxtSaldo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ftxtSaldo.setSelectedTextColor(new java.awt.Color(242, 242, 242));
        ftxtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtSaldoActionPerformed(evt);
            }
        });

        lbPreco.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbPreco.setText("Preço:");

        ftxtPreco.setEditable(false);
        ftxtPreco.setBorder(null);
        ftxtPreco.setForeground(new java.awt.Color(255, 51, 51));
        ftxtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        ftxtPreco.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        ftxtPreco.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        lbSaldoRestante1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbSaldoRestante1.setText("Saldo");

        lbSaldoRestante2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbSaldoRestante2.setText("restante:");

        ftxtSaldoRestante.setEditable(false);
        ftxtSaldoRestante.setBorder(null);
        ftxtSaldoRestante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        ftxtSaldoRestante.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ftxtSaldoRestante.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ftxtSaldoRestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtSaldoRestanteActionPerformed(evt);
            }
        });

        lbLinha.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbLinha.setText("__________________");

        btnConfirmar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNomeJogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSaldoRestante1)
                                    .addComponent(btnCancelar))
                                .addGap(38, 38, 38)
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbLinha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbSaldo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ftxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(87, 87, 87)
                                            .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbSaldoRestante2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtSaldoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtNomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldo)
                    .addComponent(ftxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSaldoRestante1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldoRestante2)
                    .addComponent(ftxtSaldoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        new TelaLoja().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ftxtSaldoRestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtSaldoRestanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtSaldoRestanteActionPerformed

    private void ftxtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtSaldoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        int compraRealizada = transferencia.efetuaCompra();
        // Verifica se a compra foi realizada com suscesso ou não
        switch (compraRealizada) {
            case 0 -> {
                int resposta = JOptionPane.showConfirmDialog(
                        null, // Componente pai (null para janela centralizada)
                        "Gostaria de comprar " + TelaLoja.jogo.getNome() + "?", // Mensagem exibida
                        "Confirmação", // Título da janela
                        JOptionPane.YES_NO_OPTION // Tipos de botões exibidos
                );  
                
                // Verifica qual botão foi pressionado
                if (resposta == JOptionPane.NO_OPTION) transferencia.cancelaCompra();
                else{
                    if(cliente.getListaJogos().contains(jogo) == false){
                        cliente.adicionaJogo(jogo);
                    }
                    listaClientes.set(cliente.getId(), cliente);
                    alteraBanco();
                    
                    JOptionPane.showMessageDialog(null,"Jogo adquirido com sucesso!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
                }
                
            }
            case 1 -> JOptionPane.showMessageDialog(null,"Saldo insuficiente, coloque mais saldo na conta para comprar este jogo", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            case 2 -> JOptionPane.showMessageDialog(null,"Esta compra já foi realizada", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            default -> {}
        }
        
        new TelaLoja().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JFormattedTextField ftxtPreco;
    private javax.swing.JFormattedTextField ftxtSaldo;
    private javax.swing.JFormattedTextField ftxtSaldoRestante;
    private javax.swing.JLabel lbLinha;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbSaldoRestante1;
    private javax.swing.JLabel lbSaldoRestante2;
    private javax.swing.JTextField txtNomeJogo;
    // End of variables declaration//GEN-END:variables
}
