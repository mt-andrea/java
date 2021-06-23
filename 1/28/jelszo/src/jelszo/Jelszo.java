/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jelszo;

import java.util.Random;

/**
 *
 * @author Miu-chan
 */
public class Jelszo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kar="abcdefghijklmnopqrstuvwxy";
        kar+=kar.toUpperCase();
        kar+="0123456789_()";
        Random vg=new Random();
        int vel;
        String jelszo;
        for (int i = 0; i < 5; i++) {
            jelszo="";
            for (int j = 0; j < 16; j++) {
                vel=vg.nextInt(kar.length());
                jelszo+=kar.charAt(vel);
            }System.out.println(jelszo);
        }
    }
    
}
