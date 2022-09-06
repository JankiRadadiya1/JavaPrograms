package Methods;
// we can overload main method also 
public class Methodoverloading {
//method overloading->When the method name is same with different arguments or input parameters and with different datatype within the same class.
//eg-> in one class we creared three methods with same name but argument and with datatype of this methods are different with 1,2,3 paramters
	
	public static void main(String[] args) {
	
		//creating object to call all non-static methods:->
		 Methodoverloading obj = new Methodoverloading();
		    obj.sum();
		    obj.sum(20);
		    obj.sum(20+30);
		
	}
//cannot create method inside a method
//duplicate methods->ie->same method name with same number of arguments are not allowed
//all sum methods is overloaded
	
     	public void sum(){                     //0 input parameter
		System.out.println("SUM method-->zero input parameter");
		
	}
     	public void sum(int i){               //1 input parameter
     		System.out.println("sum method");
     		System.out.println(i);
     		
     }
     	 public void sum(int a,int b){    //2 input parameter
     	System.out.println("sum method");
     	System.out.println(a+b);
     }
}
