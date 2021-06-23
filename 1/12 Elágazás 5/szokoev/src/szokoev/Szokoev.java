/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szokoev;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Szokoev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("Év(1800-2100): ");
        int ev=bill.nextInt();
        if (ev<1800||ev>2100)
            System.out.println("Hibás adat!");
        else
            if(ev%4==0&&ev%100!=0||ev%400==0)
                System.out.println("Szökőév");
            else
                System.out.println("Nem szökőév!");
    }
    
}
