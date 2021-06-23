/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Palindroma {

    static boolean vizsgalat(String s){
        int bal=0;
        int jobb=s.length() -1;
        while (bal<jobb) {
            if (s.charAt(bal)!=s.charAt(jobb)) {
                return false;
            }bal++;
            jobb--;
        }return true;
    }
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in,"Cp1250");
        System.out.print("Szöveg: ");
        String be=bill.nextLine().toUpperCase().replace(" ", "");
        System.out.println("Átalakítva: "+be);
        String txt;
        if(vizsgalat(be))
            txt="Palindróma!";
        else
            txt="Nem palindróma!";
        System.out.println(txt);
    }
    
}
