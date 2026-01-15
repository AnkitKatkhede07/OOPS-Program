/*5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.


Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/
import java.util.Scanner;
class Staff
{
  double salary;
  Staff(double salary)
  {
    this.salary=salary;
  }
  
  double incrementSalary()
  {
	 
    return salary; 
  }
  void show()
  {
	   System.out.println("salaries from both data :" +incrementSalary());
	   System.out.println("-----------------------------------------");
  }
  
}
class  TeachingStaff extends  Staff
{
  TeachingStaff(double salary)
  {
     super(salary);
  }
  double incrementSalary()
  {
   System.out.println("TeachingStaff salaries");
     return salary+ (salary * 0.15);
  }
}
class  NonTeachingStaff  extends  Staff
{
  NonTeachingStaff(double salary)
  {
     super(salary);
  }
  double incrementSalary()
  {
     System.out.println("NonTeachingStaff salaries");
     return salary+ (salary * 0.10);
  }
}
public class TechApp
{
  public static void main(String args[])
  {
    NonTeachingStaff n=new NonTeachingStaff(5000);
	n.show();
	TeachingStaff te=new TeachingStaff(10000);
	te.show();
  }
}