package testfitnesstracker2;
/**
 * @author Juan Carlos Romero
 * date: 6/14/2022
 * purpose: chapter 4 assignment exercise 3 part b) create a second  fitness class
 * Version 1.0
 */
public class FitnessTracker2 {
    private String day;
    private String active;
    private int mins;
    private int cal;

    public FitnessTracker2(String date, String active, int mins, int cal){
        this.day = date;
        this.active = active;
        this.mins = mins;
        this.cal = cal;     
    }

    public void date(String day){
        System.out.println("I did this on " + day + ".");
    }
    public void activity(String active){
        System.out.println("Today I plan on " + active);
    }

    public void minutesSpent(int mins){
        System.out.println("I spent " + mins + " minutes doing so.");
    }

    public void caloriesUsed(int cal){
        System.out.println("I burned " + cal + " calories.");
    }
}
