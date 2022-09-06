package Super_Keyword;
//Super Keyword:->super keyword is also reference  -> refers to parent class Object 
//DEF:->super refers to parent class instance variable.
//defination->The super keyword in Java is also reference variable which is used to refer parent class object.
/*Usage of Java super Keyword:->
1)super can be used to refer parent class instance variable.         (if both parent and child class have same variable)
2)super can be used to invoke immediate parent class method.   (if both parent and child class have same method)
3)super() can be used to invoke immediate parent class constructor. 
*Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
*/
public class Super_Keyword_Child extends parent {
	
		int i=20;
	
	public void check(int i) {
		System.out.println(i);
		System.out.println(this.i);          
		System.out.println(super.i);      //this will refer to instance variable of parent class which is i =40;
	}
	
	public static void main(String[] args) {
		Super_Keyword_Child Objref = new Super_Keyword_Child();
		Objref.check(30);
        
	}

}
