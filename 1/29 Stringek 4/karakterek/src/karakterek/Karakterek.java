/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karakterek;

/**
 *
 * @author Miu-chan
 */
public class Karakterek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 33; i < 128; i++) {
            System.out.print((char)i+" ");
            if ((i-32)%20==0) {
                System.out.println("");
            }
        }System.out.println("");
        String mh="íöüóőúéáűÍÖÜÓŐÚÉÁŰ";
        for (int i = 0; i < mh.length(); i++) {
            char c=mh.charAt(i);
            System.out.println(c+" "+(int)c);
        }
    }
    
}
