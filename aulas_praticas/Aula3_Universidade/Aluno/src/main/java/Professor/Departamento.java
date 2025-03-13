/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

/**
 *
 * @author 15452920
 */
public class Departamento {
    String nome;
    int cod;
    
    // Construtor
    public Departamento(String nome, int cod) {
        this.nome = nome;
        this.cod = cod;
    }
    
    // Get
    public String getNome() {
        return nome;
    }
    public int getCod() {
        return cod;
    }
    
    //Set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
