/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirFare;

import java.util.Scanner;

/**
 *
 * @author PC 25
 */
public class AirFare {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance;
        int cl = 0;
        float total = 0;
        float discount = 0;
        
        System.out.print("Distance (km): ");
        distance = sc.nextInt();
        System.out.print("Class: ");
        cl = sc.nextInt();
        
        if (cl == 1){
            total = distance * 250;
                if (distance >= 1000){
                    discount = total * (float) 0.10;
                    total = total - discount;
                }
                System.out.printf("Total fare: %.2f", total);
         
        }else if (cl == 2){        
            total = distance * 500;
                if (distance >= 1000){
                    discount = total * (float) 0.10;
                    total = total - discount;
                }
                System.out.printf("Total fare: %.2f", total);
        
        
        
        
    }
    }
}
