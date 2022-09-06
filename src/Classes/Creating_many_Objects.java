package Classes;
class pen{      //------>creating class pen which contain blueprint how to make pen like methods and properties 
		  String Colour;   //declaring properties of pen like colour and type of the pen
		  String type;
		
 	    	public void Writting() {            //-->Methods //Function which we write inside class is called method 
			     System.out.println("Writting something");
		}
 		
 	     	    public void printcolour(){    //creating new method inside class and "this" is keyword used to jo bhi object call karege uska colour print karega so this batayega kis object ne call. kiya hai
 			        System.out.println(this.Colour);
 		}
 		
}
		public class Creating_many_Objects {
	
	public static void main(String[] args) {
	  
	           pen pen1 = new pen();   //creating object pen1 of that class pen  and when use new keyoword it create space in memory heap it store object there
	               pen1.Colour = "blue";  //to access properties use . than we can use that in the object
	               pen1.type   = "gel";
	     
//	               pen1.Writting();     //same as calling the writting class through our object pen1
	
	           pen pen2 = new pen();   //creating new pen called as pen2
	               pen2.Colour = "black";
	               pen2.type   = "ballpoint";
	               
	               pen1.printcolour();   //beacause of "this" word it help to know that method which object pen is calling 1 or 2 
	               pen2.printcolour();
	
	}
	

}