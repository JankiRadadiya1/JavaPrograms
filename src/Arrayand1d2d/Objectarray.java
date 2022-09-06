package Arrayand1d2d;

//object class is the super class of all the classes in java 
//all datatype can be used in object array
public class Objectarray {

	public static void main(String[] args) {
		
		   Object details[][] = new Object[3][4]; 
	        
	        details[0][0] = "Java";
	        details[0][1] = 26;
	        details[0][2] = true;
	        details[0][3] = 1;
	 
	
	        details[1][0] = "Phyton";
	        details[1][1] = 24;
	        details[1][2] = false;
	        details[1][3] = 2;
	        
	        details[2][0] = "C#";
	        details[2][1] = 22;
	        details[2][2] = 6.88;
	        details[2][3] = 3;
	        
	        System.out.println("The size of row is:->" + details.length);
	        System.out.println("The size of Columns is :->" +details[0].length);
	
	        for(int i=0; i<details.length; i++) {
	        	for(int j=0; j<details[i].length; j++) {
	        	System.out.println("  "+details[i][j]);
	        	}
	        	System.out.println("  ");
	        }
	
	}
	
	

}
