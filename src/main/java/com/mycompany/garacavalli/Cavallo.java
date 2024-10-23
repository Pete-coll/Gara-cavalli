/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garacavalli;

/**
 *
 * @author osamu
 */
public class Cavallo extends Thread {
    private String nome;
    private int Dpercorsa;
    private int Dtotale;
    
    public Cavallo(String nome, int Dpercorsa, int Dtotale){
        this.nome = nome;
        this.Dpercorsa = 0;
        this.Dtotale = Dtotale;
    }
    
    public void Run(){
         int avanzamento = (int) (Math.random()* 10+1);
        while(Dpercorsa < Dtotale){
            Dpercorsa += avanzamento;
            System.out.println(nome + " percorso " + Dpercorsa + " metri");
            
            
        }
        
        System.out.println(nome + "ha terminato la gara");
    }
    
}
