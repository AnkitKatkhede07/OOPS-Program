//Q4.Create an object of ElectricCar and observe the constructor call order.
class Vehicle
{
  Vehicle()
{
  System.out.println("Vehicle Constructor");
}
}
class Car extends Vehicle
{
  Car()
{
  System.out.println(" Car Constructor");
}
}
class ElectricCar extends Car
{
  ElectricCar()
{
    System.out.println(" ElectricCar Constructor");

}
}
public class CApp
{
  public static void main (String args[])
{
  ElectricCar E1=new ElectricCar();
}
}