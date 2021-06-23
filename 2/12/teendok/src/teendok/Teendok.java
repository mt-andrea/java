/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package teendok;

import java.util.ArrayList;
import java.util.Scanner;

/* @author Máté Andrea */
public class Teendok {

    static ArrayList<String> lista = new ArrayList<>();
static void kiir(){
    for (int i = 0; i < lista.size(); i++) {
        System.out.println((i+1)+". "+lista.get(i));
    }
}
    public static void main(String[] args) {
        System.out.println("Ebben a programban megtudja adni a teendőinek a listáját.\nGépelés után az enter megnyomásával tudja hozzáadni a teendőt a listához.\nHa a teendő elé * karaktert ír a lista elejére tudja tenni, különben a lista végére kerül.\nAmennyiben negatív számot ad meg, aminek abszolút értéke kisebb a lista hosszánál törölheti az adott sorszámú elemet.\nHa nem kíván több műveletet végezni a programmal hagyja üresen a beviteli mezőt és nyomjon entert.");
        Scanner bill = new Scanner(System.in, "Cp1250");
        System.out.println("> ");
        String be = bill.nextLine();
        while (!be.equals("")) {
            if (be.charAt(0)=='*') {
                lista.add(0,be.substring(1));
            }else if (be.charAt(0)=='-') {
                int n=Integer.parseInt(be.substring(1));
                if (n-1<lista.size()) {
                    lista.remove(n-1);
                }
            }else{
                lista.add(be);
            }
            kiir();
            System.out.println("Méret: " + lista.size());
            System.out.println("> ");
            be = bill.nextLine();
        }
    }

}
