package Arrayand1d2d;
//bookish->arrays can store multiple value in one single varaible. 
public class Intro_Array {
//IMP:->new keyword in java is used to create an object
//all the objects created in java are stored in Heap Memory
//Array is an object in java
//what is the super class of array?? -->Object class
//array are always created at Runtime.
	public static void main(String[] args) {
		//types of array-->single dimensional array and multi-dimensional(arrys of arrys)(2-d,3-d)
		
         //Arrays are known as collection of homogeneous data types
		//Advantages-->1)Multiple value can be stored.
		//2)it is faster compared to typical primitive data types
		//3)we can directly store objects in array
		
		//Disadvantages:->1)array size is fixed. cannot increase/decrease size of array at runtime
		//2)higher size of array and not use it. wastage of memory is a concern 
		//array does not have add and remove methods
		
		 int[] student = new int[1000];  //this is array
		
//4 prinicple of array:->
  //declaration:->
		 
		  int[] a; //---this is most preffered 'a' is one dimensional integer array
		  int b[];
		  int []c;
		  int []d; 
		 
		 String[] name;//-->name is one dimensional string arrray
	
		 //IMP-->never ever give size of array during declaration	 	 
		 
  //creation:->
		 int[] a1 = new int[5];
		 System.out.println("the size of array :->" +a1.length);
		 
		 int[] a2 = new int[0];
		 System.out.println("the size of array is:->" +a2.length); //0
		 
//		 int[] a3 = new int[-2];
//		 System.out.println("the size of array is:->" +a3.length);  //IMP->exception->NegativeArraySizeException	 
		 
//initialization:->
		 
	/*	 int[] a4 = new int[3];
		 a4[0]=10;
		 a4[1]=20;
		 a4[2]=30;		 
  	     a4[3]=40; Exception-->Array index OutOfBoundException   */
 
		 int[] a5 = {10,20,30};
		 int[] a6 = new int[] {10,20,30}; //dec,cre,inti
		
		
//retrieval:->	
		
		  int[] a7 = {100,200,300,400,500,600,700};
	//print all the values of array:->
		  
		  for(int i=0; i<a7.length; i++) {
			  System.out.println("the value of array are :" +a7[i]);
		  }
		
	}

}
