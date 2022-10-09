package week5_evenodd;
import java.util.Scanner;
/**
 * @author Juan Carlos Romero
 * date: 7/26/2022
 * purpose: Week 5 in class assignment - even-odd
 * Version 1.0
 */
public class Week5_EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number;
        System.out.print( " Enter a number >> ");
        number = input.nextInt();
        if (isEven(number))
        {
               System.out.println( number + " is even");
                    
        }
        else 
                {
                            System.out.println( number + " is odd");
                }
    }

    public static boolean isEven(int num) {
        boolean result;
        if (num % 2 == 1)
        { result = false;
        }
        else 
        { result = true;
        }
        return result;
    }
    
}
