/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siknegyed;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Siknegyed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("x= ");
        int x=bill.nextInt();
        System.out.println("y= ");
        int y=bill.nextInt();
        String negyed;
        if(x<0)
            if(y<0)
                negyed="harmadik";
            else
                negyed="második";
        else
            if(y<0)
                negyed="negyedik";
            else
                negyed="első";
        System.out.println("A pont a(z) "+negyed+" negyedben van.");
    }
    
}
