/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.Desenvolvedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rafaelb
 */
public class TelaLoginDesenvolvedor extends javax.swing.JFrame {
    
    // Inicializando a lista de desenvolvedores e a variavel de mostrar senha
    static List<Desenvolvedor> listaDesenvolvedores = new ArrayList<>();
    private char previousEchoChar = '\u2022';
    static Desenvolvedor desenvolvedor;
    
    public TelaLoginDesenvolvedor() {
        initComponents();
        
        listaDesenvolvedores = TelaPrincipal.listaDesenvolvedores;
        desenvolvedor = null;
        
        //Habilitar botões
        btnLogin.setEnabled(true);
        btnCadastrar.setEnabled(true);
        btnRevelarSenha.setEnabled(true);
        
        //Habilitar campos de texto
        txtNomeDesenvolvedor.setEnabled(true);
        txtSenha.setEnabled(true);
        
        //Limpa campos de texto
        txtNomeDesenvolvedor.setText("");
        txtSenha.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbNomeDesenvolvedor = new javax.swing.JLabel();
        txtNomeDesenvolvedor = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnRevelarSenha = new javax.swing.JButton();
        lbRevelarSenha = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lbPossuiConta = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login do Desenvolvedor");

        lbTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("PixelPoint");

        lbNomeDesenvolvedor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbNomeDesenvolvedor.setText("Insira seu nome de Desenvolvedor/Empresa");

        txtNomeDesenvolvedor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtNomeDesenvolvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDesenvolvedorActionPerformed(evt);
            }
        });

        lbSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbSenha.setText("Insira a senha");

        txtSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnRevelarSenha.setText("👁️");
        btnRevelarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevelarSenhaActionPerformed(evt);
            }
        });

        lbRevelarSenha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbRevelarSenha.setText("Revelar");

        btnLogin.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnLogin.setText("Iniciar Sessão");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbPossuiConta.setText("Não tem uma conta?");

        btnCadastrar.setBackground(new java.awt.Color(242, 242, 242));
        btnCadastrar.setForeground(new java.awt.Color(0, 102, 255));
        btnCadastrar.setText("Cadastrar-se");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNomeDesenvolvedor)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeDesenvolvedor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSenha)
                                .addGap(0, 227, Short.MAX_VALUE))
                            .addComponent(txtSenha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRevelarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lbRevelarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPossuiConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNomeDesenvolvedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(lbRevelarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRevelarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(31, 31, 31)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPossuiConta)
                    .addComponent(btnCadastrar))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDesenvolvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDesenvolvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDesenvolvedorActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnRevelarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevelarSenhaActionPerformed
        if (txtSenha.getEchoChar() != '\u0000'){
            previousEchoChar = txtSenha.getEchoChar();
            txtSenha.setEchoChar('\u0000');
        }else txtSenha.setEchoChar(previousEchoChar);
    }//GEN-LAST:event_btnRevelarSenhaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Verifica se os campos principais possuem informação para serem modificados
        if(txtNomeDesenvolvedor.getText().equals("") || txtSenha.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Insira o Email e a Senha!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }else{
            //Procurar d na lista
            String nomeDesenvolvedor = txtNomeDesenvolvedor.getText();
            String senha = txtSenha.getText();
            
            // Verifica se existe algum desenvolvedor com este nome e senha
            boolean nomeCorrespondente = false;
            boolean senhaCorrespondente = false;
            for(Desenvolvedor d:listaDesenvolvedores){
                if(d.getNomeUsuario().equals(nomeDesenvolvedor)) {
                    nomeCorrespondente = true;
                    if (d.getSenha().equals(senha)){
                        // Entra na tela de desenvolvedor
                        senhaCorrespondente = true;
                        desenvolvedor = d;
                        new TelaPerfilDesenvolvedor().setVisible(true);
                        this.dispose();
                        break;
                    }
                }
            }
            // Algum campo está inválido ou o cliente não foi registrado
            if (nomeCorrespondente){
                if(!senhaCorrespondente) JOptionPane.showMessageDialog(null,"senha invalida", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,"Nenhuma conta registrada com essas informações, cadastre-se para acessar todos os recursos do PixelPoint", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            }
            
            //Limpar senha
            txtSenha.setText("");
            
            //Habilitar botões
            btnLogin.setEnabled(true);
            btnCadastrar.setEnabled(true);
        
            //Habilitar campos de texto
            txtNomeDesenvolvedor.setEnabled(true);
            txtSenha.setEnabled(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        new TelaCadastroDesenvolvedor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        desenvolvedor = null;
        new TelaPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginDesenvolvedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRevelarSenha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lbNomeDesenvolvedor;
    private javax.swing.JLabel lbPossuiConta;
    private javax.swing.JLabel lbRevelarSenha;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtNomeDesenvolvedor;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
