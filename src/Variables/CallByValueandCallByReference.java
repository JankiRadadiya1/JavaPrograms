package Variables;
//call by reference is possible in java ans -->yes by using object reference
// In java calling mechanism only call by value works. 
public class CallByValueandCallByReference {
      int p;    //gobal variables
      int q;
	public static void main(String[] args) {
		
		CallByValueandCallByReference obj = new CallByValueandCallByReference();
		int x=10;
		int y=20;
		obj.sum(x, y);       //Call by value and pass by value a=x & y=b 
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		                                
	}
	public int sum(int a,int b){
		 int c=a+b;
		 return c;
	}
	 public void swap(CallByValueandCallByReference  t){          //call by reference
		  int temp;
		 temp=t.p;            //temp=50
	     t.p=t.q;                //t.p=60          swaping value of p and q
	     t.q=temp;          //t.q=50
	 }
}
