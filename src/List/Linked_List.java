package List;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
//different implementation of list is array list and linkedlist 
//order of element is strickliy maintained where first element refer two second and second element refer to third than you use linklist you cannot directly access element like in arraylist
//travel through all elements to get each element 
		
		
		//.addfirst  //.addlast  ------>methods
		   
		        LinkedList<String> list = new LinkedList<String>();
		        
		              list.add("A");
		              list.add("K");
		              list.addLast("I");
		              list.addFirst("J");
		              list.add(2,"N");
		             
		              
		              System.out.println(list);
		              
		              list.remove("A");
		              list.remove(1);
		              list.removeFirst();
		              list.removeLast();
		              
		              System.out.println(list);
		              
		              
		 

	}

}
