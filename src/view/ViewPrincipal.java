
package view;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ViewPrincipal extends javax.swing.JFrame {

    
    public ViewPrincipal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        // As linhas abaixo substituem a label data-lib_data pela data data actual do sistema ao inicializar o form
       Date data = new Date();
       DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
       lb_data.setText(formatador.format(data));
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jPanel1 = new javax.swing.JPanel();
        jb_utilizadores = new javax.swing.JButton();
        jb_produtos = new javax.swing.JButton();
        jb_fornecedores = new javax.swing.JButton();
        jb_categoria = new javax.swing.JButton();
        jb_vendas = new javax.swing.JButton();
        jb_compras = new javax.swing.JButton();
        jb_clientes = new javax.swing.JButton();
        jb_relatorio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_utilizador = new javax.swing.JLabel();
        lb_data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uJPanelImagem1.setImagem(new java.io.File("D:\\MaterialUJC\\Sistemas-Java\\Sistema_Ferragem_Nkobe\\ferragemNkobe\\src\\imagens\\artigos-do-hardware-41629151.jpg"));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jb_utilizadores.setBackground(new java.awt.Color(102, 102, 0));
        jb_utilizadores.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_utilizadores.setForeground(new java.awt.Color(255, 51, 0));
        jb_utilizadores.setText("UTILIZADORES");
        jb_utilizadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_utilizadoresActionPerformed(evt);
            }
        });

        jb_produtos.setBackground(new java.awt.Color(102, 102, 0));
        jb_produtos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_produtos.setForeground(new java.awt.Color(255, 51, 0));
        jb_produtos.setText("PRODUTOS");
        jb_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_produtosActionPerformed(evt);
            }
        });

        jb_fornecedores.setBackground(new java.awt.Color(102, 102, 0));
        jb_fornecedores.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_fornecedores.setForeground(new java.awt.Color(255, 51, 0));
        jb_fornecedores.setText("FORNECEDORES");
        jb_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fornecedoresActionPerformed(evt);
            }
        });

        jb_categoria.setBackground(new java.awt.Color(102, 102, 0));
        jb_categoria.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_categoria.setForeground(new java.awt.Color(255, 51, 0));
        jb_categoria.setText("CATEGORIA");
        jb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_categoriaActionPerformed(evt);
            }
        });

        jb_vendas.setBackground(new java.awt.Color(102, 102, 0));
        jb_vendas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_vendas.setForeground(new java.awt.Color(255, 51, 0));
        jb_vendas.setText("VENDAS");
        jb_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_vendasActionPerformed(evt);
            }
        });

        jb_compras.setBackground(new java.awt.Color(102, 102, 0));
        jb_compras.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_compras.setForeground(new java.awt.Color(255, 51, 0));
        jb_compras.setText("COMPRAS");
        jb_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_comprasActionPerformed(evt);
            }
        });

        jb_clientes.setBackground(new java.awt.Color(102, 102, 0));
        jb_clientes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_clientes.setForeground(new java.awt.Color(255, 51, 0));
        jb_clientes.setText("CLIENTES");
        jb_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clientesActionPerformed(evt);
            }
        });

        jb_relatorio.setBackground(new java.awt.Color(102, 102, 0));
        jb_relatorio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb_relatorio.setForeground(new java.awt.Color(255, 51, 0));
        jb_relatorio.setText("RELATÓRIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jb_utilizadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_produtos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_fornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jb_categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_compras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jb_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jb_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jb_relatorio)
                .addGap(73, 73, 73)
                .addComponent(jb_produtos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_fornecedores)
                .addGap(18, 18, 18)
                .addComponent(jb_utilizadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_categoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_vendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_compras)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jb_clientes)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lb_utilizador.setForeground(new java.awt.Color(204, 204, 255));
        lb_utilizador.setText("Utilizador");

        lb_data.setForeground(new java.awt.Color(204, 204, 255));
        lb_data.setText("Data");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lb_utilizador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                .addComponent(lb_data)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_utilizador)
                    .addComponent(lb_data)))
        );

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clientesActionPerformed
        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_jb_clientesActionPerformed

    private void jb_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_produtosActionPerformed
       new ViewProduto().setVisible(true);
    }//GEN-LAST:event_jb_produtosActionPerformed

    private void jb_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_fornecedoresActionPerformed
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_jb_fornecedoresActionPerformed

    private void jb_utilizadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_utilizadoresActionPerformed
        new Utilizador().setVisible(true);
    }//GEN-LAST:event_jb_utilizadoresActionPerformed

    private void jb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_categoriaActionPerformed
        new ViewCategoria().setVisible(true);
    }//GEN-LAST:event_jb_categoriaActionPerformed

    private void jb_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_vendasActionPerformed
        new ViewVenda().setVisible(true);
    }//GEN-LAST:event_jb_vendasActionPerformed

    private void jb_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_comprasActionPerformed
        ViewCompra compra = new ViewCompra();
        compra.setVisible(true);
    }//GEN-LAST:event_jb_comprasActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JButton jb_categoria;
    public static javax.swing.JButton jb_clientes;
    public static javax.swing.JButton jb_compras;
    public static javax.swing.JButton jb_fornecedores;
    public static javax.swing.JButton jb_produtos;
    public static javax.swing.JButton jb_relatorio;
    public static javax.swing.JButton jb_utilizadores;
    public static javax.swing.JButton jb_vendas;
    private javax.swing.JLabel lb_data;
    public static javax.swing.JLabel lb_utilizador;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
