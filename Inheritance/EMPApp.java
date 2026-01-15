/*10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.


ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.


Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
import java.util.*;
class Employee
{
   double salary;
   Employee(double salary)
   {
      this.salary=salary;
   }
  double calculateBonus()
  {
     return salary;
  }
  void show()
  {
	 System.out.println("Employee salary"+calculateBonus());
  }
} 
class PermanentEmployee extends Employee
{

   PermanentEmployee(double salary)
   {
    super(salary);
   }
   double calculateBonus()
   {
      return salary*0.25;
   }
}
class ContractEmployee extends Employee
{
   ContractEmployee(double salary)
   { 
   super(salary);
   }
   double calculateBonus()
   {
      return salary*0.10;
   }
}
public class EMPApp
{
 public static void main (String args[])
 {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter salary for Employee");
	double salary=sc.nextInt();
	Employee emp=null;
	emp=new ContractEmployee(salary);
	
	emp.show();
	
	emp=new PermanentEmployee(salary);
	
	emp.show();
 }
}
