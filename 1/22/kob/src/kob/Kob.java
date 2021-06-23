/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kob;

/**
 *
 * @author Miu-chan
 */
public class Kob {

    static double kob(double x){
        return Math.pow(x, 3);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"\t"+kob(i));
        }
    }
    
}
