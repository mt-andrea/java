/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jegyek;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Jegyek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill= new Scanner(System.in);
        System.out.print("Osztályzat: ");
        int x=bill.nextInt();
        if (x>=1&&x<=5)
            System.out.println("Köszönöm!");
        else
            System.out.println("Hibás adat!");
    }
    
}
