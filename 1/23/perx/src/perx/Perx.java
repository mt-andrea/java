/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perx;

/**
 *
 * @author Miu-chan
 */
public class Perx {

    static double rec(double x){
        double sz;
        if (x==0) {
            sz=0.0;
        }else {
           sz=1/x; 
        }return sz;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"\t"+rec(i));
        }
    }
    
}
