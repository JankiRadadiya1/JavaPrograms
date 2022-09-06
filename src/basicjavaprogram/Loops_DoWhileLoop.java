package basicjavaprogram;

public class Loops_DoWhileLoop {

	public static void main(String[] args) { // when you are dealing with data structure in java which can store multiple elements like array and string. to access all elements simless passion not individual easily access one by one elements   
//so there are multiple ways which you can iterat for a collection and access all the elements one by one from the collection and you can use in multiple use cases
//eg--we have huge employee salary and want to give bonus to each employee and to add bonus to salary we need to do addition for the all employees it nice to return while loop so it access one by one each salary and keep adding the bonus to salary.
//while :- we can implement an infinite loop using while statement 
//do while:-evaluates its expression at the bottom of the loop instead of the top therefore the statement the do block are always execute once 
//for loop:-
		
		//While:---
/*		int count = 1;                                    //declaring variable
		while (count < 10) {                                    //condition
			System.out.println("count is :"   + count);         //statement
			count++;                                            //condition change statement post increment
		}
*/		
//Do While:-- in do while it first print statement and increment so that's why we are getting output till condition is false
//when you want to write pre processing logic even before checking the very first condition of your loop than in that case you use do while loop otherwise while and for loop is fine.
		
/*		int number = 11;  
		  do {
			System.out.println("number is :" + number);          //statement
			number ++;                                           //condition change statement
		} while (number < 10);                                   //condition 
*/		
		  
 //For Loop:-
		  
		  for(int i=1; i<10; i++)  {
		  System.out.println("count is:"  +  i);
}
  }
     }