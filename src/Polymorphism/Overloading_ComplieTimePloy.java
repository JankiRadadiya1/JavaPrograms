package Polymorphism;
//complie time ploymorphism is function overloading  methods inside class have same name of all the methods is called method overloading:-
//1)return type should be different like string, int ,if returntype same no void or if return type is same parameters should be different 
//it is handled by compiler
/*1. Overloaded methods MUST change the argument list
2. Overloaded methods CAN change the return type
3. Overloaded methods CAN change the access modifier
4. Overloaded methods CAN declare new or broader checked exceptions
5. A method can be overloaded in the same class or a subclass
Q-Can overloaded methods be overridden too?
Yes, derived classes still can override the overloaded methods. Polymorphism can still happen.*/
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
