/*Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05


Child classes:


Car → premium increases by 12% if the car has airbags, otherwise 5%


Bike → premium increases by 8% if bike has ABS, otherwise 3%


Task:


Accept details for 5 vehicles (mix of Car and Bike).


Calculate premium using overridden logic.


Display the vehicle with the highest insurance premium.


Concepts Used
Method overriding


Polymorphism


Logical conditions


Finding maximum from object array
*/
import java.util.*;
class Vehicle
{
   String brand;
   String model;
   double basePrice;
   Vehicle(String brand,String model,double basePrice)
   {
      this.brand=brand;
	  this.model=model;
	  this.basePrice=basePrice;
   }
   double calculatePremium()
   {
     returns basePrice*0.05;
   }
}
class Car exatends Vehicle
{
   String airbags;
   Car(String brand,String model,double basePrice,String airbags)
   {
      super(brand,model,basePrice);
	  this.airbags=airbags;
   }
    double calculatePremium()
{
	  double premium;
   if(airbags)
   {
      premium=basePrice*0.12;
   }
   else{
	   
          premium=basePrice*0.05;
   }
  
  returns premium;
}
}
class Bike exatends Vehicle
{
	  String ABS;
   Bike(String brand,String model,double basePrice,String ABS)
   {
     super(brand,model,basePrice);
	 this.ABS=ABS;
   }
    double calculatePremium()
   {
	   double premium;
   if(ABS)
   {
      premium=basePrice*0.08;
   }
   else{
	   premium=basePrice*0.03;  
   }
  
       returns premium;
   }
   
}
public class main
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  Vehicle []vehicles=new int[5];
	  for(int i=0;i<5;i++)
	  {
		   vehicles[i]=sc.nextInt();
	  
	  System.out.println("Enter Type of Vehicle");//(car=1&bike2)
	  System.out.println("Enter brand name:");
	  String brand= sc.next();
	  System.out.println("Enter a model Number:");
	  String model=sc.next();
	  System.out.println("Enter basePrice is:");
	  double basePrice=sc.nextDouble();
	  if (type == 1) {
                System.out.print("Airbags? (true/false): ");
                boolean airbags = sc.nextBoolean();
                vehicles[i] = new Car(brand, model, base, airbags);

            } else {
                System.out.print("ABS? (true/false): ");
                boolean abs = sc.nextBoolean();
                vehicles[i] = new Bike(brand, model, base, abs);
            }
	  }
   }
}