package StaicandnonStaic;
//global variable : the scope of global var will be available across all the functions with some conditions. like if static we can call directly or non static we have create object reference.
public class StaticAndnonstatic {
   
	               String name ="janki";      //non-static global variable
	              static int age=45;                       //static global variable 
	               
	public static void main(String[] args) {
		
//1)---->  how to call static methods and variable:->
             //1). directly calling method :->
                  sum();
           //2). calling by classname:->
                 StaticAndnonstatic.sum();
            //3.variable->
                  System.out.println(age);
          //4.declare variable by class name 
                System.out.println(StaticAndnonstatic.age);
       
 //2----->how to call non satic methods and var:->
           StaticAndnonstatic obj= new StaticAndnonstatic();
                   obj.sendmail();         // calling non-static method
                   System.out.println(obj.name);  //calling  non-satic variable
            
 //can i access static methods by using object reference ->YES you can but not good pratice
                  obj.sum();    //-->warning messages display
	
	
	}
	 public void  sendmail(){                          //non-static method
		 System.out.println("send mail--->");
	 }

	 public static void sum(){                  //static method
		 System.out.println("sum method");  
	 }
}
