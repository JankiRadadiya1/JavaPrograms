package Polymorphism;
//When a Superclass method is also implemented in the child class it's case of overriding
//Method Overriding-->same method name same input parameters , present in both parent class and child class
//it is handled by JVM
/*Q method Overriding :->
1)Overriding method's return type should be same?
-> no 
2)Access modifoer should be same or different?
->NO,  child class modifier should have higher accessibilty than parent class or should be equal with parent class  
3)Can Private method can be overriden?
->NO, it's scope access within the class
4)static method can be overridden?
->NO(static related to same class) */   

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


