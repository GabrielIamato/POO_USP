/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo01;

/**
 *
 * @author 15452920
 */
public class Produto {
    private String nome; // 
    private float preco;/**/
    private int qtd;
    final int MAXESTOQUE = 2200;
    // Construtor: não vai mudar nada existir ou não, pois o NetBeans já implementa
    public Produto(){
        System.out.println("Produto Criado");
    }
    // Construtor que inicializa as variáveis
    public Produto(String umNome, float umPreco, int umaQtd){
        nome = umNome;
        preco = umPreco;
        qtd = umaQtd;
    }
   
    // Métodos Get 
    public int getQtd(){
        return qtd;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void print(){
        System.out.println("Nome: " + nome + ", preco: " + preco+ ", qtd: " +qtd);
    }
    
    public void adicionarEstoque(int quantidade){
        if(qtd+quantidade < MAXESTOQUE){
            qtd+= quantidade;
        }else{
            System.out.println("Máximo de Estoque");
        }
    }
    
    public void removerEstoque(int quantidade){
        if(qtd - quantidade>0){
            qtd-=quantidade;
        }else{
            System.out.println("Estoque insuficiente");
        }
    }
    
    public String toString(){
        return "Nome: " + nome + ", preco: " + preco+ ", qtd: " +qtd;
    }
}
