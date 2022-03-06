package view;

import controller.ControllerCliente;
import controller.ControllerProduto;
import controller.ControllerVenda;
import controller.ControllerVendaClienteUtilizador;
import controller.ControllerVendaProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;
import model.ModelProduto;
import model.ModelSessaoUtilizador;
import model.ModelVenda;
import model.ModelVendaClienteUtilizador;
import model.ModelVendaProduto;
import util.BLDatas;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ViewVenda extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
    ControllerProduto controllerProduto = new ControllerProduto();
    ModelProduto modelProduto = new ModelProduto();
    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    ControllerVendaProduto controllerVendaProduto = new ControllerVendaProduto();
    ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
    ArrayList<ModelVendaProduto> listaModelVendaProduto = new ArrayList<>();
    BLDatas blDatas = new BLDatas();
    ControllerVenda controllerVenda = new ControllerVenda();
    ModelVenda modelVenda = new ModelVenda();
    ModelSessaoUtilizador modelSessaoUtilizador = new ModelSessaoUtilizador();
    ArrayList<ModelVendaClienteUtilizador> listaModelVendaClienteUtilizador = new ArrayList<>();
    ControllerVendaClienteUtilizador controllerVendaClienteUtilizador = new ControllerVendaClienteUtilizador();
    ModelVendaClienteUtilizador modelVendaClienteUtilizador = new ModelVendaClienteUtilizador();

    public ViewVenda() {
        initComponents();
        this.listarClientes();//Preenche o combobox do cliente
        this.listarProdutos();//Preenche o combobox do produto
        setLocationRelativeTo(null);
        this.listarVendas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcb_nome_cliente = new componentes.UJComboBox();
        jcb_nome_produto = new componentes.UJComboBox();
        jtf_numero_venda = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_quantidade = new javax.swing.JFormattedTextField();
        jb_adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_produtos_venda = new javax.swing.JTable();
        jb_cancelar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_remover_produtos = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtf_valor_total = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_venda = new javax.swing.JTable();
        jtf_pesquisa = new javax.swing.JTextField();
        jb_pesquisar = new javax.swing.JButton();
        jb_excluir = new javax.swing.JButton();
        jb_detalhes_venda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome do cliente:");

        jLabel2.setText("Nome do produto:");

        jLabel3.setText("Número da venda:");

        jcb_nome_cliente.setAutocompletar(true);

        jcb_nome_produto.setAutocompletar(true);

        jtf_numero_venda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel4.setText("Quantidade:");

        jtf_quantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jb_adicionar.setText("Adicionar");
        jb_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_adicionarActionPerformed(evt);
            }
        });

        jtable_produtos_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Produto", "Nome do produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_produtos_venda);

        jb_cancelar.setText("Cancelar");

        jb_novo.setText("Novo");
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });

        jb_remover_produtos.setText("Remover Produtos");
        jb_remover_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_remover_produtosActionPerformed(evt);
            }
        });

        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor da venda:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcb_nome_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jcb_nome_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_numero_venda))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb_cancelar)
                                .addGap(46, 46, 46)
                                .addComponent(jb_novo)
                                .addGap(44, 44, 44)
                                .addComponent(jb_remover_produtos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jb_adicionar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_valor_total, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_salvar)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jcb_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jcb_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf_numero_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_adicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar)
                    .addComponent(jb_novo)
                    .addComponent(jb_remover_produtos)
                    .addComponent(jLabel5)
                    .addComponent(jtf_valor_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_salvar)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(135, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registar", jPanel1);

        jtable_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Venda", "Nome do cliente", "Data", "Telefonel", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_venda);

        jb_pesquisar.setText("Pesquisar");

        jb_excluir.setText("Excluir");

        jb_detalhes_venda.setText("Ver Detalhes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jb_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jb_excluir)
                                .addGap(100, 100, 100)
                                .addComponent(jb_detalhes_venda))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_excluir)
                    .addComponent(jb_detalhes_venda))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar/Remover/Actulizar", jPanel2);

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

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        this.jb_salvar.setEnabled(true);
        this.limparFormulario();
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jb_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_adicionarActionPerformed
        this.adicionar();
    }//GEN-LAST:event_jb_adicionarActionPerformed

    private void jb_remover_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_remover_produtosActionPerformed
        int linha = this.jtable_produtos_venda.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_produtos_venda.getModel();
        modelo.removeRow(linha);
        this.somarValorTotalProdutos();
    }//GEN-LAST:event_jb_remover_produtosActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        this.salvar_venda();
    }//GEN-LAST:event_jb_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }

    private void adicionar() {

        if (this.jtf_quantidade.getText().equals("")) {//Testando se a quantidade está ou nao vazia
            JOptionPane.showMessageDialog(this, "Todos campos devem estar preenchidos", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {

            modelProduto = controllerProduto.getProdutoNomeController(this.jcb_nome_produto.getSelectedItem().toString());
            //Levando o nome selecionado para o campo de texto
            int produto = modelProduto.getProduto_id();

            modelProduto = controllerProduto.getProdutoController(produto);
            //colocando todos dados do produto na tabela atraves do codigo obtido
            DefaultTableModel modelo = (DefaultTableModel) this.jtable_produtos_venda.getModel();
            //para adicionar uma linha na tabela 
            int cont = 0;
            int quantidade = 0;
            quantidade = Integer.parseInt(this.jtf_quantidade.getText()); //Convertendo a quant para double

            for (int i = 0; i < cont; i++) {
                modelo.setNumRows(0);//para adicionar uma linha na tabela   
            }

            modelo.addRow(new Object[]{
                modelProduto.getProduto_id(),
                modelProduto.getNome(),
                this.jtf_quantidade.getText(),
                modelProduto.getPreco_unitario(),
                quantidade * modelProduto.getPreco_unitario()
            });
            this.somarValorTotalProdutos();
        }
    }

    private void salvar_venda() {

        int codigo_venda = 0, codigo_produto = 0;
        listaModelVendaProduto = new ArrayList<>();
        
        modelCliente = controllerCliente.getClienteNomeController(this.jcb_nome_cliente.getSelectedItem().toString());
        //Levando o nome selecionado para o campo de texto
        int cliente = modelCliente.getCliente_id();

        modelVenda.setId_cliente(cliente);
        try {
            modelVenda.setValor_venda(Double.parseDouble(this.jtf_valor_total.getText()));
        } catch (NumberFormatException e) {

        }
        try {
            modelVenda.setData_venda(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {
        }
        int utilizador = modelSessaoUtilizador.id_utilizador;
        modelVenda.setId_utilizador(utilizador);
        
        codigo_venda = controllerVenda.salvarVendaController(modelVenda);
            if (codigo_venda > 0) {
                JOptionPane.showMessageDialog(this, "Venda salva com sucesso", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            
            //Setando os produtos da venda
            int cont = this.jtable_produtos_venda.getRowCount();
            for (int i = 0; i < cont; i++) {
                codigo_produto = (int) this.jtable_produtos_venda.getValueAt(i, 0);
                modelVendaProduto = new ModelVendaProduto();//Zerando o model para evitar erro
                modelProduto = new ModelProduto();
                modelVendaProduto.setId_produto(codigo_produto);
                modelVendaProduto.setId_venda(codigo_venda);
                modelVendaProduto.setProduto_quantidade(Integer.parseInt(this.jtable_produtos_venda.getValueAt(i, 2).toString()));

                //PARA DAR BAIXA NO ESTOQUE
                modelProduto.setProduto_id((int) this.jtable_produtos_venda.getValueAt(i, 0));
                modelProduto.setEstoque(controllerProduto.getProdutoController(codigo_produto).getEstoque()
                        - Integer.parseInt(this.jtable_produtos_venda.getValueAt(i, 2).toString()));

                listaModelVendaProduto.add(modelVendaProduto);
                listaModelProduto.add(modelProduto);
            }
            //Salvar os produtos da venda
            if (controllerVendaProduto.salvarVendaProdutoController(listaModelVendaProduto)) {
                //Alterar estoque de produto
                controllerProduto.alterarEstoqueProdutoController(listaModelProduto);
                //JOptionPane.showMessageDialog(this, "Produtos da Venda salvos com sucesso", "Atenção", JOptionPane.WARNING_MESSAGE);
                this.listarVendas();
                this.limparFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar produtos da venda", "Erro", JOptionPane.ERROR_MESSAGE);
            }

    }

    private void somarValorTotalProdutos() {
        double soma = 0, valor;
        int cont = this.jtable_produtos_venda.getRowCount();//precisamos de um contador para percorrer a tabela para pegar os valores total do produto(qtd de linhas)
        for (int i = 0; i < cont; i++) {
            valor = (double) this.jtable_produtos_venda.getValueAt(i, 4);//o valorTotal está na coluna 4
            soma = soma + valor;
        }
        this.jtf_valor_total.setText(String.valueOf(soma));

    }

    /**
     * Prenche o combobox com todos clientes
     */
    private void listarClientes() {

        listaModelCliente = controllerCliente.getListaClienteController();
        this.jcb_nome_cliente.removeAllItems();//Para nao haver duplicacao de dados

        for (int i = 0; i < listaModelCliente.size(); i++) {
            this.jcb_nome_cliente.addItem(listaModelCliente.get(i).getNome());
        }
    }

    /**
     * Preenche o combobox dos produtos
     */
    private void listarProdutos() {

        listaModelProduto = controllerProduto.getListaProdutoController();
        this.jcb_nome_produto.removeAllItems();//Para nao haver duplicacao de dados

        for (int i = 0; i < listaModelProduto.size(); i++) {
            this.jcb_nome_produto.addItem(listaModelProduto.get(i).getNome());
        }
    }

    private void listarVendas() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_venda.getModel();
        try{
        listaModelVendaClienteUtilizador = controllerVendaClienteUtilizador.getListaVendaClienteUtilizadorController();
        }catch(NumberFormatException e){}
        int cont = listaModelVendaClienteUtilizador.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendaClienteUtilizador.get(i).getModelVenda().getVenda_id(),
                listaModelVendaClienteUtilizador.get(i).getModelCliente().getNome(),
                listaModelVendaClienteUtilizador.get(i).getModelVenda().getData_venda(),
                listaModelVendaClienteUtilizador.get(i).getModelCliente().getTelefone(),
                listaModelVendaClienteUtilizador.get(i).getModelCliente().getEndereco()
            });
        }
        
    }
    private void limparFormulario() {
        this.jtf_quantidade.setText("");
        //limpando as linhas da tabelas"
        DefaultTableModel modelo = (DefaultTableModel) this.jtable_produtos_venda.getModel();
        modelo.setNumRows(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_adicionar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_detalhes_venda;
    private javax.swing.JButton jb_excluir;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_remover_produtos;
    private javax.swing.JButton jb_salvar;
    private componentes.UJComboBox jcb_nome_cliente;
    private componentes.UJComboBox jcb_nome_produto;
    private javax.swing.JTable jtable_produtos_venda;
    private javax.swing.JTable jtable_venda;
    private javax.swing.JFormattedTextField jtf_numero_venda;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JFormattedTextField jtf_quantidade;
    private javax.swing.JTextField jtf_valor_total;
    // End of variables declaration//GEN-END:variables
}
