package List;
//dynamic array 
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
//use to remove array, add and fetch array      (link ->child of List Interface)    //directly get access to element using .get methods get index location 
		
//interface-declaration           implementation 	
		 List<Integer> arrayList = new ArrayList<>(5);
		   
		for (int i = 0; i <= 5; i++) {	
		   arrayList.add(i);
		
		}
		 System.out.println(arrayList);  //printing all elements in arrayList
		 
		 arrayList.remove(3);           //remove element at index 3
		 
		 //displaying the arrayList
		 //after deletion
		 
		 System.out.println(arrayList);
		 
		 //printing Elements one by one:->

	      for (int i = 0; i < arrayList.size(); i++) {
	    	  System.out.println(arrayList.get(i)  + " ");
			
		}      
	}
		 	 
	}
	


