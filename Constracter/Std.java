/*Write a Java program to demonstrate constructor chaining within the same class using the this() keyword.

Create a class Student with three constructors:

A default constructor that prints “Default Constructor”.

A parameterized constructor with one parameter (name).

Another parameterized constructor with two parameters (name, age).

Use constructor chaining so that calling the last constructor executes all previous ones in the chain.
keep
*/
class Student 
{
  String name ;
  int age;
   Student()
   {
    System.out.println("Default Constructor");
   }
   Student(String name)
   { this();
   this.name=name;
     
	 System.out.println("Parameterized Constructor with one parameter Student Name is:"+name);
   }
   Student(String name,int age)
   {
     this(name);
	 age=age;
	 System.out.println("Parameterized Constructor with Tow parameterStudent age is:"+name+","+age);
   }
}
public class Std
{
  public static void main(String args[])
  {
     Student std=new Student("Sanchit",18);
  }
}