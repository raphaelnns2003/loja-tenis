/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenis;

import java.util.LinkedList;



/**
 *
 * @author andre
 */
public class Cliente extends Pessoa{
    private int cep;
    private int telefone;
    private String email;
    private LinkedList<Compra> compras;

    public Cliente(int cep, int telefone, String email, String nome, String cpf, String sexo, int idade, int senha, String login) {
        super(nome, cpf, sexo, idade, senha, login);
        this.cep = cep;
        this.telefone = telefone;
        this.compras = new LinkedList<Compra>();
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkedList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(LinkedList<Compra> compras) {
        this.compras = compras;
    }
   
    public void adicionarCompra(Compra compra ) {
        this.compras.add(compra);
    }
    
    
    
}
