package this_Keyword;
//WHEN USE->when we had given same name to global variable (instant variable) and Local Variable than the problem occur to identify than we use THIS keyword

//It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters, and always use this keyword to refer it.
public class This_Keyword {
	
	int i;
	String name;              //global variable
	boolean promotion;
	
	public void empdata(int i,String name,boolean promotion) {
		this.i = i;
		this.name = name;                        //THIS ->this keyword is a reference variable -->pointing to Object		                                                               
		this.promotion = promotion;        //THIS.something -> is referring current class instant variable and only THIS->referring object  
	}
	
	public void output() {
		System.out.println("The value of instance variable i is : " +i);
		System.out.println("The value of instance variable name is : " +name);
	    System.out.println("The value of instance variable promotion is : " +promotion);
	}	

	public static void main(String[] args) {	
		This_Keyword output1 = new This_Keyword(); 
		output1.empdata(12, "Janki", true);
		output1.output();
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
