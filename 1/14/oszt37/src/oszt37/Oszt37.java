/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oszt37;

/**
 *
 * @author Miu-chan
 */
public class Oszt37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=200;
        while(i<=300){
            if (i%3==0 && i%7==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }
    
}
