/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conklinjason_5_searchalgorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class Main {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        Random randNum = new Random();
         final int arrLength = 1000;
         boolean looping = true;
         int inputNum;
         String answer;
         int[] array = new int[arrLength];
         boolean found;
         int foundNum = 2000000000;
         
         for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(1000) + 1;
         }
         
         Arrays.sort(array);
                 
         do{
             System.out.print("Please enter the number you wish to look for: ");
             System.out.println("");
            
             found = false;
             inputNum = input.nextInt();
                    
            System.out.println("Linear Search algorithm:");
             System.out.println("");
           
             /////////////////////////////////////
             
             for (int i = 0; i < array.length; i++) {
                 System.out.println( array[i]);
                 if(array[i] == inputNum){
                     foundNum = i;
                     found = true;
                 }
             }
            ///////////////////////////////
             if (found) {
                System.out.println("The number " + inputNum 
                                     + " can be found at " + foundNum);
             } else {
                System.out.println("Sorry, " + " could not be found.");
             }
             
             System.out.println("Binary Search algorithm:");
             System.out.println("");
             
             found = false;
            //////////////////////////////////////////////////
            int startOfSelection = 0; 
            int endOfSelection = array.length;
             for (int i = ((endOfSelection - 1) / 2); i < endOfSelection; i++) {
                 System.out.println("checking index " + i );
                 if(array[i] == inputNum){
                     System.out.println("I found your input number " + inputNum + ", at index" + i);
                     foundNum = i;
                     found = true;
                 }
                 else if(array[i] < inputNum){
                     System.out.println("your number, " + inputNum + " , "
                             + "is greater than " + array[i]
                             + ", the number at index " + i);
                     System.out.println("now searching at index " + (i + ((int) (i / 2))) + " through " + endOfSelection);
                     i = i + ((int) (i / 2));
                 }
                 else if(array[i] > inputNum){
                     System.out.println("your number, " + inputNum + " , "
                             + "is less than " + array[i]
                             + ", the number at index " + i);
                     System.out.println("now searching at index " + ((int) (i / 2)) + " through " + endOfSelection);
                     endOfSelection =  + ((int) (endOfSelection / 2));
                 }
             }
            ////////////////////////////////////////////////////////////////
             if (found) {
                 System.out.println("The number " + inputNum 
                                     + " can be found at " + foundNum);
             } else {
                System.out.println("Sorry, " + " could not be found.");
             }
             
             System.out.println("Would you like to continue?");
             Scanner replay = new Scanner(System.in);
             answer = replay.next();
             System.out.println("");
            
             if(answer.equals("no")) {
                 looping = false;
            }
        }while(looping);
     }
     
    
}
