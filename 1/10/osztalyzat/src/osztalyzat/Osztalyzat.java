/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalyzat;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Osztalyzat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Pontszám: ");
        Scanner bill=new Scanner(System.in);
        int pont=bill.nextInt();
        String oszt;
        if (pont<51){
            oszt="elégtelen";
        }else if (pont<61){
            oszt="elégséges";
        }else if (pont<71){
            oszt="közepes";
        }else if (pont<81){
            oszt="jó";
        }else{
            oszt="jeles";
        }
        System.out.println("Osztályzat: "+oszt);
    }
    
}
