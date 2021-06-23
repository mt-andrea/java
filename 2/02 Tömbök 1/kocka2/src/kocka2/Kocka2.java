/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kocka2;

import java.util.Random;

/**
 *
 * @author Miu-chan
 */
public class Kocka2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random vg=new Random();
        int d;int d1=0;int d2=0;int d3=0;int d4=0;int d5=0;int d6=0;
        for (int i = 0; i < 10000; i++) {
            d=vg.nextInt(6)+1;
            switch(d){
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
                case 6:
                    d6++;
                    break;
                
            }
        }
        
        System.out.println(1+": "+d1+"\n"+2+": "+d2+"\n"+3+": "+d3+"\n"+4+": "+d4+"\n"+5+": "+d5+"\n"+6+": "+d6);
    }
    
}
