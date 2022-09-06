package Strings_IMP;

public class Immutable_String {

	public static void main(String[] args) {
		// Immutable means?-->Something which not changed
//Ans->1) String pool in method area 2.security 3.performance
		//String object are Immutable. Immutability ka jo concept hai wo String objects ke sath relates kiya jaata hai
		
		String S = new String("Selenium");  //2 objects 1in heap area because new keyword ,1 in SCP because of literal 
		S.concat("JAVA");
		System.out.println(S);  //Selenium 

	    S = S.concat("C++");
		System.out.println(S); //SelenuimC++

//if we are changing String object it will create new String object but not make change in exsisting String object
		
//String is immutable concept and importance ?
//ans->useful when in Bulk of referal point but one object is refering than that object will not be changed so String is immutable
	
	}

}
