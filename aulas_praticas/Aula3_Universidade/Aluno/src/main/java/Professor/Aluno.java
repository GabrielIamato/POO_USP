/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

/**
 *
 * @author 15452920
 */
public class Aluno {

   String nome;
   int nusp;

    // Construtor
    public Aluno(String nome, int nusp) {
        this.nome = nome;
        this.nusp = nusp;
    }

   // Get
    public String getNome() {
        return nome;
    }

    public int getNusp() {
        return nusp;
    }
    
    // Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNusp(int nusp) {
        this.nusp = nusp;
    }
   
}