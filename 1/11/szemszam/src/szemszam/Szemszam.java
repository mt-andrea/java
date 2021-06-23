/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szemszam;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Szemszam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("születési év: ");
        int ev=bill.nextInt();
        bill.nextLine();
        System.out.print("Nem (f/n): ");
        String nem=bill.nextLine();
        int szam;
        if (ev<=1999)
            if(nem.charAt(0)=='f')
                szam=1;
            else
                szam=2;
        else
            if (nem.charAt(0)=='f')
                szam=3;
            else
                szam=4;
        System.out.println("Személyi számod eleje: "+szam);
        
    }
    
}
