package br.com.farmaware.model;

/**
 *
 * @author lucasmonteiro
 * @author michelenathalie
 */
public class Saleable {
    public static final byte PRODUCT = 0;
    public static final byte DRUG = 1;
    
    private int id;
    private String name;
    private String desc;
    private String manufc;
    private double price;
    private int stock;
    private byte categ;

    public Saleable(int id, String name, String desc, String manufc, double price, int stock, byte categ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.manufc = manufc;
        this.price = price;
        this.stock = stock;
        this.categ = categ;
    }

    public Saleable(String name, String desc, String manufc, double price, int stock, byte categ) {
        this.name = name;
        this.desc = desc;
        this.manufc = manufc;
        this.price = price;
        this.stock = stock;
        this.categ = categ;
    }

    public Saleable(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getManufc() {
        return manufc;
    }

    public void setManufc(String manufc) {
        this.manufc = manufc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public byte getCateg() {
        return categ;
    }

    public void setCateg(byte categ) {
        this.categ = categ;
    }
}
