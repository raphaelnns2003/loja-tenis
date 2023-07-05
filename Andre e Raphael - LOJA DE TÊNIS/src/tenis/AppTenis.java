/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenis;

/**
 *
 * @author raphael.cabral
 */
public class AppTenis {
    public static void main(String[] args) {
        Tenis nike = new Tenis();
       
        nike.setNome("Nike");
        System.out.println(" A Marca do tenis e: "+ nike.getNome()+"\n");
        nike.setQuantidade(50); 
        System.out.println("A quantidade: "+ nike.getQuantidade());
        nike.setPreco(400);
        System.out.println("O preco e: " + nike.getPreco());
        nike.setTamanho(43);
        System.out.println("O tamanho e: "+ nike.getTamanho());
        System.out.println("O preco e: " + nike.getPreco());
        nike.setProduto("Linha 2.0");
        System.out.println("O produto e: " + nike.getProduto());
        nike.setCor("azul");
        System.out.println("A cor e: "+ nike.getCor());
        
        //System.out.println("\n\n\n\n\n\n\n\n");
        Tenis adidas = new Tenis ("adidas", 50, 360, 42, "branco", "Linha 3.2", "grand court" );
        System.out.println("Marca do tenis: "+ adidas.getNome()+"\n");
        System.out.println("A quantidade: "+ adidas.getQuantidade());
        System.out.println("O preco e: " + adidas.getPreco());
        System.out.println("O tamanho e: "+ adidas.getTamanho());
        System.out.println("O produto e: " + adidas.getProduto());
        System.out.println("A cor e: "+ adidas.getCor());
        
    }

}
