package Constructors;
//The purpose of constructor is to initialize the object of a class. In other words, constructor provide memory to an object. Without initializing an object we can't 
//use its properties
public class Intro_Bronto {	
	
	String Browser;  //Global Variable
	int SINo;
	
//What is Constructor--> it is Block, it looks like a method but it is not a method.
//Constructor's name is same as Class Name (Modifier we can use-->private, protected and public)
//Constructor ->it has no return type(not even void)
//how to invoke a constructor?-> automatic execution (when you create an object)
//Types -->Parameterized, default Constructor , user-defined Constructor
//USE When initializing an object - Constructor most important use
	
//not inside main method	 inside class:->
	public Intro_Bronto (String Browser, int SINo) {  //------>constructor with class name
		 this.Browser = Browser;
		 this.SINo   =   SINo;
	}

	public static void main(String[] args) {
	
		 Intro_Bronto Objref = new  Intro_Bronto("Chrome", 21);
		 Intro_Bronto Objref1= new  Intro_Bronto ("Firefox",23);        //we can create as many as objects we want to create
                  
		       /*   Objref.Browser = "Chrome";
		             Objref.SINo = 21;        //no need to call global variables again and again with object we passed parameter through constructor
		           System.out.println(Objref.Browser + "   "+ Objref.SINo);   */
		                         	 
	}

}
