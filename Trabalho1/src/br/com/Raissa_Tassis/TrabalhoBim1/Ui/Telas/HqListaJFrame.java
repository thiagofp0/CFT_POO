/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Raissa_Tassis.TrabalhoBim1.Ui.Telas;

import br.com.Raissa_Tassis.TrabalhoBim1.Controle.HqControle;
import br.com.Raissa_Tassis.TrabalhoBim1.Dao.DaoException;
import br.com.Raissa_Tassis.TrabalhoBim1.Entidade.Hq;
import br.com.Raissa_Tassis.TrabalhoBim1.Entidade.Obra;
import br.com.Raissa_Tassis.TrabalhoBim1.Entidade.Usuario;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.lang.Double.parseDouble;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author José Fernandes
 */
public class HqListaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HqListaJFrame
     */
    private HqControle hqControle = HqControle.getInstance();
    private Usuario uLogado;

    public HqListaJFrame(Usuario uLogado) {
        initComponents();
        this.uLogado = uLogado;
        List<Hq> hqList = null;
        try {
            hqList = hqControle.consultaTudoUsuario(uLogado);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro no BD ", HEIGHT);
        }

        preencheTabela(hqList);
        this.setLocationRelativeTo(null);
        this.setTitle("Minhas HQs");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btAddHq = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHq = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lblNome.setText("    Nome:");

        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        btAddHq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Raissa_Tassis/TrabalhoBim1/Ui/Imagens/add.png"))); // NOI18N
        btAddHq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddHqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btAddHq, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAddHq)
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Raissa_Tassis/TrabalhoBim1/Ui/Imagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluir);

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Raissa_Tassis/TrabalhoBim1/Ui/Imagens/pencil.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(btAlterar);

        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Raissa_Tassis/TrabalhoBim1/Ui/Imagens/cursor.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setEnabled(false);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btVisualizar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        tbHq.setModel(new javax.swing.table.DefaultTableModel(
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
        tbHq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHq);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyPressed
        if (evt.getKeyCode() == 10) {
            consultaPorNome();
        }
    }//GEN-LAST:event_tfPesquisaKeyPressed

    private void btAddHqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddHqActionPerformed
        HqCadastroJDialog hqCad = new HqCadastroJDialog(this, true, uLogado);
        hqCad.setVisible(true);
        Hq hq = hqCad.getHq();

        if (hq != null) {
            tfPesquisa.setText(hq.getNmHq());
            consultaPorNome();
        }
    }//GEN-LAST:event_btAddHqActionPerformed

    private void tbHqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHqMouseClicked
        btAlterar.setEnabled(true);
        btExcluir.setEnabled(true);
        btVisualizar.setEnabled(true);
    }//GEN-LAST:event_tbHqMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opt = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir", "Exclusão", WIDTH);
        List<Hq> hqList = null;

        if (opt == JOptionPane.OK_OPTION) {
            Hq hq = getHqFromTable();
            try {
                hqControle.excluir(hq.getCdHq());

                int linha = tbHq.getSelectedRow();
                DefaultTableModel m = (DefaultTableModel) tbHq.getModel();
                m.removeRow(linha);
                desabilitarBotoes();
            } catch (DaoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro no BD ", HEIGHT);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        List<Hq> hqList = null;

        Hq hq = getHqFromTable();
        try {
            hq = hqControle.consultaPorCd(hq.getCdHq());
            HqAlterarJDialog tela = new HqAlterarJDialog(this, true, hq);
            tela.setVisible(true);

            hqList = hqControle.consultaTudoUsuario(uLogado);

            preencheTabela(hqList);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro no BD ", HEIGHT);
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        Hq hq = getHqFromTable();
        try {
            hq = hqControle.consultaPorCd(hq.getCdHq());
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro no BD ", HEIGHT);
        }

        HqVisualizarJDialog telaVisu = new HqVisualizarJDialog(this, true, hq, this.uLogado);
        telaVisu.setVisible(true);
    }//GEN-LAST:event_btVisualizarActionPerformed

    public Hq getHqFromTable() {
        Hq hqRet = null;

        int linha = tbHq.getSelectedRow();

        if (linha >= 0) {
            TableModel m = tbHq.getModel();
            String idStr = m.getValueAt(linha, 0).toString();
            int id = Integer.parseInt(idStr);

            hqRet = new Hq();
            hqRet.setCdHq(id);
            hqRet.setNmHq(m.getValueAt(linha, 1).toString());
            hqRet.setPreco(parseDouble(m.getValueAt(linha, 2).toString()));
            hqRet.setConservacao(m.getValueAt(linha, 3).toString());
        }
        return hqRet;
    }

    public void preencheTabela(List<Hq> hqList) {
        if (hqList != null) {
            String[] strVet = new String[]{"Cod.", "Nome", "Preço", "Conservação"};
            String[][] strAMat = new String[hqList.size()][4];

            for (int i = 0; i < hqList.size(); i++) {
                Hq hq = hqList.get(i);
                strAMat[i][0] = hq.getCdHq() + "";
                strAMat[i][1] = hq.getNmHq();
                strAMat[i][2] = hq.getPreco() + "";
                strAMat[i][3] = hq.getConservacao();
            }

            tbHq.setModel(new DefaultTableModel(
                    strAMat, strVet));
        }

        desabilitarBotoes();
    }

    private void desabilitarBotoes() {
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
        btVisualizar.setEnabled(false);
    }

    private void consultaPorNome() {
        List<Hq> hqList = null;
        
        try {
            hqList = hqControle.consultaPorNomeUsuario(tfPesquisa.getText(), uLogado);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro no BD ", HEIGHT);
        }
       
        preencheTabela(hqList);
    }

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
            java.util.logging.Logger.getLogger(HqListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HqListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HqListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HqListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HqListaJFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddHq;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tbHq;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
