/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzet;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Negyzet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("Az első szám: ");
        double x=bill.nextDouble();
        while(x!=0){
            System.out.println("A szám négyzete: "+Math.pow(x, 2));
            System.out.print("A következő szám: ");
            x=bill.nextDouble();
        }
    }
    
}
