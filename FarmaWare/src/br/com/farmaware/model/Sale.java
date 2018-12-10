package br.com.farmaware.model;

import java.util.List;

/**
 *
 * @author lucasmonteiro
 * @author michelenathalie
 */
public class Sale {
    private int id;
    private List<Sold> solds;
    private String clientCpf;
    private String sellerCpf;
    private double price;

    public Sale(int id, List<Sold> solds, String clientCpf, String sellerCpf, double price) {
        this.id = id;
        this.solds = solds;
        this.clientCpf = clientCpf;
        this.sellerCpf = sellerCpf;
        this.price = price;
    }

    public Sale(List<Sold> solds, String clientCpf, String sellerCpf, double price) {
        this.solds = solds;
        this.clientCpf = clientCpf;
        this.sellerCpf = sellerCpf;
        this.price = price;
    }

    public Sale(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Sold> getSolds() {
        return this.solds;
    }

    public void setSolds(List<Sold> solds) {
        this.solds = solds;
    }

    public String getClientCpf() {
        return clientCpf;
    }

    public void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
    }

    public String getSellerCpf() {
        return sellerCpf;
    }

    public void setSellerCpf(String sellerCpf) {
        this.sellerCpf = sellerCpf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
