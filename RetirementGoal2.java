package retirementgoal2;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author Juan Carlos Romero
 * date: 8/8/2022
 * purpose: Week 6 in class assignment - exercise 10
 * b)	RetirementGoal2
 * Version 1.0
 */
public class RetirementGoal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      int years, savings, principal;
   do {
      System.out.println("How much money do you have?");
      System.out.print("$");
         principal = s.nextInt();
      System.out.println("How many years until retirement? ");
         years = s.nextInt();
      System.out.println("How much money can you save annually? ");
         savings = s.nextInt();
      } while(savings <= 0 || years <= 0);
    System.out.println("Amount of money at retirement: $" + getTotal
        (years, savings, principal));
  }
  public static double getTotal(int years, int savings, int principal) {
      double amount = Math.round(principal * Math.pow(1+(0.05/12), 12*years));
      return amount;
    }
    
}
