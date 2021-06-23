/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package hatos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/* @author Máté Andrea */
public class Hatos {

    int[][] szamok = new int[400][6];
    int db = 0;

    void feltolt(String s) {
        Scanner olvas = new Scanner(s);
        for (int i = 0; i < 6; i++) {
            szamok[db][i] = olvas.nextInt();
        }
    }
    int[] stat = new int[45];

    void statisztika() {
        for (int i = 0; i < db; i++) {
            for (int j = 0; j < 6; j++) {
                stat[szamok[i][j] - 1]++;
            }
        }
        for (int i = 0; i < stat.length; i++) {
            System.out.print(stat[i] + " ");
            if (i % 10 == 9) {
                System.out.println("");
            }
        }
        System.out.println("");
    }

    void legtobbszor(boolean tobb) {
        int maxi = 0;
        String txt;
        if (tobb) {
            for (int i = 0; i < stat.length; i++) {
                if (stat[i] > stat[maxi]) {
                    maxi = i;
                }
            }
            txt = "Legtöbbször húzott: " + (maxi + 1);

        } else {
            for (int i = 0; i < stat.length; i++) {
                if (stat[i] < stat[maxi]) {
                    maxi = i;
                }
            }
            txt = "Legkevesebbszer húzott: " + (maxi + 1);
        }
        System.out.println(txt);
    }

    public static void main(String[] args) {
        File fbe = new File("hatos.txt");
        try (Scanner be = new Scanner(fbe);) {
            Hatos h = new Hatos();
            while (be.hasNextLine()) {
                String next = be.nextLine();
                h.feltolt(next);
                h.db++;
            }
            be.close();
            h.statisztika();
            h.legtobbszor(true);
            h.legtobbszor(false);
        } catch (IOException ex) {
        }

    }

}
