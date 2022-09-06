package Methods;

public class Methods {  //Methods are used to perform certain actions, and they are also known as functions.and we can call that function through help of object of particular class.

//A method is a block of code which only runs when it is called.You can pass data, known as parameters,into a method.Methods are used to perform certain actions, and they are also known as functions.
//Why use methods? To reuse code: define the code once, and use it many times.


			public static void Janki() {       //A method must be declared within a class
		  System.out.println("I passed my Exam"); //myMethod():- is the name of the method static:-means that the method belongs to the Main class and not an object of the Main class.
			                   // void:-> means that this method does not have a return value. 			   
		   }

 //      public static void main(String[] args) {	
 //   	      Janki();
 //           Janki();   //A method can also be called multiple times:
 //           Janki();
 //      }
  
//Method with parameters:-Information can be passed to methods as parameter. Parameters act as variables inside the method.Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

      public static void school(String StudentFName) {
        	   
        	   System.out.println(StudentFName  +" Makani");   
           }
           
  public static void main(String []args) {
    school("Janki"); //When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
    school("Paril");
    school("Keyur");
        	   
           }
           }
