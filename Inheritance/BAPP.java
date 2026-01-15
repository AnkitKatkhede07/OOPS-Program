/* 2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) 
 and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
 
 Interest Rate = (Simple Interest × 100)/(Principal × Time)
*/
import java.util.*;
class BankAccount
{
	double amount;
   BankAccount(double amount)
   {
     this.amount=amount;  
   }
   double calculateInterest()
   {
      return amount;
   }
   void display()
   {
     System.out.println("Interest is:"+ calculateInterest());
   }
}
class SavingsAccount extends BankAccount
{
	SavingsAccount(double amount)
	{
		super(amount);
	}

  double calculateInterest()
  {
     double interest=amount*0.5;
	 return amount+interest;
  }
}
class CurrentAccount extends BankAccount
{
	CurrentAccount(double amount)
	{
		super(amount);
	}
   double calculateInterest()
  {
          double interest=amount*0.2;
		  return amount+interest;
  }
}
public class BAPP
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter amount from User:");
	 double amount=sc.nextDouble();
	 CurrentAccount ca=new CurrentAccount(amount);
	 ca.display();
	 SavingsAccount s=new SavingsAccount(amount);
	 s.display();
	
  }
}