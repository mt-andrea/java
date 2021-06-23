/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percdij;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Percdij {

    static int atsz(int ora,int perc,int mp){
        return ora*3600+perc*60+mp;
    }
    static int beol(String s){
        Scanner bill=new Scanner(System.in);
        System.out.print(s+" (ó p mp): ");
        int o=bill.nextInt();
        int p=bill.nextInt();
        int mp=bill.nextInt();
        return atsz(o, p, mp);
    }
    public static void main(String[] args) {
        final int CSUCS=30;
        final int DIJ=15;
        System.out.println("Percdíj számítása");
        int ido1=beol("A hívás eleje");
        int ido2=beol("A hívás vége");
        int hossz=(int)Math.ceil((ido2-ido1)/60.0);
        System.out.println("Számlázott percek: "+hossz);
        if (ido1>atsz(7,0,0)&&ido1<atsz(19,0,0)) {
            System.out.println("Fizetendő: "+hossz*CSUCS+" Ft");
        }else{
            System.out.println("Fizetendő: "+hossz*DIJ+" Ft");
        }
    }
    
}
