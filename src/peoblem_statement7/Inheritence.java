package peoblem_statement7;

public class Inheritence {
	 public void methodInheritence()
	   {
	     System.out.println("Base class method");
	   }
}
  class Child extends Inheritence{
	   public void methodChild()
	   {
	     System.out.println("Child class method");
	   }
	   public static void main(String args[]) {
		   Base obj = new  Base();
	     obj.methodInheritence(); //calling super class method
	     obj.methodChild(); //calling local method
	     obj.methodjava();
	  }
}
  class Base extends Child{
	 public void methodjava() {
		 System.out.println("sub-childclass method");
	 }
	 }