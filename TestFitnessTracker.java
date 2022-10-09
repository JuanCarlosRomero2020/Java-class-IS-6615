package Testfitnesstracker;
import java.util.Scanner;
/**
 * @author Juan Carlos Romero
 * date: 6/14/2022
 * purpose: chapter 4 assignment exercise 3 part a) use the fitness class
 * Version 1.0
 */
public class TestFitnessTracker {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println( " Enter activity: ");
        String actv = a.nextLine();
        System.out.println( " Enter date 'Month, Day, Year' format ");
        String dat = a.nextLine();
        System.out.println( " Enter time spent in the activity in minutes");
        int min = a.nextInt();
        FitnessTracker.setActivity(actv);
        FitnessTracker.setMinutes(min);
        FitnessTracker.setDate(dat);
        System.out.println("Activity: " + FitnessTracker.getActivity());
        System.out.println("Minutes spent doing the activity: " + FitnessTracker.getMinutes());
        System.out.println("Date: " + FitnessTracker.getDate());       
    }
    
}
