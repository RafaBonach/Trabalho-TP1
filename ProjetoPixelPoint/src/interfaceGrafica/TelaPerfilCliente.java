/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.Cliente;
import backend.Jogo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafaelb
 */
public class TelaPerfilCliente extends javax.swing.JFrame {
    
    static ArrayList<Jogo> listaJogos;
    static Cliente cliente = TelaLoginCliente.clienteSelecionado;
    private char previousEchoChar = '\u2022';
    String botao;
    /**
     * Creates new form TelaPerfil
     */
    public TelaPerfilCliente() {
        initComponents();
        
        // Inicializando os botões
        btnLoja.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnSair.setEnabled(true);
        btnExcluirConta.setEnabled(true);
        
        // Desabilitando campos de Texto
        txtUsuario.setEnabled(false);
        txtID.setEnabled(false);
        ftxtDataRegistro.setEnabled(false);
        txtSenha.setEnabled(false);
        txtEmail.setEnabled(false);
        ftxtDataNascimento.setEnabled(false);
        
        //Carregar informações do cliente
        txtUsuario.setText(cliente.getNomeUsuario());
        txtID.setText("");
        ftxtDataRegistro.setText(cliente.getDataRegistro());
        txtSenha.setText(cliente.getSenha());
        txtEmail.setText(cliente.getEmail());
        ftxtDataNascimento.setText(cliente.getDataNascimento());
        
    }
    
    public void carregaLista(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Gênero","Requisitos"},0);
        for(Jogo jogos:listaJogos){
            Object linha[] = new Object[]{
                                        jogos.getNome(),
                                        jogos.getGenero(),
                                        jogos.getRequisitos()};
            modelo.addRow(linha);
        }
        // Alocando modelo na tabela
        tblJogos.setModel(modelo);
        
        tblJogos.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblJogos.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblJogos.getColumnModel().getColumn(2).setPreferredWidth(10);
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lbTitulo = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbDataNascimento = new javax.swing.JLabel();
        ftxtDataNascimento = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        lbEndereco = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbDataRegistro = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        ftxtDataRegistro = new javax.swing.JFormattedTextField();
        txtUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJogos = new javax.swing.JTable();
        lbJogos = new javax.swing.JLabel();
        btnLoja = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluirConta = new javax.swing.JButton();
        lbRevelarSenha = new javax.swing.JLabel();
        btnRevelarSenha = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Configurações da Conta");

        lbUsername.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbUsername.setText("Nome de Usuario");

        lbSenha.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbSenha.setText("Senha");

        lbEmail.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbEmail.setText("Email");

        lbDataNascimento.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbDataNascimento.setText("Data de Nascimento");

        ftxtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        txtSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lbEndereco.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbEndereco.setText("Endereço");

        btnSalvar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbID.setText("ID");

        lbDataRegistro.setText("Data de Registro");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtID.setText("00000");
        txtID.setBorder(null);

        ftxtDataRegistro.setEditable(false);
        ftxtDataRegistro.setBorder(null);
        ftxtDataRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        ftxtDataRegistro.setText("12/12/2000");
        ftxtDataRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataRegistroActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtEndereco.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        tblJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblJogos);

        lbJogos.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbJogos.setText("Jogos");

        btnLoja.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnLoja.setText("Loja");
        btnLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLojaActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluirConta.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnExcluirConta.setText("Excluir Conta");
        btnExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirContaActionPerformed(evt);
            }
        });

        lbRevelarSenha.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbRevelarSenha.setText("Revelar");

        btnRevelarSenha.setText("👁️");
        btnRevelarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevelarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnLoja)
                        .addGap(46, 46, 46)
                        .addComponent(btnSalvar)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(52, 52, 52)
                        .addComponent(btnExcluirConta)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbJogos)
                            .addComponent(lbDataNascimento)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(ftxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbUsername)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbID)
                                                .addGap(108, 108, 108)
                                                .addComponent(lbDataRegistro))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ftxtDataRegistro))))
                                    .addComponent(lbEndereco)
                                    .addComponent(lbEmail))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSenha)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRevelarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbRevelarSenha, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(lbDataRegistro)
                    .addComponent(lbUsername)
                    .addComponent(lbSenha)
                    .addComponent(lbRevelarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftxtDataRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRevelarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbJogos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSair)
                    .addComponent(btnLoja)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluirConta))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        new TelaLoginCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void ftxtDataRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtDataRegistroActionPerformed

    private void btnLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLojaActionPerformed

    private void btnExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirContaActionPerformed

    private void btnRevelarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevelarSenhaActionPerformed
        if (txtSenha.getEchoChar() != '\u0000'){
            previousEchoChar = txtSenha.getEchoChar();
            txtSenha.setEchoChar('\u0000');
        }else txtSenha.setEchoChar(previousEchoChar);
    }//GEN-LAST:event_btnRevelarSenhaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        botao = "editar";
        
        // Habilitar e desabilitar botoes
        btnLoja.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnSair.setEnabled(true);
        btnExcluirConta.setEnabled(true);
        
        // Habilitar e desabilitar campos de Texto
        txtUsuario.setEnabled(true);
        txtID.setEnabled(false);
        ftxtDataRegistro.setEnabled(false);
        txtSenha.setEnabled(true);
        txtEmail.setEnabled(true);
        ftxtDataNascimento.setEnabled(true);
        txtEmail.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (txtUsuario.getText().equals("") || txtSenha.getText().equals("") || txtEmail.getText().equals("") ||
            ftxtDataNascimento.getText().equals("") || txtEndereco.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser inseridos!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        } else{
            String usuario = txtUsuario.getName();
            String senha = txtSenha.getText();
            String email = txtEmail.getText();
            String dataNascimento = ftxtDataNascimento.getText();
            String endereco = txtEndereco.getText();
            
            if(botao.equals("editar")){
                cliente.setNomeUsuario(usuario);
                cliente.setSenha(senha);
                cliente.setEmail(email);
                cliente.setDataNascimento(dataNascimento);
                cliente.setEndereco(endereco);
            }
            
            // Inicializando os botões
        btnLoja.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnSair.setEnabled(true);
        btnExcluirConta.setEnabled(true);
        
        // Desabilitando campos de Texto
        txtUsuario.setEnabled(false);
        txtID.setEnabled(false);
        ftxtDataRegistro.setEnabled(false);
        txtSenha.setEnabled(false);
        txtEmail.setEnabled(false);
        ftxtDataNascimento.setEnabled(false);
        
        //Carregar informações do cliente
        txtUsuario.setText(cliente.getNomeUsuario());
        txtID.setText("");
        ftxtDataRegistro.setText(cliente.getDataRegistro());
        txtSenha.setText(cliente.getSenha());
        txtEmail.setText(cliente.getEmail());
        ftxtDataNascimento.setText(cliente.getDataNascimento());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerfilCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerfilCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerfilCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerfilCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfilCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluirConta;
    private javax.swing.JButton btnLoja;
    private javax.swing.JButton btnRevelarSenha;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftxtDataNascimento;
    private javax.swing.JFormattedTextField ftxtDataRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbDataRegistro;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbJogos;
    private javax.swing.JLabel lbRevelarSenha;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTable tblJogos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
