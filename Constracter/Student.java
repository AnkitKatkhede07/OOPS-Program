//Q1. Simple Constructor Initialization

//Question:
//Create a class Student with the following attributes: name (String) and age (int).

//Write a constructor to initialize these attributes.

//Create an object and print the student details.
 public class Student
{
  String name;
  int age;
  //constructor to initialize attributes
  Student(String n,int a)
  {
	   name=n;
	   age=a;
  }
  
   void showStudentdetails()
  {
    System.out.println("String Name:"+name);
	System.out.println("Student Age: " + age);
  }

//public class Student

 public static void main(String args[])
 {
    Student std=new Student("ankit",18);
    std.showStudentdetails();
 }
}

