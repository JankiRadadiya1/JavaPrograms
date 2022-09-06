package InterfaceConcepts;
//INTERVIEW->Q->we have to give body to static method and cannot to abstract method
public interface Bronto_Intro_Automobile {
//     **  DEFINATION**
//interface in java is reference type
//interface is pure abstraction
	// **IMPLEMENTATION**
//collection of abstract methods (abstract method don't have body it just declaration )
//A class implents an interface , it inherits all abstract methods of the interface to class
//constant, default methods , static methods , nested types 
	
//NOTE-> default and static methods	- these 2 methods can have a body in interface MAIN METHOD->is also allowed in interface(because it is static)
//NOTE->Any variable of any datatype once declared or intiailized in interface is final in nature(Static)
	
	    int i=10;
       String name= "Janki";
       
	 public void steering();
	 public void horn();
	 public void infotainment();
	 public void cruisecontrol();
	 public void brakes();
	 
//	 public static void sunroof() {
//		 System.out.println("this static method says there is sunroof");
//	 }

//	     public static void main(String[] args)  {
//		 System.out.println("this is the main method inside the interface");
	 }


