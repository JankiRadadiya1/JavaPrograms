package Polymorphism;
//When a Superclass method is also implemented in the child class it's case of overriding
//Method Overriding-->same method name same input parameters , present in both parent class and child class
//it is handled by JVM
 class Superclass {
	   
	     public void Animal(String name){
	    	 System.out.println("Base Class/Superclass");
	     }
 }
 
 class Child extends Superclass {
	 
	    public void Animal(String momname) {
		    System.out.println("Child Class");
	 }
 }

public class Overridding {

	public static void main(String[] args) {
		
		Child chi = new Child();{
    	chi.Animal("Lion");		 
		 System.out.println(chi);
		}
		
		
			 
		}
        
	}


