package Encapsulations;

public class StudentGetandSet {	

// class -->class have entity like student is class and student have behaviour and attributes like hand,eye,leg etc behaviour like walking,running etc 
//-same as in class have properties which is attributes and behvoiur which is methods class->properties and methods 
	   //geter and setter methods to get name,age and address of the students 
		
		   String name;
		   int age;    //properties ->attributes
		   String address;
//public->access than same class name than all the properties to create object 		   
    public StudentGetandSet(String name,int age,String address) { //why we need constructor-> class is blueprint of object so we have student class and there is 5000 students so we need to create 5000 new student object for each student and also need to intilaize each student class 5000times to do that we use constructors  
    	  this.name = name;       //-constructor this is a special type of method to initizlies any class object if we want to create multiple object of student class we can reapeatly call constructor  
    	  this.age=age;           //.this-> is to identify that the name,age and add is from contructor not from the class because of same attributes
    	  this.address=address;
   }  	      	
    
           public void setName(String name){        //by using setter and getter we are adding or modifying name,age and add to the student class  
            	this.name = name;
             }                                          
		 	     public void setage(int age){		 	     
		 		     this.age = age;
		 	     }
		 	         public void setaddress(String address){
		 		         this.address = address;
		 	         }
		 	 
           public String getname() {
        	   return name;
           }                                          //for reading method we use getter method reading current name poperties value and return that value
		        public int getage() {
		        	return age;
		        }
		          public String getaddress() {
		        	  return address;
		          }	
		  
//		          public String toString() {
//		        	  return ("Student name is "+ this.name() + ", age is: " +this.age() +" and address is: " + this.address());
//		          }
		        
		    public static void main(String [] args) { 	
		    	StudentGetandSet john = new StudentGetandSet("john", 23,"325 Bogert avenue");//creating object of class and //we gave value same as constructor	    	   
		    	  System.out.println(john.getname());
		          System.out.println(john.getage());
		          System.out.println(john.getaddress());
		    
	}
}

