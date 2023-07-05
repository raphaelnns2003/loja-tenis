package tenis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raphael.cabral
 */


public class Tenis{
    
    private String nome;
    private int quantidade;
    private float preco;
    private int tamanho;
    private String cor;
    private String produto;
    private String modelo;
    
    public Tenis(){
        this.nome = "nome";
        this.quantidade = 0;
        this.preco = 0;
        this.tamanho = 0;
        this.cor = "cor";
        this.produto = "produto";
        this.modelo = "modelo";
        
    }
    
    public Tenis( String nome,int quantidade, float preco, int tamanho, String cor, String produto, String modelo ){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
        this.produto = produto;
        this.modelo = modelo;

    }
    
    public String getModelo () {
        return this.modelo;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getNome () {
        return this.nome;
    }   
     
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCor () {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float preco) {
        if(preco >= 60){
            this.preco = preco;
        }
    }
 
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade)  {
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(int tamanho)  {
        if(quantidade >=0){
            this.tamanho = tamanho;
        }
    }
    
    public String getProduto() {
        return this.produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
}