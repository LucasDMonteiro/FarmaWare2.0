package br.com.farmaware.dao;

import br.com.farmaware.database.Database;
import br.com.farmaware.model.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasdm
 */
public class UserDAO implements DAO<User>{
    private User user = null;
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;

    @Override
    public boolean insert(User obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("INSERT INTO User values (?, ?, ?, ?);");
        
        pst.setString(1, obj.getCpf());
        pst.setString(2, obj.getName());
        pst.setString(3, obj.getPasswd());
        pst.setByte(4, obj.getCateg());
        
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
    public User search(User obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("SELECT * FROM User WHERE cpf = ?;");
        
        pst.setString(1, obj.getCpf());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            user = new User(rs.getString("cpf"),rs.getString("name"),rs.getString("passwd"),rs.getByte("categ"));
        }
        
        rs.close();
        Database.close();
        
        return user;
    }

    @Override
    public boolean update(User obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("UPDATE User SET name = ?, passwd = ?, categ = ? WHERE cpf = ?;");
        
        pst.setString(1, obj.getName());
        pst.setString(2, obj.getPasswd());
        pst.setByte(3, obj.getCateg());
        pst.setString(4, obj.getCpf());
        
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
    public boolean delete(User obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("DELETE FROM User WHERE cpf = ?;");
        
        pst.setString(1, obj.getCpf());
        
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
    public List<User> getRecords(String query) throws SQLException, ClassNotFoundException {
        ArrayList<User> users = new ArrayList();
        user = null;
        
        String sql = "SELECT * FROM User";
        if(query.length() > 0)
            sql += " WHERE " + query;
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()) {
            user = new User(rs.getString("cpf"),rs.getString("name"),rs.getString("passwd"),rs.getByte("categ"));
            
            users.add(user);
        }
        
        rs.close();
        Database.close();
        
        return users;
    }
    
}
