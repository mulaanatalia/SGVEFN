
package view;

import controller.ControllerCategoria;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCategoria;
import util.BLDatas;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ViewCategoria extends javax.swing.JFrame {
    ControllerCategoria controllerCategoria = new ControllerCategoria();
    ModelCategoria modelCategoria = new ModelCategoria();
    ArrayList<ModelCategoria> listaModelCategoria = new ArrayList<>();
    BLDatas blDatas = new BLDatas();
    
    
    public ViewCategoria() {
        initComponents();
        setLocationRelativeTo(null); //Para a tela/interface ficar no centro
        this.visualizar_categoria();
        this.listar_categoria_actualizacao_remocao();
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1_Registar_Categoria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_descricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_categoria = new javax.swing.JTable();
        jb_cancelar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jPanel2_Visualizar_categoria = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_lista_categorias = new javax.swing.JTable();
        jtf_pesquisa = new javax.swing.JTextField();
        jb_pesquisar = new javax.swing.JButton();
        jb_actualizar_lista_tabela = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3_actualizar_remover_categoria = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_actualiza_remove_categoria = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_pesquisa_categoria = new javax.swing.JTextField();
        jtf_pesquisar_categoria = new javax.swing.JButton();
        jb_actualizar_tabela_categoria2 = new javax.swing.JButton();
        jb_cancelar_categoria = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_remover = new javax.swing.JButton();
        jb_salvar_actualizacao = new javax.swing.JButton();
        jtf_id_categoria = new javax.swing.JTextField();
        jtf_nome_categoria = new javax.swing.JTextField();
        jtf_descricao_categoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CATEGORIA");

        jLabel1.setText("Nome: ");

        jLabel2.setText("Descrição: ");

        jtable_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_categoria);
        if (jtable_categoria.getColumnModel().getColumnCount() > 0) {
            jtable_categoria.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_categoria.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_categoria.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jb_novo.setText("Novo");
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });

        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_Registar_CategoriaLayout = new javax.swing.GroupLayout(jPanel1_Registar_Categoria);
        jPanel1_Registar_Categoria.setLayout(jPanel1_Registar_CategoriaLayout);
        jPanel1_Registar_CategoriaLayout.setHorizontalGroup(
            jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_Registar_CategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1_Registar_CategoriaLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(35, 35, 35)
                            .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_Registar_CategoriaLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jtf_descricao))
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1_Registar_CategoriaLayout.createSequentialGroup()
                        .addComponent(jb_cancelar)
                        .addGap(50, 50, 50)
                        .addComponent(jb_novo)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_Registar_CategoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_salvar)
                .addGap(48, 48, 48))
        );
        jPanel1_Registar_CategoriaLayout.setVerticalGroup(
            jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_Registar_CategoriaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1_Registar_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar)
                    .addComponent(jb_novo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_salvar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registar", jPanel1_Registar_Categoria);

        jtable_lista_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Data de Registo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_lista_categorias);
        if (jtable_lista_categorias.getColumnModel().getColumnCount() > 0) {
            jtable_lista_categorias.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_lista_categorias.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_lista_categorias.getColumnModel().getColumn(0).setMaxWidth(40);
            jtable_lista_categorias.getColumnModel().getColumn(3).setHeaderValue("Data de Registo");
        }

        jb_pesquisar.setText("Pesquisar");
        jb_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisarActionPerformed(evt);
            }
        });

        jb_actualizar_lista_tabela.setText("Actualizar Tabela");
        jb_actualizar_lista_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_lista_tabelaActionPerformed(evt);
            }
        });

        jLabel3.setText("Informe o nome da categoria:");

        javax.swing.GroupLayout jPanel2_Visualizar_categoriaLayout = new javax.swing.GroupLayout(jPanel2_Visualizar_categoria);
        jPanel2_Visualizar_categoria.setLayout(jPanel2_Visualizar_categoriaLayout);
        jPanel2_Visualizar_categoriaLayout.setHorizontalGroup(
            jPanel2_Visualizar_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Visualizar_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_Visualizar_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_Visualizar_categoriaLayout.createSequentialGroup()
                        .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jb_pesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_actualizar_lista_tabela)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2_Visualizar_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2_Visualizar_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2_Visualizar_categoriaLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2)
                    .addGap(17, 17, 17)))
        );
        jPanel2_Visualizar_categoriaLayout.setVerticalGroup(
            jPanel2_Visualizar_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Visualizar_categoriaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel2_Visualizar_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_actualizar_lista_tabela)
                    .addComponent(jb_pesquisar)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(jPanel2_Visualizar_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2_Visualizar_categoriaLayout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2_Visualizar_categoria);

        jtable_actualiza_remove_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtable_actualiza_remove_categoria);
        if (jtable_actualiza_remove_categoria.getColumnModel().getColumnCount() > 0) {
            jtable_actualiza_remove_categoria.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_actualiza_remove_categoria.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_actualiza_remove_categoria.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel4.setText("ID:");

        jLabel5.setText("Nome: ");

        jLabel6.setText("Descrição; ");

        jLabel7.setText("Informe o nome da categoria para pesquisar");

        jtf_pesquisar_categoria.setText("Pesquisar");
        jtf_pesquisar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_pesquisar_categoriaActionPerformed(evt);
            }
        });

        jb_actualizar_tabela_categoria2.setText("Actualizar Tabela");
        jb_actualizar_tabela_categoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_tabela_categoria2ActionPerformed(evt);
            }
        });

        jb_cancelar_categoria.setText("Cancelar");
        jb_cancelar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_categoriaActionPerformed(evt);
            }
        });

        jb_actualizar.setText("Actualizar");
        jb_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizarActionPerformed(evt);
            }
        });

        jb_remover.setText("Remover");
        jb_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_removerActionPerformed(evt);
            }
        });

        jb_salvar_actualizacao.setText("Salvar");
        jb_salvar_actualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvar_actualizacaoActionPerformed(evt);
            }
        });

        jtf_id_categoria.setEditable(false);

        javax.swing.GroupLayout jPanel3_actualizar_remover_categoriaLayout = new javax.swing.GroupLayout(jPanel3_actualizar_remover_categoria);
        jPanel3_actualizar_remover_categoria.setLayout(jPanel3_actualizar_remover_categoriaLayout);
        jPanel3_actualizar_remover_categoriaLayout.setHorizontalGroup(
            jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                        .addComponent(jtf_pesquisa_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_pesquisar_categoria)
                        .addGap(18, 18, 18)
                        .addComponent(jb_actualizar_tabela_categoria2))
                    .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                        .addComponent(jb_cancelar_categoria)
                        .addGap(71, 71, 71)
                        .addComponent(jb_actualizar)
                        .addGap(58, 58, 58)
                        .addComponent(jb_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar_actualizacao))
                    .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                        .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_descricao_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                                .addComponent(jtf_id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                                .addComponent(jtf_nome_categoria)
                                .addGap(133, 133, 133)))))
                .addContainerGap())
        );
        jPanel3_actualizar_remover_categoriaLayout.setVerticalGroup(
            jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3_actualizar_remover_categoriaLayout.createSequentialGroup()
                        .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jtf_id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jtf_nome_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jtf_descricao_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_actualizar_tabela_categoria2)
                    .addComponent(jtf_pesquisar_categoria)
                    .addComponent(jtf_pesquisa_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3_actualizar_remover_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar_categoria)
                    .addComponent(jb_actualizar)
                    .addComponent(jb_remover)
                    .addComponent(jb_salvar_actualizacao))
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Actualizar/Remover", jPanel3_actualizar_remover_categoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_categoriaActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelar_categoriaActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        this.salvar_categoria();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarActionPerformed
        this.pesquisar_categoria();
    }//GEN-LAST:event_jb_pesquisarActionPerformed

    private void jb_actualizar_lista_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_lista_tabelaActionPerformed
        this.listar_actualizacao_categoria();
    }//GEN-LAST:event_jb_actualizar_lista_tabelaActionPerformed

    private void jtf_pesquisar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_pesquisar_categoriaActionPerformed
        this.pesquisar_categoria_actualizacao_remocao();
    }//GEN-LAST:event_jtf_pesquisar_categoriaActionPerformed

    private void jb_actualizar_tabela_categoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_tabela_categoria2ActionPerformed
        this.listar_actualizacao_categoria2();
    }//GEN-LAST:event_jb_actualizar_tabela_categoria2ActionPerformed

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        this.actualizar_categoria();
    }//GEN-LAST:event_jb_actualizarActionPerformed

    private void jb_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_removerActionPerformed
        this.remover_categoria();
    }//GEN-LAST:event_jb_removerActionPerformed

    private void jb_salvar_actualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_actualizacaoActionPerformed
        this.salvar_actualizacao_categoria();
    }//GEN-LAST:event_jb_salvar_actualizacaoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCategoria().setVisible(true);
            }
        });
    }

    //MÉTODOS USADOS NA ABA: registar
    private void salvar_categoria() {
        // Salva um novo cliente na BD
        modelCategoria.setNome(this.jtf_nome.getText());
        modelCategoria.setDescricao(this.jtf_descricao.getText());
        try {
            modelCategoria.setData_registo(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {

        }

        if (controllerCategoria.salvarCategoriaController(modelCategoria) > 0) {
            JOptionPane.showMessageDialog(this, "Categoria registada com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.listar_categoria();//Para mostar o novo cliente na tabela
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registar o categoria!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_categoria() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_lista_categorias.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_lista_categorias.setRowSorter(classificador);
        String nome_categoria = this.jtf_pesquisa.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_categoria, 1));//a coluna é 1 pois a pesquisa será por nome
    }
    
    /**
     * Metodo chamado após registar um novo cliente
     */
    private void listar_categoria() {
        listaModelCategoria = controllerCategoria.getListaCategoriaController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) jtable_categoria.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCategoria.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoria.get(i).getCategoria_id(),
                listaModelCategoria.get(i).getNome(),
                listaModelCategoria.get(i).getDescricao()

            });

        }
    }
    //FIM DOS MÉTODOS DA ABA registar

    //INICIO DOS MÉTODOS USADOS NA ABA: actualizar/remover:
    /**
     * Apenas pega os dados da linha da tabela selecionada e coloca nos devidos
     * campos
     */
    private void actualizar_categoria() {
        int linha = jtable_actualiza_remove_categoria.getSelectedRow();//pegamos a linha seleccionada e depois pegamos o id correspondente
        try {
            int id_categoria = (int) this.jtable_actualiza_remove_categoria.getValueAt(linha, 0);//colocamos 0 pois o id está na primeira coluna que é 0

            //recuperar dados da BD
            modelCategoria = controllerCategoria.getCategoriaController(id_categoria);//retornar o produto selecionado
            //colocar os dados do cliente selecionado na interface/nos devidos campos
            //Nao é obrigatório incluir o codigo
            this.jtf_id_categoria.setText(String.valueOf(modelCategoria.getCategoria_id()));
            this.jtf_nome_categoria.setText(modelCategoria.getNome());
            this.jtf_descricao_categoria.setText(modelCategoria.getDescricao());
            this.habilitarDesabilitarCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registo seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void salvar_actualizacao_categoria() {
        modelCategoria.setNome(this.jtf_nome_categoria.getText()); //Preencher o objecto cliente com todos dados do cliente
        modelCategoria.setDescricao(this.jtf_descricao_categoria.getText());

        if (controllerCategoria.atualizarCategoriaController(modelCategoria)) {
            JOptionPane.showMessageDialog(this, "Categoria actualizado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //Carregar os clientes na tabela
            this.listar_categoria_actualizacao_remocao();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao actualizar categoria!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void remover_categoria() {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(this, "Tem a certeza de que deseja remover? /n1.Confirmar;/n2.Cancelar"));
        if (opcao == 1) {
            int linha = this.jtable_actualiza_remove_categoria.getSelectedRow(); //remove o dado da linha seleccionada
            int id_categoria = (int) this.jtable_actualiza_remove_categoria.getValueAt(linha, 0); //Pegar o id da linha selecionada e a coluna do codigo é 0, se estivesse na 2 coluna seria 1
            if (controllerCategoria.excluirCategoriaController(id_categoria)) {
                JOptionPane.showMessageDialog(this, "Categoria excluída com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.listar_categoria_actualizacao_remocao();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o categoria!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Remoção cancelada", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_categoria_actualizacao_remocao() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_categoria.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_actualiza_remove_categoria.setRowSorter(classificador);
        String nome_categoria = this.jtf_pesquisa_categoria.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_categoria, 1));//a coluna é 1 pois a pesquisa será por nome
    }
    
    /**
     * lista os dados ao abrirmos a aba 
     */
    private void listar_categoria_actualizacao_remocao() {
        listaModelCategoria = controllerCategoria.getListaCategoriaController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_categoria.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCategoria.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoria.get(i).getCategoria_id(),
                listaModelCategoria.get(i).getNome(),
                listaModelCategoria.get(i).getDescricao()
            });

        }
    }
    
    /**
     * lista os dados actualizados apos adicionar ou actualizar algum cliente ao clicar em actualizar dados
     */
    private void listar_actualizacao_categoria2() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_actualiza_remove_categoria.getModel();
        listaModelCategoria = controllerCategoria.getListaCategoriaController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCategoria.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoria.get(i).getCategoria_id(),
                listaModelCategoria.get(i).getNome(),
                listaModelCategoria.get(i).getDescricao()


            });

        }
    }
    //FIM DOS MÉTODOS DA ABA: actualizar/remover
    
    
    //MÉTODOS USADOS NA ABA VER:
    
    /**
     * Lista os dados na tabela
     */
    private void visualizar_categoria() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_categorias.getModel();
        listaModelCategoria = controllerCategoria.getListaCategoriaController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCategoria.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoria.get(i).getCategoria_id(),
                listaModelCategoria.get(i).getNome(),
                listaModelCategoria.get(i).getDescricao(),
                listaModelCategoria.get(i).getData_registo()
            });

        }
    }
    
    private void listar_actualizacao_categoria() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_categorias.getModel();
        listaModelCategoria = controllerCategoria.getListaCategoriaController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCategoria.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoria.get(i).getCategoria_id(),
                listaModelCategoria.get(i).getNome(),
                listaModelCategoria.get(i).getDescricao(),
                listaModelCategoria.get(i).getData_registo()
            });

        }
    }
    
    //MÉTODOS COMUNS AS ABAS
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtf_nome.setEnabled(condicao);
        jtf_descricao.setEnabled(condicao);
        
        jb_salvar.setEnabled(condicao);
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_categoria.setEnabled(condicao);
        this.jtf_descricao_categoria.setEnabled(condicao);
        
        this.jb_salvar_actualizacao.setEnabled(condicao);

    }

    /**
     * limpar os campos do formulario
     *
     * @param condicao
     */
    private void limparCampos() {
        jtf_nome.setText("");
        jtf_descricao.setText("");
        
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_categoria.setText("");
        this.jtf_descricao_categoria.setText("");
       


    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JPanel jPanel1_Registar_Categoria;
    private javax.swing.JPanel jPanel2_Visualizar_categoria;
    private javax.swing.JPanel jPanel3_actualizar_remover_categoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_actualizar_lista_tabela;
    private javax.swing.JButton jb_actualizar_tabela_categoria2;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_cancelar_categoria;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_remover;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_salvar_actualizacao;
    private javax.swing.JTable jtable_actualiza_remove_categoria;
    private javax.swing.JTable jtable_categoria;
    private javax.swing.JTable jtable_lista_categorias;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_descricao_categoria;
    private javax.swing.JTextField jtf_id_categoria;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_nome_categoria;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTextField jtf_pesquisa_categoria;
    private javax.swing.JButton jtf_pesquisar_categoria;
    // End of variables declaration//GEN-END:variables
}
