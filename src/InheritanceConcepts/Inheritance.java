package InheritanceConcepts;
/*INTERVIEW--> Q1 When i use extend keyword is it relationship or it has a relationship ? ANS-> HAS A RELATIONSHIP
  Q2-One class can extend Multiple classes? ->ANS->NO, one class can only extend one class , child class only extend parent class. it cannot extend both it cannot extend multiple classes that is not allowed in java
  
Why we USE->with help of inheritance reusebility will be more we no need to write same attributes and methods again and again.
INTRO:->Inheritance is class can inherit attributes and methods from another class
The class that inherits the properties is known as the sub-class or the child class. The class from which the properties are inherited is known as the superclass or the parent class
	
Example:->In the example, the Traingle (subclass) inherits the attributes and methods from the Shape class (superclass):
*/
 class Shape{
	    
	    String colour;	  
 }
  class Traingle extends Shape{         //traingle class take properties and methods of shape class with extends keyword
	  	  
 }                                            		
public class Inheritance {
	 public static void main(String[] args) {
		  
			  Traingle Tri = new Traingle();{
				  Tri.colour = "red";
			  }

	 }

}


 // NOTE:->to make blue print of class it is in base class and we take in derived class and to make object we take from class