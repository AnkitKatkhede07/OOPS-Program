/*Q1. Simple Constructor Initialization Question: 
Create a class Student with the following attributes: name (String) and age (int).
Write a constructor to initialize these attributes. 
Create an object and print the student details.*/
import java.util.*;
public class Student1
{
String name;
int age;
  Student1(String n,int a)
  {
   name=n;
	age=a;
  }
   void showStudent()
   {
    System.out.println("Student name is:"+name);
	System.out.println("Student name is:"+age);

   }
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Student name");
	 String name=sc.nextLine();
	 System.out.println("Enter a Student name");
	 int  age=sc.nextInt();
	 Student1 s1=new Student1(name,age);
	 s1.showStudent();
  }
}