/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitatal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Kitatal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        Random vel = new Random();
        final int HATAR = 1000;
        int tip, lepes, szam;
        do {
            lepes = 0;
            szam = vel.nextInt(HATAR) + 1;
            System.out.println("gondoltam egy számra 1 és " + HATAR + " között\ntaláld ki!");
            do {
                System.out.print("tip: ");
                tip = bill.nextInt();
                lepes++;
                String txt = "";
                if (tip < szam) {
                    txt = "nagyob";
                } else if (tip > szam) {
                    txt = "kisebb";
                }
                System.out.println(txt);
            } while (tip != szam);
            System.out.print("eltaláltad " + lepes + " lépésben\nmég egy (i/n)?");
            bill.nextLine();
        } while (bill.nextLine().charAt(0) != 'n');

    }

}
