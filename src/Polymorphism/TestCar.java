package Polymorphism;

import InheritanceConcepts.ChildBMW3;
import InheritanceConcepts.ParentCar;

//polymorphism--> ... An important example of polymorphism is how a parent class refers to a child class object. In fact, any object that satisfies more than one IS-A relationship is polymorphic in nature.
//Polymorphism in Java has two types:-->  1)Compile time polymorphism (static binding)    2) Runtime polymorphism (dynamic binding).
 //                                                                                                   |                                                                                |
 //                                               we can access both parent &childclass methods       only access overriden&common methods of parent class not child class methods
 public class TestCar {

	public static void main(String[] args) {
		
     ChildBMW3 b = new ChildBMW3();                 //static polymorphism and compile time polymorphism--->because it will check  all methods and which java should call at a time of compile.                   
                   b.start();                            //------>it will display child class output first priority to child class ---->overiden method
                   b.stop();
                   b.refuel();
                   b.theftsafety();                 //--->we can only  acess this child class method by using compile time polymorphism 
                   b.engine();                        //---->method of grand parent class
                   
                   System.out.println("************");
                   
    ParentCar c=new ParentCar();                           // it only allow methods of parent class--> Car not of child class
                  c.start();
                  c.stop();
                  c.refuel();
                  
                  System.out.println("*************");
                  
 //top casting---> dynamic polymorphism child class object can be referred by parent class refence variable  eg->small box fits into big box 
  ParentCar c1 = new ChildBMW3();                //child class object can be referred by parent class reference variable is called dynamic polymorphism & runtime polymorphism.
                  c1.start();                      //child class method will display overiden method
                  c1.stop();
                  c1.refuel();
       //c1.theftsafety  --> it can refer the object but it can not take it's properties of child class only overriden and common methods of parent class can be call using dynamic polymorphism
         //BMW will not allow to use theftsafety method to anyone only BMW object referece variable can acess this method.  
    
  //Down casting --> it is possible but it will show warning at a runtime 
           ChildBMW3 b1=(ChildBMW3) new ParentCar();             // classcastexception
   
	
	}
	

}
