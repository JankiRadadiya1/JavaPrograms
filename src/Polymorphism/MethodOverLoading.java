package Polymorphism;

public class MethodOverLoading {
/*method overloading->method name is same but datatype is different.(int,double)
	method name is same number of argument is different.(int,int,int)

method overloading;->multiple methods can have the same name with different parameters example :->
int    myMethod (int x)
float  myMethod (float x)
double myMethod (double x, double y)

----------------------------------------------------------------------------------------------		
		      static int plusMethodInt(int x, int y) {
	    	  return x+y; 
	   }
	      static double plusMethodDouble(double x, double y) {
	    	  return x+y;
	    }		
	public static void main(String[] args) {
		   int num1 = plusMethodInt(4+6);
		double num2 = plusMethodDouble(4.5+6.7);
		System.out.println("int :" +num1);
		System.out.println("int :" +num2);   */

//instead of defining two methods that should do the same thing, it is better to overload one.
	static int plusMethod(int x, int y) {
		  return x + y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		}

		public static void main(String[] args) {
		  int myNum1 =  plusMethod(8, 5);
		double myNum2 = plusMethod(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2); //Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
	}
}