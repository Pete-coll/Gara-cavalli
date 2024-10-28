/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garacavalli;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author osamu
 */
public class GaraCavalli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // leggere diversi inpunt su console 
         
       // Inserisco la lunghezza della gara
        System.out.println("inserire lunghezza percorso");
        int LunghezzaGara = scanner.nextInt();
       
       System.out.println("inserire numero di cavalli"); // inserisco il numero dei cavalli 
       int Ncavalli = scanner.nextInt();
       scanner.nextLine(); // la pulizia del buffer 
       
       ArrayList<Cavallo> cavallo = new ArrayList<>();// utilizzo un ArrayList per memomirrizzare i cavalli Thread
       
       for(int i = 0; i < Ncavalli; i++){
               
           System.out.println("inserire nome dei cavalli : " + (i+1)+ ":");
           String NomeCavallo = scanner.nextLine(); 
           
           cavallo.add(new Cavallo(NomeCavallo, LunghezzaGara)); // passo a LunghezzaGara a ogni cavallo
           
               }
       
       
       
       System.out.println("\nLa gara iniziata!");
       
      System.out.println("gara terminata!");
      
    }
    
}
