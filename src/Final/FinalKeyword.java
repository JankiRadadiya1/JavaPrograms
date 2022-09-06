package Final;

public class FinalKeyword {   //constant->final 

	public static void main(String[] args) {
		// FINAL keyword is used to make fix value to that variable nothing can make change in that value 
		//eg->Pai value is always a fix 3.14 if you try to change it will channge but if you use FINAL keyword it will not change and if you try you will get error
		 final Float PI = 3.14F;
		   //    PI = 1.1F;	     
		//this way we define constant and define variable name with uppercase letter as PI
		 
//---------------------------------------------------------------------------------------------------------------------------------------------------------		 
//Bronto-> final is a keyword - can be used with variable,methods and class
		 
//1.final variable - once a variable is initizlized with final keyword, it cannot changed:->
		final int i=10; // (fixed)
		 System.out.println(i);
	 //complietime error	 i=11; 	 
	}
//2.final method ->we cannot override this method once it final
    final public void Method() {
		System.out.println("Final Method i am trying to overide");
	}

//final class->we cannot extend that class(you cannot make subclass of that class) and all the methods become final automatically  inside final class but not variable.
public final class  Final_Class{
	
}
public class Final_Test extends FinalKeyword  {       // extends Final_Class{ ----> cannot extend the final class 
//	  public void Method() {                                          //extends method from class FinalKeyword error  
//	  System.out.println("Final Method i am trying to overide");
}

}


