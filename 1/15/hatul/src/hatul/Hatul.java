/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatul;

import java.util.Scanner;

/**
 *
 * @author Miu-chan
 */
public class Hatul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        int jegy;
        String oszt = "";
        do {
            System.out.print("Az osztáléyzat: ");
            jegy = bill.nextInt();
        } while (jegy < 1 || jegy > 5);
        switch (jegy) {
            case 1:
                oszt = "elégtelen";
                break;
            case 2:
                oszt = "elégséges";
                break;
            case 3:
                oszt = "közepes";
                break;
            case 4:
                oszt = "jó";
                break;
            case 5:
                oszt = "jeles";
                break;
        }
        System.out.println(jegy + ": " + oszt);
    }

}
