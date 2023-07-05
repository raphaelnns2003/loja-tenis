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
public class Compra {
    private LinkedList<Tenis> produtos;
    private double valor;
   
    public Compra() {
        this.produtos = new LinkedList<Tenis>();
        this.valor = 0;
    }

    public LinkedList<Tenis> getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList<Tenis> produtos) {
        this.produtos = produtos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void adicionarTenis(Tenis tenis) {
        this.produtos.add(tenis);
    }
    
    
}
