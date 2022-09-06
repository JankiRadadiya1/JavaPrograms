package Increment_Decrement;

public class Increment_Decrement {

	public static void main(String[] args) {
	//post increment-->
          int i=10;
          int j =i++;             //going left to right j will first go to i so j will be 10 and i++ increase by one j=10, i =11.
          int k=j++ + i++;                                                                            // k=10+11=21 , j=11 , i =12          
  
    //pre increment-->	 
          int l = ++k + ++i + ++j;            //l=22 + 13 + 12 =47 --->                  l=45,  k=22 , j=12, i=13 
          
   //post decrement-->
          int m = l--+k-- - j-- - i--;          //m=47+22-12-13 = 44,-->                   l=46, k=21,  j=11, i=12 
       
   //pre decrement-->
		int n = --m + --l - --k - --j + --i;  //n=43+45 -20 -10 +11 = 69.  m=43,   l=45,   k=20,  j=10,   i=11

          System.out.println(i);	//12  
          System.out.println(j);	//11
          System.out.println(k);   //21
          System.out.println(l);    //45
          System.out.println(m);  //44
          System.out.println(n);  //
	}

}
