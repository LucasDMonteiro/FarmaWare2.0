package br.com.farmaware.dao;

import br.com.farmaware.database.Database;
import br.com.farmaware.model.Sold;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasmonteiro
 * @author michelenathalie
 */
public class SoldDAO implements DAO<Sold>{
    private Sold sold = null;
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;

    @Override
    public boolean insert(Sold obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("INSERT INTO Sold VALUES (?, ?, ?);");
        
        pst.setInt(1, obj.getSaleableId());
        pst.setInt(2, obj.getSaleId());
        pst.setInt(3, obj.getQty());
        
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
    public Sold search(Sold obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("SELECT * FROM Sold WHERE saleableId = ? AND saleId = ?;");
        
        pst.setInt(1, obj.getSaleableId());
        pst.setInt(2, obj.getSaleId());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            sold = new Sold(rs.getInt("saleableId"), rs.getInt("saleId"), rs.getInt("qty"));
        }
        
        rs.close();
        Database.close();
        
        return sold;
    }

    @Override
    public boolean update(Sold obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("UPDATE Sold SET qty = ? WHERE saleableId = ? AND saleId = ?;");
        
        pst.setInt(1, obj.getQty());
        pst.setInt(2, obj.getSaleableId());
        pst.setInt(3, obj.getSaleId());
        
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
    public boolean delete(Sold obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("DELETE FROM Sold WHERE saleableId = ? AND saleId = ?;");
        
        pst.setInt(1, obj.getSaleableId());
        pst.setInt(2, obj.getSaleId());
        
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
    public List<Sold> getRecords(String query) throws SQLException, ClassNotFoundException {
        ArrayList<Sold> solds = new ArrayList();
        sold = null;
        
        String sql = "SELECT * FROM Sold";
        if(query.length() > 0)
            sql += " WHERE " + query;
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()) {
            sold = new Sold(rs.getInt("saleableId"), rs.getInt("saleId"), rs.getInt("qty"));
            
            solds.add(sold);
        }
        
        rs.close();
        Database.close();
        
        return solds;
    }
    
}
