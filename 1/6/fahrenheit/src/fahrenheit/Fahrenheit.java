/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;
import java.util.Scanner;
/**
 *
 * @author Miu-chan
 */
public class Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hőmérséklet (°F): ");
        Scanner bill=new Scanner(System.in);
        double f=bill.nextDouble();
        System.out.printf("A hőmérséklet (°C): %.1f\n",(f-32)*5/9.0);
    }
    
}
