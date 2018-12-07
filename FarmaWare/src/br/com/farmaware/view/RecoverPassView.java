/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmaware.view;

import br.com.farmaware.dao.UserDAO;
import br.com.farmaware.model.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucasdm
 */
public class RecoverPassView extends javax.swing.JFrame {
    User user = null;
    /**
     * Creates new form RecoverPassView
     */
    public RecoverPassView(User user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWrapper2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JTextField();
        txtPassConfirm = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnRedefinir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainWrapper2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Redefinir Senha");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html>Farma<b>Ware</b></html>");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Nova Senha:");

        txtPasswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswdFocusLost(evt);
            }
        });

        txtPassConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassConfirmFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Confirmar Senha:");

        javax.swing.GroupLayout mainWrapper2Layout = new javax.swing.GroupLayout(mainWrapper2);
        mainWrapper2.setLayout(mainWrapper2Layout);
        mainWrapper2Layout.setHorizontalGroup(
            mainWrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
            .addComponent(jLabel10)
            .addGroup(mainWrapper2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(mainWrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(txtPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(txtPassConfirm))
                .addGap(50, 50, 50))
        );
        mainWrapper2Layout.setVerticalGroup(
            mainWrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWrapper2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        btnRedefinir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRedefinir.setText("Redefinir Senha");
        btnRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedefinirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWrapper2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainWrapper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedefinirActionPerformed
        String passwd = txtPasswd.getText();
        String passwdConfirm = txtPassConfirm.getText();

        if(passwd.equals("") || !passwd.matches("^.{8}$") || passwdConfirm.equals("") || !passwdConfirm.matches("^.{8}$")){
            JOptionPane.showMessageDialog(this, "Insira uma senha válida de 8 dígitos!", "Atenção", 0);
            return;
        }
        
        if(!passwd.equals(passwdConfirm)){
            JOptionPane.showMessageDialog(this, "As senhas não batem!", "Atenção", 0);
            return;
        }
        
        UserDAO dao = new UserDAO();
        try {
            user = dao.search(user);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
        }
        
        user.setPasswd(txtPasswd.getText());
        
        boolean success = false;
        try {
            success = dao.update(user);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
        }
        
        if(success){
            JOptionPane.showMessageDialog(this, "Senha redefinida com sucesso!", "Sucesso", 0);
            this.dispose();
        }
    }//GEN-LAST:event_btnRedefinirActionPerformed

    private void txtPasswdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswdFocusLost
        try{
            txtPasswd.setText(txtPasswd.getText().substring(0,8));
        } catch(Exception ex){
            
        }
    }//GEN-LAST:event_txtPasswdFocusLost

    private void txtPassConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassConfirmFocusLost
        try{
            txtPassConfirm.setText(txtPassConfirm.getText().substring(0,8));
        } catch(Exception ex){
            
        }
    }//GEN-LAST:event_txtPassConfirmFocusLost

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
            java.util.logging.Logger.getLogger(RecoverPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverPassView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedefinir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainWrapper2;
    private javax.swing.JTextField txtPassConfirm;
    private javax.swing.JTextField txtPasswd;
    // End of variables declaration//GEN-END:variables
}
