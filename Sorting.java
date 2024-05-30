/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingalgorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Sorting {
    public static void main(String[] args){
        /*
        int[] myArray = {5, 2, 8, 3, 1, 6, 4};
        
        // call sort() method to sort in ascending(default) order
        Arrays.sort(myArray);
        
        System.out.println("Sorted array");
        for(int i : myArray){
            System.out.println(i + " ");
        }
        */
        String[] coffeeTypes = {
            "Americano", "Ristretto", "Corretto", "Cappuccino", "Cortado",
            "Doppio", "Espresso", "Frappucino", "freddo", "Lungo", "Macchiato",
            "Marocchino", "Affogato"};
        
        // In descending order
        Arrays.sort(coffeeTypes, Collections.reverseOrder());
        
        // In ascending order
        // Arrays.sort(coffeeTypes);

        System.out.println("Sorted String Array");
        for (String coffee : coffeeTypes){
            System.out.println(coffee + " ");
        }
        
        // Let's try parallel sorting
        //int[][] numbersInHundreds = new int[][]{{100,101,102,103},{182882,28861991,618929,8278289,2562781},{615781,2766719,920082}};
        
        int[] largeArray = {5,2,8,1,3,4,5,6,5,22,4,5,67,69,100,9,50,90,91,89};
        
        Arrays.parallelSort(largeArray);
        
        System.out.println(Arrays.toString(largeArray));
        
    }
}
