/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingalgorithm;

/**
 *
 * @author user
 */
public class ArrayCars {
    
    public static void main(String[] args){
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        /*
        // A for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        */
        
        // A for-each loop
        for (String car : cars){
            System.out.println(car);
        }
    }
}
