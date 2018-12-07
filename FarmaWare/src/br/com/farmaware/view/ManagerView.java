package br.com.farmaware.view;

import br.com.farmaware.model.User;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lucasdm
 */
public class ManagerView extends javax.swing.JFrame {
    User currentUser = null;
    
    private boolean isCashierOpen = false;
    /**
     * Creates new form ManagerView
     */
    public ManagerView(User currentUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.currentUser = currentUser;
        if(currentUser != null){
            lblUsername.setText("Olá, " + currentUser.getName().split(" ")[0] + ".");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWrapper = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlBtnSell = new javax.swing.JPanel();
        lblIcon5 = new javax.swing.JLabel();
        lblText5 = new javax.swing.JLabel();
        pnlBtnCashier = new javax.swing.JPanel();
        lblIcon2 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        pnlBtnUsers = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        pnlBtnClients = new javax.swing.JPanel();
        lblIcon1 = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        pnlBtnSales = new javax.swing.JPanel();
        lblIcon3 = new javax.swing.JLabel();
        lblText3 = new javax.swing.JLabel();
        pnlBtnDrugs = new javax.swing.JPanel();
        lblIcon4 = new javax.swing.JLabel();
        lblText4 = new javax.swing.JLabel();
        pnlBtnStock = new javax.swing.JPanel();
        lblIcon6 = new javax.swing.JLabel();
        lblText6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainWrapper.setBackground(new java.awt.Color(255, 255, 255));

        lblUsername.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(102, 102, 102));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Olá, <username>.");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Farma<b>Ware</b></html>");

        pnlBtnSell.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnSell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnSellMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon5.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/sell.png"))); // NOI18N
        pnlBtnSell.add(lblIcon5);

        lblText5.setBackground(new java.awt.Color(255, 255, 255));
        lblText5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText5.setForeground(new java.awt.Color(102, 102, 102));
        lblText5.setText("Vender");
        pnlBtnSell.add(lblText5);

        pnlBtnCashier.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnCashier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnCashier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnCashierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon2.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/cashier.png"))); // NOI18N
        pnlBtnCashier.add(lblIcon2);

        lblText2.setBackground(new java.awt.Color(255, 255, 255));
        lblText2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText2.setForeground(new java.awt.Color(102, 102, 102));
        lblText2.setText("Caixa");
        pnlBtnCashier.add(lblText2);

        pnlBtnUsers.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/employee.png"))); // NOI18N
        pnlBtnUsers.add(lblIcon);

        lblText.setBackground(new java.awt.Color(255, 255, 255));
        lblText.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText.setForeground(new java.awt.Color(102, 102, 102));
        lblText.setText("Usuários");
        pnlBtnUsers.add(lblText);

        pnlBtnClients.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnClients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnClientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon1.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/customer_icon.png"))); // NOI18N
        pnlBtnClients.add(lblIcon1);

        lblText1.setBackground(new java.awt.Color(255, 255, 255));
        lblText1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText1.setForeground(new java.awt.Color(102, 102, 102));
        lblText1.setText("Clientes");
        pnlBtnClients.add(lblText1);

        pnlBtnSales.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon3.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/cart.png"))); // NOI18N
        pnlBtnSales.add(lblIcon3);

        lblText3.setBackground(new java.awt.Color(255, 255, 255));
        lblText3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText3.setForeground(new java.awt.Color(102, 102, 102));
        lblText3.setText("Vendas");
        pnlBtnSales.add(lblText3);

        pnlBtnDrugs.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnDrugs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnDrugs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnDrugsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon4.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/pill_bottle.png"))); // NOI18N
        pnlBtnDrugs.add(lblIcon4);

        lblText4.setBackground(new java.awt.Color(255, 255, 255));
        lblText4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText4.setForeground(new java.awt.Color(102, 102, 102));
        lblText4.setText("Medic.");
        pnlBtnDrugs.add(lblText4);

        pnlBtnStock.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnUsersMouseExited(evt);
            }
        });

        lblIcon6.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/box.png"))); // NOI18N
        pnlBtnStock.add(lblIcon6);

        lblText6.setBackground(new java.awt.Color(255, 255, 255));
        lblText6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblText6.setForeground(new java.awt.Color(102, 102, 102));
        lblText6.setText("Produtos");
        pnlBtnStock.add(lblText6);

        javax.swing.GroupLayout mainWrapperLayout = new javax.swing.GroupLayout(mainWrapper);
        mainWrapper.setLayout(mainWrapperLayout);
        mainWrapperLayout.setHorizontalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGroup(mainWrapperLayout.createSequentialGroup()
                .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWrapperLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(pnlBtnSell, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBtnCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainWrapperLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainWrapperLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(pnlBtnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlBtnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainWrapperLayout.createSequentialGroup()
                                .addComponent(pnlBtnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlBtnDrugs, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlBtnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        mainWrapperLayout.setVerticalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addGap(30, 30, 30)
                .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBtnSell, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBtnCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBtnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBtnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnlBtnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlBtnDrugs, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBtnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        btnLogout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/farmaware/view/off.png"))); // NOI18N
        btnLogout.setText("Encerrar Sessão");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void pnlBtnUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnUsersMouseEntered
        changePnlBtnColor(true, (JPanel)evt.getComponent());
    }//GEN-LAST:event_pnlBtnUsersMouseEntered

    private void pnlBtnUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnUsersMouseExited
        changePnlBtnColor(false, (JPanel)evt.getComponent());
    }//GEN-LAST:event_pnlBtnUsersMouseExited

    private void pnlBtnSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnSellMouseClicked
        /*SellView sv = new SellView();
        sv.setVisible(true);*/
    }//GEN-LAST:event_pnlBtnSellMouseClicked

    private void pnlBtnCashierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnCashierMouseClicked
        /*if(!isCashierOpen){
            AuthView av = new AuthView();
            av.setVisible(true);
            
            if (!av.getAuthenticated())
                return;
        }
        
        isCashierOpen = !isCashierOpen;
        
        pnlBtnSell.setEnabled(isCashierOpen);*/
    }//GEN-LAST:event_pnlBtnCashierMouseClicked

    private void pnlBtnUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnUsersMouseClicked
        RecordView rv = new RecordView(RecordView.USERS);
        rv.setVisible(true);
    }//GEN-LAST:event_pnlBtnUsersMouseClicked

    private void pnlBtnClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnClientsMouseClicked
        RecordView rv = new RecordView(RecordView.CLIENTS);
        rv.setVisible(true);
    }//GEN-LAST:event_pnlBtnClientsMouseClicked

    private void pnlBtnSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnSalesMouseClicked
        RecordView rv = new RecordView(RecordView.SALES);
        rv.setVisible(true);
    }//GEN-LAST:event_pnlBtnSalesMouseClicked

    private void pnlBtnDrugsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnDrugsMouseClicked
        RecordView rv = new RecordView(RecordView.DRUGS);
        rv.setVisible(true);
    }//GEN-LAST:event_pnlBtnDrugsMouseClicked

    private void pnlBtnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnStockMouseClicked
        RecordView rv = new RecordView(RecordView.STOCK);
        rv.setVisible(true);
    }//GEN-LAST:event_pnlBtnStockMouseClicked
    
    private void changePnlBtnColor(boolean isOver, JPanel panel){
        panel.setBackground((isOver ? Color.lightGray : Color.WHITE));
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcon5;
    private javax.swing.JLabel lblIcon6;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    private javax.swing.JLabel lblText4;
    private javax.swing.JLabel lblText5;
    private javax.swing.JLabel lblText6;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mainWrapper;
    private javax.swing.JPanel pnlBtnCashier;
    private javax.swing.JPanel pnlBtnClients;
    private javax.swing.JPanel pnlBtnDrugs;
    private javax.swing.JPanel pnlBtnSales;
    private javax.swing.JPanel pnlBtnSell;
    private javax.swing.JPanel pnlBtnStock;
    private javax.swing.JPanel pnlBtnUsers;
    // End of variables declaration//GEN-END:variables
}