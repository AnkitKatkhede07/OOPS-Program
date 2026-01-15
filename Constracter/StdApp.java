/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
*/
import java.util.*;
class Student
{
  int rollNo;
  String name;
  double m1;
  double m2;
  double m3;
  double total=0;
  Student(int rollNo,
  String name,
  double m1,
  double m2,
  double m3)
  {
     this.rollNo=rollNo;
	 this.name=name;
	 this.m1=m1;
	 this.m2=m2;
	 this.m3=m3;
	 //calcualate marks of student
	 total=m1+m2+m3;
  }
  void displayStudentdetails()
  {
     System.out.println("Student rollNo is:"+rollNo);
	 System.out.println("Student name is:"+name);
	 System.out.println("Student m1 is:"+m1);
	 System.out.println("Student m2 is:"+m2);
	 System.out.println("Student m3 is:"+m3);
	 System.out.println("Student total marks is:"+total);
  }
}
public class StdApp
{
  public static void main(String args[])
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter a Student rollNo:");
	  int rollNo=sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter a Student name:");
	  String name=sc.nextLine();
	  System.out.println("Enter a Student m1:");
	  double m1=sc.nextInt();
	  System.out.println("Enter a Student m2:");
	  double m2=sc.nextInt();
	  System.out.println("Enter a Student rollNo:");
	  double m3=sc.nextInt();
	  
     Student std= new Student(rollNo,name,m1,m2,m3);
	 std.displayStudentdetails();
  }
}