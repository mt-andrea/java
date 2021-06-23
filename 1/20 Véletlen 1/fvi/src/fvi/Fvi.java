/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fvi;

import java.util.Random;

/**
 *
 * @author Miu-chan
 */
public class Fvi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random vel=new Random();
        int dobas;
        String txt;
        int fej=0;
        int iras=0;
        for (int i = 0; i < 10; i++) {
            dobas=vel.nextInt(2);
            if (dobas==0) {
                txt="fej";
                fej++;
            }else{
                txt="írás";
                iras++;
            }System.out.print(txt+" ");
        }System.out.println("\n"+fej+" fej "+iras+" írás");
    }
    
}
