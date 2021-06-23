/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */

package kocka2;

import java.util.Random;

/* @author Máté Andrea */
public class Kocka2 {

    
    public static void main(String[] args) {
        Random vg=new Random();
        int [][] dobasok=new int[6][6];
        int sor, oszl;
        for (int i = 0; i < 1000; i++) {
            sor=vg.nextInt(6);
            oszl=vg.nextInt(6);
            dobasok[sor][oszl]++;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(dobasok[i][j]+" ");
            }System.out.println("");
        }
    int het=dobasok[0][5]+dobasok[5][0]+dobasok[1][4]+dobasok[4][1]+dobasok[3][2]+dobasok[2][3];
        System.out.println("Hetesek: "+het);
    int dob11=dobasok[4][5]+dobasok[5][4];
        System.out.println("Tizenegyesek: "+dob11);}

}
