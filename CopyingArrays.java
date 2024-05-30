/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingalgorithm;

/**
 *
 * @author user
 */
public class CopyingArrays {
    
    public static void main(String[] args){
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto"};
        
        String[] copyTo = new String[7];
        
        System.arraycopy(copyFrom, 1, copyTo, 1, 4);
        for(String coffee : copyTo){
            System.out.println(coffee + "");
        }
    }
}
