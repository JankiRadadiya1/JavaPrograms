package StaicandnonStaic;

//Static :->keyword which accessable for all but not like public this properties which is common for the class 

class Student{
	      String name;
        static String School;   //static variable //for all the student school will be the same right so i wrote static so now school name is same for the students  
		

  public static void changeSchool() {  //Static Function-->creating static function to change School-->
	   School = "newSchool";             //every static varaibles school is changed to new school. no need to change every where
 }

}
public class StaticandNonstatcDetails {

	public static void main(String[] args) {
		Student.School ="Vidhya Sabha School";   //no need to create object of class in static method static variables---->we can access with the class name
  //we can directly access by class name because this is of class things not object things so no need too create object to call stactic methods      
	
		
		Student stu = new Student();
		 stu.name = "Janki";
		 System.out.println(stu.School);
		
		
		
	}
}

/*Note:->if in future school name is changed for all student we just have to change in static method no need to change for every students

1)use in properties
2)use in block
3)use in function
4)use in nested class like class inside class there also we can use staic keyword
*/
//for Static things it will give memory for on time and object things will get memory again and again  ---->when we have to use less memory and when we have common declaration than use static