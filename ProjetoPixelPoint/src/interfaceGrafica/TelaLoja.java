/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.BancoDeDados;
import backend.Jogo;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuria
 */
public final class TelaLoja extends javax.swing.JFrame {
    
    public static List<Jogo> listaJogos = TelaPrincipal.jogos;
    public static Jogo jogo;
    

    /**
     * Creates new form JogoJFrame
     */
    public TelaLoja() {
        initComponents();
        carregarTabelaJogos();
        jCheckBoxPesquisaNome.setSelected(true);
    }
    
    public void carregarTabelaJogos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome","Preço","Gênero","Requisitos"},0);
        tabelaJogos.setModel(modelo);
        if (jCheckBoxPesquisaNome.isSelected()){
            for(int i=0;i<listaJogos.size();i++){
                if (!jTextFieldPesquisa.getText().trim().isEmpty()){
                    if (listaJogos.get(i).getNome().contains(jTextFieldPesquisa.getText())){
                        Object linha[] = new Object[]{listaJogos.get(i).getNome(),
                                            String.format("%.2f", listaJogos.get(i).getPreco()) + " R$",
                                            listaJogos.get(i).getGenero(),
                                            listaJogos.get(i).getRequisitos()};
                        modelo.addRow(linha);
                    }
                }
                else {
                    Object linha[] = new Object[]{listaJogos.get(i).getNome(),
                                            String.format("%.2f", listaJogos.get(i).getPreco()) + " R$",
                                            listaJogos.get(i).getGenero(),
                                            listaJogos.get(i).getRequisitos()};
                    modelo.addRow(linha);
                }
            }
        }
        else {
            for(int i=0;i<listaJogos.size();i++){
                if (!jTextFieldPesquisa.getText().trim().isEmpty()){
                    if (listaJogos.get(i).getGenero().contains(jTextFieldPesquisa.getText())){
                        Object linha[] = new Object[]{listaJogos.get(i).getNome(),
                                            String.format("%.2f", listaJogos.get(i).getPreco()) + " R$",
                                            listaJogos.get(i).getGenero(),
                                            listaJogos.get(i).getRequisitos()};
                        modelo.addRow(linha);
                    }
                }
                else {
                    Object linha[] = new Object[]{listaJogos.get(i).getNome(),
                                            String.format("%.2f", listaJogos.get(i).getPreco()) + " R$",
                                            listaJogos.get(i).getGenero(),
                                            listaJogos.get(i).getRequisitos()};
                    modelo.addRow(linha);
                }
            }
        }
        
        tabelaJogos.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabelaJogos.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabelaJogos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabelaJogos.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaJogos = new javax.swing.JTable();
        jButtonCadastrarJogo = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jCheckBoxPesquisaNome = new javax.swing.JCheckBox();
        jCheckBoxPesquisaGenero = new javax.swing.JCheckBox();
        jButtonComprar = new javax.swing.JButton();
        jButtonRemoverJogo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil do Desenvolvedor");

        tabelaJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Preço", "Gênero", "Requisitos"
            }
        ));
        jScrollPane2.setViewportView(tabelaJogos);

        jButtonCadastrarJogo.setText("Cadastrar Jogo");
        jButtonCadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarJogoActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jCheckBoxPesquisaNome.setText("Nome");
        jCheckBoxPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPesquisaNomeActionPerformed(evt);
            }
        });

        jCheckBoxPesquisaGenero.setText("Gênero");
        jCheckBoxPesquisaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPesquisaGeneroActionPerformed(evt);
            }
        });

        jButtonComprar.setText("Comprar");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jButtonRemoverJogo.setText("Remover Jogo");
        jButtonRemoverJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverJogoActionPerformed(evt);
            }
        });

        jButton1.setText("Acessar Perfil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxPesquisaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxPesquisaGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCadastrarJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonComprar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPesquisaNome)
                    .addComponent(jCheckBoxPesquisaGenero)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarJogo)
                    .addComponent(jButtonComprar)
                    .addComponent(jButtonRemoverJogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarJogoActionPerformed
        new TelaCadastrarJogo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCadastrarJogoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        carregarTabelaJogos();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jCheckBoxPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPesquisaNomeActionPerformed
        jCheckBoxPesquisaGenero.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPesquisaNomeActionPerformed

    private void jCheckBoxPesquisaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPesquisaGeneroActionPerformed
        jCheckBoxPesquisaNome.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPesquisaGeneroActionPerformed

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        int i = tabelaJogos.getSelectedRow();
        if (i == -1){
            JOptionPane.showMessageDialog(null,"Nenhum jogo selecionado", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            try {
                System.out.println(listaJogos.get(i).getNome());
                jogo = listaJogos.get(i);
                new TelaComprar().setVisible(true);
                this.dispose();
            } catch (Exception e){
                System.err.println(e);
                
                JOptionPane.showMessageDialog(null,"Nenhuma conta encontrada, cadastre-se ou entre em uma conta antes de comprar um jogo", "Mensagem",JOptionPane.PLAIN_MESSAGE);
                
                new TelaLoginCliente().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonRemoverJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverJogoActionPerformed
        int i = tabelaJogos.getSelectedRow();
        if (i == -1){
            JOptionPane.showMessageDialog(null,"Nenhum jogo selecionado", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            int resposta = JOptionPane.showConfirmDialog(
            null, // Componente pai (null para janela centralizada)
            "Gostaria de remover " + listaJogos.get(i).getNome() + "?", // Mensagem exibida
            "Confirmação", // Título da janela
            JOptionPane.YES_NO_OPTION // Tipos de botões exibidos
            );

            // Verifica qual botão foi pressionado
            if (resposta == JOptionPane.YES_OPTION) {
                //Remove o jogo da lista de jogos
                listaJogos.remove(i);
                //Remove o jogo do banco de dados
                try {
                    BancoDeDados.atualizaBD(listaJogos);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastrarJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Recarrega a tabela
                carregarTabelaJogos();
                JOptionPane.showMessageDialog(null,"Jogo removido com sucesso", "Mensagem",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonRemoverJogoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            new TelaPerfilCliente().setVisible(true);
            this.dispose();
        } catch(Exception e){
            System.err.println(e);
                
            JOptionPane.showMessageDialog(null,"Nenhuma conta encontrada, cadastre-se ou entre em uma conta antes de comprar um jogo", "Mensagem",JOptionPane.PLAIN_MESSAGE);

            new TelaLoginCliente().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrarJogo;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRemoverJogo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxPesquisaGenero;
    private javax.swing.JCheckBox jCheckBoxPesquisaNome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTable tabelaJogos;
    // End of variables declaration//GEN-END:variables

    
}
