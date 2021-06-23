/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package szerkeszt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* @author Máté Andrea */
public class Szerkeszt {

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in, "Cp1250");
        System.out.print("A fájl neve:");
        String nev = bill.nextLine();
        try (FileWriter f = new FileWriter(nev + ".txt", true)) {
            PrintWriter p = new PrintWriter(f);
            System.out.println("Írd be a sorokat! Vége:*");
            while (true) {
                String sor = bill.nextLine();
                if (sor.equals("*")) {
                    f.close();
                    Scanner be = new Scanner(new File(nev + ".txt"));
                    while (be.hasNextLine()) {
                        String next = be.nextLine();
                        System.out.println(next);
                    }
                    break;
                }
                p.println(sor);

            }
            
        } catch (IOException e) {
            System.out.println("Hiba a fájl megnyitásakor.");
        }
    }
}
