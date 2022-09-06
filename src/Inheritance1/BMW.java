package Inheritance1;

public class BMW extends Car2 {                                     //child class

	//when same method is present in parent class and child class both with the same name and same number of arguments , is called method overriding.
	
	public void start(){                //overiden method   // same start() method in parent class --> car and child class -->bmw 
	 System.out.println("BMW----->start");
	 }
	 public void theftsafety() {
	 System.out.println("BMW-------->theftsafety");
		
	}

}
