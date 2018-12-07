package br.com.farmaware.view;

import br.com.farmaware.dao.DAO;
import br.com.farmaware.dao.UserDAO;
import br.com.farmaware.model.User;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucasdm
 */
public class RecordView extends javax.swing.JFrame {
    private byte entity;
    
    // Entity constants
    public static final byte USERS = 0;
    public static final byte CLIENTS = 1;
    public static final byte DRUGS = 2;
    public static final byte SALES = 3;
    public static final byte STOCK = 4;
    
    DefaultTableModel tableModel = new DefaultTableModel();
    
    /**
     * Creates new form RecordView
     * @param entity
     */
    public RecordView(byte entity) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.entity = entity;
        
        loadData(entity);
        
        switch(entity){
            case USERS: lblAction.setText("Relação de Usuários"); break;
            case CLIENTS: lblAction.setText("Relação de Clientes"); break;
            case DRUGS: lblAction.setText("Relação de Medicamentos"); break;
            case SALES: lblAction.setText("Relação de Vendas"); break;
            case STOCK: lblAction.setText("Relação de Produtos"); break;
        }
        
        tblData.setModel(tableModel);
    }

    private void loadData(byte entity){
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
            /*case CLIENTS: 
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
                columnNames = new String[]{"ID", "Nome", "Desc", "Laboratório", "Preço"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new DrugDAO();
                List<Drug> drugs;
                
                try{
                    drugs = dao.getRecords("");
                    for(Drug drug : drugs){
                        Object[] values = new Object[]{drug.getId(), drug.getName(), drug.getDesc(), drug.getLab(), drug.getPrice()};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
            case SALES: 
                columnNames = new String[]{"ID", "Produto", "CPF Cliente", "CPF Vendedor", "Valor total(R$)"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new SaleDAO();
                List<Sale> sales;
                
                try{
                    sales = dao.getRecords("");
                    for(Sale sale : sales){
                        Object[] values = new Object[]{sale.getId(), sale.getProdId(), sale.getClientCpf(), sale.getSellerCpf(), sale.getPrice()};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;
            case STOCK: 
                columnNames = new String[]{"ID", "Nome", "Desc", "Fabricante", "Preço"};
                tableModel.setColumnIdentifiers(columnNames);
                dao = new ProductDAO();
                List<Product> products;
                
                try{
                    products = dao.getRecords("");
                    for(Product product : products){
                        Object[] values = new Object[]{product.getId(), product.getName(), product.getDesc(), product.getManufc(), product.getPrice()};
                        tableModel.addRow(values);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
                }
                break;*/
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
        jLabel3 = new javax.swing.JLabel();
        txtQuery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainWrapper.setBackground(new java.awt.Color(255, 255, 255));

        lblAction.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblAction.setForeground(new java.awt.Color(102, 102, 102));
        lblAction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAction.setText("Relação de <entidade>s");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Farma<b>Ware</b></html>");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pesquisar:");

        tblData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout mainWrapperLayout = new javax.swing.GroupLayout(mainWrapper);
        mainWrapper.setLayout(mainWrapperLayout);
        mainWrapperLayout.setHorizontalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(mainWrapperLayout.createSequentialGroup()
                .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAction, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(mainWrapperLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1)
                            .addComponent(txtQuery))))
                .addGap(20, 20, 20))
        );
        mainWrapperLayout.setVerticalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAction)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        btnDelete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnDelete.setText("Deletar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(102, 102, 102));
        btnEdit.setText("Editar");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int index = tblData.getSelectedRow();
        
        if(index < 0)
            return;
        
        switch(entity){
            case USERS: 
                User user = new User(tblData.getValueAt(index,0).toString());
                UserView uv = new UserView(user);
                uv.setVisible(true); break;
            /*case CLIENTS: 
                Client client = new Client(tblData.getValueAt(index,0).toString());
                ClientView cv = new ClientView(client);
                cv.setVisible(true); break;
            case DRUGS: 
                Drug drug = new Drug(tblData.getValueAt(index,0).toString());
                DrugView dv = new DrugView(user);
                dv.setVisible(true); break;
            case SALES: 
                Sale sale = new Sale(tblData.getValueAt(index,0).toString());
                SaleView sv = new SaleView(sale);
                sv.setVisible(true); break;
            case STOCK: 
                Product product = new Product(tblData.getValueAt(index,0).toString());
                ProductView pv = new ProductView(product);
                pv.setVisible(true); break;*/
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAction;
    private javax.swing.JPanel mainWrapper;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtQuery;
    // End of variables declaration//GEN-END:variables
}
