/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import backend.Biblioteca;
import interfaceGrafica.TelaCadastrarJogo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuria
 */
public final class TelaBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form JogoJFrame
     */
    public TelaBiblioteca() {
        initComponents();
        
        carregarTabelaJogos();
    }
    
    public void carregarTabelaJogos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome","Preço","Genero","Requisitos"},0);
        
        
        for(int i=0;i<Biblioteca.jogos.size();i++){
            Object linha[] = new Object[]{Biblioteca.jogos.get(i).getNome(),
                                        Biblioteca.jogos.get(i).getPreco(),
                                        Biblioteca.jogos.get(i).getGenero(),
                                        Biblioteca.jogos.get(i).getRequisitos()};
            modelo.addRow(linha);
        }
        
        //Tabela recebe modelo
        tabelaJogos.setModel(modelo);
        
        /*
        tabelaJogos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaJogos.getColumnModel().getColumn(1).setPreferredWidth(1);
        */
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
        jButtonRecarregarTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaJogos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaJogos);

        jButtonCadastrarJogo.setText("Cadastrar Jogo");
        jButtonCadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarJogoActionPerformed(evt);
            }
        });

        jButtonRecarregarTabela.setText("Recarregar");
        jButtonRecarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecarregarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jButtonCadastrarJogo)
                .addGap(3, 3, 3)
                .addComponent(jButtonRecarregarTabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarJogo)
                    .addComponent(jButtonRecarregarTabela))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarJogoActionPerformed
        new TelaCadastrarJogo().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarJogoActionPerformed

    private void jButtonRecarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecarregarTabelaActionPerformed
        carregarTabelaJogos();
    }//GEN-LAST:event_jButtonRecarregarTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarJogo;
    private javax.swing.JButton jButtonRecarregarTabela;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaJogos;
    // End of variables declaration//GEN-END:variables
}
