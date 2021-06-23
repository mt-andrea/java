/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atlag;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Atlag {

    static double szamol(String s){
        int db=0;
        int ossz=0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c=s.charAt(i);
            if(c>='1'&&c<='5'){
                db++;
                ossz+=(int)c-(int)'0';
            }
        }if (db>0) {
            return (double)ossz/db;
        }else
            return 0;
    }
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.println("Átlagszámítás");
        String be;
        while (true) {            
            System.out.print("Osztályzatok: ");
            be=bill.nextLine();
            if (be.equals("")) {
                break;
            }
                System.out.printf("Átlag: %.2f\n",szamol(be));
        }
    }
    
}
