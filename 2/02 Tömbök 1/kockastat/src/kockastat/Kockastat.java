/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kockastat;

import java.util.Random;

/**
 *
 * @author Miu-chan
 */
public class Kockastat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kockadobás statisztika");
        Random vg=new Random();
        int d;
        int[] dobas=new int[6];
        for (int i = 0; i < 10000; i++) {
            d=vg.nextInt(6)+1;
            dobas[d-1]++;
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println((i+1)+": "+dobas[i]);
        }
    }
    
}
