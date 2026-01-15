/*Q2. Multilevel Inheritance

Create three classes named Animal, Mammal, and Dog to demonstrate multilevel inheritance.

Animal should have a method eat()

Mammal should inherit from Animal and have a method walk()

Dog should inherit from Mammal and have a method bark()

Write a program to create a Dog object and call all three methods.*/


class Animal
{
  void eat()
 {
  System.out.println("Animals is Eating");
 }
}
class Mammal extends Animal
{
   void walk()
   {
     System.out.println("Mammal is walk");
   }
}
class Dog extends Mammal
{
   void bark()
   {
     System.out.println("dog is bark...");
   }
}
public class AnimalApp
{
  public static void main(String []args)
  {
     Dog d1=new Dog();
	 d1.eat();
	 d1.walk();
	 d1.bark();
  }
}

