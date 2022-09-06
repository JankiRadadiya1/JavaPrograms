package Classes;
//class-> class is a entity where numbers of properties are there number of properties in form of methods and variables.
//Car is a class
//my body is object who represting my body janki is represting my body.
public class Car {
     
    //class variable
	 String model;
	 int wheels;

	public static void main(String[] args) {
		
//class  reference variable  object
//new Car(); --> this is a object of car class.
		
		Car a = new Car();       // creating object of car a,b,c
		Car b = new Car();      // a b c is object reference.
		Car c = new Car();      // new keyword to create the object
		
	// variables given to each objects
	    a.model="BMW";
	    a.wheels=4;
	    
	    b.model="CIVIC";
	    b.wheels=4;
	    
	    c.model="hyndai";
	    c.wheels=4;
	    
	 System.out.println("before assigning the references");
	 System.out.println(a.model);
	 System.out.println(a.wheels);
	 
	 System.out.println(b.model);
	 System.out.println(b.wheels);
	 
	 System.out.println(c.model);
	 System.out.println(c.wheels);
	 
	 System.out.println("after shifting the references");
	   a=b;
	   b=c;
	   c=a;
	   
	 a.model="BMW";
	 System.out.println(a.model);
	 c.model="hyndai";
	 System.out.println(a.model);
	 System.out.println(c.model);
	 
	 
		

	}

}
