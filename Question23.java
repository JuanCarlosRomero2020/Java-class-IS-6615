/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question23;

import java.util.Scanner;

/* @author Juan Carlos Romero
 * date: 7/11/2022
 * purpose: Midterm question 22 
/* Version 1.0

*/

public class Question23 
 {
   public static void main(String[] args) {
      int firstNumber;
      int secondNumber;
      int thirdNumber;
      int sum;
      int average;
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter an integer >> ");
      firstNumber = input.nextInt();
      System.out.print("Please enter another integer >> ");
      secondNumber = input.nextInt();
      System.out.print("Please enter another integer >> ");
      thirdNumber = input.nextInt();
      sum = firstNumber + secondNumber+thirdNumber;
      average = sum / 3;
      System.out.println(firstNumber + " + " + secondNumber + "+ " + thirdNumber + " is " + sum);
      
      System.out.println("The average of " + firstNumber + " and " + secondNumber + " and " + +thirdNumber +
      " is " + average);
   }
}
    
    

