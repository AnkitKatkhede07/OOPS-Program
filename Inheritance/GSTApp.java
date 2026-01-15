/*7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.


BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.


Explanation:
 Tests method overriding with percentage-based calculations.
*/
class Ticket
{
 double amount;
   Ticket(double amount)
   {
     this.amount=amount;
   }
   double calculatePrice()
   {
      return amount;
   }
}
class MovieTicket extends Ticket
{
    MovieTicket(double amount)
	{
	  super(amount);
	}
	double calculatePrice()
	{
	   double GST=amount*0.18;
	   return amount+GST;
	}
}
class BusTicket extends Ticket
{
   BusTicket(double amount)
   {
      super(amount);
   }
   double calculatePrice()
	{
	   double GST=amount*0.05;
	   return amount+GST;
	}
}
public class GSTApp
{
  public static void main (String args[])
  {
     BusTicket b=new BusTicket(500);
	 MovieTicket m=new MovieTicket(1000);
	 double finalAmount=m.calculatePrice();
	 finalAmount=b.calculatePrice();
	 System.out.println("amount is:"+finalAmount);
	 System.out.println("amount is:"+finalAmount);
  }
}