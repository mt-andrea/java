/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package bubi;

import java.util.Random;

/**
 *
 * @author Máté Andrea
 */
public class Bubi {
    static int[] szamok=new int[10];
    static void rendez(){
        for (int i = szamok.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (szamok[j]>szamok[j+1]) {
                    csere(j);
                }
            }
        }
    }
    static void rendez_2(){
        for (int i = szamok.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (szamok[j]<szamok[j+1]) {
                    csere(j);
                }
            }
        }
    }
    static void feltolt(){
        Random vg=new Random();
        for (int i = 0; i < szamok.length; i++) {
            szamok[i]=vg.nextInt(100);
        }
    }
    static void csere(int n){
        int seged=szamok[n];
        szamok[n]=szamok[n+1];
        szamok[n+1]=seged;
    }
    static void kiir(){
        for (int i = 0; i < 10; i++) {
            System.out.print(szamok[i]+" ");
        }System.out.println("");
    }
    public static void main(String[] args) {
        feltolt();
        kiir();
        rendez();
        kiir();
        rendez_2();
        kiir();
    }
    
}
