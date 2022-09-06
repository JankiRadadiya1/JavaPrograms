package Constructors; //3 ways to create objects or constructor 1)nonparameter:- Student1() 2)parameterized:-Student1(String name ,int age) and 3)copy constructor we created s2 for the copy constructor

class Student1{ 
	 //properties of students
	   String name;
	   int age;
	   int studentId;
	 //now methods of student as function like studing,walking etc
	   
	       public void printname() {
                System.out.println("the name of student is " +this.name);	    	   
	       }
	        public void age() {
	        	System.out.println("The age of student is " +this.age);
	        }	  
	        public void studentId() {
	        	System.out.println("The student Id is " +this.studentId);
	        }
	        
	 //creating 3)copy constructor doing copy one object and sending in another object like created s2 from stu 	  
	        Student1(Student1 s2) {            //2)parameterized constructor:-Student1(String name,int age)   //creating constructor and no return type for constructor 
	        	this.name= s2.name; 
	        	this.age=  s2.age;
	        }               	      
			Student1() {	//just declaring constructor 			
			} 	  
}
public class ConstructorsofStudentClass {

	public static void main(String[] args) {
		Student1 stu = new Student1(); //Student1() is a special function which called constructor-and construct work is to construct objects-
	             stu.name="Janki";
	             stu.age = 12;  //declaring value to properties
	             stu.studentId=5;  
	             
//created one more student s2 and assigning s1 properties to s2 we didn't declared its own properties             
        Student1 s2 = new Student1(stu);   
                 	       
                stu.printname();
	            s2.age();                 //calling methods
	            s2.studentId();

}
	}  




