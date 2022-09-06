package Variables;
//global variable/instance variable->which defined under class and we can use anywhere in program but to access it we need to create object.
//local variable can call directly inside particular method and it can use inside particular method only
//Satic variable->A variable that is declared as static it cannot be local 
public class LocalVsGlobalVariable {
	//  global variables or  class variable
	            String name="Janki";           
                      int age=15;

	public static void main(String[] args) {
		      int i=17;           //local variable for main method
		      System.out.println(i);
		      
		      LocalVsGlobalVariable obj=new LocalVsGlobalVariable();   // to acess global variable we have to create object 
		      System.out.println(obj.age);
		      System.out.println(obj.name);
	
}
	  public void sum(){
		    int  i=15;            //local variable for sum method
		    int j=20;    
		    System.out.println(j);
		  
		    
	  }
}
