/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletkor;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Eletkor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hány éves? ");
        Scanner bill=new Scanner(System.in);
        int ev=bill.nextInt();
        if (ev<18){
            System.out.println("tanuló");
        }else if (ev<65){
            System.out.println("dolgozó");
        }else {
            System.out.println("nyugdíjas");
        }
    }
    
}
