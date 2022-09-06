package InterfaceConcepts;
// interface is pure abstraction ,abstraction is not pure it will also show useless things like use less methods or functions 

//interface is like a class but it has some fix properties
interface Animal{
	
/*public*/ void walk();     //abstract methods only (no need to write public because in interface it by defalut public and abstract)
//	public void eat()       //we cannot create non abstract function inside interface	
//	Animal(){              //------->it not allow to make constructor we cannot create constructor of class interface
}	

interface herbivore{
     

}
  class Horse implements Animal,herbivore{           //implement -->used interface animal in the horse class
	  public void walk() {                 //need to write public for to make access modifier public
		  System.out.println("walks on 4 legs");
	  }
  }
		

public class Interfacedetails {

	public static void main(String[] args) {	  
		Horse horse = new Horse();
		      horse.walk();
	}

}

//concept of multilevel inheritance is possible in the interface like herbivore is created and boths interface properties(animal,herbivore) is taken by horse class


/*
Details:->
    1)all the varaiable and fields in interfaces are public , static and final by default.
    2)all methods are public & abstract by default
    3)A class that implements an interface must implement all the methods declared in the interface
    4)interface supports the functionality of multiple inheritance
*/