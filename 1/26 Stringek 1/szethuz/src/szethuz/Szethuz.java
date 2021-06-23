/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szethuz;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Szethuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Szöveg: ");
        Scanner bill=new Scanner(System.in,"Cp1250");
        String s=bill.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
        }System.out.println("");
    }
    
}
