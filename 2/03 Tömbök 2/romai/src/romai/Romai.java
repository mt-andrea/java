/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romai;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Romai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        String[] egyesek  = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tizesek  = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] szazasok = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ezresek = {"M","MM","MMM"};
        String romai;
         while (true) {            
            System.out.print("Az átváltandó szám: ");
            int szam=bill.nextInt();
            if (szam<1||szam>3999)
                break;
            romai=ezresek[(szam/1000)-1];
            szam%=1000;
            romai+=szazasok[(szam/100)-1];
            szam%=100;
            romai+=tizesek[(szam/10)-1];
            szam%=10;
            romai+=egyesek[szam-1];
            System.out.println("Római számmal: "+romai);
        }
    }
    
}
