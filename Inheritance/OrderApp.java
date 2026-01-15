/*6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.


Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.


Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/
class Order
{
 int orderId;
 double amount;
  Order(int orderId,double amount)
  {
     this.orderId=orderId;
	 this.amount=amount;
  }
  
  double calculate()
  {
   return amount;
  }
  void show()
  {
	  System.out.println("Constmer id is : "+orderId+ " Costmer amount is :"+calculate());
  }
}
class CODOrder extends Order
{
	 CODOrder(int orderId,double amount)
	 {
		  super(orderId,amount);
	 }
  double deliverycharge=50;
 
   double calculate()
   {
     return amount+50;
   }
}
class OnlinePaymentOrder extends Order
{
	OnlinePaymentOrder(int orderId,double amount)
	{
		 super(orderId,amount);
	}
  
    double calculate()
	{
	  double cashback = 0.05 * amount; // 5% cashback
        return amount - cashback;
	}
}
public class OrderApp
{
  public static void main(String args[])
  {
     OnlinePaymentOrder ol = new OnlinePaymentOrder(107,1000);
	 ol.show();
	 CODOrder cl=new CODOrder(101,1000);
	 cl.show();
	 
  }
}
