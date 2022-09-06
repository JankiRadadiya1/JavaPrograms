package Polymorphism;
//complie time ploymorphism is function overloading  methods inside class have same name of all the methods is called method overloading:-
//1)return type should be different like string, int ,if returntype same no void or if return type is same parameters should be different 
//it is handled by compiler
 class Student{
	  
	       public void printInfo(String name){
	    	  System.out.println(name);	   
	       }
	       public void printInfo(int age) {
	    	  System.out.println(age);
	       }
	       public void printInfo(String name,int age) {
	    	  System.out.println(name+age);
	       }	       
 }
public class Overloading_ComplieTimePloy {
      
	
	public static void main(String[] args) {
		Student s1 = new Student();{
			s1.printInfo("Paril");
			s1.printInfo(21);
			s1.printInfo("Keyur ",31);
			
		}	

	}

}
