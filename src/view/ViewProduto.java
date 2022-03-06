package view;

import controller.ControllerCategoria;
import controller.ControllerCategoriaProduto;
import controller.ControllerProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCategoria;
import model.ModelCategoriaProduto;
import model.ModelProduto;
import util.BLDatas;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ViewProduto extends javax.swing.JFrame {

    ModelCategoria modelCategoria = new ModelCategoria();
    ControllerCategoria controllerCategoria = new ControllerCategoria();
    ArrayList<ModelCategoria> listaModelCategoria = new ArrayList<>();
    ModelProduto modelProduto = new ModelProduto();
    ControllerProduto controllerProduto = new ControllerProduto();
    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    ControllerCategoriaProduto controllerCategoriaProduto = new ControllerCategoriaProduto();
    ModelCategoriaProduto modelCategoriaProduto = new ModelCategoriaProduto();
    ArrayList<ModelCategoriaProduto> listaModelCategoriaProduto = new ArrayList<>();
    BLDatas blDatas = new BLDatas();

    public ViewProduto() {
        initComponents();
        this.listarCategoria();//Preenche o combobox da categoria
        this.visualizar_produto();
        this.listar_produto_actualizacao_remocao();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1_registar_produto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_preco_unitario = new javax.swing.JFormattedTextField();
        jtf_estoque = new javax.swing.JFormattedTextField();
        jcb_categoria = new componentes.UJComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_produto = new javax.swing.JTable();
        jb_cancelar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jPanel2_visualizar_produto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtf_pesquisa = new javax.swing.JTextField();
        jb_pesquisar = new javax.swing.JButton();
        jb_actualizar_lista_tabela = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_lista_produto = new javax.swing.JTable();
        jPanel3_actualizar_remover_produto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_id_produto = new javax.swing.JFormattedTextField();
        jtf_nome_produto = new javax.swing.JTextField();
        jtf_estoque_produto = new javax.swing.JFormattedTextField();
        jtf_preco_unitario_produto = new javax.swing.JFormattedTextField();
        jcb_categoria_produto = new componentes.UJComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable_actualiza_remove_produto = new javax.swing.JTable();
        jb_cancelar_produto = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_remover = new javax.swing.JButton();
        jb_salvar_actualizacao = new javax.swing.JButton();
        jtf_pesquisa_produto = new javax.swing.JTextField();
        jb_pesquisar_produto = new javax.swing.JButton();
        jb_actualizar_lista_tabela_produto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome: ");

        jLabel2.setText("Preço Unitário: ");

        jLabel3.setText("Estoque: ");

        jLabel4.setText("Categoria: ");

        jcb_categoria.setAutocompletar(true);

        jtable_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço Unitário", "Estoque", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_produto);
        if (jtable_produto.getColumnModel().getColumnCount() > 0) {
            jtable_produto.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_produto.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_produto.getColumnModel().getColumn(0).setMaxWidth(40);
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

        javax.swing.GroupLayout jPanel1_registar_produtoLayout = new javax.swing.GroupLayout(jPanel1_registar_produto);
        jPanel1_registar_produto.setLayout(jPanel1_registar_produtoLayout);
        jPanel1_registar_produtoLayout.setHorizontalGroup(
            jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                        .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                                .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_preco_unitario))
                            .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                                .addComponent(jtf_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 130, Short.MAX_VALUE))))
                    .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                        .addComponent(jb_cancelar)
                        .addGap(92, 92, 92)
                        .addComponent(jb_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar)))
                .addContainerGap())
            .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1_registar_produtoLayout.setVerticalGroup(
            jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_preco_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar)
                    .addComponent(jb_novo)
                    .addComponent(jb_salvar))
                .addGap(68, 68, 68))
            .addGroup(jPanel1_registar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1_registar_produtoLayout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registar", jPanel1_registar_produto);

        jLabel5.setText("Informe o nome do produto para pesquisar: ");

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

        jtable_lista_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço Unitário", "Estoque", "Categoria", "Data de Registo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtable_lista_produto);

        javax.swing.GroupLayout jPanel2_visualizar_produtoLayout = new javax.swing.GroupLayout(jPanel2_visualizar_produto);
        jPanel2_visualizar_produto.setLayout(jPanel2_visualizar_produtoLayout);
        jPanel2_visualizar_produtoLayout.setHorizontalGroup(
            jPanel2_visualizar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_visualizar_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_visualizar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_visualizar_produtoLayout.createSequentialGroup()
                        .addGroup(jPanel2_visualizar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2_visualizar_produtoLayout.createSequentialGroup()
                                .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_pesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(jb_actualizar_lista_tabela)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2_visualizar_produtoLayout.setVerticalGroup(
            jPanel2_visualizar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_visualizar_produtoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2_visualizar_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar)
                    .addComponent(jb_actualizar_lista_tabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2_visualizar_produto);

        jLabel6.setText("ID: ");

        jLabel7.setText("Nome: ");

        jLabel8.setText("Preço unitário: ");

        jLabel9.setText("Estoque: ");

        jLabel10.setText("Categoria: ");

        jtf_id_produto.setEditable(false);
        jtf_id_produto.setEnabled(false);

        jtf_estoque_produto.setEnabled(false);

        jtable_actualiza_remove_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço Unitário", "Estoque", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtable_actualiza_remove_produto);
        if (jtable_actualiza_remove_produto.getColumnModel().getColumnCount() > 0) {
            jtable_actualiza_remove_produto.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_actualiza_remove_produto.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_actualiza_remove_produto.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jb_cancelar_produto.setText("Cancelar");
        jb_cancelar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_produtoActionPerformed(evt);
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

        jb_pesquisar_produto.setText("Pesquisar");
        jb_pesquisar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisar_produtoActionPerformed(evt);
            }
        });

        jb_actualizar_lista_tabela_produto.setText("Actualizar Produto");
        jb_actualizar_lista_tabela_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_lista_tabela_produtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3_actualizar_remover_produtoLayout = new javax.swing.GroupLayout(jPanel3_actualizar_remover_produto);
        jPanel3_actualizar_remover_produto.setLayout(jPanel3_actualizar_remover_produtoLayout);
        jPanel3_actualizar_remover_produtoLayout.setHorizontalGroup(
            jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                        .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_preco_unitario_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                                .addComponent(jb_cancelar_produto)
                                .addGap(44, 44, 44)
                                .addComponent(jb_actualizar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                                .addComponent(jb_remover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_salvar_actualizacao))
                            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_categoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 141, Short.MAX_VALUE))))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                        .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(jtf_id_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_estoque_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                                .addComponent(jtf_pesquisa_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jb_pesquisar_produto)
                                .addGap(32, 32, 32)
                                .addComponent(jb_actualizar_lista_tabela_produto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3_actualizar_remover_produtoLayout.setVerticalGroup(
            jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_actualizar_remover_produtoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_id_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_estoque_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_preco_unitario_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcb_categoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar_produto)
                    .addComponent(jb_actualizar_lista_tabela_produto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar_produto)
                    .addComponent(jb_actualizar)
                    .addComponent(jb_remover)
                    .addComponent(jb_salvar_actualizacao))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Actualizar/Remover", jPanel3_actualizar_remover_produto);

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

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        this.salvar_produto();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarActionPerformed
        this.pesquisar_produto();
    }//GEN-LAST:event_jb_pesquisarActionPerformed

    private void jb_actualizar_lista_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_lista_tabelaActionPerformed
        this.listar_actualizacao_produto();
    }//GEN-LAST:event_jb_actualizar_lista_tabelaActionPerformed

    private void jb_pesquisar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisar_produtoActionPerformed
        this.pesquisar_produto_actualizacao_remocao();
    }//GEN-LAST:event_jb_pesquisar_produtoActionPerformed

    private void jb_actualizar_lista_tabela_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_lista_tabela_produtoActionPerformed
        this.listar_actualizacao_produto2();
    }//GEN-LAST:event_jb_actualizar_lista_tabela_produtoActionPerformed

    private void jb_cancelar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_produtoActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelar_produtoActionPerformed

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        this.actualizar_produto();
    }//GEN-LAST:event_jb_actualizarActionPerformed

    private void jb_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_removerActionPerformed
        this.remover_produto();
    }//GEN-LAST:event_jb_removerActionPerformed

    private void jb_salvar_actualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_actualizacaoActionPerformed
        this.salvar_actualizacao_produto();
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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    //MÉTODOS USADOS NA ABA: registar
    private void salvar_produto() {
        // Salva um novo cliente na BD
        modelProduto.setNome(this.jtf_nome.getText());
        modelProduto.setPreco_unitario(Double.parseDouble(this.jtf_preco_unitario.getText()));
        modelProduto.setEstoque(Integer.parseInt(this.jtf_estoque.getText()));
        try {
            modelProduto.setData_registo(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {

        }
        modelCategoria = controllerCategoria.getCategoriaNomeController(this.jcb_categoria.getSelectedItem().toString());
        //Levando o nome selecionado para o campo de texto
        int categoria = modelCategoria.getCategoria_id();
        modelProduto.setId_categoria(categoria);

        if (controllerProduto.salvarProdutoController(modelProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Produto registado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.listar_produto();
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_produto() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_lista_produto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_lista_produto.setRowSorter(classificador);
        String nome_produto = this.jtf_pesquisa.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_produto, 1));//a coluna é 1 pois a pesquisa será por nome
    }

    /**
     * Metodo chamado após registar um novo produto
     */
    private void listar_produto() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_produto.getModel();
        listaModelCategoriaProduto = controllerCategoriaProduto.getListaCategoriaProdutoController();//Recebendo os produtos da BD e guardar na lista
        int cont = listaModelCategoriaProduto.size();
        modelo.setNumRows(0);

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoriaProduto.get(i).getModelProduto().getProduto_id(),
                listaModelCategoriaProduto.get(i).getModelProduto().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getPreco_unitario(),
                listaModelCategoriaProduto.get(i).getModelProduto().getEstoque(),
                listaModelCategoriaProduto.get(i).getModelCategoria().getNome()
            });
        }
    }

    //FIM DOS MÉTODOS DA ABA registar
    //INICIO DOS MÉTODOS USADOS NA ABA: actualizar/remover:
    /**
     * Apenas pega os dados da linha da tabela selecionada e coloca nos devidos
     * campos
     */
    private void actualizar_produto() {
        int linha = jtable_actualiza_remove_produto.getSelectedRow();//pegamos a linha seleccionada e depois pegamos o id correspondente
        try {
            int id_produto = (int) this.jtable_actualiza_remove_produto.getValueAt(linha, 0);//colocamos 0 pois o id está na primeira coluna que é 0

            //recuperar dados da BD
            //modelProduto = controllerProduto.getProdutoController(id_produto);//retornar o produto selecionado
            modelCategoriaProduto = controllerCategoriaProduto.getListaCategoriaProdutoController(id_produto);
            //colocar os dados do cliente selecionado na interface/nos devidos campos
            //Nao é obrigatório incluir o codigo
            this.jtf_id_produto.setText(String.valueOf(modelCategoriaProduto.getModelProduto().getProduto_id()));
            this.jtf_nome_produto.setText(modelCategoriaProduto.getModelProduto().getNome());
            this.jtf_preco_unitario_produto.setText(String.valueOf(modelCategoriaProduto.getModelProduto().getPreco_unitario()));
            this.jtf_estoque_produto.setText(String.valueOf(modelCategoriaProduto.getModelProduto().getEstoque()));
            this.jcb_categoria_produto.setSelectedItem(modelCategoriaProduto.getModelCategoria().getNome());
            this.habilitarDesabilitarCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registo seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void salvar_actualizacao_produto() {
        modelProduto.setNome(this.jtf_nome_produto.getText());
        modelProduto.setPreco_unitario(Double.parseDouble(this.jtf_preco_unitario_produto.getText()));
        modelProduto.setEstoque(Integer.parseInt(this.jtf_estoque_produto.getText()));

        modelCategoria = controllerCategoria.getCategoriaNomeController(this.jcb_categoria_produto.getSelectedItem().toString());
        //Levando o nome selecionado para o campo de texto
        int categoria = modelCategoria.getCategoria_id();
        modelProduto.setId_categoria(categoria);

        if (controllerProduto.atualizarProdutoController(modelProduto)) {
            JOptionPane.showMessageDialog(this, "Produto actualizado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //Carregar os clientes na tabela
            this.listar_produto_actualizacao_remocao();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao actualizar produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void remover_produto() {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(this, "Tem a certeza de que deseja remover? /n1.Confirmar;/n2.Cancelar"));
        if (opcao == 1) {
            int linha = this.jtable_actualiza_remove_produto.getSelectedRow(); //remove o dado da linha seleccionada
            int id_produto = (int) this.jtable_actualiza_remove_produto.getValueAt(linha, 0); //Pegar o id da linha selecionada e a coluna do codigo é 0, se estivesse na 2 coluna seria 1
            if (controllerProduto.excluirProdutoController(id_produto)) {
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.listar_produto_actualizacao_remocao();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Remoção cancelada", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_produto_actualizacao_remocao() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_produto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_actualiza_remove_produto.setRowSorter(classificador);
        String nome_produto = this.jtf_pesquisa_produto.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_produto, 1));//a coluna é 1 pois a pesquisa será por nome
    }

    /**
     * lista os dados ao abrirmos a aba
     */
    private void listar_produto_actualizacao_remocao() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_produto.getModel();
        listaModelCategoriaProduto = controllerCategoriaProduto.getListaCategoriaProdutoController();//Recebendo os produtos da BD e guardar na lista
        int cont = listaModelCategoriaProduto.size();
        modelo.setNumRows(0);

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoriaProduto.get(i).getModelProduto().getProduto_id(),
                listaModelCategoriaProduto.get(i).getModelProduto().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getPreco_unitario(),
                listaModelCategoriaProduto.get(i).getModelProduto().getEstoque(),
                listaModelCategoriaProduto.get(i).getModelCategoria().getNome()
            });
        }

    }

    /**
     * lista os dados actualizados apos adicionar ou actualizar algum cliente ao
     * clicar em actualizar dados
     */
    private void listar_actualizacao_produto2() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_actualiza_remove_produto.getModel();
        listaModelCategoriaProduto = controllerCategoriaProduto.getListaCategoriaProdutoController();//Recebendo os produtos da BD e guardar na lista
        int cont = listaModelCategoriaProduto.size();
        modelo.setNumRows(0);

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoriaProduto.get(i).getModelProduto().getProduto_id(),
                listaModelCategoriaProduto.get(i).getModelProduto().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getPreco_unitario(),
                listaModelCategoriaProduto.get(i).getModelProduto().getEstoque(),
                listaModelCategoriaProduto.get(i).getModelCategoria().getNome()
            });
        }

    }
     //FIM DOS MÉTODOS DA ABA: actualizar/remover

    //MÉTODOS USADOS NA ABA VER:
    /**
     * Lista os dados na tabela
     */
    private void visualizar_produto() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_produto.getModel();
        listaModelCategoriaProduto = controllerCategoriaProduto.getListaCategoriaProdutoController();//Recebendo os produtos da BD e guardar na lista
        int cont = listaModelCategoriaProduto.size();
        modelo.setNumRows(0);

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoriaProduto.get(i).getModelProduto().getProduto_id(),
                listaModelCategoriaProduto.get(i).getModelProduto().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getPreco_unitario(),
                listaModelCategoriaProduto.get(i).getModelProduto().getEstoque(),
                listaModelCategoriaProduto.get(i).getModelCategoria().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getData_registo()
            });
        }

    }

    private void listar_actualizacao_produto() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_produto.getModel();
        listaModelCategoriaProduto = controllerCategoriaProduto.getListaCategoriaProdutoController();//Recebendo os produtos da BD e guardar na lista
        int cont = listaModelCategoriaProduto.size();
        modelo.setNumRows(0);

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCategoriaProduto.get(i).getModelProduto().getProduto_id(),
                listaModelCategoriaProduto.get(i).getModelProduto().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getPreco_unitario(),
                listaModelCategoriaProduto.get(i).getModelProduto().getEstoque(),
                listaModelCategoriaProduto.get(i).getModelCategoria().getNome(),
                listaModelCategoriaProduto.get(i).getModelProduto().getData_registo()
            });
        }

    }

    //MÉTODOS COMUNS AS ABAS
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtf_nome.setEnabled(condicao);
        jtf_preco_unitario.setEnabled(condicao);
        jtf_estoque.setEnabled(condicao);
        jcb_categoria.setEnabled(condicao);
        jb_salvar.setEnabled(condicao);
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_produto.setEnabled(condicao);
        this.jtf_preco_unitario_produto.setEnabled(condicao);
        this.jtf_estoque_produto.setEnabled(condicao);
        this.jcb_categoria_produto.setEnabled(condicao);
        this.jb_salvar_actualizacao.setEnabled(condicao);

    }

    /**
     * limpar os campos do formulario
     *
     * @param condicao
     */
    private void limparCampos() {
        jtf_nome.setText("");
        jtf_preco_unitario.setText("");
        jtf_estoque.setText("");

        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_produto.setText("");
        this.jtf_preco_unitario_produto.setText("");
        this.jtf_estoque_produto.setText("");

    }

    //Lista categoria para preencher o comboobx
    private void listarCategoria() {
        listaModelCategoria = controllerCategoria.getListaCategoriaController();
        this.jcb_categoria.removeAllItems();//Para nao haver duplicacao de dados

        for (int i = 0; i < listaModelCategoria.size(); i++) {
            this.jcb_categoria.addItem(listaModelCategoria.get(i).getNome());
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1_registar_produto;
    private javax.swing.JPanel jPanel2_visualizar_produto;
    private javax.swing.JPanel jPanel3_actualizar_remover_produto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_actualizar_lista_tabela;
    private javax.swing.JButton jb_actualizar_lista_tabela_produto;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_cancelar_produto;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_pesquisar_produto;
    private javax.swing.JButton jb_remover;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_salvar_actualizacao;
    private componentes.UJComboBox jcb_categoria;
    private componentes.UJComboBox jcb_categoria_produto;
    private javax.swing.JTable jtable_actualiza_remove_produto;
    private javax.swing.JTable jtable_lista_produto;
    private javax.swing.JTable jtable_produto;
    private javax.swing.JFormattedTextField jtf_estoque;
    private javax.swing.JFormattedTextField jtf_estoque_produto;
    private javax.swing.JFormattedTextField jtf_id_produto;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_nome_produto;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTextField jtf_pesquisa_produto;
    private javax.swing.JFormattedTextField jtf_preco_unitario;
    private javax.swing.JFormattedTextField jtf_preco_unitario_produto;
    // End of variables declaration//GEN-END:variables
}
