/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuvudsz;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Tuvudsz {

    static void kiir(String s){
        final String MH="AÁEÉIÍOÓÖŐUÚÜŰ";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            System.out.print(c);
            if (MH.indexOf(c)>-1){
                System.out.print("V"+c);
            
            }
        }
    }
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in,"Cp1250");
        while (true) {
            System.out.print("Szöveg: ");
            String mit=bill.nextLine().toUpperCase();
            if (mit.isEmpty()) {
                break;
            }
            kiir(mit);
        System.out.println("");
        }
    }
    
}
