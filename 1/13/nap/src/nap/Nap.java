/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nap;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Nap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("Nap sorszáma: ");
        int nap=bill.nextInt();
        switch(nap){
            case 1:
                System.out.println("hétfő");
                break;
            case 2:
                System.out.println("kedd");
                break;
            case 3:
                System.out.println("szerda");
                break;
            case 4:
                System.out.println("csütörtök");
                break;
            case 5:
                System.out.println("péntek");
                break;
            case 6:
                System.out.println("szombat");
                break;
            case 7:
                System.out.println("vasárnap");
                break;
            default:
                System.out.println("nincs ilyen nap");
                break;
        }
    }
    
}
