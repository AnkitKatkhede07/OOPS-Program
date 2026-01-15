/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.


Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.*/
 import java.util.*;
 
 class Employee{
 String name;
 double salary;
 
   Employee(String name,double salary)
   {
     this.name=name;
	 this.salary=salary;
   }
  
    double getsalary()
	{
		   return salary;	   
	}
	void display()
	{
		System.out.println("Employee Name: " + name);
	   System.out.println("Total salary is"+ getsalary());
	}
 }
 class Manager extends Employee{
	 
	 Manager(String name,double salary)
	   {
		   super(name,salary);
	   }
     	 double getsalary()
		 {
			double bouns=salary*0.20;
			 return salary+bouns;
         }
		
 }
 class Developer extends Employee{
 
    Developer(String name,double salary)
	{
		  super(name,salary);
	}
	 double getsalary()
	 {
		   double bouns=salary*0.10;
		   return salary+bouns;
	 }
 
 }
 public class ESAPP
 {
   public static void main (String args[])
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a Employee Name");
	  String name=sc.nextLine();
	  System.out.println("Enter a Employee Salary");
	  double salary=sc.nextDouble();
	 Developer d=new Developer(name,salary);
	 d.display();
	 Manager m=new Manager(name,salary);
     m.display();	 
	
	 
   }
 }
 