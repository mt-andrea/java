/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pithagorasz;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Pithagorasz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("a oldal: ");
        Scanner bill = new Scanner(System.in);
        double a=bill.nextDouble();
        System.out.print("b oldal: ");
        double b=bill.nextDouble();
        System.out.println("c oldal: "+(Math.round(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)))*10)/10.0);
    }
    
}
