package view;

import controller.ControllerFornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelFornecedor;
import util.BLDatas;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ViewFornecedor extends javax.swing.JFrame {

    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ModelFornecedor modelFornecedor = new ModelFornecedor();
    ArrayList<ModelFornecedor> listaModelFornecedor = new ArrayList<>();
    BLDatas blDatas = new BLDatas();

    public ViewFornecedor() {
        initComponents();
        setLocationRelativeTo(null); //Para a tela/interface ficar no centro
        this.visualizar_fornecedor();
        this.listar_fornecedor_actualizacao_remocao();
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1_registar_fornecedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_nuit = new javax.swing.JFormattedTextField();
        jtf_telefone1 = new javax.swing.JFormattedTextField();
        jtf_email = new javax.swing.JTextField();
        jtf_localizacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_fornecedor = new javax.swing.JTable();
        jb_cancelar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jtf_telefone2 = new javax.swing.JTextField();
        jPanel2_visualizar_fornecedor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_lista_fornecedores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtf_pesquisa = new javax.swing.JTextField();
        jb_pesquisar = new javax.swing.JButton();
        jb_actualizar_lista_tabela = new javax.swing.JButton();
        jPanel3_actualizar_remover_fornecedor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtf_id_fornecedor = new javax.swing.JFormattedTextField();
        jtf_nome_fornecedor = new javax.swing.JTextField();
        jtf_nuit_fornecedor = new javax.swing.JFormattedTextField();
        jtf_telefone1_fornecedor = new javax.swing.JFormattedTextField();
        jtf_telefone2_fornecedor = new javax.swing.JTextField();
        jtf_email_fornecedor = new javax.swing.JTextField();
        jtf_localizacao_fornecedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtf_pesquisa_fornecedor = new javax.swing.JTextField();
        jb_pesquisar_fornecedor = new javax.swing.JButton();
        jb_actualizar_tabela_fornecedor2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_actualiza_remove_fornecedor = new javax.swing.JTable();
        jb_cancelar_fornecedor = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_remover = new javax.swing.JButton();
        jb_salvar_actualizacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome: ");

        jLabel2.setText("NUIT: ");

        jLabel3.setText("Telefone 1: ");

        jLabel4.setText("Telefone 2: ");

        jLabel5.setText("E-mail: ");

        jLabel6.setText("Localização: ");

        try {
            jtf_nuit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtf_telefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+(258) ## ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtable_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "NUIT", "Telefone 1", "Telefone 2", "Email", "Localização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_fornecedor);
        if (jtable_fornecedor.getColumnModel().getColumnCount() > 0) {
            jtable_fornecedor.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_fornecedor.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_fornecedor.getColumnModel().getColumn(0).setMaxWidth(40);
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

        javax.swing.GroupLayout jPanel1_registar_fornecedorLayout = new javax.swing.GroupLayout(jPanel1_registar_fornecedor);
        jPanel1_registar_fornecedor.setLayout(jPanel1_registar_fornecedorLayout);
        jPanel1_registar_fornecedorLayout.setHorizontalGroup(
            jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                        .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                                .addComponent(jtf_telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                                .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nuit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                        .addComponent(jb_cancelar)
                        .addGap(248, 248, 248)
                        .addComponent(jb_novo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_registar_fornecedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_salvar)
                .addContainerGap())
            .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1_registar_fornecedorLayout.setVerticalGroup(
            jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                        .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_registar_fornecedorLayout.createSequentialGroup()
                        .addComponent(jtf_telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar)
                    .addComponent(jb_novo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_salvar)
                .addGap(38, 38, 38))
            .addGroup(jPanel1_registar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1_registar_fornecedorLayout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registar", jPanel1_registar_fornecedor);

        jtable_lista_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "NUIT", "Telefone 1", "Telefone 2", "E-mail", "Localização", "Data de Registo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_lista_fornecedores);
        if (jtable_lista_fornecedores.getColumnModel().getColumnCount() > 0) {
            jtable_lista_fornecedores.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_lista_fornecedores.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_lista_fornecedores.getColumnModel().getColumn(0).setMaxWidth(40);
            jtable_lista_fornecedores.getColumnModel().getColumn(7).setHeaderValue("Data de Registo");
        }

        jLabel7.setText("Informe o nome do fornecedor para pesquisar");

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

        javax.swing.GroupLayout jPanel2_visualizar_fornecedorLayout = new javax.swing.GroupLayout(jPanel2_visualizar_fornecedor);
        jPanel2_visualizar_fornecedor.setLayout(jPanel2_visualizar_fornecedorLayout);
        jPanel2_visualizar_fornecedorLayout.setHorizontalGroup(
            jPanel2_visualizar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_visualizar_fornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_visualizar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2_visualizar_fornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2_visualizar_fornecedorLayout.createSequentialGroup()
                        .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jb_pesquisar)
                        .addGap(36, 36, 36)
                        .addComponent(jb_actualizar_lista_tabela)))
                .addContainerGap())
        );
        jPanel2_visualizar_fornecedorLayout.setVerticalGroup(
            jPanel2_visualizar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_visualizar_fornecedorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2_visualizar_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar)
                    .addComponent(jb_actualizar_lista_tabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2_visualizar_fornecedor);

        jLabel8.setText("ID: ");

        jLabel9.setText("Nome: ");

        jLabel10.setText("NUIT: ");

        jLabel11.setText("Telefone 1: ");

        jLabel12.setText("Telefone 2: ");

        jLabel13.setText("E-mail: ");

        jLabel14.setText("Localização: ");

        jtf_id_fornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtf_id_fornecedor.setEnabled(false);

        try {
            jtf_nuit_fornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtf_telefone1_fornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+(258) ## ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setText("Informe o nome do fornecedor para pesquisar");

        jb_pesquisar_fornecedor.setText("Pesquisar");
        jb_pesquisar_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisar_fornecedorActionPerformed(evt);
            }
        });

        jb_actualizar_tabela_fornecedor2.setText("Actualizar Tabela");
        jb_actualizar_tabela_fornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_tabela_fornecedor2ActionPerformed(evt);
            }
        });

        jtable_actualiza_remove_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "NUIT", "Telefone 1", "Telefone 2", "E-mail", "Localização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtable_actualiza_remove_fornecedor);
        if (jtable_actualiza_remove_fornecedor.getColumnModel().getColumnCount() > 0) {
            jtable_actualiza_remove_fornecedor.getColumnModel().getColumn(0).setMinWidth(40);
            jtable_actualiza_remove_fornecedor.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtable_actualiza_remove_fornecedor.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jb_cancelar_fornecedor.setText("Cancelar");
        jb_cancelar_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_fornecedorActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3_actualizar_remover_fornecedorLayout = new javax.swing.GroupLayout(jPanel3_actualizar_remover_fornecedor);
        jPanel3_actualizar_remover_fornecedor.setLayout(jPanel3_actualizar_remover_fornecedorLayout);
        jPanel3_actualizar_remover_fornecedorLayout.setHorizontalGroup(
            jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                        .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_localizacao_fornecedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_telefone2_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_email_fornecedor))
                            .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jtf_id_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nome_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nuit_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addComponent(jLabel15)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                                .addComponent(jtf_pesquisa_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_pesquisar_fornecedor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_telefone1_fornecedor)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                                .addGap(0, 38, Short.MAX_VALUE)
                                .addComponent(jb_actualizar_tabela_fornecedor2))))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                        .addComponent(jb_cancelar_fornecedor)
                        .addGap(63, 63, 63)
                        .addComponent(jb_actualizar)
                        .addGap(68, 68, 68)
                        .addComponent(jb_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar_actualizacao)))
                .addContainerGap())
        );
        jPanel3_actualizar_remover_fornecedorLayout.setVerticalGroup(
            jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_id_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nome_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_nuit_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_telefone1_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_telefone2_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jtf_email_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_localizacao_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar_fornecedor)
                    .addComponent(jb_actualizar_tabela_fornecedor2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3_actualizar_remover_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar_fornecedor)
                    .addComponent(jb_actualizar)
                    .addComponent(jb_remover)
                    .addComponent(jb_salvar_actualizacao))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar/Remover", jPanel3_actualizar_remover_fornecedor);

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
        this.salvar_fornecedor();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarActionPerformed
        this.pesquisar_fornecedor();
    }//GEN-LAST:event_jb_pesquisarActionPerformed

    private void jb_actualizar_lista_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_lista_tabelaActionPerformed
        this.listar_actualizacao_fornecedor();
    }//GEN-LAST:event_jb_actualizar_lista_tabelaActionPerformed

    private void jb_pesquisar_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisar_fornecedorActionPerformed
        this.pesquisar_fornecedor_actualizacao_remocao();
    }//GEN-LAST:event_jb_pesquisar_fornecedorActionPerformed

    private void jb_actualizar_tabela_fornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_tabela_fornecedor2ActionPerformed
        this.listar_actualizacao_fornecedor2();
    }//GEN-LAST:event_jb_actualizar_tabela_fornecedor2ActionPerformed

    private void jb_cancelar_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_fornecedorActionPerformed
        this.limparCampos();
        this.habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jb_cancelar_fornecedorActionPerformed

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        this.actualizar_fornecedor();
    }//GEN-LAST:event_jb_actualizarActionPerformed

    private void jb_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_removerActionPerformed
        this.remover_fornecedor();
    }//GEN-LAST:event_jb_removerActionPerformed

    private void jb_salvar_actualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_actualizacaoActionPerformed
        this.salvar_actualizacao_fornecedor();
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
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedor().setVisible(true);
            }
        });
    }

    //MÉTODOS USADOS NA ABA: registar
    private void salvar_fornecedor() {
        // Salva um novo cliente na BD
        modelFornecedor.setNome(this.jtf_nome.getText());
        modelFornecedor.setNuit(Integer.parseInt(this.jtf_nuit.getText()));
        modelFornecedor.setTelefone1(this.jtf_telefone1.getText());
        modelFornecedor.setTelefone2(this.jtf_telefone2.getText());
        modelFornecedor.setEmail(this.jtf_email.getText());
        modelFornecedor.setLocalizacao(this.jtf_localizacao.getText());
        try {
            modelFornecedor.setData_registo(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {

        }

        if (controllerFornecedor.salvarFornecedorController(modelFornecedor) > 0) {
            JOptionPane.showMessageDialog(this, "Fornecedor registado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.listar_fornecedor();//Para mostar o novo cliente na tabela
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_fornecedor() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_lista_fornecedores.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_lista_fornecedores.setRowSorter(classificador);
        String nome_fornecedor = this.jtf_pesquisa.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_fornecedor, 1));//a coluna é 1 pois a pesquisa será por nome
    }

    /**
     * Metodo chamado após registar um novo cliente
     */
    private void listar_fornecedor() {
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) jtable_fornecedor.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelFornecedor.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelFornecedor.get(i).getFornecedor_id(),
                listaModelFornecedor.get(i).getNome(),
                listaModelFornecedor.get(i).getNuit(),
                listaModelFornecedor.get(i).getTelefone1(),
                listaModelFornecedor.get(i).getTelefone2(),
                listaModelFornecedor.get(i).getEmail(),
                listaModelFornecedor.get(i).getLocalizacao()

            });

        }
    }
    //FIM DOS MÉTODOS DA ABA registar

    //INICIO DOS MÉTODOS USADOS NA ABA: actualizar/remover:
    /**
     * Apenas pega os dados da linha da tabela selecionada e coloca nos devidos
     * campos
     */
    private void actualizar_fornecedor() {
        int linha = jtable_actualiza_remove_fornecedor.getSelectedRow();//pegamos a linha seleccionada e depois pegamos o id correspondente
        try {
            int id_fornecedor = (int) this.jtable_actualiza_remove_fornecedor.getValueAt(linha, 0);//colocamos 0 pois o id está na primeira coluna que é 0

            //recuperar dados da BD
            modelFornecedor = controllerFornecedor.getFornecedorController(id_fornecedor);//retornar o produto selecionado
            //colocar os dados do cliente selecionado na interface/nos devidos campos
            //Nao é obrigatório incluir o codigo
            this.jtf_id_fornecedor.setText(String.valueOf(modelFornecedor.getFornecedor_id()));
            this.jtf_nome_fornecedor.setText(modelFornecedor.getNome());
            this.jtf_nuit_fornecedor.setText(String.valueOf(modelFornecedor.getNuit()));
            this.jtf_telefone1_fornecedor.setText(modelFornecedor.getTelefone1());
            this.jtf_telefone2_fornecedor.setText(modelFornecedor.getTelefone2());
            this.jtf_email_fornecedor.setText(modelFornecedor.getEmail());
            this.jtf_localizacao_fornecedor.setText(modelFornecedor.getLocalizacao());
            this.habilitarDesabilitarCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registo seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void salvar_actualizacao_fornecedor() {
        modelFornecedor.setNome(this.jtf_nome_fornecedor.getText());
        modelFornecedor.setNuit(Integer.parseInt(this.jtf_nuit_fornecedor.getText()));
        modelFornecedor.setTelefone1(this.jtf_telefone1_fornecedor.getText());
        modelFornecedor.setTelefone2(this.jtf_telefone2_fornecedor.getText());
        modelFornecedor.setEmail(this.jtf_email_fornecedor.getText());
        modelFornecedor.setLocalizacao(this.jtf_localizacao_fornecedor.getText());

        if (controllerFornecedor.atualizarFornecedorController(modelFornecedor)) {
            JOptionPane.showMessageDialog(this, "Fornecedor actualizado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //Carregar os clientes na tabela
            this.listar_fornecedor_actualizacao_remocao();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao actualizar fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void remover_fornecedor() {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(this, "Tem a certeza de que deseja remover? /n1.Confirmar;/n2.Cancelar"));
        if (opcao == 1) {
            int linha = this.jtable_actualiza_remove_fornecedor.getSelectedRow(); //remove o dado da linha seleccionada
            int id_fornecedor = (int) this.jtable_actualiza_remove_fornecedor.getValueAt(linha, 0); //Pegar o id da linha selecionada e a coluna do codigo é 0, se estivesse na 2 coluna seria 1
            if (controllerFornecedor.excluirFornecedorController(id_fornecedor)) {
                JOptionPane.showMessageDialog(this, "Fornecedor excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.listar_fornecedor_actualizacao_remocao();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Remoção cancelada", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar_fornecedor_actualizacao_remocao() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_fornecedor.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtable_actualiza_remove_fornecedor.setRowSorter(classificador);
        String nome_fornecedor = this.jtf_pesquisa_fornecedor.getText(); //variavel que receberá o texto a ser pesquisado
        //Começando a filtrar os dados na tabela
        classificador.setRowFilter(RowFilter.regexFilter(nome_fornecedor, 1));//a coluna é 1 pois a pesquisa será por nome
    }

    /**
     * lista os dados ao abrirmos a aba
     */
    private void listar_fornecedor_actualizacao_remocao() {
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_actualiza_remove_fornecedor.getModel();
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelFornecedor.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelFornecedor.get(i).getFornecedor_id(),
                listaModelFornecedor.get(i).getNome(),
                listaModelFornecedor.get(i).getNuit(),
                listaModelFornecedor.get(i).getTelefone1(),
                listaModelFornecedor.get(i).getTelefone2(),
                listaModelFornecedor.get(i).getEmail(),
                listaModelFornecedor.get(i).getLocalizacao()
            });

        }
    }

    /**
     * lista os dados actualizados apos adicionar ou actualizar algum cliente ao
     * clicar em actualizar dados
     */
    private void listar_actualizacao_fornecedor2() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_actualiza_remove_fornecedor.getModel();
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelFornecedor.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelFornecedor.get(i).getFornecedor_id(),
                listaModelFornecedor.get(i).getNome(),
                listaModelFornecedor.get(i).getNuit(),
                listaModelFornecedor.get(i).getTelefone1(),
                listaModelFornecedor.get(i).getTelefone2(),
                listaModelFornecedor.get(i).getEmail(),
                listaModelFornecedor.get(i).getLocalizacao(),
                listaModelFornecedor.get(i).getData_registo()
            });

        }
    }
    //FIM DOS MÉTODOS DA ABA: actualizar/remover

    //MÉTODOS USADOS NA ABA VER:
    /**
     * Lista os dados na tabela
     */
    private void visualizar_fornecedor() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_fornecedores.getModel();
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelFornecedor.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelFornecedor.get(i).getFornecedor_id(),
                listaModelFornecedor.get(i).getNome(),
                listaModelFornecedor.get(i).getNuit(),
                listaModelFornecedor.get(i).getTelefone1(),
                listaModelFornecedor.get(i).getTelefone2(),
                listaModelFornecedor.get(i).getEmail(),
                listaModelFornecedor.get(i).getLocalizacao(),
                listaModelFornecedor.get(i).getData_registo()
            });

        }
    }

    private void listar_actualizacao_fornecedor() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_lista_fornecedores.getModel();
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();//Recebendo os produtos da BD e guardar na lista
        //Preenchendo a tabela de clientes
        modelo.setNumRows(0); //Tabela inicia com zero colunas - remoçao das linhas
        //inserir clientes na tabela
        int cont = listaModelFornecedor.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelFornecedor.get(i).getFornecedor_id(),
                listaModelFornecedor.get(i).getNome(),
                listaModelFornecedor.get(i).getNuit(),
                listaModelFornecedor.get(i).getTelefone1(),
                listaModelFornecedor.get(i).getTelefone2(),
                listaModelFornecedor.get(i).getEmail(),
                listaModelFornecedor.get(i).getLocalizacao(),
                listaModelFornecedor.get(i).getData_registo()
            });

        }
    }

    //MÉTODOS COMUNS AS ABAS
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtf_nome.setEnabled(condicao);
        jtf_nuit.setEnabled(condicao);
        jtf_telefone1.setEnabled(condicao);
        jtf_telefone2.setEnabled(condicao);
        jtf_email.setEnabled(condicao);
        jtf_localizacao.setEnabled(condicao);
        jb_salvar.setEnabled(condicao);
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_fornecedor.setEnabled(condicao);
        this.jtf_nuit_fornecedor.setEnabled(condicao);
        this.jtf_telefone1_fornecedor.setEnabled(condicao);
        this.jtf_telefone2_fornecedor.setEnabled(condicao);
        this.jtf_email_fornecedor.setEnabled(condicao);
        this.jtf_localizacao_fornecedor.setEnabled(condicao);
        this.jb_salvar_actualizacao.setEnabled(condicao);

    }

    /**
     * limpar os campos do formulario
     *
     * @param condicao
     */
    private void limparCampos() {
        this.jtf_nome.setText("");
        this.jtf_nuit.setText("");
        this.jtf_telefone1.setText("");
        this.jtf_telefone2.setText("");
        this.jtf_email.setText("");
        this.jtf_localizacao.setText("");
        //Campos que estao na aba de actualizacao e remocao
        this.jtf_nome_fornecedor.setText("");
        this.jtf_telefone1_fornecedor.setText("");
        this.jtf_telefone2_fornecedor.setText("");
        this.jtf_email_fornecedor.setText("");
        this.jtf_localizacao.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1_registar_fornecedor;
    private javax.swing.JPanel jPanel2_visualizar_fornecedor;
    private javax.swing.JPanel jPanel3_actualizar_remover_fornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_actualizar_lista_tabela;
    private javax.swing.JButton jb_actualizar_tabela_fornecedor2;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_cancelar_fornecedor;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_pesquisar_fornecedor;
    private javax.swing.JButton jb_remover;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_salvar_actualizacao;
    private javax.swing.JTable jtable_actualiza_remove_fornecedor;
    private javax.swing.JTable jtable_fornecedor;
    private javax.swing.JTable jtable_lista_fornecedores;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_email_fornecedor;
    private javax.swing.JFormattedTextField jtf_id_fornecedor;
    private javax.swing.JTextField jtf_localizacao;
    private javax.swing.JTextField jtf_localizacao_fornecedor;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_nome_fornecedor;
    private javax.swing.JFormattedTextField jtf_nuit;
    private javax.swing.JFormattedTextField jtf_nuit_fornecedor;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTextField jtf_pesquisa_fornecedor;
    private javax.swing.JFormattedTextField jtf_telefone1;
    private javax.swing.JFormattedTextField jtf_telefone1_fornecedor;
    private javax.swing.JTextField jtf_telefone2;
    private javax.swing.JTextField jtf_telefone2_fornecedor;
    // End of variables declaration//GEN-END:variables
}
