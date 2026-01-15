/*Q3. Hierarchical Inheritance

Create a base class named Shape that contains a method displayShapeName().
Create two subclasses:

Circle – contains a method area() to calculate area of a circle

Rectangle – contains a method area() to calculate area of a rectangle

Write a Java program to create objects of Circle and Rectangle classes and display their area.
*/
class Shape
{
  void displayShapeName()
  {
    System.out.println(" this is shap name :(Circle or Rectangle)");
  }
}
class Circle extends Shape
{
   void area()
   {
      double pi=3.14;
	  double radius=5;
	  double area=pi*radius*radius;
	  System.out.println("The Area of Circle is:"+area);
   }
}
class Rectangle extends Shape
{
  void area()
  {
    double length =10;
	double breadth=10;
	double area=length*breadth;
	System.out.println("The Area of Rectangle is:"+area);
  }
}
public class AppCal
{
 public static void main (String []args)
 {
   Circle c1=new Circle();
   c1.displayShapeName();
   c1.area();
   Rectangle r1= new Rectangle();
   r1.displayShapeName();
   r1.area();   
 }
}
