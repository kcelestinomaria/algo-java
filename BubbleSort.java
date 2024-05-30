/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingalgorithm;

/**
 *
 * @author user
 */
public class BubbleSort {
    /*
    Bubble Sort algorithm is NOT the most efficient algorithm
    for sorting large datasets
    */
    
    public static void bubbleSort(int[] myArray){
        int n = myArray.length;
        
        
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (myArray[j] > myArray[j + 1]){
                    // Swap elements
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int[] myArray = {5, 2, 8, 3, 1, 6, 4};
        bubbleSort(myArray);
        
        System.out.println("Sorted array: ");
        for(int iterator : myArray){
            System.out.println(iterator+"");
        } 
    }
}
