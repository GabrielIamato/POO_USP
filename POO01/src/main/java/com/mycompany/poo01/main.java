/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo01;

/**
 *
 * @author 15452920
 */
public class main {
    public static void main(String[] args){
        System.out.println("Hello World");
        Produto p1 = new Produto();
        
        /* System.out.println(p1);
        System.out.println(p1.getPreco());
        System.out.println(p1.getNome());
        System.out.println(p1.getQtd());*/
        p1.print();
        System.out.println("__________________");  
        Produto p2 = new Produto("TV", 3000.0f, 2000);
       /* System.out.println(p2);
        System.out.println(p2.getPreco());
        System.out.println(p2.getNome());
        System.out.println(p2.getQtd());*/
        p2.adicionarEstoque(5);
        p2.removerEstoque(4);
    
        p2.print();
    }
    
}
