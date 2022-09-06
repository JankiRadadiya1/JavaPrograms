package Strings_IMP;

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {

		String S1 = "Automation";
		S1.concat("Hub Sarthak");
		System.out.println(S1);  //This proves that String are immutable (String not change)
		
		StringBuffer S2 = new StringBuffer("Gold");
		S2.append("Diamond");
		System.out.println(S2);    //this proves That StringBuffer us mutable(String can change)
//All the methods in StringBuffer are synchronized 
//Synchronized->there are 2 threads. (these 2 threads cannot execute a synchronized method which require the same lock simultaneously/ concurrently)
//Impact of synchronization - waiting peroid will be more and performance kharab hota hai
		
		StringBuilder S4 = new StringBuilder(); //all methods are non Synchronized
		
		
//	                 	             String                                                    StringBuffer                                                    StringBulider
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------		
//Storage->                 Heap,SCP/SLP	                                      Heap Area                                                         Heap Area

//Objects->                 Immutable                                                  Mutable                                                              Mutable

//MemorySpace->       String eats more                               less than String                                            even less than StringBuffer
	
//Threadsafe ->        not ThreadSafe	                         All methods are synchronized, so                   non-Synchronized, So not thread safe
 //                                                                                           they are Thread Safe
//performance  ->  Slow than StringBuffer	              Faster than string slow than StringBulider                                Fastest
	
//Usage-> if data is frequently change and u                     recommended                                                          recommended
//have challenges in excution speed then strings
//should not be the first priority	
	}

}
