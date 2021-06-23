/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package szavak;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* @author Máté Andrea */
public class Szavak {

    int maganhangzok(String szo) {
        char[] mgh = {'a', 'e', 'i', 'o', 'u'};
        int c = 0;
        for (int i = 0; i < szo.length(); i++) {
            for (int j = 0; j < mgh.length; j++) {
                if (szo.charAt(i) == mgh[j]) {
                    c++;
                }
            }
        }
        return c;
    }

    void f2() {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Szó: ");
        String szo = keyb.nextLine();
        System.out.println("Magánhangzók száma: " + maganhangzok(szo));
    }

    void f3_4() {
        File f = new File("szavak.txt");
        try (Scanner be = new Scanner(f)) {
            
            //4. feladat
            int c_ossz=0,c_talalat=0;
            System.out.println("Több magánhangzó: ");
            //3. feladat
            int c, max_c = 0;
            String max_line="";
            
            while (be.hasNextLine()) {
                String next = be.nextLine();
                c = next.length();
                if (c > max_c) {
                    max_c = c;
                    max_line=next;
                }
                //4. feladat
                if (maganhangzok(next)>c-maganhangzok(next)) {
                    c_talalat++;
                    System.out.print(next+" ");
                    if (c_talalat%10==0) {
                        System.out.println("");
                    }
                }
                c_ossz++;
            }
            /*4*/System.out.printf("\n"+c_talalat+"/"+c_ossz+": %,.2f%%\n",(double)c_talalat/c_ossz*100);
            /*3*/System.out.println("A leghosszabb szó: " + max_line + "\nKaraktereinek száma: " + max_c);

        } catch (IOException e) {
            System.out.println("Ez egy hibaüzenet IOException fellépésekor.");
        }
    }

    public static void main(String[] args) {
        Szavak sz = new Szavak();
        sz.f2();
        sz.f3_4();
    }

}
