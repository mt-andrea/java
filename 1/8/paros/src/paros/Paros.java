/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paros;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Paros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Írj be egy számot!");
        Scanner bill= new Scanner(System.in);
        int sz=bill.nextInt();
        if (sz%2==0){
            System.out.println("Páros");
        }else{
            System.out.println("Páratlan");
        }
    }
    
}
