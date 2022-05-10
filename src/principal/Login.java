/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import DAO.Conexao;
import DAO.FuncionariosDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author SALA 02 - 1º AUTO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form loginn
     */
    public Login() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 35, 134, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUsuario.setText("Usuário:");

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:");

        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com(2).png"))); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrar)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed


    }//GEN-LAST:event_tfSenhaActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        Conexao.abrirConexao();
        FuncionariosDAO sql = new FuncionariosDAO(Conexao.getConexao());
        String Login = tfUsuario.getText();
        String Senha = tfSenha.getText();
        if (Login.equalsIgnoreCase("") || Senha.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode pode esta vazio  ",
                    "Video locadora", JOptionPane.WARNING_MESSAGE);
            tfUsuario.setText("");
            pfSenha.setText("");

        } else {
            if (sql.Logar(Login, Senha) == true) {
                new Home().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha  Invalidos", "Video locadora", JOptionPane.ERROR_MESSAGE);
                tfUsuario.setText("");
                tfSenha.setText("");
            }
        }

    }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}