/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homerseklet;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Homerseklet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hány fok van? ");
        Scanner bill=new Scanner(System.in);
        int t=bill.nextInt();
        if(t>25){
        System.out.println("Meleg van!");
        System.out.println("Nyisd ki az ablakot!");
        }else{
        System.out.println("Nincs meleg.");
        System.out.println("Ne nyisd ki az ablakot!");
    }
}
