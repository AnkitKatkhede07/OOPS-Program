/*Q2. Constructor Overloading
Question:
Create a class Rectangle with attributes: length and breadth.
Write two constructors:
Initialize both length and breadth.
Initialize only length and assign the same value to breadth (square case).
Write a method to calculate and print the area of the rectangle.
Test your class by creating objects using both constructors.*/
import java.util.*;
public class Rectangle
{
	double length;
	double breadth;
   Rectangle(double len,double bre)
   {
     length=len;
	 breadth=bre;
   }
   Rectangle(double side)
   {
	   length=side;
	   breadth=side;
   }
   void showArea()
   {
	    //double square=breadth*breadth;
     double area=length*breadth;
	 System.out.println("Area Rectangle is:"+area);
   }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter length from User");
	double length=sc.nextDouble();
	System.out.println("Enter breadth from User");
	double breadth=sc.nextDouble();
	
	Rectangle r=new Rectangle(length,breadth);
	r.showArea();
	// Square case
     System.out.print("\nEnter side for square: ");
     double side = sc.nextDouble();

      Rectangle r2 = new Rectangle(side);
      r2.showArea();
  }
}