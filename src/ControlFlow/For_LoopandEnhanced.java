package ControlFlow;

public class For_LoopandEnhanced {

	public static void main(String[] args) {
		// For loop:-->
		
		  
		  for(int i=1; i<10; i++)  {
		  System.out.println("count is:"  +  i);
	}
		  
		  
// Enhanced for loop:--> when we use enhanced for loop for scenarios whenever we have to iterate over collection of items or array of items
		//when you want to print array in steps use enhanced for loop  
		
		  int[] numbers = {1,2,3,4,5,6,7,8,9,10};  //intiaziling list of array
		  
		  for (int i : numbers)                      //taking value from numbers and i is varaiable to store value of numbers
	     System.out.println("Count is:"  +i);
			  
//nested for loop:- execute the inner loop for every value of the outer loop / whenever you have a scenario where you have to iterate over a collection based on a certain value of another collection than you can use nested for loop or
//when you have to iterate 2d and 3d array   
		  
		  int array[][] = {{2,7,6},{5,4,3},{6,5,3}};
		  
		  for(int i=0; i < 3; i++)
		  {
			  for (int j = 0; j < 3; j++) {
				  
				  System.out.print(array[i][j] +  " ");    // check condition[0][0] than [0][1] , [0][2] , [0][3] ,out of loop again in [1][0] , [1][1], [1][2],.....so on
			}
			  System.out.println("");
		  }
		  
		}  

}
