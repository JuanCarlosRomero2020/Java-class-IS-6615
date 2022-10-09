package retirementgoal;
import java.util.Scanner;
/**
 * @author Juan Carlos Romero
 * date: 8/8/2022
 * purpose: Week 6 in class assignment - exercise 10
 * a)	RetirementGoal
 * Version 1.0
 */
public class RetirementGoal {

    public static void main(String[] args) {
        Scanner rg = new Scanner(System.in);
   int years, savings;
   do {
      System.out.println("How many years until retirement? ");
          years = rg.nextInt();
      System.out.println("How much money can you save annually? ");
         savings = rg.nextInt();
      } while(savings <= 0 || years <= 0);
    int total = years * savings;
    System.out.println("Amount of money at retirement: $" + total);
    }
    
}
