/*Write a Java program to demonstrate constructor chaining between parent and child classes using the super() keyword.

Create a Person class with a constructor that takes a String name.

Create an Employee class that extends Person and has another constructor taking name and salary.

Call the parent class constructor from the child constructor using super().
keep
*/

class Person
{
  String name;
  double salary;
  Person(String name)
  {
    this.name=name;
    System.out.println("Person Name is:"+name);
  }
}
class Employee extends Person
{
   Employee(String name,double salary)
   {
     super(name);
	 
	 this.salary=salary;
	 System.out.println("Employee salary & name is:"+name+","+salary);
   }
}
public class Parent
{
  public static void main(String args[])
  {
     Employee emp=new Employee("Jay",23);
  }
}