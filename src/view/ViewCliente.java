package view;

import controller.ControllerCliente;
import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import util.BLDatas;

public class ViewCliente extends javax.swing.JFrame {

    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    BLDatas blDatas = new BLDatas();

    public ViewCliente() {
        initComponents();
        setLocationRelativeTo(null); //Para a tela/interface ficar no centro
        this.visualizar_cliente();
        this.listar_cliente_actualizacao_remocao();
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2_Registar_Cliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_endereco = new javax.swing.JTextField();
        jtf_telefone = new javax.swing.JFormattedTextField();
        jtf_email = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_cliente = new javax.swing.JTable();
        jb_cancelar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jPanel4_ver_cliente = new javax.swing.JPanel();
        jtf_pesquisa = new javax.swing.JTextField();
        jb_pesquisar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable_lista_clientes = new javax.swing.JTable();
        jb_actualizar_lista_tabela = new javax.swing.JButton();
        jPanel3_Actualizar_Cliente = new javax.swing.JPanel();
        jtf_pesquisa_cliente = new javax.swing.JTextField();
        jb_pesquisar_cliente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_actualiza_remove_cliente = new javax.swing.JTable();
        jb_cancelar_cliente = new javax.swing.JButton();
        jb_actualizar_cliente = new javax.swing.JButton();
        jb_remover = new javax.swing.JButton();
        jb_salvar_actualizacao = new javax.swing.JButton();
        jtf_id_cliente = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_nome_cliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_telefone_cliente = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_endereco_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_email_cliente = new javax.swing.JTextField();
        jb_actualizar_tabela_cliente2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTE");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Endereço: ");

        jLabel4.setText("Telefone: ");

        jLabel5.setText("E-mail: ");

        try {
            jtf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+(258) ## ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtable_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtable_cliente);

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

        javax.swing.GroupLayout jPanel2_Registar_ClienteLayout = new javax.swing.GroupLayout(jPanel2_Registar_Cliente);
        jPanel2_Registar_Cliente.setLayout(jPanel2_Registar_ClienteLayout);
        jPanel2_Registar_ClienteLayout.setHorizontalGroup(
            jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Registar_ClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jb_cancelar)
                .addGap(107, 107, 107)
                .addComponent(jb_novo)
                .addGap(177, 177, 177)
                .addComponent(jb_salvar)
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(jPanel2_Registar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_Registar_ClienteLayout.createSequentialGroup()
                        .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2_Registar_ClienteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_telefone))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2_Registar_ClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_endereco)
                            .addComponent(jtf_email)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2_Registar_ClienteLayout.setVerticalGroup(
            jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Registar_ClienteLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_Registar_ClienteLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2_Registar_ClienteLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel2_Registar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_cancelar)
                            .addComponent(jb_novo)
                            .addComponent(jb_salvar))))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registar", jPanel2_Registar_Cliente);

        jb_pesquisar.setText("Pesquisa");
        jb_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisarActionPerformed(evt);
            }
        });

        jtable_lista_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "E-mail", "Data de Registo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtable_lista_clientes);

        jb_actualizar_lista_tabela.setText("Actualizar tabela");
        jb_actualizar_lista_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_lista_tabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4_ver_clienteLayout = new javax.swing.GroupLayout(jPanel4_ver_cliente);
        jPanel4_ver_cliente.setLayout(jPanel4_ver_clienteLayout);
        jPanel4_ver_clienteLayout.setHorizontalGroup(
            jPanel4_ver_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_ver_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4_ver_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4_ver_clienteLayout.createSequentialGroup()
                        .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_pesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_actualizar_lista_tabela)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel4_ver_clienteLayout.setVerticalGroup(
            jPanel4_ver_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_ver_clienteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4_ver_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar)
                    .addComponent(jb_actualizar_lista_tabela))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", jPanel4_ver_cliente);

        jb_pesquisar_cliente.setText("Pesquisa");
        jb_pesquisar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisar_clienteActionPerformed(evt);
            }
        });

        jtable_actualiza_remove_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtable_actualiza_remove_cliente);

        jb_cancelar_cliente.setText("Cancelar");
        jb_cancelar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_clienteActionPerformed(evt);
            }
        });

        jb_actualizar_cliente.setText("Actualizar");
        jb_actualizar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_clienteActionPerformed(evt);
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

        jtf_id_cliente.setEditable(false);
        jtf_id_cliente.setEnabled(false);

        jLabel6.setText("ID: ");

        jLabel7.setText("Nome: ");

        jLabel9.setText("Telefone: ");

        jLabel10.setText("Endereço: ");

        jLabel11.setText("E-mail: ");

        jb_actualizar_tabela_cliente2.setText("Actualizar tabela");
        jb_actualizar_tabela_cliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_tabela_cliente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3_Actualizar_ClienteLayout = new javax.swing.GroupLayout(jPanel3_Actualizar_Cliente);
        jPanel3_Actualizar_Cliente.setLayout(jPanel3_Actualizar_ClienteLayout);
        jPanel3_Actualizar_ClienteLayout.setHorizontalGroup(
            jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_nome_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_email_cliente)
                        .addContainerGap())
                    .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                        .addComponent(jtf_pesquisa_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_pesquisar_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(jb_actualizar_tabela_cliente2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jb_cancelar_cliente)
                        .addGap(68, 68, 68)
                        .addComponent(jb_actualizar_cliente)
                        .addGap(93, 93, 93)
                        .addComponent(jb_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(jb_salvar_actualizacao)
                        .addGap(138, 138, 138))))
        );
        jPanel3_Actualizar_ClienteLayout.setVerticalGroup(
            jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_Actualizar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jtf_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_email_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar_cliente)
                    .addComponent(jb_actualizar_tabela_cliente2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3_Actualizar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar_cliente)
                    .addComponent(jb_actualizar_cliente)
                    .addComponent(jb_remover)
                    .addComponent(jb_salvar_actualizacao))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar/Remover", jPanel3_Actualizar_Cliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_pesquisar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisar_clienteActionPerformed
        this.pesquisar_cliente_actualizacao_remocao();
    }//GEN-LAST:event_jb_pesquisar_clienteActionPerformed

    private void jb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarActionPerformed
        this.pesquisar_cliente();

    }//GEN-LAST:event_jb_pesquisarActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        this.salvar_cliente();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jb_actualizar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_clienteActionPerformed
        this.actualizar_cliente();
    }//GEN-LAST:event_jb_actualizar_clienteActionPerformed

    //Cancelar da aba actualizar/remover
    private void jb_cancelar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_clienteActionPerformed
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jb_cancelar_clienteActionPerformed

    private void jb_salvar_actualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_actualizacaoActionPerformed
        this.salvar_actualizacao_cliente();
    }//GEN-LAST:event_jb_salvar_actualizacaoActionPerformed

    private void jb_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_removerActionPerformed
        this.remover_cliente();
    }//GEN-LAST:event_jb_removerActionPerformed

    private void jb_actualizar_lista_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_lista_tabelaActionPerformed
        this.listar_actualizacao_cliente();
    }//GEN-LAST:event_jb_actualizar_lista_tabelaActionPerformed

    private void jb_actualizar_tabela_cliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_tabela_cliente2ActionPerformed
        this.listar_actualizacao_cliente2();
    }//GEN-LAST:event_jb_actualizar_tabela_cliente2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    //MÉTODOS USADOS NA ABA: registar
    private void salvar_cliente() {
        // Salva um novo cliente na BD
        modelCliente.setNome(this.jtf_nome.getText());
        modelCliente.setEndereco(this.jtf_endereco.getText());
        modelCliente.setTelefone(this.jtf_telefone.getText());
        modelCliente.setEmail(this.jtf_email.getText());
        try {
            modelCliente.setData_registo(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {

        }

        if (controllerCliente.salvarClienteController(modelCliente) > 0) {
            JOptionPane.showMessageDialog(this, "Cliente registado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.listar_cliente();//Para mostar o novo cliente na tabela
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registar o cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_cliente() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_lista_clientes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_lista_clientes.setRowSorter(classificador);
        String nome_cliente = this.jtf_pesquisa.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_cliente, 1));//a coluna é 1 pois a pesquisa será por nome
    }
    
    /**
     * Metodo chamado após registar um novo cliente
     */
    private void listar_cliente() {
        listaModelCliente = controllerCliente.getListaClienteController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) jtable_cliente.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCliente_id(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getEndereco(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getEmail()
            });

        }
    }
    //FIM DOS MÉTODOS DA ABA registar

    //INICIO DOS MÉTODOS USADOS NA ABA: actualizar/remover:
    /**
     * Apenas pega os dados da linha da tabela selecionada e coloca nos devidos
     * campos
     */
    private void actualizar_cliente() {
        int linha = jtable_actualiza_remove_cliente.getSelectedRow();//pegamos a linha seleccionada e depois pegamos o id correspondente
        try {
            int id_cliente = (int) this.jtable_actualiza_remove_cliente.getValueAt(linha, 0);//colocamos 0 pois o id está na primeira coluna que é 0

            //recuperar dados da BD
            modelCliente = controllerCliente.getClienteController(id_cliente);//retornar o produto selecionado
            //colocar os dados do cliente selecionado na interface/nos devidos campos
            //Nao é obrigatório incluir o codigo
            this.jtf_id_cliente.setText(String.valueOf(modelCliente.getCliente_id()));
            this.jtf_nome_cliente.setText(modelCliente.getNome());
            this.jtf_endereco_cliente.setText(modelCliente.getEndereco());
            this.jtf_telefone_cliente.setText(modelCliente.getTelefone());
            this.jtf_email_cliente.setText(modelCliente.getEmail());
            this.habilitarDesabilitarCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registo seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void salvar_actualizacao_cliente() {
        modelCliente.setNome(this.jtf_nome_cliente.getText()); //Preencher o objecto cliente com todos dados do cliente
        modelCliente.setEndereco(this.jtf_endereco_cliente.getText());
        modelCliente.setTelefone(this.jtf_telefone_cliente.getText());
        modelCliente.setEmail(this.jtf_email_cliente.getText());

        if (controllerCliente.atualizarClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, "Cliente actualizado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //Carregar os clientes na tabela
            this.listar_cliente_actualizacao_remocao();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao actualizar cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void remover_cliente() {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(this, "Tem a certeza de que deseja remover? /n1.Confirmar;/n2.Cancelar"));
        if (opcao == 1) {
            int linha = this.jtable_actualiza_remove_cliente.getSelectedRow(); //remove o dado da linha seleccionada
            int id_cliente = (int) this.jtable_actualiza_remove_cliente.getValueAt(linha, 0); //Pegar o id da linha selecionada e a coluna do codigo é 0, se estivesse na 2 coluna seria 1
            if (controllerCliente.excluirClienteController(id_cliente)) {
                JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.listar_cliente_actualizacao_remocao();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Remoção cancelada", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_cliente_actualizacao_remocao() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_cliente.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_actualiza_remove_cliente.setRowSorter(classificador);
        String nome_cliente = this.jtf_pesquisa_cliente.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_cliente, 1));//a coluna é 1 pois a pesquisa será por nome
    }
    
    /**
     * lista os dados ao abrirmos a aba 
     */
    private void listar_cliente_actualizacao_remocao() {
        listaModelCliente = controllerCliente.getListaClienteController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_cliente.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCliente_id(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getEndereco(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getEmail()
            });

        }
    }
    
    /**
     * lista os dados actualizados apos adicionar ou actualizar algum cliente ao clicar em actualizar dados
     */
    private void listar_actualizacao_cliente2() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_actualiza_remove_cliente.getModel();
        listaModelCliente = controllerCliente.getListaClienteController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCliente_id(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getEndereco(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getEmail(),
                listaModelCliente.get(i).getData_registo()
            });

        }
    }
    //FIM DOS MÉTODOS DA ABA: actualizar/remover
    
    
    //MÉTODOS USADOS NA ABA VER:
    
    /**
     * Lista os dados na tabela
     */
    private void visualizar_cliente() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_clientes.getModel();
        listaModelCliente = controllerCliente.getListaClienteController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCliente_id(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getEndereco(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getEmail(),
                listaModelCliente.get(i).getData_registo()
            });

        }
    }
    
    private void listar_actualizacao_cliente() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_clientes.getModel();
        listaModelCliente = controllerCliente.getListaClienteController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCliente_id(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getEndereco(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getEmail(),
                listaModelCliente.get(i).getData_registo()
            });

        }
    }
    
    //MÉTODOS COMUNS AS ABAS
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtf_nome.setEnabled(condicao);
        jtf_endereco.setEnabled(condicao);
        jtf_telefone.setEnabled(condicao);
        jtf_email.setEnabled(condicao);
        jb_salvar.setEnabled(condicao);
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_cliente.setEnabled(condicao);
        this.jtf_endereco_cliente.setEnabled(condicao);
        this.jtf_telefone_cliente.setEnabled(condicao);
        this.jtf_email_cliente.setEnabled(condicao);
        this.jb_salvar_actualizacao.setEnabled(condicao);

    }

    /**
     * limpar os campos do formulario
     *
     * @param condicao
     */
    private void limparCampos() {
        jtf_nome.setText("");
        jtf_endereco.setText("");
        jtf_telefone.setText("");
        jtf_email.setText("");
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_cliente.setText("");
        this.jtf_endereco_cliente.setText("");
        this.jtf_telefone_cliente.setText("");
        this.jtf_email_cliente.setText("");

    }

    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2_Registar_Cliente;
    private javax.swing.JPanel jPanel3_Actualizar_Cliente;
    private javax.swing.JPanel jPanel4_ver_cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_actualizar_cliente;
    private javax.swing.JButton jb_actualizar_lista_tabela;
    private javax.swing.JButton jb_actualizar_tabela_cliente2;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_cancelar_cliente;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_pesquisar_cliente;
    private javax.swing.JButton jb_remover;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_salvar_actualizacao;
    private javax.swing.JTable jtable_actualiza_remove_cliente;
    private javax.swing.JTable jtable_cliente;
    private javax.swing.JTable jtable_lista_clientes;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_email_cliente;
    private javax.swing.JTextField jtf_endereco;
    private javax.swing.JTextField jtf_endereco_cliente;
    private javax.swing.JFormattedTextField jtf_id_cliente;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_nome_cliente;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTextField jtf_pesquisa_cliente;
    private javax.swing.JFormattedTextField jtf_telefone;
    private javax.swing.JFormattedTextField jtf_telefone_cliente;
    // End of variables declaration//GEN-END:variables
}
