/*8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.


CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.


Explanation:
 Tests inheritance with customized formula calculations.
*/
import java.util.*;
class Loan 
{
	 int year;
  double amount;
   
   Loan(int year,double amount)
   {
	   this.year=year;
      this.amount=amount;
   }
   double calculateEMI(double annualRate) {
        double monthlyRate = annualRate / (12 * 100); // Convert to monthly interest
        int months = year * 12;
        double emi = (amount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);
        return emi;
    }
    void show() {
        System.out.println("Base loan — No EMI calculation defined.");
    }
}
class HomeLoan extends Loan
{
   HomeLoan(int year,double amount)
   {
      super(year,amount);
   }
   void show() {
        double emi = calculateEMI(7); // 7% interest rate
        System.out.println("Home Loan EMI: ₹" + String.format("%.2f", emi));
    }
   
}
class CarLoan extends Loan
{
  CarLoan(int year,double amount)
  {
     super(year,amount);
  }
  void show() {
        double emi = calculateEMI(9); // 7% interest rate
        System.out.println("Home Loan EMI: ₹" + String.format("%.2f", emi));
    }
   
}
public class LoanApp
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Year of from User");
	   int year=sc.nextInt();
	 System.out.println("Enter Amount from User");
	 double amount=sc.nextDouble();
	
	 CarLoan cl=new CarLoan(year,amount);
	 cl.show();
	 HomeLoan hl=new HomeLoan(year,amount);
	 hl.show();
  }
}