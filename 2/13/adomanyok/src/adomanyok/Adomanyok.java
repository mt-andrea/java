/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */

package adomanyok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* @author Máté Andrea */
public class Adomanyok {
static ArrayList<Integer> utalasok=new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.println("Utalások: ");
        while (bill.hasNextInt()) {            
            utalasok.add(bill.nextInt());
        }
        double ossz=0;
        for (Integer i : utalasok) {
            ossz+=i;
        }System.out.println("A befolyt összeg: "+ossz);
        Collections.sort(utalasok,Collections.reverseOrder());
        ArrayList<Integer> masolat=new ArrayList<>(utalasok.subList(0, 3));
        String txt="A legnagyobbak: ";
        for (int i = 0; i < masolat.size(); i++) {
            if (i<masolat.size()-1){
            txt+=Integer.toString(masolat.get(i))+", ";}
            else{
                txt+=Integer.toString(masolat.get(i));
            }
        }
        System.out.println(txt);
        System.out.println("A legkisebb: "+utalasok.get(utalasok.size()-1));
        if (ossz>0) {
            System.out.println("Átlag: "+(double)Math.round(ossz/utalasok.size()*100)/100);
        }
    }

}
