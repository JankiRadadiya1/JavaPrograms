package InterfaceConcepts;

public interface Usbank {
	
       int minbal = 100; 
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	 
}

//only method declaration.
//no method body
//in interface ,we can only declare the variables  , variable are by default static in nature.
//no static methods in interface
//no main method in inerface
//we can not create object of interface
//interface is abstart in nature