/*Detailed Description:
1. Class: Vehicle (Superclass)
Data Members:
String model – Vehicle model
String registrationNumber – Registration number of the vehicle
double speed – Vehicle speed in kilometers per hour
double fuelCapacity – Fuel tank capacity in liters
double fuelConsumption – Fuel consumption in kilometers per liter


Member Methods:
Parameterized Constructor


Initializes all data members with the given values.


Getters and Setters


Provide get and set methods for each data member.


fuelNeeded(double distance)


Accepts distance (in kilometers) as an argument.


Calculates and returns the amount of fuel required for that distance.


distanceCovered(double time)


Accepts time (in hours) as an argument.
Calculates and returns the distance covered based on the vehicle’s speed.
display()


Displays all details of the vehicle, including model, registration number, speed, fuel capacity, and fuel consumption.
2. Class: Truck (Subclass of Vehicle)
Additional Data Member:
double cargoWeightLimit – Cargo carrying capacity in kilograms.
Member Methods:
Parameterized Constructor


Initializes all data members, including those inherited from the Vehicle class (using super()), and cargoWeightLimit.


Overridden display() Method


Must call super.display() to display the base class details,
 and then display the cargo weight limit specific to the truck.
3. Class: Bus (Subclass of Vehicle)
Additional Data Member:
int numberOfPassengers – Total number of passengers the bus can carry.


Member Methods:
Parameterized Constructor


Initializes all data members, including those from the superclass (using super()).


Getters and Setters


Provide getter and setter methods for numberOfPassengers.


Overridden display() Method


Must call super.display() to display base class details,
 and then display the number of passengers specific to the bus.
4. Class: Transport (Driver Class)
Description:
 This class must contain the main() method to test inheritance and method overriding.
Steps to Perform in main() Method:
Create an object of Truck and initialize all its data members with valid values using the parameterized constructor.


Create an object of Bus and initialize all its data members with valid values using the parameterized constructor.


For both objects:


Call the fuelNeeded() method by passing a sample distance (e.g., 500 km).


Call the distanceCovered() method by passing a sample time (e.g., 5 hours).


Call the display() method to display all details.
Concepts Demonstrated:
Inheritance (Superclass → Subclasses)


Constructor Chaining using super()


Method Overriding (display() method)


Encapsulation (Private data members with getters/setters)


Polymorphism (Different display() methods for Bus and Truck)

*/
import java.util.*;
class Vehicle
{
 private String model,registrationNumber;
 private double speed;
 private double fuelCapacity,fuelConsumption;
 double distance,time;
  Vehicle(String model,String registrationNumber,double speed,double fuelCapacity, double fuelConsumption)
  {
    this.model=model;
	this.registrationNumber=registrationNumber;
	this.speed=speed;
	this.fuelCapacity=fuelCapacity;
	this.fuelConsumption=fuelConsumption;
  }
  public void setmodel(String model)
  {
   this.model=model;
  }
  public String getmodel()
  {
    return model;
  }
  public void setregistrationNumber(String registrationNumber)
  {
   this.registrationNumber=registrationNumber;
  }
  public String getregistrationNumber()
  {
    return registrationNumber;
  }public void setspeed(double speed)
  {
   this.speed=speed;
  }
  public double getspeed()
  {
    return speed;
  }public void setfuelCapacity(double fuelCapacity)
  {
   this.fuelCapacity=fuelCapacity;
  }
  public double getfuelCapacity()
  {
    return fuelCapacity;
  }public void setfuelConsumption(double fuelConsumption)
  {
   this.fuelConsumption=fuelConsumption;
  }
  public double getfuelConsumption()
  {
    return fuelConsumption;
  }


 double fuelNeeded(double distance) {
	 this.distance=distance;
        return distance / fuelConsumption;
    }

    double distanceCovered(double time) {
		this.time=time;
        return speed * time;
    }

    void show() {
        System.out.println("Fuel needed for " + distance + " km : " + fuelNeeded(distance));
        System.out.println("Distance covered in " + time + " hours : " + distanceCovered(time));
    }
	 
  
 void display()
 {
     System.out.println("Vehicle model name is:"+model);
	 System.out.println("Vehicle registration number is:"+registrationNumber);
	 System.out.println("Vehicle speed is :"+speed);
	 System.out.println("Vehicle fuelCapacity is:"+fuelCapacity);
	 System.out.println("Vehicle fuelConsumption is:"+fuelConsumption+ " km/l"); 
	 
 }
}
 
 ///2 class Start
 class Truck extends Vehicle
 {
 double cargoWeightLimit;
    Truck(String model, String registrationNumber,double speed, double fuelCapacity,double fuelConsumption, double cargoWeightLimit)
	{
	   super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
	   this.cargoWeightLimit=cargoWeightLimit;
	}
	void display()
	{
	   super.display();
	   System.out.println("Truck Cargo limit is"+cargoWeightLimit+ " kg");
	}
 }
 //Bus #3 class
 class Bus extends Vehicle
 {
    private int numberOfPassengers;
	Bus(String model, String registrationNumber,double speed,double fuelCapacity,double fuelConsumption,int numberOfPassengers)
	{
	   super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
	   this.numberOfPassengers=numberOfPassengers;
	}
	public void setnumberOfPassenger(int numberOfPassengers)
	{
	this.numberOfPassengers=numberOfPassengers;
	}
	public int getnumberOfPassengers()
	{
	  return numberOfPassengers;
	}
	void display()
	{
	   super.display();
	   System.out.println("numberOfPassengers in bus:"+numberOfPassengers);
	}
 }
public class Transport
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter vehicle model:");//model num is dja54dbdb
	 String model=sc.next();
	 System.out.println("Enter registrationNumber is:");
	 String registrationNumber=sc.next();
	 System.out.println("Enter speed of vehicle:");
	 double speed=sc.nextDouble();
	 System.out.println("Enter fuelCapacity of vehicle is:");
	 double fuelCapacity=sc.nextDouble();
	 System.out.println("Enter fuelConsumption is :");
	 double fuelConsumption=sc.nextDouble();
	 Vehicle veh=new Vehicle(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
	 veh.fuelNeeded(300);
	 veh.distanceCovered(4);
	 veh.show();
	 System.out.println();
	 veh.display();
	 System.out.println("***********Truck Transport Information**********");
	 System.out.println();
	 System.out.println("Enter cargoWeightLimit is Truck:");
	 double cargoWeightLimit=sc.nextDouble();
	 Truck t=new Truck(model,registrationNumber,speed,fuelCapacity,fuelConsumption,cargoWeightLimit);
	  t.fuelNeeded(70);
	 t.distanceCovered(3);
	 t.show();
	 t.display();
	 
	 System.out.println("***********Bus Transport Information**********");
	 System.out.println();
	 System.out.println("Enter number of Passger in bus:");
	 int numberOfPassengers=sc.nextInt();
	 Bus b=new Bus(model,registrationNumber,speed,fuelCapacity,fuelConsumption,numberOfPassengers);
	 b.fuelNeeded(50);
	 b.distanceCovered(5);
	 System.out.println();
	 b.show();
	 b.display();
	 
	 
	 
   }
}