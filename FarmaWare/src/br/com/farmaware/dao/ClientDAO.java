package br.com.farmaware.dao;

import br.com.farmaware.database.Database;
import br.com.farmaware.model.Client;
import br.com.farmaware.model.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasdm
 */
public class ClientDAO implements DAO<Client>{
    private Client client;
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;

    @Override
    public boolean insert(Client obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("INSERT INTO Client values (?, ?, ?);");
        
        pst.setString(1, obj.getCpf());
        pst.setString(2, obj.getName());
        pst.setInt(3, obj.getCateg());
        
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
    public Client search(Client obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("SELECT * FROM Client WHERE cpf = ?;");
        
        pst.setString(1, obj.getCpf());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            client = new Client(rs.getString("cpf"),rs.getString("name"),rs.getInt("categ"));
        }
        
        rs.close();
        Database.close();
        
        return client;
    }

    @Override
    public boolean update(Client obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("UPDATE Client SET name = ?, categ = ? WHERE cpf = ?;");
        
        pst.setString(1, obj.getName());
        pst.setInt(2, obj.getCateg());
        pst.setString(3, obj.getCpf());
        
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
    public boolean delete(Client obj) throws SQLException, ClassNotFoundException {
        Database.open();
        pst = Database.getConnection().prepareStatement("DELETE FROM Client WHERE cpf = ?;");
        
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
    public List<Client> getRecords(String query) throws SQLException, ClassNotFoundException {
        ArrayList<Client> clients = new ArrayList();
        client = null;
        
        String sql = "SELECT * FROM Client";
        if(query.length() > 0)
            sql += " WHERE " + query;
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()) {
            client = new Client(rs.getString("cpf"),rs.getString("name"),rs.getInt("categ"));
            
            clients.add(client);
        }
        
        rs.close();
        Database.close();
        
        return clients;
    }
    
}
