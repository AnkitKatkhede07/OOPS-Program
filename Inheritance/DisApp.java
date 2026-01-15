/*3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
*/
import java.util.*;
class Product
{
int id;
String name;
double price;
Product(int id,String name,double price)
{
  this.id=id;
  this.name=name;
  this.price=price;
  }
 
 double calculate()
 {
    return price;
 }
 void show()
 {
	 System.out.println("costmer id is:"+id);
	 System.out.println("Costmer name is:"+name);
  System.out.println("Final price is:"+ calculate());
  System.out.println("--------------------------------");
 }
 }
class Electronics extends Product
  {
   Electronics(int id,String name,double price)
   {
     super(id,name,price);
   }
   double calculate()
   {
     double discount=price*0.10;
	 double finalPrice = price - discount;
     price=finalPrice;	 
	 return price;
   }
   
  }
 class Clothing extends Product
  {
   Clothing (int id,String name,double price)
   {
     super(id,name,price);
   }
   double calculate()
   {
     double discount=price*0.20;
	 double finalPrice = price - discount;
	 price=finalPrice;
	 return price;
   }
   
  }
  public class DisApp
  {
    public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter price from user:");
	   double price=sc.nextInt();
	   Clothing cl=new Clothing(12,"Mayur",price);
	   cl.show();
	   Electronics el=new Electronics(10,"Gaurav",price);
	   el.show();
	}
  }
   