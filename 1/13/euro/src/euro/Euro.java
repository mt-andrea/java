/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euro;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Euro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("Hány Ft 1 Euro? ");
        int arfolyam=bill.nextInt();
        int osszeg;
        System.out.print("1-Euro->Ft 2-Ft->Eouro: ");
        int valasz=bill.nextInt();
        switch(valasz){
            case 1:
                System.out.print("Átváltandó összeg (EUR): ");
                osszeg=bill.nextInt();
                System.out.println(Math.round(osszeg*arfolyam)+" Ft");
                break;
            case 2:
                System.out.print("Átváltandó összeg (Ft): ");
                osszeg=bill.nextInt();
                System.out.println(Math.round(osszeg/arfolyam)+" EUR");
                break;
            default:
                System.out.println("Hibás választás!");
                break;
        }
    }
    
}
