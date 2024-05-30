/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingalgorithm;

import java.util.Collections;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Task2 {
    
    public static void main(String[] args) {
        
       Integer ten[] = {10,20,20,40,50,60,70,80,90,100};
       int sum = 0;
       
        for (Integer ten1 : ten) {
            sum += ten1;
        }
       
        System.out.println("Sum is: " + sum);
        
        //Arrays.sort(ten, Collections.reverseOrder());
        Arrays.sort(ten, Collections.reverseOrder());

        System.out.println("Elements in descending order: " + Arrays.toString(ten));
        
        ten[9] = 1000;
        
        System.out.println("Array is currently: " + Arrays.toString(ten));
    }
}
/*
--- exec:3.1.0:exec (default-cli) @ sortingalgorithm ---
Sum is: 540
Elements in descending order: [100, 90, 80, 70, 60, 50, 40, 20, 20, 10]
Array is currently: [100, 90, 80, 70, 60, 50, 40, 20, 20, 1000]
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  6.445 s
Finished at: 2024-05-30T20:28:21+03:00
-----------------------------------------------------------------------
*/