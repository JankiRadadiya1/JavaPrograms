package Classes;

public class Bro_Animal_Initialize_objects {

	String colour;
	int age;
	
	
	public static void main(String[] args) {
		Bro_Animal_Initialize_objects romeo = new Bro_Animal_Initialize_objects();
//calling by Method
		 romeo.initializeobject("Fawn" , 9);                     
		 romeo.display();      
//calling by referance varaible
		 System.out.println(romeo.colour="Brown");
		 System.out.println(romeo.age =2);
}	
	public void initializeobject(String c, int  a )	{        //Through Method Initialization
    	colour =c;
		  age = a;                                      //equavelate instance varibale(colour,age)to local variable and calling it
	}
  public void display() {
	  System.out.println(colour +" "+age);
	  
}
	}


