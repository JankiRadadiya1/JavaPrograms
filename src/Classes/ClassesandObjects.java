package Classes;

public class ClassesandObjects {                 // class->FRUIT,CAR objects->APPLE, BANANA, MANGO , VOLVO, AUDI, TOYOTA

//So, a class is a template for objects, and an object is an instance of a class.
//When the individual objects are created, they inherit all the variables and methods from the class.

		//Everything in Java is associated with classes and objects, along with its attributes and methods. 
		//For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
        //A Class is like an object constructor, or a "blueprint" for creating objects.   
		
/*	public class Main {               //creating Class as Main
		  int x = 5;

		  public static void main(String[] args) {
		    Main myObj = new Main();                      //creating object of the class Main with new keyword 
		    System.out.println(myObj.x);
		  }
		}*/               		
     
//Multiple Objects:->

        public class Main{                                    //we can’t create objects of an abstract class or an interface.  
        	int x = 10;
        
        
        public void Main (String [] args) {
        	Main myobj1 = new Main();
        	Main myobj2 = new Main();
        	
        	System.out.println(myobj1.x);
        	System.out.println(myobj2.x);
        	}     	
        }   
}
        
