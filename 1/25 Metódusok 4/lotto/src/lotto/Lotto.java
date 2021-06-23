/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

/**
 *
 * @author Miu-chan
 */
public class Lotto {

    static long szorzat(int m, int n){
        if (n-m>1) {
            return m*szorzat(m+1,n);
        }else
            return m*n;
    }
    public static void main(String[] args) {
        System.out.println("5-ös lottó:\t"+szorzat(86, 90)/szorzat(1, 5)+"\n6-os lottó:\t"+szorzat(40, 45)/szorzat(1, 6)+"\nSkandináv:\t"+szorzat(29, 35)/szorzat(1, 7));
    }
    
}
