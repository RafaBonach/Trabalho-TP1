/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author rafaelb
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    public static ArrayList<Cliente> listaClientes;
    String botao;
    private char previousEchoChar = '\u2022';
    
    public TelaCadastroCliente() {
        initComponents();
        
        this.inicializaArrayList();
                
        //Habilitar botões
        btnCadastrar.setEnabled(true);
        btnEntrar.setEnabled(true);
        
        //Habilitar campos de texto
        txtEmail.setEnabled(true);
        txtUsername.setEnabled(true);
        ftxtData.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmaSenha.setEnabled(true);
        
        aplicaMascara();
        
        System.out.println(listaClientes);

    }
    
    private void aplicaMascara(){
        try{
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');
            
            ftxtData.setFormatterFactory(new DefaultFormatterFactory(mascara));
            
        } catch (Exception e){
            System.err.println(e);
        }
    }
    
    private void inicializaArrayList(){
        try{
            listaClientes = TelaLoginCliente.listaClientes;
        } catch (Exception e){
            System.err.println(e);
            listaClientes = new ArrayList<>();
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

        tituloCadastrarCliente = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbConfSenha = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        ftxtData = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        lbPossuiConta = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lbSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmaSenha = new javax.swing.JPasswordField();
        lbRevelaSenha = new javax.swing.JLabel();
        btnRevelarSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de jogador");

        tituloCadastrarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        tituloCadastrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastrarCliente.setText("Cadastrar-se");

        txtEmail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbEmail.setText("Endereço de Email");

        lbUsername.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbUsername.setText("Nome de usuario");

        lbConfSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbConfSenha.setText("Confirmar senha");

        txtUsername.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lbData.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbData.setText("Data de Nascimento");

        ftxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        ftxtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lbPossuiConta.setText("Já possui uma conta?");

        btnEntrar.setBackground(new java.awt.Color(242, 242, 242));
        btnEntrar.setForeground(new java.awt.Color(0, 102, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setHideActionText(true);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSair)
                            .addComponent(lbPossuiConta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPossuiConta)
                    .addComponent(btnEntrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtConfirmaSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lbRevelaSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbRevelaSenha.setText("Revelar");

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
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbEmail)
                            .addComponent(tituloCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUsername))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbData)
                                    .addComponent(ftxtData, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSenha)
                                    .addComponent(lbConfSenha)
                                    .addComponent(txtSenha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRevelarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lbRevelaSenha))))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(242, 242, 242))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tituloCadastrarCliente)
                .addGap(18, 18, 18)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(lbData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftxtData)
                    .addComponent(txtUsername))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRevelarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbConfSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbRevelaSenha)
                        .addGap(247, 247, 247))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtEmail.getText().equals("") || txtUsername.getText().equals("") || 
                !ftxtData.getText().matches("\\d{2}/\\d{2}/\\d{4}") || txtSenha.getText().equals("") || 
                txtConfirmaSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser inseridos!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }else{
            String email = txtEmail.getText();
            String username = txtUsername.getText();
            String data = ftxtData.getText();
            String senha = txtSenha.getText();
            String confSenha = txtConfirmaSenha.getText();
            boolean equalName = false;
            
            if (listaClientes.isEmpty() == false){
                for(Cliente cli:listaClientes){
                    if (cli.getNomeUsuario().equals(username)){
                        JOptionPane.showMessageDialog(null,"Já existe um usuario com este nome, insira um novo nome.", "Mensagem",JOptionPane.PLAIN_MESSAGE);
                        equalName = true;
                        break;
                    }
                }
            
            }
            
            if (equalName == false){
                if (senha.equals(confSenha)){
                    // Criando objeto
                    int id = listaClientes.size();
                    
                    Cliente cliente = new Cliente(username, email, senha, data);
                    cliente.setId(id);

                    listaClientes.add(cliente);

                    new TelaLoginCliente().setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"A senha para confirmar deve ser igual a senha inserida!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
                }
            }
            
            //Habilitar botões
            btnCadastrar.setEnabled(true);
            btnEntrar.setEnabled(true);

            //Habilitar campos de texto
            txtEmail.setEnabled(true);
            txtUsername.setEnabled(true);
            ftxtData.setEnabled(true);
            txtSenha.setEnabled(true);
            txtConfirmaSenha.setEnabled(true);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //Sair da tela
        new TelaLoginCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void ftxtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtDataActionPerformed

    private void btnRevelarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevelarSenhaActionPerformed
        if (txtSenha.getEchoChar() != '\u0000' && txtConfirmaSenha.getEchoChar() != '\u0000'){
            previousEchoChar = txtSenha.getEchoChar();
            txtSenha.setEchoChar('\u0000');
            txtConfirmaSenha.setEchoChar('\u0000');
        }else{
            txtSenha.setEchoChar(previousEchoChar);
            txtConfirmaSenha.setEchoChar(previousEchoChar);
        }
    }//GEN-LAST:event_btnRevelarSenhaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        new TelaLoginCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRevelarSenha;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftxtData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbConfSenha;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbPossuiConta;
    private javax.swing.JLabel lbRevelaSenha;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel tituloCadastrarCliente;
    private javax.swing.JPasswordField txtConfirmaSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
