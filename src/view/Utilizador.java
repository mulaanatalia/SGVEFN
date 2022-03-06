package view;

import controller.ControllerUtilizador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUtilizador;
import util.BLDatas;

/**
 *
 * @author Anatalia Neves Mula
 */
public class Utilizador extends javax.swing.JFrame {

    ControllerUtilizador controllerUtilizador = new ControllerUtilizador();
    ModelUtilizador modelUtilizador = new ModelUtilizador();
    ArrayList<ModelUtilizador> listaModelUtilizador = new ArrayList<>();
    BLDatas blDatas = new BLDatas();

    public Utilizador() {
        initComponents();
        setLocationRelativeTo(null); //Para a tela/interface ficar no centro
        this.visualizar_utilizador();
        this.listar_utilizador_actualizacao_remocao();
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_login = new javax.swing.JTextField();
        jtf_senha = new javax.swing.JPasswordField();
        jcb_perfil = new componentes.UJComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_utilizador = new javax.swing.JTable();
        jb_cancelar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtf_pesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jb_pesquisar = new javax.swing.JButton();
        jb_actualizar_lista_tabela = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_lista_utilizador = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable_actualiza_remove_utilizador = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_id_utilizador = new javax.swing.JFormattedTextField();
        jtf_nome_utilizador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_login_utilizador = new javax.swing.JTextField();
        jtf_senha_utilizador = new javax.swing.JPasswordField();
        jcb_perfil_utilizador = new componentes.UJComboBox();
        jLabel11 = new javax.swing.JLabel();
        jtf_pesquisa_utilizador = new javax.swing.JTextField();
        jb_pesquisar_utilizador = new javax.swing.JButton();
        jb_actualizar_tabela_utilizador2 = new javax.swing.JButton();
        jb_cancelar_utilizador = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_remover = new javax.swing.JButton();
        jb_salvar_actualizacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UTILIZADOR");

        jLabel1.setText("Nome: ");

        jLabel2.setText("Login: ");

        jLabel3.setText("Senha: ");

        jLabel4.setText("Perfil: ");

        jcb_perfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gestor", "Utilizador Comum" }));
        jcb_perfil.setAutocompletar(true);
        jcb_perfil.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jtable_utilizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_utilizador);
        if (jtable_utilizador.getColumnModel().getColumnCount() > 0) {
            jtable_utilizador.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_utilizador.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_utilizador.getColumnModel().getColumn(0).setMaxWidth(40);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_senha))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_login)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 96, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_cancelar)
                        .addGap(108, 108, 108)
                        .addComponent(jb_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar)
                    .addComponent(jb_novo)
                    .addComponent(jb_salvar))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registar", jPanel1);

        jLabel5.setText("Informe o nome do utilizador: ");

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

        jtable_lista_utilizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha", "Perfil", "Data de Registo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtable_lista_utilizador);
        if (jtable_lista_utilizador.getColumnModel().getColumnCount() > 0) {
            jtable_lista_utilizador.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_lista_utilizador.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_lista_utilizador.getColumnModel().getColumn(0).setMaxWidth(40);
            jtable_lista_utilizador.getColumnModel().getColumn(5).setHeaderValue("Data de Registo");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jb_pesquisar)
                        .addGap(42, 42, 42)
                        .addComponent(jb_actualizar_lista_tabela)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar)
                    .addComponent(jb_actualizar_lista_tabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2);

        jtable_actualiza_remove_utilizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtable_actualiza_remove_utilizador);
        if (jtable_actualiza_remove_utilizador.getColumnModel().getColumnCount() > 0) {
            jtable_actualiza_remove_utilizador.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_actualiza_remove_utilizador.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_actualiza_remove_utilizador.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel6.setText("ID: ");

        jLabel7.setText("Nome: ");

        jtf_id_utilizador.setEditable(false);
        jtf_id_utilizador.setEnabled(false);

        jLabel8.setText("Perfil: ");

        jLabel9.setText("Login: ");

        jLabel10.setText("Senha: ");

        jcb_perfil_utilizador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gestor", "Utilizador Comum" }));
        jcb_perfil_utilizador.setAutocompletar(true);

        jLabel11.setText("Informe o nome de utilizador para pesquisar: ");

        jb_pesquisar_utilizador.setText("Pesquisar");
        jb_pesquisar_utilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisar_utilizadorActionPerformed(evt);
            }
        });

        jb_actualizar_tabela_utilizador2.setText("Actualizar Tabela");
        jb_actualizar_tabela_utilizador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_tabela_utilizador2ActionPerformed(evt);
            }
        });

        jb_cancelar_utilizador.setText("Cancelar");
        jb_cancelar_utilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_utilizadorActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_id_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_nome_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcb_perfil_utilizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_login_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_senha_utilizador))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtf_pesquisa_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_pesquisar_utilizador)
                                .addGap(58, 58, 58)
                                .addComponent(jb_actualizar_tabela_utilizador2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jb_cancelar_utilizador)
                        .addGap(50, 50, 50)
                        .addComponent(jb_actualizar)
                        .addGap(54, 54, 54)
                        .addComponent(jb_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar_actualizacao)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_id_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_nome_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jcb_perfil_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jtf_senha_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jtf_login_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar_utilizador)
                    .addComponent(jb_actualizar_tabela_utilizador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_cancelar_utilizador)
                            .addComponent(jb_actualizar)
                            .addComponent(jb_remover)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jb_salvar_actualizacao)))
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Actualizar/Remover", jPanel3);

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
        this.salvar_utilizador();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarActionPerformed
        this.pesquisar_utilizador();
    }//GEN-LAST:event_jb_pesquisarActionPerformed

    private void jb_actualizar_lista_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_lista_tabelaActionPerformed
        this.listar_actualizacao_utilizador();
    }//GEN-LAST:event_jb_actualizar_lista_tabelaActionPerformed

    private void jb_pesquisar_utilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisar_utilizadorActionPerformed
        this.pesquisar_utilizador_actualizacao_remocao();
    }//GEN-LAST:event_jb_pesquisar_utilizadorActionPerformed

    private void jb_actualizar_tabela_utilizador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_tabela_utilizador2ActionPerformed
        this.listar_actualizacao_utilizador2();
    }//GEN-LAST:event_jb_actualizar_tabela_utilizador2ActionPerformed

    private void jb_cancelar_utilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_utilizadorActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelar_utilizadorActionPerformed

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        this.actualizar_utilizador();
    }//GEN-LAST:event_jb_actualizarActionPerformed

    private void jb_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_removerActionPerformed
        this.remover_utilizador();
    }//GEN-LAST:event_jb_removerActionPerformed

    private void jb_salvar_actualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_actualizacaoActionPerformed
        this.salvar_actualizacao_utilizador();
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
            java.util.logging.Logger.getLogger(Utilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilizador().setVisible(true);
            }
        });
    }

    //MÉTODOS USADOS NA ABA: registar
    private void salvar_utilizador() {
        // Salva um novo cliente na BD
        modelUtilizador.setNome(this.jtf_nome.getText());
        modelUtilizador.setLogin(this.jtf_login.getText());
        modelUtilizador.setSenha(String.valueOf(this.jtf_senha.getPassword()));
        modelUtilizador.setPerfil(String.valueOf(this.jcb_perfil.getSelectedItem()));
        try {
            modelUtilizador.setData_registo(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {

        }

        if (controllerUtilizador.salvarUtilizadorController(modelUtilizador) > 0) {
            JOptionPane.showMessageDialog(this, "Utilizador registado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.listar_utilizador();//Para mostar o novo cliente na tabela
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registar o utilizador!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_utilizador() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_lista_utilizador.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_lista_utilizador.setRowSorter(classificador);
        String nome_utilizador = this.jtf_pesquisa.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_utilizador, 1));//a coluna é 1 pois a pesquisa será por nome
    }

    /**
     * Metodo chamado após registar um novo cliente
     */
    private void listar_utilizador() {
        listaModelUtilizador = controllerUtilizador.getListaUtilizadorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) jtable_utilizador.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelUtilizador.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUtilizador.get(i).getUtilizador_id(),
                listaModelUtilizador.get(i).getNome(),
                listaModelUtilizador.get(i).getLogin(),
                listaModelUtilizador.get(i).getSenha(),
                listaModelUtilizador.get(i).getPerfil()
            });

        }
    }
    //FIM DOS MÉTODOS DA ABA registar

    //INICIO DOS MÉTODOS USADOS NA ABA: actualizar/remover:
    /**
     * Apenas pega os dados da linha da tabela selecionada e coloca nos devidos
     * campos
     */
    private void actualizar_utilizador() {
        int linha = jtable_actualiza_remove_utilizador.getSelectedRow();//pegamos a linha seleccionada e depois pegamos o id correspondente
        try {
            int id_utilizador = (int) this.jtable_actualiza_remove_utilizador.getValueAt(linha, 0);//colocamos 0 pois o id está na primeira coluna que é 0

            //recuperar dados da BD
            modelUtilizador = controllerUtilizador.getUtilizadorController(id_utilizador);//retornar o produto selecionado
            //colocar os dados do cliente selecionado na interface/nos devidos campos
            //Nao é obrigatório incluir o codigo
            this.jtf_id_utilizador.setText(String.valueOf(modelUtilizador.getUtilizador_id()));
            this.jtf_nome_utilizador.setText(modelUtilizador.getNome());
            this.jtf_login_utilizador.setText(modelUtilizador.getLogin());
            this.jtf_senha_utilizador.setText(modelUtilizador.getSenha());
            this.jcb_perfil_utilizador.setSelectedItem(modelUtilizador.getPerfil());
            this.habilitarDesabilitarCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registo seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void salvar_actualizacao_utilizador() {
        modelUtilizador.setNome(this.jtf_nome_utilizador.getText()); //Preencher o objecto cliente com todos dados do cliente
        modelUtilizador.setLogin(this.jtf_login_utilizador.getText());
        modelUtilizador.setSenha(String.valueOf(this.jtf_senha_utilizador.getPassword()));
        modelUtilizador.setPerfil(String.valueOf(this.jcb_perfil_utilizador.getSelectedItem()));

        if (controllerUtilizador.atualizarUtilizadorController(modelUtilizador)) {
            JOptionPane.showMessageDialog(this, "utilizador actualizado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //Carregar os clientes na tabela
            this.listar_utilizador_actualizacao_remocao();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao actualizar utilizador!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void remover_utilizador() {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(this, "Tem a certeza de que deseja remover? /n1.Confirmar;/n2.Cancelar"));
        if (opcao == 1) {
            int linha = this.jtable_actualiza_remove_utilizador.getSelectedRow(); //remove o dado da linha seleccionada
            int id_utilizador = (int) this.jtable_actualiza_remove_utilizador.getValueAt(linha, 0); //Pegar o id da linha selecionada e a coluna do codigo é 0, se estivesse na 2 coluna seria 1
            if (controllerUtilizador.excluirUtilizadorController(id_utilizador)) {
                JOptionPane.showMessageDialog(this, "Utilizador excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.listar_utilizador_actualizacao_remocao();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o utilizador!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Remoção cancelada", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_utilizador_actualizacao_remocao() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_utilizador.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_actualiza_remove_utilizador.setRowSorter(classificador);
        String nome_utilizador = this.jtf_pesquisa_utilizador.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_utilizador, 1));//a coluna é 1 pois a pesquisa será por nome
    }

    /**
     * lista os dados ao abrirmos a aba
     */
    private void listar_utilizador_actualizacao_remocao() {
        listaModelUtilizador = controllerUtilizador.getListaUtilizadorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_utilizador.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelUtilizador.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUtilizador.get(i).getUtilizador_id(),
                listaModelUtilizador.get(i).getNome(),
                listaModelUtilizador.get(i).getLogin(),
                listaModelUtilizador.get(i).getSenha(),
                listaModelUtilizador.get(i).getPerfil()
            });

        }
    }

    /**
     * lista os dados actualizados apos adicionar ou actualizar algum cliente ao
     * clicar em actualizar dados
     */
    private void listar_actualizacao_utilizador2() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_actualiza_remove_utilizador.getModel();
        listaModelUtilizador = controllerUtilizador.getListaUtilizadorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelUtilizador.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUtilizador.get(i).getUtilizador_id(),
                listaModelUtilizador.get(i).getNome(),
                listaModelUtilizador.get(i).getLogin(),
                listaModelUtilizador.get(i).getSenha(),
                listaModelUtilizador.get(i).getPerfil(),
                listaModelUtilizador.get(i).getData_registo()
            });

        }
    }
    //FIM DOS MÉTODOS DA ABA: actualizar/remover

    //MÉTODOS USADOS NA ABA VER:
    /**
     * Lista os dados na tabela
     */
    private void visualizar_utilizador() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_utilizador.getModel();
        listaModelUtilizador = controllerUtilizador.getListaUtilizadorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelUtilizador.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUtilizador.get(i).getUtilizador_id(),
                listaModelUtilizador.get(i).getNome(),
                listaModelUtilizador.get(i).getLogin(),
                listaModelUtilizador.get(i).getSenha(),
                listaModelUtilizador.get(i).getPerfil(),
                listaModelUtilizador.get(i).getData_registo()
            });

        }
    }

    private void listar_actualizacao_utilizador() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_utilizador.getModel();
        listaModelUtilizador = controllerUtilizador.getListaUtilizadorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelUtilizador.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUtilizador.get(i).getUtilizador_id(),
                listaModelUtilizador.get(i).getNome(),
                listaModelUtilizador.get(i).getLogin(),
                listaModelUtilizador.get(i).getSenha(),
                listaModelUtilizador.get(i).getPerfil(),
                listaModelUtilizador.get(i).getData_registo()
            });

        }
    }

    //MÉTODOS COMUNS AS ABAS
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtf_nome.setEnabled(condicao);
        jtf_login.setEnabled(condicao);
        jtf_senha.setEnabled(condicao);
        jcb_perfil.setEnabled(condicao);
        jb_salvar.setEnabled(condicao);
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_utilizador.setEnabled(condicao);
        this.jtf_login_utilizador.setEnabled(condicao);
        this.jtf_senha_utilizador.setEnabled(condicao);
        this.jcb_perfil_utilizador.setEnabled(condicao);
        this.jb_salvar_actualizacao.setEnabled(condicao);

    }

    /**
     * limpar os campos do formulario
     *
     * @param condicao
     */
    private void limparCampos() {
        jtf_nome.setText("");
        jtf_login.setText("");
        jtf_senha.setText("");
        //jcb_perfil.setSelectedItem("");
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_utilizador.setText("");
        this.jtf_login_utilizador.setText("");
        this.jtf_senha_utilizador.setText("");
        //this.jcb_perfil_utilizador.setSelectedItem("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_actualizar_lista_tabela;
    private javax.swing.JButton jb_actualizar_tabela_utilizador2;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_cancelar_utilizador;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_pesquisar_utilizador;
    private javax.swing.JButton jb_remover;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_salvar_actualizacao;
    private componentes.UJComboBox jcb_perfil;
    private componentes.UJComboBox jcb_perfil_utilizador;
    private javax.swing.JTable jtable_actualiza_remove_utilizador;
    private javax.swing.JTable jtable_lista_utilizador;
    private javax.swing.JTable jtable_utilizador;
    private javax.swing.JFormattedTextField jtf_id_utilizador;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JTextField jtf_login_utilizador;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_nome_utilizador;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTextField jtf_pesquisa_utilizador;
    private javax.swing.JPasswordField jtf_senha;
    private javax.swing.JPasswordField jtf_senha_utilizador;
    // End of variables declaration//GEN-END:variables
}
