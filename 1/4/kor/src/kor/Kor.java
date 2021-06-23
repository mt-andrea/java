/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kor;

/**
 *
 * @author Miu-chan
 */
public class Kor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r=3.45;
        double ker=2*r*Math.PI;
        double ter=Math.pow(r, 2)*Math.PI;
        System.out.println("A kör sugara: "+r);
        System.out.println("A kör kerülete: "+Math.round(ker*1000)/1000.0);
        System.out.println("A kör területe: "+Math.round(ter*1000)/1000.0);
        
        double x=6.23;
        System.out.println("a="+Math.min(x,5));
        System.out.println("b="+Math.round(x*10)/10.0);
        System.out.println("c="+Math.abs(x));
        System.out.println("d="+Math.sqrt(x));
        System.out.println("e="+Math.pow(x,3));
    }
    
}
