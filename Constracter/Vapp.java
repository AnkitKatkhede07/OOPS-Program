//Q2.Create a subclass Car that extends Vehicle and prints "Car Constructor".
class Vehical
{
   Vehical()
{
          System.out.println("Vehicle Constructor");
}
}
class Car extends Vehical
{
   Car()
{
          System.out.println("car Constructor");

}
}
public class Vapp
{
 public static void main (String []args)
{
  //Vehical v1= new Vehical();
Car c1=new Car();
}
}