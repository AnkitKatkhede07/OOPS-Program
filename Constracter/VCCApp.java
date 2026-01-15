//Write a Java program to demonstrate constructor chaining across multiple levels of inheritance.
 class Vehical
 {
	 Vehical(){
      System.out.println("Vehical constructor");
   }
 }
 class Car extends Vehical
 { Car(){
   System.out.println("Car constructor");
 }
 }
 class ElectriCar extends Car
 {   ElectriCar()
	 {
   System.out.println("ElectriCar constructor");
 }}
 public class VCCApp
 {
   public static void main (String args[])
   {
      ElectriCar ec=new ElectriCar();
   }
 }