package Strings_IMP;
//5 types of memory loacation?
	//1.Method area
	//2.Heap area (SCP - Size manipulate kar sakte hai)
	//3.stack area
	//4.pc register
	//5.native MethodArea
public class String_Constant_Pool {

	public static void main(String[] args) {
//Qwhat is string constant pool(String Literal Pool)l?Ans->Memory location jo ki String Objects store karta hai
//Q->SCP/SLP inside that the object created is deleted by Garbage collector? ANS->NO (because JVM internal ref is refering to that object so no)
//Q->String S1 = new String("Java");   v/s   String S2 = "C#";  ANS->2 object created in heap and SCP(heavy so not use) v/s 1 object inside SCP(prefered)

		  String S = new String();    //when we create object with new keyword it store in HEAP memory
		  String S1 = new String("Java"); //1 object is created in heap area, and 1 is SCP/SLP area (Java is literal object)
		
		 String S2 = "C#"; //this is Literal,this object  is directly created inside the SLP/SCP area not in HEAP memory(1 object created)
		
		String S3 = new String("JAVA");  //2 objects created 
		String S4 = new String(".NET");  //2 Objects created
		String S5 = new String("JAVA"); //1 object created inside Heap memory not in SCP/SLP because same literal created before
//when we are creating same literal it will not created object again inside SCP/SLP it will use the one which we already created so it will only created inside HEAP memory not inside SLP/SCP 
	
	    String S6 = "JAVA"; //0 now it is already created in SLP/SCP so no objects will be created already(not JVM now it will  directly refered by S6 inside SCP)
	
	    //   == it will check that both of this reference variable pointing to the same object in memory (but if created in heap memory not matching )
	    //    .equals -> it will compare value of the varaible (literal name)
	    
	    
	}

}
