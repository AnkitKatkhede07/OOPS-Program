/*5. Method Overriding

Create two classes: Parent and Child.

The Parent class should have a method show() that prints "This is parent class".

The Child class should override the same method to print "This is child class".

In the main method, create objects of both classes and call the show() method using each object to demonstrate method overriding.*/

class Parent
{
  void show()
  {
    System.out.println("This is parent class");
  }
}
class Child extends Parent
{
  void show()
  {
    super.show();
    System.out.println("This is child class");
  }
}
public class Overriding
{
  public static void main(String args[])
  {
    Parent p1= new Parent();
	p1.show();
	Child c1=new Child();
	c1.show();
	
  }
}