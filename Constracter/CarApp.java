/* Use of super Keyword

Create a base class named Vehicle with a constructor that prints "Vehicle is created".
Create a subclass Car that uses super() to call the parent constructor and prints "Car is created".
Write a program to create a Car object and observe the order of constructor calls.*/

class Vehicle
{
	 Vehicle()
	 {
		 System.out.println("Vehicle is created");
	 }
}
class Car extends Vehicle
{ 
 Car()
 {
  super();
  System.out.println("Car is Created");
 }
}
public class CarApp
{
  public static void main (String args[])
  {
    Car c1= new Car();
	
  }
}