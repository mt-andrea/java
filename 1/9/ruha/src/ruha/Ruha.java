/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruha;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Ruha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hány fok van? ");
        Scanner bill=new Scanner(System.in);
        int t=bill.nextInt();
        if (t<10){
            System.out.println("Kabátot vegyél fel!");
        }else if (t<20){
            System.out.println("Pulóvert vegyél fel!");
        }else if (t<30){
            System.out.println("Pólót vegyél fel!");
        }else{
            System.out.println("Fürdőruhát vegyél fel!");
        }
    }
    
}
