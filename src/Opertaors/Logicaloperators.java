package Opertaors;
// || ->or  && ->and(in && both codition should match)  ->logical operators

public class Logicaloperators {

	public static void main(String[] args) {
          
		  String need="fan";
      if (need.equalsIgnoreCase("table")||need.equalsIgnoreCase("fan")) {
   	        System.out.println("contact janki");
      } else {
			System.out.println("contact paril");
			}	
}
}
