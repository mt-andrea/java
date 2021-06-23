/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package robot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* @author Máté Andrea */
public class Robot {

    String[] utak;
    int db;

    void beolvas() {
        File f = new File("utak.txt");
        try (Scanner be = new Scanner(f)) {
            db = be.nextInt();
            be.nextLine();
            utak = new String[db];
            for (int i = 0; i < db; i++) {
                utak[i] = be.nextLine();
            }
        } catch (IOException e) {
        }
    }

    double tavolsag(String ut) {
        int x = 0, y = 0;
        for (int i = 0; i < ut.length(); i++) {
            switch (ut.charAt(i)) {
                case 'K':
                    x++;
                    break;
                case 'N':
                    x--;
                    break;
                case 'E':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;

            }
        }
        return Math.sqrt(x * x + y * y);
    }

    int energia(String ut) {
        int e = 3;
        for (int i = 1; i < ut.length(); i++) {
            e++;
            if (ut.charAt(i) != ut.charAt(i - 1)) {
                e += 2;
            }
        }
        return e;
    }

    void kiir() {
        try (FileWriter f = new FileWriter("kimenet.txt"); PrintWriter ki = new PrintWriter(f);) {
            for (int i = 0; i < db; i++) {
                ki.println(utak[i]);
                ki.println("Távolság: " + tavolsag(utak[i]));
                ki.println("Energia: " + energia(utak[i]));
            }
            ki.close();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws IOException {
        Robot r = new Robot();
        r.beolvas();
        r.kiir();
    }

}
