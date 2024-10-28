/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garacavalli;

import java.util.Random;
/**
 *
 * @author osamu
 */
// Costruttore del cavallo
public class Cavallo extends Thread {
    private final String nome; // Nome del cavallo
    private int Dpercorsa; // Distanza totale gara
    private final int Dtotale = 0; // Metri percorsi nel momento
    private static final Random random = new Random(); // l'isanza di Random
    
    public Cavallo(String nome, int Dpercorsa){
        this.nome = nome;
        this.Dpercorsa = Dpercorsa;
    }
    
    public void Run(){ // metodo run quando il thread parte 
        while(Dpercorsa < Dtotale){ // il cavallo corre finche non ha coperto la distanza totale
            int step;
            // uso random.nextInt(10) per generare un numero casuale fra 0 e 9 + 1
            step = random.nextInt(10) + 1; //corre tra 1 e 10 metri
            Dpercorsa += step;
            
            if (Dpercorsa > Dtotale) {
                Dpercorsa = Dtotale;
            } // cerco di non superare la distanza totale 
            
            System.out.println(nome + "il cavallo ha percorso" + Dpercorsa + "metri");
            
           
            
        }
        
        
        System.out.println(nome + "ha terminato la gara");
    }
    
}
