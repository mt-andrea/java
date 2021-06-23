/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hossz;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Hossz {

    static int atvalt(int m,int cm){
        return m*1000+cm*10;
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("m: ");
        int m=k.nextInt();
        System.out.print("cm: ");
        int cm=k.nextInt();
        System.out.println(atvalt(m,cm)+" mm");
    }
    
}
