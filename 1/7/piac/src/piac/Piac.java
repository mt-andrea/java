/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piac;
import java.util.Scanner;
/**
 *
 * @author Miu-chan
 */
public class Piac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ALMA_AR=49;
        final int KORTE_AR=69;
        Scanner bill=new Scanner(System.in);
        System.out.print("Almák száma: ");
        int alma_db=bill.nextInt();
        System.out.print("Körték száma: ");
        int korte_db=bill.nextInt();
        int ar=alma_db*ALMA_AR+korte_db*KORTE_AR;
        ar=Math.round(ar/5f)*5;
        System.out.println("Fizetendő: "+ar+" Ft");
        System.out.print("Kapott összeg: ");
        int kapott=bill.nextInt();
        int vissza=kapott-ar;
        System.out.println("Visszajáró: "+vissza+" Ft");
        System.out.println("100 Ft\t"+vissza/100);
        vissza=vissza%100;
        System.out.println("50 Ft\t"+vissza/50);
        vissza=vissza%50;
        System.out.println("20 Ft\t"+vissza/20);
        vissza=vissza%20;
        System.out.println("10 Ft\t"+vissza/10);
        vissza=vissza%10;
        System.out.println("5 Ft\t"+vissza/5);
    }
    
}
