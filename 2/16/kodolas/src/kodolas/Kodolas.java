/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package kodolas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* @author Máté Andrea */
public class Kodolas {
    static void fordit(String nevforr,String nevcel,int kulcs){
        Caesar c = new Caesar();
        File fbe = new File(nevforr+".txt");
        try (Scanner be = new Scanner(fbe); FileWriter fki = new FileWriter(nevcel+".txt"); PrintWriter ki = new PrintWriter(fki);) {
            String sor;
            while (be.hasNextLine()) {
                sor = be.nextLine();
                ki.println(c.titkosit(sor, kulcs));
            }
            be.close();
        } catch (IOException e) {
            System.out.println("Undefined Error");
        }
    }

    public static void main(String[] args) {
        System.out.println("Fordítani vagy titkosítaqni? (f/t)");
        Scanner keyb=new Scanner(System.in);
        Scanner bill=new Scanner(System.in);
        char val=keyb.nextLine().charAt(0);
        System.out.println("Mi a kulcs?");
        int kulcs=keyb.nextInt();
        if (val=='f') {
            System.out.println("Fordítani kívánt fájl neve?");
            String nevforr=bill.nextLine();
            System.out.println("Cél fájl neve?");
            String nevcel=bill.nextLine();
            fordit(nevforr, nevcel, kulcs);
        } else {
            System.out.println("Titkosítani kívánt fájl neve?");
            String nevforr=bill.nextLine();
            System.out.println("Cél fájl neve?");
            String nevcel=bill.nextLine();
            fordit(nevforr, nevcel, kulcs);
        }

    }

}
