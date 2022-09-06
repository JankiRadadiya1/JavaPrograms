package Arrayand1d2d;       //type[]arrayName = new type[size]; ---->int[]marks = new int[3] 
                           // type[]arrayName = {1,2,3,4,5,6}; --->when we know already what is variable and size of our array
public class Array { //An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

	public static void main(String[] args) {

		//one dimensional array - 1d array :-->
		
		                   //declaring an array of integers
		             
		             int[] arr=new int[3];     //Allocates memory of 10 integers		             
		             arr[0] = 6;        //initialize first element
		             arr[1] = 5;        //           second element
		             arr[2] = 56;
		        
		    /*     System.out.println("Element at index 0: "+arr[0]); //we can also do same thing with loop if we have so many index number no print so many times
		           System.out.println("Element at index 1: "+arr[1]); 
		           System.out.println("Element at index 2: "+arr[2]);  
         
		            for(int i= 0; i < 3; i++);{
		            System.out.println(arr[i]);	
		            }
	*/	          
		           System.out.println(arr.length);   //--->finding lenght of array ->which is 3   
		          
		           //finding largest number in this array:->
		             int max = arr[0];
		             for (int i = 0; i < arr.length; i++) {
		            	 if(arr[i]>max) 
		            	 max = arr[i];
					}
		           System.out.println("Max is : " +max);
		          
		       
		           String[] cars = {"Volvo", "BMW", "Ford", "Mazda","maruti"};    //to find length of array:- this is example of String Array
		           System.out.println("the number of cars:->" +cars.length);
		           
		          	           
//	              String[] name = {"Janki", "sus", "nayan", "Mukesh"};
//		           for (int i = 0; i < name.length; i++) {                 //to find how many letters in array:-
//		             System.out.println(name[i]);
		           
		          
		           //two dimensional array:-		           
		            	    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };            //write this way if we know the size and number of array
		            	    for (int i = 0; i < myNumbers.length; ++i) {
		            	      for(int j = 0; j < myNumbers[i].length; ++j) {
		            	        System.out.println(myNumbers[i][j]);
		            	      }
		            	    }
		            	  }        
		                }
 
	


