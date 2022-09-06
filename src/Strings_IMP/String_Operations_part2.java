package Strings_IMP;

public class String_Operations_part2 {

	public static void main(String[] args) {
//String can be Updated :->
		
    	//1.replace() ,2) replaceFirst() ,3) replaceAll()
		
		   //  replace() :-> if it is reapiting in the words it will change all the same string
		                      String S = "I am learning java";
		                      System.out.println(S.replace("am", "am not"));
		                      
		   //replaceFirst() :->		                      
		                      String S1 = "Can an ankle injury heal";	
		                      System.out.println(S1.replaceFirst("an" , "add")); 
		       
		   //replaceAll() :->
		                         System.out.println(S1.replace("an", "add"));             //replace() method cannot works in regular expression
		                         System.out.println(S1.replaceAll("an(.)", "add"));    //replaceAll() method works in regular exp
		
//String Searching Category :-> IMP :-> Index Starts from 0 and length Starts from 1.
		                         
		 //1.indexof() 2.lastIndexof() 3.contains() 4.charAt() 5.endsWith() 6.startsWith()
		            //1.indexof():-> return int
		                          String S2 = "Selenuim";
		                         System.out.println(S2.indexOf(4)); // -1 not it will only take string and char but (return integer)
		                         System.out.println(S2.indexOf('n'));        //4 count start from first char of string 
		                         System.out.println(S2.indexOf("nui"));   //4 
		           //2.lastIndexof() :-> return int
		                         System.out.println(S2.lastIndexOf('m'));      //7
		                         System.out.println(S2.lastIndexOf("ele"));   //1 
		            
		           //3.charAt() :->return string or char //input integer and return char at particular index
		                         System.out.println(S2.charAt(4));               //n
		                         
		           //4.conatins():->if that character present anywhere in the string return true else false (return boolean value) 
		                     System.out.println(S2.contains("enu"));       //true
		                     System.out.println(S2.contains("ze"));         //false
                  //5.endsWith() :-> check string ends with particular string or char "uim" if yes true else false 
		                      System.out.println(S2.endsWith("uim"));    //true
		                      System.out.println(S2.endsWith("nui"));     //false
		          //6.startsWith() :->
		                       System.out.println(S2.startsWith("S"));      //true
		                       System.out.println(S2.startsWith("el"));     //false
	}

}
