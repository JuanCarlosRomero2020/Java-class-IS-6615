package testjobapplicants;
/**
 * @author Juan Carlos Romero
 * date: 7/18/2022
 * purpose: Ch5 Assignment. Exercise 7 b) testing the class 
 * Version 1.0
 */
public class TestJobApplicants {

    public static void main(String[] args) {
        
    int qualCounter=0;
    JobApplicant applicant = new JobApplicant("ABC", 98125123, true, true, true, false);
    if(applicant.getWord() == true)
    qualCounter++;
    if(applicant.getSpreadSheet() == true)
    qualCounter++;
    if(applicant.getDatabase() == true)
    qualCounter++;
    if(applicant.getGraphics() == true)
    qualCounter++;
    if(qualCounter>=3)
System.out.println("Qualified Applicant");
else
System.out.println("Applicant is not qualified ");
    }
    
}
