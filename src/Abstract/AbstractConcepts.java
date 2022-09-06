package Abstract;
//inhertiance concept to make animals it's blue print is in the base class animal     
//abstract:->means khayal hai just blue print it is not real we can create but not using like animal class

//no need to look for properties because its prorties anyways taken by hourse and chicken so this class is irelavent no need to look in this class animal 
//also we are not making object of animal class we are making hourse object to make another hourse and same also for chicke	
 abstract class Animal{ 
	 
abstract public void walks(); 	              
 }                             //we can also able to create some properties and functions abstarct in this abstract class animal like walk all ani should walk but this walk is not needed so making it abstract	
class Hourse extends Animal{
	  public void walks() {
		 System.out.println("walk on 4 legs");  
  }
}
class Chicken extends Animal{
	  public void walks() {
		System.out.println("walk on 2 legs");	  
   }
}
public class AbstractConcepts {

	public static void main(String[] args) {
	 Hourse hourse = new Hourse(); 
		    hourse.walks();                         
  
//     Animal animal= new Animal();          //we cannot create object of abstract class animal becuase it's just imagination just concept we can't make it actual
//           animal.walks();              //runtime error 
	 }	 
	
	}
	



