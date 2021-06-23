/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kor;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Kor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("A kör sugara: ");
        Scanner bill = new Scanner(System.in);
        double r=bill.nextDouble();
        double ker=2*r*Math.PI;
        double ter=Math.pow(r, 2)*Math.PI;
        System.out.println("A kör sugara: "+r);
        System.out.println("A kör kerülete: "+Math.round(ker*1000)/1000.0);
        System.out.println("A kör területe: "+Math.round(ter*1000)/1000.0);
    }
    
}
