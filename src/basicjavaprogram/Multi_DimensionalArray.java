package basicjavaprogram;

public class Multi_DimensionalArray {

	public static void main(String[] args) {
//2d arraytwo dimensional array - [][]-: is use when you do any metrics calculations(stores value in row ad colunm)  two row and two colounm will be 2/2 metrics(x,y axis)

		    int [][] array = {{2, 7 ,9},{3 ,6 ,1},{7 ,4, 2}};   //represent Row and colounm of the table
		    
		    for (int i = 0; i < 3; i++) {
		    	
		    for (int j = 0; j < 3; j++) {
		    	
		    	System.out.print(array[i][j] +  "  ");		
			}
				System.out.println();
			}
		    
		      System.out.println(array[1][2]);  // to print get number in row and colounm  
		
		
  // 3d array :- 3/3 metrics like 3 row and 3 colounm(x,y& z axis) and also we can make as many as dimensional array and also  image data store in 3d array
		
		  int[][][] array1 = {{{1,2,10},{3,4,11}},{{5,6,12},{7,8,10}}};
		  
		  System.out.println(array1[0][1][2]);   //x[] y[] z[]  --Axis
		
		}	    	
}


