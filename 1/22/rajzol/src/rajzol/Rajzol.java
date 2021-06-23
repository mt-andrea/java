/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajzol;

/**
 *
 * @author Miu-chan
 */
public class Rajzol {

    static void vonal(int db, char c){
        for (int i = 0; i < db; i++) {
            System.out.print(c);
        }System.out.println("");
    }
    public static void main(String[] args) {
            vonal(40,'=');
            vonal(50,'*');
    }
    
}
