/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udv;
/**
 *
 * @author Miu-chan
 */
public class Udv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Mi a neved? ");
        java.util.Scanner bill = new java.util.Scanner(System.in,"Cp1250");
        String nev=bill.nextLine();
        System.out.println("Üdvözöllek "+nev+'!');
    }
    
}
