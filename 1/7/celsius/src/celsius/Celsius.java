/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Celsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hőmérséklet (°C): ");
        Scanner bill=new Scanner(System.in);
        double c=bill.nextDouble();
        System.out.printf("A hőmérséklet (°F): %.0f\n",9.0/5*c+32);
    }
    
}
