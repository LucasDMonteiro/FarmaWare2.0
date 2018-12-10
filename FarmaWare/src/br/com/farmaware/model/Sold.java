/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmaware.model;

/**
 *
 * @author lucasmonteiro
 * @author michelenathalie
 */
public class Sold {
    private int saleableId;
    private int saleId;
    private int qty;

    public Sold(int saleableId, int saleId, int qty) {
        this.saleableId = saleableId;
        this.saleId = saleId;
        this.qty = qty;
    }

    public int getSaleableId() {
        return saleableId;
    }

    public void setSaleableId(int saleableId) {
        this.saleableId = saleableId;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
