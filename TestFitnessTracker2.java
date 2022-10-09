/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testfitnesstracker2;

import java.util.Scanner;

/**
 * @author Juan Carlos Romero
 * date: 6/14/2022
 * purpose: chapter 4 assignment exercise 3 part c) test the second fitness class
 * Version 1.0
 */
public class TestFitnessTracker2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FitnessTracker2 trackerObject = new FitnessTracker2("January 1st", "running", 0, 0);
        Scanner input = new Scanner(System.in);

        String day;
        String active;
        int mins;
        int cal;


        System.out.println("What day are you recording this activity for?");
        day = input.nextLine();

        System.out.println("What fitness exersise did you complete?");
        active = input.nextLine();

        System.out.println("How many minutes did you spend " + active + "?");
        mins = input.nextInt();

        System.out.println("How many calories did you burn?");
        cal = input.nextInt();

        trackerObject.date(day);
        trackerObject.activity(active);
        trackerObject.minutesSpent(mins);
        trackerObject.caloriesUsed(cal);
    }
    
}
