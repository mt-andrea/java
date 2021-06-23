/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto5;

import java.util.Random;

/**
 *
 * @author Miu-chan
 */
public class Lotto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random vg=new Random();
        boolean szelveny[]=new boolean[90];
        int szam;
        int db=0;
        while (db<5) {            
            szam=vg.nextInt(90);
            if (!szelveny[szam]){
                szelveny[szam]=true;
                db++;
            }
        }System.out.print("A számok: ");
        for (int i = 0; i < szelveny.length; i++) {
            if (szelveny[i]) {
                System.out.print((i+1)+" ");
            }
        }System.out.println("");
    }
    
}
