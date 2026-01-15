/*Q1. Single Inheritance

Create a class named Employee having two data members salary and bonus, and a method displaySalary() that prints both values.
Create another class Programmer that inherits from Employee and defines a method displayTotalSalary() to display the total salary (salary + bonus).
Write a main method to create an object of Programmer and display all details.*/

class Employee
{
  double salary=1200;
  double Bouns=200;
   
     void displaySalary() 
   {
     System.out.println("Salary of Employee is:"+salary);
	 System.out.println("Bouns of Employee is:"+Bouns);

   }
}
class Programmer extends Employee
{
    void displayTotalSalary()
   {
     double total=salary+Bouns;
  System.out.println("Salary of Employee is:"+total);

   }
}
public class MainApp
{
 public static void main(String args[])
 {
    Programmer p1 = new Programmer();
	p1.displaySalary();
	p1.displayTotalSalary();
	
 }
}