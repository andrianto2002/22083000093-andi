/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrsyad;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class kalkulatorBMI {
   public static void main (String[] args) {
       String nama;
       int umur;
        Scanner sc = new Scanner (System.in);
        manusia manusia = new manusia ();
        System.out.println("Silahkan input nama anda : ");
        nama = sc.nextLine();
        System.out.println("Silahkan input umur anda : ");
        umur = sc.nextInt();
        System.out.println("berat badan anda: ");
        manusia.weight = sc.nextDouble();
        System.out.println("tinggi badan anda: ");
        manusia.height = sc.nextDouble();
        System.out.println("Namau adalah :" + nama);
        System.out.println("umurmu : " + umur);
        manusia.kalkulatorBMI();
        
   
        
        
        
        
     
       
       
   } 
           
          
}
