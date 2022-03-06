package view;

import controller.ControllerUtilizador;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.ModelSessaoUtilizador;
import model.ModelUtilizador;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ViewLogin extends javax.swing.JFrame {

    ControllerUtilizador controllerUtilizador = new ControllerUtilizador();
    ModelUtilizador modelUtilizador = new ModelUtilizador();
    ModelSessaoUtilizador modelSessaoUtilizador = new ModelSessaoUtilizador();

    public ViewLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jLabel4 = new javax.swing.JLabel();
        jtf_login_utilizador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_senha_utilizador = new javax.swing.JPasswordField();
        jb_entrar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uJPanelImagem1.setImagem(new java.io.File("D:\\MaterialUJC\\Sistemas-Java\\Sistema_Ferragem_Nkobe\\ferragemNkobe\\src\\imagens\\parafusos-debatida-de-chrome-no-contador-uma-loja-ferragens-fundo-dos-144608279.jpg"));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Login: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Senha: ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Sistema de Gestão de Vendas e Estoque da Ferragem Nkobe (SGVEFN)");

        jb_entrar.setText("Entrar");
        jb_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entrarActionPerformed(evt);
            }
        });

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jb_entrar)
                        .addGap(114, 114, 114)
                        .addComponent(jb_cancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_login_utilizador)
                            .addComponent(jtf_senha_utilizador))))
                .addContainerGap())
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_login_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtf_senha_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_entrar)
                    .addComponent(jb_cancelar))
                .addGap(47, 47, 47))
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

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        this.entrar();
    }//GEN-LAST:event_jb_entrarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //começa o look aqui
                LookAndFeel lf = UIManager.getLookAndFeel();

                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (UnsupportedLookAndFeelException exc) {
                } catch (ClassNotFoundException exc) {
                } catch (InstantiationException exc) {
                } catch (IllegalAccessException exc) {
                }

                UIManager.put("nimbusBase", new Color(100, 50, 30));//passando as cores em  RGB
                UIManager.put("nimbusBlueGrey", new Color(190, 189, 170));
                UIManager.put("control", new Color(242, 242, 242));
                //Termina o look aqui

                new ViewLogin().setVisible(true);
            }
        });
    }

    private void entrar() {
        modelUtilizador.setLogin(jtf_login_utilizador.getText());
        modelUtilizador.setSenha(String.valueOf(jtf_senha_utilizador.getPassword()));

        if (controllerUtilizador.validarUtilizadorController(modelUtilizador)) {
            //Inicio para sessaoUtilizador
            modelUtilizador = controllerUtilizador.getUtilizadorController(jtf_login_utilizador.getText());
            modelSessaoUtilizador.id_utilizador = modelUtilizador.getUtilizador_id();
            modelSessaoUtilizador.nome_utilizador = modelUtilizador.getNome();
            modelSessaoUtilizador.login_utilizador = modelUtilizador.getLogin();
            modelSessaoUtilizador.perfil_utilizador = modelUtilizador.getPerfil();
            //Fim para sessaoUtilizador

            if (modelUtilizador.getPerfil().equals("Gestor")) {
                ViewPrincipal viewPrincipal = new ViewPrincipal();
                viewPrincipal.setVisible(true);
                ViewPrincipal.jb_categoria.setEnabled(false);
                ViewPrincipal.jb_clientes.setEnabled(false);
                ViewPrincipal.jb_vendas.setEnabled(false);
                ViewPrincipal.jb_compras.setEnabled(false);
                ViewPrincipal.jb_fornecedores.setEnabled(false);
                ViewPrincipal.jb_produtos.setEnabled(false);
                ViewPrincipal.lb_utilizador.setText(modelUtilizador.getNome());//pega o o valor da coluna usuario da tabela utilizador
            } else {
                ViewPrincipal viewPrincipal = new ViewPrincipal();
                viewPrincipal.setVisible(true);
                ViewPrincipal.jb_relatorio.setEnabled(false);
                ViewPrincipal.lb_utilizador.setText(modelUtilizador.getNome());//pega o o valor da coluna usuario da tabela utilizador
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Utilizador/Senha inválidos", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_entrar;
    private javax.swing.JTextField jtf_login_utilizador;
    private javax.swing.JPasswordField jtf_senha_utilizador;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
