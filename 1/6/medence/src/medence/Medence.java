/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medence;
import java.util.Scanner;
/**
 *
 * @author Miu-chan
 */
public class Medence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("A medence sugara: ");
        Scanner bill=new Scanner(System.in);
        double r=bill.nextDouble();
        double felszin=Math.pow(r, 2)*Math.PI;
        System.out.printf("A vízfelsín: %.2f\n",felszin);
        System.out.print("A medence mélysége: ");
        double melyseg=bill.nextDouble();
        double terfogat=felszin*melyseg;
        System.out.printf("A medence térfogata: %.2f köbméter\n",terfogat);
        final int AR=500;
        System.out.printf("A feltöltés ára: %,.0f Ft\n", terfogat*AR);
    }
    
}
