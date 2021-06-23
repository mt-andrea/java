/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tti;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Tti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.print("Hány cm magas vagy?");
        double cm=bill.nextDouble();
        System.out.print("Hány kg a testtömeged?");
        double kg=bill.nextDouble();
        double tti= kg/Math.pow(cm/100, 2);
        tti=Math.round(tti*100)/100;
        String alkat;
        if (tti<20){
            alkat="alultáplált";
        }else if(tti<25){
            alkat="normális";
        }else if (tti<30){
            alkat="túlsúlyos";
        }else if (tti<35){
            alkat="elhízott";
        }else{
            alkat="elősen elhízott";
        }
        System.out.println("Testtömegindexed: "+tti+" "+alkat);
    }
    
}
