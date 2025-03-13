/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;
/**
 *
 * @author 15452920
 */
public class Professor {
    private String nome;
    private String nivel;

    // right-click - > insert code ... get/set

    // Construtor
    public Professor(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    

    // Get
    public String getNome(){
        return nome;
    }

    public String getNivel() {
        return nivel;
    }
    // Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    // Agregação Simples
        // Em um método (NÃO COMO ATRIBUTO), a classe professor agrega/usa a classe aluno
    public void tministra(Aluno aluno){
        System.out.println("Professor " + nome + "da aula para " + aluno.getNome());
    }
  
}
