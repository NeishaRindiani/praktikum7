/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Praktikum7 {

     public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Masuk ke Sistem Parkir? y/n");
            char masuk = in.nextLine().charAt(0);

            if (masuk == 'y') {
                new Program1();
            }
            if (masuk == 'n') {
                break;
            }

        }
    }
}
   