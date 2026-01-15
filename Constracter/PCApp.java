//Call the parent class constructor from the child constructor using super().keep

class Parent
{
	Parent()
	{
      System.out.println("Parent constructor");
    }
}
class Child extends Parent
{

  Child()
  {
	  super();
   System.out.println("Child constructor");
  }
}
public class PCApp
{
  public static void main(String []args)
  {
    Child c=new Child(); 
  }
}