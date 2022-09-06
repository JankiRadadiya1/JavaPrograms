package Strings_IMP;

public class Strings_INTRO {
//Q)Why String so important? ANS->in automation we use so much for object creation.
//NOTE->1) NON-primitive data type. Why->because String size is not fixed)       
  public static void main(String[] args) {

//2)String is sequence of character(String is also called Array of Character)			
    	char array[] = {'s','e','l','e','n','i','u','m',};
	    String S = new String(array);
	    System.out.println(S);

// 3)String is a class which contain so many methods in it
	
//  4)String is also an immutable Object (we cannot change it is immutable)
	 String S0 = new String(array);
	  String S1 = "Selenuim";
	
//5 ) how many ways we can create String ->	 remember->String have three main classes from we can create objects  
	                                                                                              //1)String 2)StringBuffer 3)StringBulider
	  //Example->
	  String S2 = new String();
	  String S3= "JankiMakani";
	  StringBuffer S4 = new StringBuffer();
	  StringBuilder S5 = new StringBuilder();
	  
	
	}

}
