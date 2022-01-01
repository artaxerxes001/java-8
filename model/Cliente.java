package model;


public class Cliente {
    private String nome;
    private String senha;
    private boolean status;
    public Cliente(String nome, String senha, boolean status) {
        this.nome = nome;
        this.senha = senha;
        this.status = status;
    }
    public String getNome() {
        return nome;
    }
  
    public String getSenha() {
        return senha;
    }
  
    public boolean getStatus() {
        return status;
    }
  
}
