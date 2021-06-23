/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */

package kektura;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/* @author Máté Andrea */
public class Kektura {
    ArrayList<Szakasz> szakaszok=new ArrayList<>();
    
    public static void main(String[] args) {
        Kektura k=new Kektura();
        try (Scanner be= new Scanner(new File("kektura.csv"))){
            int magassag=Integer.parseInt(be.nextLine());
            while (be.hasNextLine()) {
                k.szakaszok.add(new Szakasz(be.nextLine()));                
            }
            System.out.println("Szakaszok száma: "+k.szakaszok.size());
            double hossz=0;
            for (Szakasz sz : k.szakaszok) {
                hossz+=sz.getTav();
            }
            System.out.printf("Túra teljes hossza: %.3f km\n",hossz);
            ArrayList<Szakasz> masolat= new ArrayList<>(k.szakaszok);
            Collections.sort(masolat,(a,b)->Double.compare(b.getTav(), a.getTav()));
            System.out.println("Leghosszabb szakaszok:");
            for (int i = 0; i < 3; i++) {
                System.out.println(masolat.get(i));
            }
            System.out.println("A legrövidebb szakasz:\n"+masolat.get(masolat.size()-1));
            int vpmagassag=magassag;
            int legmagasabb=magassag;
            int hol=-1;
            for (int i = 0; i < k.szakaszok.size(); i++) {
                vpmagassag+=k.szakaszok.get(i).szintvaltozas();
                if (vpmagassag>legmagasabb) {
                    legmagasabb=vpmagassag;
                    hol=i;
                }
            }
            System.out.println("Legmagasabb végpont: "+legmagasabb+" m");
            System.out.println(k.szakaszok.get(hol));
            int db=0;
            System.out.println("Hiányos állomásnevek: ");
            for (Szakasz sz : k.szakaszok) {
                if (sz.hianyos()) {
                    System.out.println(sz);
                    db++;
                }
            }if (db==0) {
                System.out.println("Nincs hiányos állomásnév!");
            }
            PrintWriter ki=new PrintWriter("kektura2.csv");
            ki.println(magassag);
            for (Szakasz szakasz : k.szakaszok) {
                szakasz.javit();
                ki.println(szakasz);
            }ki.close();
        } catch (IOException e) {
        }
    }

}
