/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenis;

/**
 *
 * @author andre
 */
public class Vendedor extends Pessoa {
    private int codigo;

    public Vendedor(int codigo, String nome, String cpf, String sexo, int idade, int senha, String login) {
        super(nome, cpf, sexo, idade, senha, login);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
