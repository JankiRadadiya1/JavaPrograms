package ScannerTOINPUT;
import java.util.*;    //----imp to import here when you use scanner
public class Scanner1 {      //with help of scanner we can write in output 
	
	public static void main(String[] args) {
		
		//CLASS SCANNER AND CREATING OBJECT OF CLASS SCANNER
		
/*		     Scanner sc = new Scanner(System.in);
		     int size = sc.nextInt();
             int numbers[]=new int[size];
	    
	          for(int i=0;i<size; i++) {
	        	  System.out.println();
	          }
*/
		  Scanner sc = new Scanner(System.in);  //creatin object of class scanner sc is object now  //system.in is used to write input same as syso for output
		  System.out.println("intput your age:->");  
		  int age = sc.nextInt();               // .nextInt is a function in scanner class there is function we call with help of object
		  System.out.println(age);               
		  
		//String name = sc.next   //to input string value next only take single word for input line use nextLine() take full line inout
	}

}
