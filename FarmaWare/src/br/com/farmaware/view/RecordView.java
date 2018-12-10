package br.com.farmaware.view;

import br.com.farmaware.dao.ClientDAO;
import br.com.farmaware.dao.DAO;
import br.com.farmaware.dao.SaleDAO;
import br.com.farmaware.dao.SaleableDAO;
import br.com.farmaware.dao.SoldDAO;
import br.com.farmaware.dao.UserDAO;
import br.com.farmaware.model.Client;
import br.com.farmaware.model.Saleable;
import br.com.farmaware.model.Sale;
import br.com.farmaware.model.Sold;
import br.com.farmaware.model.User;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucasdm
 * @author michelenathalie
 */
public class RecordView extends javax.swing.JDialog {
    private byte entity;
    
    // Entity constants
    public static final byte USERS = 0;
    public static final byte CLIENTS = 1;
    public static final byte DRUGS = 2;
    public static final byte PRODUCTS = 3;
    public static final byte SALES = 4;
    
    DefaultTableModel tableModel = new DefaultTableModel();
    
    /**
     * Creates new form RecordView
     * @param entity
     */
    public RecordView(byte entity) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.entity = entity;
        
        loadData();
        
        switch(entity){
            case USERS: lblAction.setText("Relação de Usuários"); break;
            case CLIENTS: lblAction.setText("Relação de Clientes"); break;
            case DRUGS: lblAction.setText("Relação de Medicamentos"); break;
            case PRODUCTS: lblAction.setText("Relação de Produtos"); break;
            case SALES: 
                lblAction.setText("Relação de Vendas");
                btnInsert.setEnabled(false);
                btnEdit.setEnabled(false);break;
        }
        
        tblData.setModel(tableModel);
    }

    private void loadData(){
        tableModel.setRowCount(0);
        
        String[] columnNames;
        DAO dao;
        
        switch(entity){
            case USERS: 
                columnNames = new String[]{"CPF", "Nome", "Senha", "Categoria"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new UserDAO();
                List<User> users;
                
                try{
                    users = dao.getRecords("");
                    for(User user : users){
                        Object[] values = new Object[]{user.getCpf(), user.getName(), user.getPasswd(), user.getCateg() == 0? "Gerente" : "Atendente"};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
            case CLIENTS: 
                columnNames = new String[]{"CPF", "Nome", "Categoria"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new ClientDAO();
                List<Client> clients;
                
                try{
                    clients = dao.getRecords("");
                    for(Client client : clients){
                        Object[] values = new Object[]{client.getCpf(), client.getName(), client.getCateg() == 0? "Cliente padrão" : "Aposentado"};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
            case DRUGS: 
                columnNames = new String[]{"ID", "Nome", "Desc", "Laboratório", "Preço", "Em estoque"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new SaleableDAO();
                List<Saleable> drugs;
                
                try{
                    drugs = dao.getRecords("categ = 1");
                    for(Saleable drug : drugs){
                        Object[] values = new Object[]{drug.getId(), drug.getName(), drug.getDesc(), drug.getManufc(), drug.getPrice(), drug.getStock()};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
            case PRODUCTS: 
                columnNames = new String[]{"ID", "Nome", "Desc", "Fabricante", "Preço", "Em estoque"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new SaleableDAO();
                List<Saleable> products;
                
                try{
                    products = dao.getRecords("categ = 0");
                    for(Saleable product : products){
                        Object[] values = new Object[]{product.getId(), product.getName(), product.getDesc(), product.getManufc(), product.getPrice(), product.getStock()};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
            case SALES: 
                columnNames = new String[]{"ID", "Produtos", "CPF Cliente", "CPF Vendedor", "Valor total(R$)"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new SaleDAO();
                List<Sale> sales;
                
                try{
                    sales = dao.getRecords("");
                    for(Sale sale : sales){
                        Object[] values = new Object[]{sale.getId(), "(...)", sale.getClientCpf(), sale.getSellerCpf(), sale.getPrice()};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
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
        lblAction = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtPass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainWrapper.setBackground(new java.awt.Color(255, 255, 255));

        lblAction.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lblAction.setForeground(new java.awt.Color(102, 102, 102));
        lblAction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAction.setText("Relação de <entidade>s");

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Farma<b>Ware</b></html>");

        tblData.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        tblData.setForeground(new java.awt.Color(51, 51, 51));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblData.setRowHeight(20);
        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        txtPass.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Nova Senha:");

        javax.swing.GroupLayout mainWrapperLayout = new javax.swing.GroupLayout(mainWrapper);
        mainWrapper.setLayout(mainWrapperLayout);
        mainWrapperLayout.setHorizontalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWrapperLayout.createSequentialGroup()
                .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainWrapperLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainWrapperLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(20, 20, 20))
        );
        mainWrapperLayout.setVerticalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWrapperLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblAction)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnDelete.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnDelete.setText("Deletar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(102, 102, 102));
        btnEdit.setText("Editar");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(102, 102, 102));
        btnInsert.setText("Inserir");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(tblData.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(this, "Selecione um registro!", "Atenção", 0);
            return;
        }
        
        int index = Integer.parseInt((String) tableModel.getValueAt(tblData.getSelectedRow(), 0));
        
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este registro permanentemente?") != JOptionPane.OK_OPTION)
            return;
        
        DAO dao = null;
        
        switch(entity){
            case USERS: 
                User user = new User(tblData.getValueAt(index,0).toString());
                dao = new UserDAO(); 

                try {
                    dao.delete(user);
                    JOptionPane.showMessageDialog(this, "Removido com sucesso!", "Sucesso", 1);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                } break;
            case CLIENTS: 
                Client client = new Client(tblData.getValueAt(index,0).toString());
                dao = new ClientDAO(); 

                try {
                    dao.delete(client);
                    JOptionPane.showMessageDialog(this, "Removido com sucesso!", "Sucesso", 1);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                } break;
            case DRUGS: 
                Saleable drug = new Saleable(index);
                dao = new SaleableDAO(); 

                try {
                    dao.delete(drug);
                    JOptionPane.showMessageDialog(this, "Removido com sucesso!", "Sucesso", 1);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                } break;
            case PRODUCTS: 
                Saleable product = new Saleable(index);
                dao = new SaleableDAO(); 

                try {
                    dao.delete(product);
                    JOptionPane.showMessageDialog(this, "Removido com sucesso!", "Sucesso", 1);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                } break;
            case SALES: 
                Sale sale = new Sale(index);
                dao = new SaleDAO(); 

                try {
                    dao.delete(sale);
                    JOptionPane.showMessageDialog(this, "Removido com sucesso!", "Sucesso", 1);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                } break;
        }
        
        loadData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int index = Integer.parseInt((String) tableModel.getValueAt(tblData.getSelectedRow(), 0));
        
        if(index < 0){
            JOptionPane.showMessageDialog(this, "Selecione um registro!", "Atenção", 0);
            return;
        }
        
        switch(entity){
            case USERS: 
                User user = new User(tblData.getValueAt(index,0).toString());
                UserView uv = new UserView(user, false);
                uv.setVisible(true); break;
            case CLIENTS: 
                Client client = new Client(tblData.getValueAt(index,0).toString());
                ClientView cv = new ClientView(client);
                cv.setVisible(true); break;
            case DRUGS: 
                Saleable drug = new Saleable(index);
                SaleableView dv = new SaleableView(drug, Saleable.DRUG);
                dv.setVisible(true); break;
            case PRODUCTS: 
                Saleable product = new Saleable(index);
                SaleableView pv = new SaleableView(product, Saleable.PRODUCT);
                pv.setVisible(true); break;
        }
        
        loadData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        switch(entity){
            case USERS: 
                UserView uv = new UserView(null, false);
                uv.setVisible(true); break;
            case CLIENTS: 
                ClientView cv = new ClientView(null);
                cv.setVisible(true); break;
            case DRUGS: 
                SaleableView dv = new SaleableView(null, Saleable.DRUG);
                dv.setVisible(true); break;
            case PRODUCTS: 
                SaleableView pv = new SaleableView(null, Saleable.PRODUCT);
                pv.setVisible(true); break;
        }
        
        loadData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if(entity == SALES && evt.getClickCount() == 2)
            showSaleablesInSold();
    }//GEN-LAST:event_tblDataMouseClicked

    private void showSaleablesInSold(){
        int index = Integer.parseInt((String) tableModel.getValueAt(tblData.getSelectedRow(), 0));
        
        switch(entity){
            case SALES:
                SoldDAO dao = new SoldDAO();
                try{
                    List<Sold> solds = dao.getRecords("saleId = " + index);
                    SoldView mv = new SoldView(solds);
                    mv.setModal(true);
                    mv.setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                    return;
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                    return;
                }
                break;
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordView((byte)0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAction;
    private javax.swing.JPanel mainWrapper;
    private javax.swing.JTable tblData;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
