package testapartments;
/**
 * @author Juan Carlos Romero
 * date: 7/18/2022
 * purpose: Ch5 Assignment. Exercise 9 a) create a java class
 * Version 1.0
 */
public class Apartment {
       
    int AptNumber;
    int numBedrooms;
    double numBathrooms;
    int AptRent;

public Apartment(int num, int beds, double baths, int rent)
{

}


public void setAptNumber(int num)// Accessor method for apartment number
{
    AptNumber = num;    
}

public int getAptNumber() // Gets the apartment number
{   
    return AptNumber;
}
public void setnumBedrooms(int beds) // Accessor method for bedrooms
{
    int numBedrooms;
    numBedrooms = beds;
}
public int getnumBedrooms()  // Gets the number of bedrooms
{
    return numBedrooms;
}
    public void setnumBathrooms(double baths) // Gets the number of bathrooms
{
    double numBathrooms;
    numBathrooms = baths;
    }
public double getnumBathrooms()  // Accessor method for bathrooms
{
    return numBathrooms;
}
public void setAptRent(int rent) // Accessor for rent
{
    int AptRent;
    AptRent = rent;
}
public int getAptRent() // Gets the amount of rent
{
    return AptRent;
}
public void display(int num, int beds, double baths, int rent)
{

}
    public double display()
{
    return display();
    
}
}