package Methods;
//methods - independent unit of execution. they have a logic. they can execute this logic under certain condition. 2types->1)userdefined 2)standard library methods 
//SYNTAX of Method->acess-modifier + static(optional) + return type + name of the method + body
//IMP->via objref we can call methods having access modifier as private and protected also(even you can call if they are static in nature- directly or with classname)
//INTERVIEW can you create default method inside a class->NO, Default method only be created in an interface		
public class Intro_Methods_byBronto {
	
	private void Bedroom() {
		System.out.println("This is Private access Modifier");
	}
	protected void acessModi() {
		System.out.println("This is protected access Modifier");
	}
 public int test(){                //no void we want output in integer so write datatype which you want output and return inside body.
	 int i=5; int j=5;
	 int k=i+j;
	 return k;
 }
 public String details() {
	 String str = "Janki";
	 String str1 ="Makani";
	String str3=str+str1;
	return str3;
 }
public static void main(String[] args) {
Intro_Methods_byBronto Objref = new Intro_Methods_byBronto();   //---->object of class name to call all methods 
	       int k = Objref.test();
	       System.out.println(k);
	String str3 = Objref.details();
    	System.out.println(str3);
 System.out.println("***************Calling Private and protected Methods inside Main Method-->Yes we can*******************");
    	Objref.Bedroom();
    	Objref.acessModi();

}  }