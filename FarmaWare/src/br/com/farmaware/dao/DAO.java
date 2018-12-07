/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmaware.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lucasmonteiro
 */
public interface DAO <Type> {
    public boolean insert(Type obj) throws SQLException, ClassNotFoundException;
    public Type search(Type obj) throws SQLException, ClassNotFoundException;
    public boolean update(Type obj) throws SQLException, ClassNotFoundException;
    public boolean delete(Type obj) throws SQLException, ClassNotFoundException;
    public List<Type> getRecords(String query) throws SQLException, ClassNotFoundException;
}
