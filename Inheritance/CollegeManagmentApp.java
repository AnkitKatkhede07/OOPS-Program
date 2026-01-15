/*Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
Class Structure:
Parent Class – Person
Data Members:
 int id, String name, String address, String contactNo
Member Methods:
addDetails() – Accept and store basic person details.
displayDetails() – Display details of a person.
updateAddress() – Update the address of a person.
updateContact() – Update contact number.
showBasicInfo() – Display ID, name, and contact number.
Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


Operations to Perform (Sequentially):
Add student details using addDetails() method.
Enter marks for three subjects using enterMarks().
Calculate and store the student’s percentage using calculatePercentage().
Update the student’s contact number using updateContact().
Display all details of the student using displayDetails().
Add faculty details using addDetails() method.
Assign subject to faculty using assignSubject().
Calculate salary increment for the faculty using calculateIncrement().
Update the faculty’s address using updateAddress().
Display complete faculty information using displayFacultyInfo().
Instructions:
Use constructors in all classes for initialization.
Use the super keyword to call parent constructors in child classes.
Apply method overriding for displayDetails() to show specific outputs for each child class.
Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.
*/
import java.util.*;
class Person
{
  int id;
  String name;
  String address;
  String contactNo;
  Person(int id,String name,String address,String contactNo)
  {
     this.id=id;
     this.name=name;
	 this.address=address;
	 this.contactNo=contactNo;
  }
   void addDetails(int id,String name,String address,String contactNo)
  {
    this.id=id;
	this.name=name;
	this.address=address;
	this.contactNo=contactNo;
   }   //– Accept and store basic person details.
   void  displayDetails() 
  {
     System.out.println("Person id:"+id);
	 System.out.println("Person name:"+name);
	 System.out.println("Person addDetails:"+address);
	 System.out.println("Person contactNo:"+contactNo);
  }//– Display details of a person.
  void updateAddress(String newAddress) 
  {
	  this.address=newAddress;
    //System.out.println("address is:"+address);
  }
 void updateContact(String newcontactNo) 
  {
	   this.contactNo=newcontactNo;
   //System.out.println("contact is:"+contactNo);
  }//– Update contact number.
  void showBasicInfo()
  {
    System.out.println("Id is:"+id);
    System.out.println("name is:"+name);
    System.out.println("contact is:"+contactNo);
  }  //– Display ID, name, and contact number.

  
}
class Student extends Person
{
   String courseName;
   int marks[]=new int[3];
   double percentage;
   Student(int id,String name,String address,String contactNo,String courseName)
   {
     super(id,name,address,contactNo);
	 this.courseName=courseName;
   }
   void enterMarks(int m1,int m2,int m3)
    {
	  marks[0]=m1;
	  marks[1]=m2;
	  marks[2]=m3;
    }//   – Accept marks of three subjects.
   void calculatePercentage()
	{
	   int total = marks[0] + marks[1] + marks[2];
        percentage = total / 3.0;
    }
//	– Calculate and store percentage based on marks.
   void displayStudentDetails() {
        System.out.println("---- Student Details ----");
        super.displayDetails();
        System.out.println("Course: " + courseName);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Percentage: " + percentage);
    }
}
class Faculty extends Person
{
  String subject;
  double salary;
  int experience;
  Faculty(int id,String name,String address,String contactNo,String subject,double salary,int experience)
  {
    super(id,name,address,contactNo);
	this.subject=subject;
	this.salary=salary;
	this.experience=experience;
  }
  void assignSubject(String subject) 
  {
      this.subject=subject;
  }//– Assign subject to faculty.
   void calculateIncrement(double salary)
  {if (experience > 5) {
            salary = salary + (salary * 0.10);
        }
  }   
   //– Increase salary by 10% if experience is greater than 5 years.
  void displayFacultyInfo()
  {
	  System.out.println("---- faculty’s Details ----");
     super.displayDetails();
	System.out.println("Tech subject is:"+subject);
	System.out.println("Tech salary is:"+salary);
	System.out.println("Tech experience is: "+experience);
  
  }//– Display faculty’s subject, salary, and experience.



}
public class CollegeManagmentApp
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Person id");
	int id=sc.nextInt();
	System.out.println("Enter a Person name");
	String name=sc.next();
	System.out.println("Enter a person address:");
	String address=sc.next();
	System.out.println("Enter a Person contact");
	String contact=sc.next();
Person p1=new Person(id,name,address,contact);	
p1.showBasicInfo();
System.out.println("************************");
p1.displayDetails();
System.out.println("Students Info System");
System.out.println("_____________________________");
System.out.println("Enter a new Address:");
String newAddress=sc.next();
System.out.println("Enter a new Contact:");
String newcontactNo=sc.next();
System.out.println(" Enter a courseName :");
String courseName=sc.next();
Student s1=new Student(id,name,newAddress,newcontactNo,courseName);
System.out.println("Enter a new marks:");
s1.updateAddress(newAddress);
s1.enterMarks(50,60,58);
s1.calculatePercentage();
s1.displayStudentDetails();
System.out.println("Faculty Info System");
System.out.println("_____________________________");
System.out.println("Enter faculty Subject name");
String subject=sc.next();
System.out.println("Enter faculty salary is:");
double salary=sc.nextDouble();
System.out.println("Enter faculty of experience");
int experience=sc.nextInt();
Faculty f1=new Faculty(id,name,newAddress,newcontactNo,subject,salary,experience);
f1.assignSubject(subject);
f1.calculateIncrement(salary);
f1.displayFacultyInfo();

	
	
  }
}