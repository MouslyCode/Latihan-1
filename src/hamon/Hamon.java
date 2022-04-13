/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamon;

import java.util.Scanner;

/**
 *
 * @author ASUS A455L
 */
public class Hamon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sunlight Yellow
        Scanner input = new Scanner(System.in);
        int angka1;
        int angka2;
        
        System.out.print("Masukan angka pertama : ");
        angka1 = input.nextInt();
        System.out.print("Masukan angka kedua : ");
        angka2 = input.nextInt();
        
        if(angka1<angka2){
            System.out.println(angka2);
        }else{System.out.println(angka1);}
    }
    
}
