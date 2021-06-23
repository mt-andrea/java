/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztok;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Osztok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("n=");
        int n=bill.nextInt();
        int i=1;
        while(i<=n){
            if (n%i==0){
                System.out.print(i+" ");
                
            }i++;
        }System.out.println();
    }
    
}
