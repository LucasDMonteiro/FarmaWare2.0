/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmaware.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lucasmonteiro
 */
public class Database {
    public static String user;
    public static String password;
    public static String server;
    public static String database;
    public static int port;
    public static Connection connection = null;
    
    static {
        user = "root";
        password = "root";
        server = "localhost";
        database = "farmaware";
        port = 8889;
    }
    
    public static void open() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + server + ":" + port + "/" + database;
        
        connection = java.sql.DriverManager.getConnection(url, user, password);
    }
    
    public static void close() throws ClassNotFoundException, SQLException{
        connection.close();
    }
    
    public static Connection getConnection(){
        return connection;
    }
}
