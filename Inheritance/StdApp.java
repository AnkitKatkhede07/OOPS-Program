/*4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
*/
class Student 
{
  String name;
  int marks;
  Student(String name,int marks)
  {
  this.name=name;
  this.marks=marks;
  }
String result() {
        if (marks >= 50)
            return "Pass";
        else
            return "Fail";
    }
void show()
{
  System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result());
        System.out.println("--------------------------------");
}
}
class EngineeringStudent extends Student
{
   EngineeringStudent(String name,int marks)
   {
      super(name,marks);
   }
   @Override
   String result()
   {
	 System.out.println("Engineering Student Result:");
     return (marks>=50)?"pass":"fails";
	 
   }
   
}
class MedicalStudent extends Student
{
  MedicalStudent(String name,int marks)
  {
     super(name,marks);
  }
  @Override
   String result()
   {
	 System.out.println("Medical Student Result:");
     return (marks>=50)?"pass":"fails";
   }
  
}
public class StdApp
{
  public static void main(String args[])
  {
     MedicalStudent m=new MedicalStudent("mayur",65);
	 m.show();
  

	 EngineeringStudent e= new EngineeringStudent("avi",40);
	     
	 e.show();
  }
}