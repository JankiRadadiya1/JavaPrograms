package Looping;

public class NestedForLoop {

	public static void main(String[] args) {
		
	for (int row = 1; row <= 5; row++) //if this one execute once, then inner loop executes full time
	       //outer for loop body
	       {
	         for (int col = 1; col <= row; col++)
	               System.out.print("* ");
	           
	           System.out.println(); 
	           //outer for loop body
	       }

	}

}
