package br.com.farmaware.model;

/**
 *
 * @author lucasdm
 * @author michelenathalie
 */
public class User {
    public static final int MANAGER_TYPE = 0;
    public static final int CLERK_TYPE = 1;
    
    private String cpf;
    private String name;
    private String passwd;
    private int categ;

    public User(String cpf) {
        this.cpf = cpf;
    }

    public User(String cpf, String name, String passwd, int categ) {
        this.cpf = cpf;
        this.name = name;
        this.passwd = passwd;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getCateg() {
        return categ;
    }

    public void setCateg(int categ) {
        this.categ = categ;
    }
}
