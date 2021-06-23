/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekurzio;

/**
 *
 * @author Miu-chan
 */
public class Rekurzio {

    static void kiir(int n){
        if (n>0) {
            System.out.println(n);
            kiir(n-1);
        }
    }
    public static void main(String[] args) {
        kiir(8);
    }
    
}
