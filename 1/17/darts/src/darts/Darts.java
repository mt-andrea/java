/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darts;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Darts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        System.out.println("Darts játék");
        int pont=0;
        int db=0;
        int dobas;
        int legnagyobb=0;
        int mind=301;
        while (pont!=301) {
            System.out.println("Pont: "+pont);
            System.out.print("Dobás: ");
            dobas=bill.nextInt();
            db++;
            if (pont+dobas<=301){
                pont+=dobas;
                if (dobas>legnagyobb){
                    legnagyobb=dobas;
                }if (dobas<mind) {
                    mind=dobas;
                }
            }
        }System.out.println("Nyertél!");
        System.out.println("Dobások száma: "+db);
        System.out.println("Legnagyobb dobás: "+legnagyobb);
        System.out.println("Legkisebb dobás: "+mind);
    }
    
}
