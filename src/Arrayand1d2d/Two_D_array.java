package Arrayand1d2d;
//row&coloum
public class Two_D_array {

	public static void main(String[] args) {
// Datatype  variablename[] = new datatype[row lenght][coloum lenght]
		
		String userdetails[][]= new String[2][2];
		       userdetails[0][0]="Janki";
		       userdetails[0][1]="Makani";
	           userdetails[1][0]="Janki";
		       userdetails[1][1]="Radadiya";
		       
    System.out.println("Row Lenght :"+userdetails.length);
    System.out.println("Coloum Lenght:" +userdetails.length);
   
   for(int i=0;i<userdetails.length;i++){
   for(int j=0;j<userdetails.length;j++){
	   //make output in two lines remove ln
	   System.out.print(userdetails[i][j]+"  ");
   }
    System.out.println(" ");
   }

   //2-D for integer---------------------------------------------------------------------------------

   int[][] num1 = new int[3][3];

   num1[0][0] = 1;
   num1[0][1]=  2;
   num1[0][2]=  3;
   
   num1[1][0]=  4;
   num1[1][1]=  5;
   num1[1][2]=  6;
   
   num1[2][0]=  7;
   num1[2][1] = 8;
   num1[2][2] = 9;

 System.out.println("********************************************************");  
   System.out.println(num1.length);
   System.out.println(num1[0].length);
   
   for(int i=0; i<num1.length; i++) {
   	
   	for(int j=0; j<num1[i].length; j++) {
   		System.out.print(num1[i][j] +" ");
   	}
   	System.out.println(" ");
   }
   
	}
}
