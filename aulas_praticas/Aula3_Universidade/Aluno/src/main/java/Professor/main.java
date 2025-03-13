/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Professor;

/**
 *
 * @author 15452920
 */
public class main {
    public static void main(String args[]) {
        Universidade u1 = new Universidade("USP");
        Universidade u2 = new Universidade("Ufscar");
        
        Professor p1 = new Professor("Gabriel", "Grad");
        Professor p2 = new Professor("Gabriela", "Pos-grad");
        
        u1.vincula(p1);
        u1.vincula(p2);
        u2.vincula(p1);
        u2.vincula(p2);
        
        u1.desvincula(p2);
        u2.desvincula(p1);
        u1 = null; //delete u1
        u2 = null;
        
    }
}
