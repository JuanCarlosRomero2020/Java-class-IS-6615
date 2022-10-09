package salespersonsort;
/**
 * @author Juan Carlos Romero
 * date: 8/9/2022
 * purpose: Week 9  - exercise 4 a)Create SalesPerson
 * Version 1.0
 */
public class SalesPerson {
private int ID ;
	private double annualSalesAmount;
	public SalesPerson(int ID, double annualSalesAmount ) {
		this.ID = ID;
		this.annualSalesAmount = annualSalesAmount;
	}
	public void setID(int id) {
		this.ID = id;
	}
	public void setAnnualSalesAmount(double salesAmount) {
		this.annualSalesAmount = salesAmount;
	}
	public int getID() {
		return ID;
	}
	public double getAnnualSalesAmount() {
		return annualSalesAmount;   
}
}