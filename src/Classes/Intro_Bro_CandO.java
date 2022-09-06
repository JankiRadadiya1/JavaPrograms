package Classes;
//OOPS-->object oriented programming system->(it is a paradigm ->method-tarika)
//CLASS//
//What is a Class ?(book->it is kind of a template/blueprint which behaviour/ state of an object which it support) Ans->class is a logical form.
//class is collection of objects ,  
//represents set of properties that are common to all objects of one type
//Class does not occupy memory
//SYNTAX>accessmodifier(if not mention it by default accmodi)  class    Classname(wht we crete inside class method, var, constructor, objects, blocks, nested class)


//OBJECTS//
//What is an Object?->Ans->it is an instance of a class. they have states/ behaviour.(object is a  physical form it has properties)
//ocuppy memory(heap memory)	
//Object is a collection of all non static stuff inside Class.	
//How to call objects ?->by using dot(.)	operator via object reference
//How to intiallize objects ?->  1.by object variable   2.by method   3.by constructor

//METHODS/FUNCTIONS//
//Methods->set of code which perform particluar task (perform task) (something input give out put)	
//Adv->1)code reusebility
//2.code optimization
//Syntax->AccessModifier(if no access by default)  returntype  methodName(list of parameters){	

public class Intro_Bro_CandO {
	public static void main (String[] args) {
		
		Intro_Bro_CandO  Sarthak = new Intro_Bro_CandO();  //class1(automation)
    		Sarthak.Automation();
    	           TestNG();                            //not Sarthak.TestNG(); because it is a static method 
    	MaualTesting Maninder = new MaualTesting();             //class2 (manual)
    		Maninder.MaualTesting();
	}
	
 public void Automation() {
	 System.out.println("Sarthak teaching us Automation");
     }
 public static void TestNG() {
	 System.out.println("Sathak also teaching us TestNG(static method)");
 }
 }
class MaualTesting{
	
	public void MaualTesting() {
		System.out.println("Maninder teaching us Manual testing");
	}
}
