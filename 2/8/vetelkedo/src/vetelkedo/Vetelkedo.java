/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package vetelkedo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* @author Máté Andrea */
public class Vetelkedo {

    static Integer[] pontok = new Integer[10];
    static int db = 0;

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.print("Pontok:");
        while (bill.hasNextInt()) {
            if (db < pontok.length) {
                pontok[db++] = bill.nextInt();
            } else {
                bill.nextInt();
            }
        }
        Integer[] masolat = Arrays.copyOf(pontok, db);
        Arrays.sort(masolat, Collections.reverseOrder());
        int osszeg = 0;
        for (int i = 0; i < masolat.length-1; i++) {
            osszeg += masolat[i];
        }
        System.out.println("pontszám:" + osszeg);
    }

}
