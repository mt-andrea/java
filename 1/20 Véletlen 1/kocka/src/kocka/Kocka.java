/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kocka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Kocka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        Random dice = new Random();
        int jat, gep;
        String txt;
        do {
            jat = dice.nextInt(6) + 1;
            gep = dice.nextInt(6) + 1;
            System.out.println("játékos dobása: " + jat + "\n" + "gép dobása: " + gep);
            if (jat < gep) {
                txt = "a gép nyert";
            } else if (jat > gep) {
                txt = "a játékos nyert";
            } else {
                txt = "döntetlen";
            }
            System.out.print(txt + "\nmég egy játék (i/n)? ");
        }
            while (bill.nextLine().charAt(0) != 'n');
        } 
}

