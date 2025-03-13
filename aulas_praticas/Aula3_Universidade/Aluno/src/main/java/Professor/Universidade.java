/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

/**
 *
 * @author 15452920
 */
public class Universidade {
    int top;
    String nome;
    // Agregação com Professor, pois professor é atributo e se uma universidade deixar de existir, os professotes ainda existem
    Professor profs[];
    // Composição com Departamentos, pois departamento é atributo e se uma universidade deixar de existir, os departamentos também deixam de existir
    Departamento depts[];

    // Construtor
    public Universidade(String nome) {
        this.nome = nome;
        profs = new Professor[3];
        depts = new Departamento[2];
        
        depts[0] = new Departamento("Matematica", 1);
        depts[1] = new Departamento("Fisica", 2);
    }
    // Getter
    public int getTop() {
        return top;
    }
    
    public String getNome() {
        return nome;
    }

    public Professor[] getProfs() {
        return profs;
    }
    // Setter
    public void setTop(int top){
        this.top = top;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfs(Professor[] profs) {
        this.profs = profs;
    }
    
    public boolean vincula(Professor prof){
      for(int i = 0; i<top; i++){
          if(profs[i] == null){
              profs[i] = prof;
          }
      }
      return false;
    }

    public boolean desvincula(Professor prof){
        for(int i = 0; i<top ; i++){
            if(profs[i] == prof){
                profs[i] = null;
                return true;
            }
        }
    return false;
    }
    /*
        Em c++, temos os Destrutor para evitar vazamento de memória
        Entretanto, no Java temos o Garbage Colector
        ~Universidade(){
            for(..)
                delete depts[i];
            delete[] depts;
        }
    */
    
}