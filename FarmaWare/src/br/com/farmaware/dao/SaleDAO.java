package br.com.farmaware.dao;

import br.com.farmaware.database.Database;
import br.com.farmaware.model.Sale;
import br.com.farmaware.model.Sold;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasdm
 */
public class SaleDAO implements DAO<Sale>{
    private Sale sale;
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;

    @Override
    public boolean insert(Sale obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("INSERT INTO Sale values (?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
        
        pst.setString(1, obj.getClientCpf());
        pst.setString(2, obj.getSellerCpf());
        pst.setDouble(3, obj.getPrice());

        int recordId = 0;
        int update = pst.executeUpdate();
        java.sql.ResultSet rs = pst.getGeneratedKeys();
        if (rs.next())
            recordId=rs.getInt(1);
        
        System.out.println("GOT ID: " + recordId);
        
        SoldDAO dao = new SoldDAO();
        for (Sold sold : obj.getSolds()){
            sold.setSaleId(recordId);
            dao.insert(sold);
        }
        
        if(update > 0) {
            Database.close();
            return true;
        }
        else {
            Database.close();
            return false;
        }
    }

    @Override
    public Sale search(Sale obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("SELECT * FROM Sale WHERE id = ?;");
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            sale = new Sale(rs.getInt("id"), null,rs.getString("clientCpf"),rs.getString("sellerCpf"), rs.getDouble("price"));
            SoldDAO dao = new SoldDAO();
            sale.setSolds(dao.getRecords("saleId = " + sale.getId()));
        }
        
        rs.close();
        Database.close();
        
        return sale;
    }

    @Override
    public boolean update(Sale obj) throws SQLException, ClassNotFoundException {
        System.out.println("Houve um problema: Vendas não podem ser editadas!");
        return false;
    }

    @Override
    public boolean delete(Sale obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("DELETE FROM Sale WHERE id = ?; DELETE FROM Sold WHERE saleId = ?");
        
        pst.setInt(1, obj.getId());
        pst.setInt(2, obj.getId());
        
        if(pst.executeUpdate() > 0) {
            Database.close();
            
            return true;
        }
        else {
            Database.close();
            return false;
        }
    }

    @Override
    public List<Sale> getRecords(String query) throws SQLException, ClassNotFoundException {
        ArrayList<Sale> sales = new ArrayList();
        sale = null;
        
        String sql = "SELECT * FROM Sale";
        if(query.length() > 0)
            sql += " WHERE " + query;
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()) {
            sale = new Sale(rs.getInt("id"), null,rs.getString("clientCpf"),rs.getString("sellerCpf"), rs.getDouble("price"));
            SoldDAO dao = new SoldDAO();
            sale.setSolds(dao.getRecords("saleId = " + sale.getId()));
            
            sales.add(sale);
        }
        
        rs.close();
        Database.close();
        
        return sales;
    }
    
    public List<Sold> getSoldRecords(Sale obj) throws SQLException, ClassNotFoundException {
        ArrayList<Sold> solds = new ArrayList();
        Sold sold = null;
        
        String sql = "SELECT * FROM Sold  WHERE saleId = " + obj.getId();
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()) {
            sold = new Sold(rs.getInt("salableId"),rs.getInt("saleId"),rs.getInt("qty"));
            
            solds.add(sold);
        }
        
        rs.close();
        Database.close();
        
        return solds;
    }
}
