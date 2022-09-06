package Looping;

public class For_Each_Loop {
//Enhanced For Loop or Mutated for Loop
//USE->While working with array or collections, we give preference to for each loop instead of for Loop
//Do->this loop iterates Through each element of the Collection/array.
//Syntax->easier ,code becomes more readable and less complicated	
public static void main(String[] args) {
	
	  char vowels[] = {'a','e','i','o','u'};
		
	      for(char item : vowels ) { //item is just name can be anything
    System.out.println(item + " ");
 }
	      
	      int numbers[] = {10,10,20,30,40,50};
	      int sum=0;
	      for(int num :  numbers) {
	    	  sum = sum + num;
	  }
    System.out.println("The total of all nnumbers is :-> " + sum );

}
} 