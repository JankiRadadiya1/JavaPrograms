package Methods;
//non-static methods:->
//functions and methods are same in java.
//main is method and also  we can call function in java. 

public class Functions {
	
public static void main(String[] args) {
//main method is void --> never write return a value	
	
	              Functions obj=new Functions();                       //classname  ,  obj->reference variable , new Functions();->object
	 
// this all 4 are non-static methods cannot run out of main method so we have create object inside main method
 // after creating object ,the copy of all non-static methods given to this object	              

	              obj.test();
	              
	             int l= obj.abc();
	             System.out.println(l);
	                                                                                                     // calling all methods inside main method with help of object reference
	            String s1=  obj.QA();
	            System.out.println("s1");
	              
	            int div =  obj.division(30, 10);
	            System.out.println(div);              		   
}           
           
//void-> does not return any value.
//return type->void
   public void test(){            //no input no output
  System.out.println("test method");	
}

//return type->int & method name->abc        
   public int abc(){               //no input some output
  System.out.println("abc method");	
         int a=20;
         int b=10;
         int c=a+b;
        return c;         		 
}
  
//return type->String
   public String QA(){               //no input some output
	   System.out.println("QA methods");
	   String s = "selenium";
	   return s;
   }
   
//return type->int
//x,y --> input parameters or arguments
   public int division(int x,int y){
	   System.out.println("division method");
	   int d=x/y;      //creting variable d
	   return d;
	   
   }
}
