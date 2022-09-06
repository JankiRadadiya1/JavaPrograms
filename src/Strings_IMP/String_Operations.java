package Strings_IMP;

public class String_Operations {
	
	public static void main(String[] args) {
		
           //1. lenght():->To find Lenght of String 
        
                             String S1 = "Automation Learning";             
                            System.out.println(S1.length());            //This will return integer value
		                   //  int val = S1.lenght();                          //if the string value is null when using lenght() it will throw null pointer exception  
		                   
		 //2. isEmpty() :-> To find is string is empty or not
		
		                 String S2 = "";
		                 boolean val1 = S2.isEmpty();                   //This will return Boolean value
		                 System.out.println(S2.isEmpty());
		
	     //3.trim() :->   it will use to trim the Space which is outside of the string 
		                 
		                 String name = "    Janki Makani   ";
		             String returnval = name.trim();                 //This return String 
		                 System.out.println(returnval);           //cut spaces(outer space) at front and end of string not middle of string       
		
	   	//4.trim() and lenght() :-> first we have to use trim() and than use lenght()  (NOTE->cannot use lenght() than trim())
		                 
		                 String S3 = "  WorldCup 2011 is India's       ";
		                 String ref = S3.trim();                                 //return String
		                 int ref1 = S3.length();                                //return integer
		                 System.out.println( ref +   "  / "+ "the lenght of String is :-> " + ref1);
		
		//5.Compare Two Strings using ->equals()  ,  equalsIgnoreCase() ,   compareTo()  , compareToIgnoreCase()
		                 
	     //equals() :-> Return Boolean               
		                 String name1 = "Janki";
		                 String name2 = "Janki";
	                 if(name1.equals(name2)) {
	                	 System.out.println("Both are Matching");
	                 }else {
	                	 System.out.println("Both are not Matching");
	                 }
	  //equalsIgnoreCase() :->Return boolean
	                 String S6 = "LOGIN IS NOT WORKING";
	                 String S7= "login is not working";
	                 System.out.println(S6.equalsIgnoreCase(S7));
	                 
	 //compareTo():->Take unicode value  ( Return integer)
	                 String S8 = "I am learing String in Java";
	                 String S9 ="I am not interested in Strings in Java";
	                 System.out.println( S8.compareTo(S9)); 
	                 
	//compareToIgnoreCase():->return integer 
	                 String S10 = "MARUTI";
		             String S11 = "maruti";
		             System.out.println(S10.compareToIgnoreCase(S11));	
		             
	//How to add/concat() Strings
		             String S12 = "10";
		             String S13 = "Selenuim";
		             String S14 = "24";
		             String S15 = "34";
		             String S16 = "Automation";		             
		             System.out.println(S12+S13+S14+S15+S16);
		             System.out.println(S12.concat(S13).concat(S14).concat(S15).concat(S16)); 
		             
	//How to join String :-> 
		            String S17 = "Maruti";
		            String S18 = "Toyota";
		            String S19 = "Hyndai";
		  System.out.println(String.join("&",S17,S18,S19));
		             
	//subSequence()  ->Return char sequence value
		  String S20 = "Lockdown is boring but essential";
		  System.out.println(S20.subSequence(4, 16));      //start from 4th position end with (16-1)th position
	   //  System.out.println(S20.subSequence(0, 121));      //outofbound exception
		             
	  //substring():->
	      System.out.println(S20.substring(9)); 
	      System.out.println(S20.substring(1, 6)); //Starts with 1 but ends with (6-1)th position
		  	   
	  //split()->    
	      String s = "Rahul Shetty Academy";
	      String[] splittedString = s.split("Shetty");
	      System.out.println(splittedString[0]);
	      System.out.println(splittedString[1]);
	}

}
