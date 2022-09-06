package basicjavaprogram;

public class If_Else_Nested_ifStatments {

	public static void main(String[] args) {
		//control flow statement   if only use to get true and false  (if, if else and else if ---is used in this program)

		/*	int marks = 76;
	char grade;
		
		if (marks >=90) {
		   grade = 'A';
		}
	   else if (marks >= 80) {
		   grade = 'B'; 
	   }
	   else if (marks >= 70) {
		   grade = 'C';
		   }
	   else if (marks >= 60) {
           grade = 'D';
	}
	    else {
		   grade = 'F';
	}	
	    System.out.println("grade"   + grade);  */
	
//*******Nested if Statement *****when you have to check multiple conditions where output of the first condition is the input second condition and output of second condition is the input of third condition
		int x = 50;
		
		if (x == 50) {
			System.out.println("x is 50");
		if (x < 75) {
			System.out.println("x is smaller than 75");
		if (x < 57) {
			System.out.println("x is also smaller than 56");
		}	
	    	} 		
		        }
//************Ternary operator *''****** we can do if else in writing single line of code (only use when one condition to print no more than one statement)
		
		    int a = 15;
		    int b = 14;
		    int result;
		    
		    result  =  a < b ? a : b;  //   a < b is condition ?  and a is actual result if a<b which you want to print and else is after : means b
		    System.out.println(result);
		
			
	}
	}          


