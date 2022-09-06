package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {  //i=1 ;1<=5 (true)
			
			for(int j=5; j>=i; j--) { 
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
