/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */

package toldi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* @author Máté Andrea */
public class Toldi {

    
    public static void main(String[] args) {
        Scanner keyb=new Scanner(System.in,"Cp1250");
        System.out.println("Megnyitni kívánt fájl neve:");
        String filename=keyb.nextLine();
        int c=0;
        try (Scanner be=new Scanner(new File(filename),"Cp1250")){
            while (be.hasNextLine()) {
                String next = be.nextLine();
                System.out.println(next);
                c++;
            }
            System.out.println("\nA sorok száma: "+c);
        } catch (FileNotFoundException e) {
            System.out.println("Nincs meg a fájl!");
        }
    }

}
