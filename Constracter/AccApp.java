/*Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000


A parameterized constructor to initialize all fields


A method deposit() to add money


A method display() to show details.


Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/
class BankAccount
{
  int accNo;
  String accHolder;
  double balance;

  BankAccount()
  {
   balance=1000;
	System.out.println("default constructor is"+balance);
  }
   BankAccount(int accNo,
  String accHolder,
  double balance)
   {
     this.accNo=accNo;
	 this.accHolder=accHolder;
	 this.balance=balance;
	
   }
    void deposit(double amount)
   {
	   balance+=amount;
	 System.out.println("deposit :"+amount+"is");
	 System.out.println("Account deposit is"+balance);
   }
  
   void showdisplay()
   {
     System.out.println("***This is Account details****");
	 System.out.println("Account Number is:"+accNo);
	 System.out.println("Account Name is :"+accHolder);
	 System.out.println("Account balance is:"+balance); 
   }
}
public class AccApp
{
 public static void main (String args[])
 {
	 //using Pratramzie constructor
   BankAccount BA= new BankAccount();
   BA.accNo=32425;
   BA.accHolder="OM katkhede";
   BA.balance=500;
   BA.showdisplay();
   BA.deposit(2000);
   
   
   // Using default constructor
    BankAccount BA1 = new BankAccount();  
    BA1.accNo = 1234;
    BA1.accHolder = "Jay Patil";
	BA1.balance=500;
    BA1.showdisplay();
    BA1.deposit(3000);
           
 }
}