/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Fordit {

    static int[] sor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static Scanner bill = new Scanner(System.in);

    static void kiir() {
        for (int i = 0; i < sor.length; i++) {
            System.out.print(sor[i] + " ");
        }
        System.out.println("");
    }

    static void megfordit(int n) {
        int x;
        for (int i = 0; i < n / 2; i++) {
            x = sor[i];
            sor[i] = sor[n - i - 1];
            sor[n - i - 1] = x;
        }
    }

    static void kever(int hanyszor) {
        Random vg = new Random();
        int db;
        for (int i = 0; i < hanyszor; i++) {
            db = vg.nextInt(8) + 2;
            megfordit(db);
        }
    }

    static boolean kesz() {
        for (int i = 0; i < 9; i++) {
            if (sor[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

    static int beolvas() {
        int be;
        do {
            System.out.print("Hányat fordítsak meg? ");
            be = bill.nextInt();
        } while (be < 2 || be > 9);
        return be;
    }

    public static void main(String[] args) {
        int lepes;
        do {
            System.out.println("Fordítós játék");
            System.out.println("Rendezd növekvő sorrendbe a számokat!");
            kever(50);
            kiir();
            lepes = 0;
            while (!kesz()) {
                megfordit(beolvas());
                kiir();
                lepes++;
            }
            System.out.println("Gratulálok, megoldottad " + lepes + " lépésben!");
            System.out.print("Még egy játék? (i/n): ");
            bill.nextLine();
        } while (bill.nextLine().toUpperCase().charAt(0) != 'N');
    }

}
