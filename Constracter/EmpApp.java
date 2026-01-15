/*Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
Explanation:
 This helps you understand how constructors can perform initial calculations immediately after object creation.
*/
class Employee
{   String empName;
    int empId;
   double basicSalary;
   double hra=0.10;
   double da=0.15;
   double grossSalary=0.0;
   
  Employee(String empName,int empId,double basicSalary)
  {  this.empName=empName;
	 this.empId=empId;
	 this.basicSalary=basicSalary;
	  // Calculate hra, da, and gross salary
        hra =hra* basicSalary;   // 10% of basic
        da  = da * basicSalary;   // 15% of basic
   grossSalary=basicSalary+hra+da;
  } 
  void calculateSalary()
	 {
		 System.out.println("*************Salary Slip*************");
	 System.out.println("Employee name is:"+empName);
	 System.out.println("Employee empId is:"+empId);
	   System.out.println("Basic Salary    : " + basicSalary);
        System.out.println("HRA (10%)       : " + hra);
        System.out.println("DA (15%)        : " + da);
	 System.out.println("Employee salary is:"+grossSalary);
	 }
  
}
public class EmpApp
{
  public static void main (String args[])
  {
     Employee em = new Employee("jay",10,10000);
	 em.calculateSalary();
  }
}
/*import java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    double basicSalary, hra, da, grossSalary;

    // Parameterized constructor
    Employee(int empId, String empName, double basicSalary)
    {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;

        // Salary calculations
        hra = 0.10 * basicSalary;   // 10% of basic
        da  = 0.15 * basicSalary;   // 15% of basic
        grossSalary = basicSalary + hra + da;
    }

    // Method to display employee details
    void displayDetails()
    {
        System.out.println("\n----------- Salary Slip -----------");
        System.out.println("Employee ID     : " + empId);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Basic Salary    : " + basicSalary);
        System.out.println("HRA (10%)       : " + hra);
        System.out.println("DA (15%)        : " + da);
        System.out.println("Gross Salary    : " + grossSalary);
        System.out.println("-----------------------------------");
    }
}

public class EmpApp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        sc.nextLine(); // clear buffer
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        // Create Employee object using user input
        Employee e = new Employee(id, name, basic);

        // Display salary slip
        e.displayDetails();

        sc.close();
    }
}
*/