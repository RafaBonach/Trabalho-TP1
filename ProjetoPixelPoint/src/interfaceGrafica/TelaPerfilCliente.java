/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.Cliente;
import backend.Jogo;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author rafaelb
 */
public class TelaPerfilCliente extends javax.swing.JFrame {
    
    static ArrayList<Jogo> listaJogos;
    static ArrayList<Cliente> listaClientes;
    static Cliente cliente = TelaLoginCliente.clienteSelecionado;
    private char previousEchoChar = '\u2022';
    String botao;
    
    
    /**
     * Creates new form TelaPerfil
     */
    public TelaPerfilCliente() {
        initComponents();
        
        this.inicializaArrayList();
        
        botao = null;
        
        // Inicializando os botões
        btnLoja.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnSair.setEnabled(true);
        btnExcluirConta.setEnabled(true);
        
        // Desabilitando campos de Texto
        txtUsuario.setEnabled(false);
        txtID.setEnabled(false);
        txtSenha.setEnabled(false);
        ftxtDataNascimento.setEnabled(false);
        ftxtSaldo.setEnabled(false);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        
        // Inicializa os campos formatados
        this.aplicaMascara();
        
        // Carregar informações do cliente
        txtUsuario.setText(cliente.getNomeUsuario());
        txtID.setText(String.valueOf(cliente.getId()));
        txtSenha.setText(cliente.getSenha());
        txtEmail.setText(cliente.getEmail());
        txtEndereco.setText(cliente.getEndereco());
        
        // Carregando as informações do Cliente nos campos formatados
        if (cliente.getDataNascimento().matches("\\d{2}/\\d{2}/\\d{4}")) {
            ftxtDataNascimento.setText(cliente.getDataNascimento());
        }
        if (cliente.getSaldoCarteira(cliente.getSenha()) >= 0){
            ftxtSaldo.setValue(cliente.getSaldoCarteira(cliente.getSenha()));
        }
        
        System.out.println(listaClientes);
    }
    
    public void carregaTabelaJogos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Gênero","Requisitos"},0);
        for(Jogo jogos:listaJogos){
            Object linha[] = new Object[]{jogos.getNome(),
                                        jogos.getGenero(),
                                        jogos.getRequisitos()};
            modelo.addRow(linha);
        }
        // Alocando modelo na tabela
        tblJogos.setModel(modelo);
        
        tblJogos.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblJogos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblJogos.getColumnModel().getColumn(2).setPreferredWidth(100);
    }
    
    private void aplicaMascara(){
        try{
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');
            
            ftxtDataNascimento.setFormatterFactory(new DefaultFormatterFactory(mascara));
            
            // Configurando o formato de número para moeda
            NumberFormat formatoMonetario = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
            NumberFormatter formatter = new NumberFormatter(formatoMonetario);
            formatter.setMinimum(0.0); // Define o valor mínimo permitido
            formatter.setMaximum(Double.MAX_VALUE); // Define o valor máximo permitido
            formatter.setAllowsInvalid(false); // Evita entradas inválidas
            
            // Criando o JFormattedTextField com o formatter
            ftxtSaldo.setFormatterFactory(new DefaultFormatterFactory(formatter));
            ftxtSaldo.setValue(0);
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

    
    // Ele vai modificar para ficar com as informações iguais ao inicializar a classe
    private void setInicial(){
        // Inicializando os botões
        btnLoja.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnSair.setEnabled(true);
        btnExcluirConta.setEnabled(true);
        btnAlteraSaldo.setEnabled(true);
        

        // Desabilitando campos de Texto
        txtUsuario.setEnabled(false);
        txtID.setEnabled(false);
        txtSenha.setEnabled(false);
        txtEmail.setEnabled(false);
        ftxtDataNascimento.setEnabled(false);
        txtEndereco.setEnabled(false);
        ftxtSaldo.setEnabled(false);

        //Carregar informações do cliente
        txtUsuario.setText(cliente.getNomeUsuario());
        txtID.setText(String.format("%d", cliente.getId()));
        txtSenha.setText(cliente.getSenha());
        txtEmail.setText(cliente.getEmail());
        ftxtDataNascimento.setText(cliente.getDataNascimento());
        txtEndereco.setText(cliente.getEndereco());
        ftxtSaldo.setValue(cliente.getSaldoCarteira(cliente.getSenha()));

        botao = null;
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
        txtID = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJogos = new javax.swing.JTable();
        lbJogos = new javax.swing.JLabel();
        btnLoja = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluirConta = new javax.swing.JButton();
        lbRevelarSenha = new javax.swing.JLabel();
        btnRevelarSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ftxtSaldo = new javax.swing.JFormattedTextField();
        btnAlteraSaldo = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();

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

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtID.setText("00000");
        txtID.setBorder(null);

        txtUsuario.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        tblJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Gênero", "Requisitos"
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

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Saldo na conta");

        ftxtSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        btnAlteraSaldo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnAlteraSaldo.setText("Alterar Saldo");
        btnAlteraSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraSaldoActionPerformed(evt);
            }
        });

        txtEndereco.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEndereco)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbUsername)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbID)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbEmail)
                                        .addComponent(ftxtDataNascimento)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSenha)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbSenha)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRevelarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbRevelarSenha, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 83, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ftxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAlteraSaldo))))))
                            .addComponent(txtEndereco))
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
                    .addComponent(lbUsername)
                    .addComponent(lbSenha)
                    .addComponent(lbRevelarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRevelarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlteraSaldo))
                .addGap(18, 18, 18)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbJogos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (botao == null){
            new TelaLoginCliente().setVisible(true);
            this.dispose();
        } else{
            // Volta para as configurações iniciais, com os valores alterados
            this.setInicial();
        }
    }//GEN-LAST:event_btnSairActionPerformed

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
        btnExcluirConta.setEnabled(false);
        btnAlteraSaldo.setEnabled(false);
        
        // Habilitar e desabilitar campos de Texto
        txtUsuario.setEnabled(true);
        txtID.setEnabled(false);
        txtSenha.setEnabled(true);
        txtEmail.setEnabled(true);
        ftxtDataNascimento.setEnabled(true);
        txtEndereco.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (botao.equals("editar")){
            if (txtUsuario.getText().equals("") || txtSenha.getText().equals("") || txtEmail.getText().equals("") ||
                !ftxtDataNascimento.getText().matches("\\d{2}/\\d{2}/\\d{4}")){
                JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            } else{
                String usuario = txtUsuario.getText();
                String senha = txtSenha.getText();
                String email = txtEmail.getText();
                String dataNascimento = ftxtDataNascimento.getText();
                String endereco = txtEndereco.getText();

                boolean equalName = false;
                for(Cliente cli:listaClientes){
                    if (cli.getNomeUsuario().equals(usuario) && cli.getId() != cliente.getId()){
                        JOptionPane.showMessageDialog(null,"Já existe um usuario com este nome, insira um novo nome.", "Mensagem",JOptionPane.PLAIN_MESSAGE);
                        equalName = true;
                        break;
                    }
                }

                if (equalName == false){
                    cliente.setNomeUsuario(usuario);
                    cliente.setSenha(senha);
                    cliente.setEmail(email);
                    cliente.setDataNascimento(dataNascimento);
                    cliente.setEndereco(endereco);
                    listaClientes.set(cliente.getId(), cliente); 
                    
                    System.out.println("\n" + cliente + "\n" + listaClientes);
                    
                    // Volta para as configurações iniciais, com os valores alterados
                    this.setInicial();
                }
            }
        } else if (botao.equals("alterar saldo")){
            if ((double) ftxtSaldo.getValue() < 0){
                JOptionPane.showMessageDialog(null,"Insira um valor valido maior que 0", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            } else{
                double saldo = (double) ftxtSaldo.getValue();
                cliente.setSaldoCarteira(saldo, cliente.getSenha());
                
                // Volta para as configurações iniciais, com os valores alterados
                this.setInicial();
                
                System.out.println("\n" + cliente + "\n" + listaClientes);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlteraSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraSaldoActionPerformed
        // TODO add your handling code here:
        botao = "alterar saldo";
        ftxtSaldo.setEnabled(true);
        ftxtSaldo.setText("");
        
        // Inicializando os botões
        btnLoja.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnSair.setEnabled(true);
        btnExcluirConta.setEnabled(true);
        btnAlteraSaldo.setEnabled(false);
        
    }//GEN-LAST:event_btnAlteraSaldoActionPerformed

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
    private javax.swing.JButton btnAlteraSaldo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluirConta;
    private javax.swing.JButton btnLoja;
    private javax.swing.JButton btnRevelarSenha;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftxtDataNascimento;
    private javax.swing.JFormattedTextField ftxtSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbDataNascimento;
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
