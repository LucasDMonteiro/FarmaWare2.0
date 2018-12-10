/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmaware.model;

/**
 *
 * @author lucasmonteiro
 */
public class Client {
    public static final int MANAGER = 0;
    public static final int CLERK = 1;
    
    private String cpf;
    private String name;
    private int categ;
    
    public Client(String cpf){
        this.cpf = cpf;
    }
    
    public Client(String cpf, String name, int categ){
        this.cpf = cpf;
        this.name = name;
        this.categ = categ;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCateg() {
        return categ;
    }

    public void setCateg(int categ) {
        this.categ = categ;
    }
    
    
}
