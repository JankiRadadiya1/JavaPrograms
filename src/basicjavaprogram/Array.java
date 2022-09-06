package basicjavaprogram;

public class Array {

	public static void main(String[] args) {

		//one dimensional array - 1d array :-->
		
		             int arr[];      //declaring an array of integers
		             
		             arr=new int[3];     //Allocates memory of 10 integers		             
		             arr[0] = 6;        //initialize first element
		             arr[1] = 5;        //          second element
		             arr[2] = 56;
		         
		          
	//	             System.out.println(arr);  
		           System.out.println("Element at index 0: "+arr[0]);
		           System.out.println("Element at index 1: "+arr[1]);
		           System.out.println("Element at index 2: "+arr[2]);
	//	           System.out.println(arr.length);
		           
		           
		           //to find length of array:- this is example of String Array
		       
		           String[] cars = {"Volvo", "BMW", "Ford", "Mazda","maruti"};
		           System.out.println(cars.length);
		           
		           //to find how many letters in array:-
	           
//	              String[] name = {"Janki", "sus", "nayan", "Mukesh"};
//		           for (int i = 0; i < name.length; i++) {
//		             System.out.println(name[i]);
		           
		             //two dimensional array:-		           
		            	    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };
		            	    for (int i = 0; i < myNumbers.length; ++i) {
		            	      for(int j = 0; j < myNumbers[i].length; ++j) {
		            	        System.out.println(myNumbers[i][j]);
		            	      }
		            	    }
		            	  }        
		                }

	


