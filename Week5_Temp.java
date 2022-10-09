package week.pkg5_temp;
import java.util.Scanner;
/**
 * @author Juan Carlos Romero
 * date: 7/26/2022
 * purpose: Week 5 in class assignment - Temp warning
 * Version 1.0
 */
public class Week5_Temp {
    public static void main(String[] args) {
        int high, low, diff;
        final int HIGH_TRESHHOLD = 90;
        final int LOW_TRESHHOLD = 32;
        final int DIFF_TRESHHOLD = 40;
        
        Scanner Keyboard = new Scanner ( System.in);
        System.out.print(" Enter the day's highest temp >>");
        high = Keyboard.nextInt();
        System.out.print(" Enter the day's lowest temp >>");
        low = Keyboard.nextInt();
        if ( high >= HIGH_TRESHHOLD)
        {
            System.out.println(" Heat Warning");
        }
        if (low <= LOW_TRESHHOLD ) 
        {
            System.out.println(" Freeze Warning");
        }
        if ((high - low)>= DIFF_TRESHHOLD )
        {
            System.out.println(" Large temp swing");
        }
    }
    
}
