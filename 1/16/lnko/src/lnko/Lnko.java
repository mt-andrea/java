/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lnko;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Lnko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        int a;
        int b;
        int s;
        int m;
        System.out.print("a=");
        a=bill.nextInt();
        System.out.print("b=");
        b=bill.nextInt();
        if (a<b){
            s = a;
            a = b;
            b = s;
        }m=a%b;
        while(m>0){
            a=b;
            b=m;
            m=a%b;
        }System.out.println("LNKO: "+b);
    }
    
}
