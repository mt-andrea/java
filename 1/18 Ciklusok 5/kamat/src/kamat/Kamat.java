/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamat;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Kamat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("Induló össz: ");
        double ossz=bill.nextDouble();
        System.out.print("Kamat %: ");
        double kamat=bill.nextDouble()/100;
        System.out.print("Betét: ");
        int ev1=bill.nextInt();
        System.out.print("Kivét: ");
        int ev2=bill.nextInt();
        for (int i = ev1+1; i <= ev2; i++) {
            ossz+=ossz*kamat;
            System.out.println(i+" "+Math.round(ossz));
        }System.out.println("Kapott össz: "+Math.round(ossz));
    }
    
}
