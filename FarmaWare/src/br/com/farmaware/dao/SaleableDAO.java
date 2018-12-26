package br.com.farmaware.dao;

import br.com.farmaware.database.Database;
import br.com.farmaware.model.Saleable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasdm
 */
public class SaleableDAO implements DAO<Saleable>{
    private Saleable saleable;
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;

    @Override
    public boolean insert(Saleable obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("INSERT INTO Saleable(name, description, manufc, price, stock, categ) VALUES (?, ?, ?, ?, ?, ?);");
        
        pst.setString(1, obj.getName());
        pst.setString(2, obj.getDesc());
        pst.setString(3, obj.getManufc());
        pst.setDouble(4, obj.getPrice());
        pst.setInt(5, obj.getStock());
        pst.setByte(6, obj.getCateg());
        
        System.out.println(pst.toString());
        
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
    public Saleable search(Saleable obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("SELECT * FROM Saleable WHERE id = ?;");
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            saleable = new Saleable(rs.getInt("id"), rs.getString("name"),rs.getString("description"),rs.getString("manufc"),rs.getDouble("price"),  rs.getInt("stock"), rs.getByte("categ"));
        }
        
        rs.close();
        Database.close();
        
        return saleable;
    }

    @Override
    public boolean update(Saleable obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("UPDATE Saleable SET name = ?, description = ?, manufc = ?, price = ?, stock = ?, categ = ? WHERE id = ?;");
        
        pst.setString(1, obj.getName());
        pst.setString(2, obj.getDesc());
        pst.setString(3, obj.getManufc());
        pst.setDouble(4, obj.getPrice());
        pst.setInt(5, obj.getStock());
        pst.setByte(6, obj.getCateg());
        pst.setInt(7, obj.getId());
        
        System.out.println(pst.toString());
                
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
    public boolean delete(Saleable obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("DELETE FROM Saleable WHERE id = ?;");
        
        pst.setInt(1, obj.getId());
        
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
    public List<Saleable> getRecords(String query) throws SQLException, ClassNotFoundException {
        ArrayList<Saleable> saleables = new ArrayList();
        saleable = null;
        
        String sql = "SELECT * FROM Saleable";
        if(query.length() > 0)
            sql += " WHERE " + query;
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()) {
            saleable = new Saleable(rs.getInt("id"), rs.getString("name"),rs.getString("description"),rs.getString("manufc"),rs.getDouble("price"),  rs.getInt("stock"), rs.getByte("categ"));
            
            saleables.add(saleable);
        }
        
        rs.close();
        Database.close();
        
        return saleables;
    }
    
}
