/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package txt2srt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Feliratok → srt
 *
 * @author Máté Andrea
 */
public class Txt2srt {

    ArrayList<Felirat> feliratok = new ArrayList<>();

    public static void main(String[] args) {
        Txt2srt t = new Txt2srt();

        try (Scanner be = new Scanner(new File("feliratok.txt"));) {
            String s1, s2, longest="";
            while (be.hasNextLine()) {
                s1 = be.nextLine();
                s2 = be.nextLine();
                if (s2.length()>longest.length()) {
                    longest=s2;
                }
                Felirat f = new Felirat(s1, s2);
                f.eltol(1);
                t.feliratok.add(f);
            }
            System.out.println("Leghosszabb felirat: "+longest+"\nHossza: "+longest.length()+"\nFeliratok száma: " + t.feliratok.size());
            be.close();
            PrintWriter ki = new PrintWriter("felirat.srt");
            for (int i = 0; i < t.feliratok.size(); i++) {
                ki.println(i + 1);
                ki.println(t.feliratok.get(i).getSrt());
                ki.println(t.feliratok.get(i).getSzoveg());
                ki.println();
            }
            ki.close();
        } catch (IOException e) {
        }

    }

}
