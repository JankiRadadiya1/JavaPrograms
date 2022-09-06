package Encapsulations;


//In class there should be many imp information like password which we don't want to give access to all the files
//4 types of access modifier:->1)public:-> In full class we can access or also we can access by importing packages once anyone create object of that class anyone can access it(NOTE:->Main class should be always public to make it run the program.
//private:-> private can only access in that particular class no where else no packages no subclass or not other packages -->only you can get access by creating this functions->GETTERS AND SETTERS
//protected:->it's own package have full access but if you want it in another package class only subclass have access no else anything have access 
//defalut:-> if we not write any thing it will be default like public is a default 

//	GETTERS:->giving private information back 
//	Setters:->set value to that private	
	
	
	class Account{
		
		public String name;
		protected String email;
		private String Password;
		
	   public String getpassword() {           //getter
		   return this.Password;
	   }
	   public void setPassword(String pass) {  //setter
		  this.Password = pass;
	  }
	   
	public class AccessModifier {
}
		public static void main(String[] args) {
			Account account1 = new Account(); 
			account1.name="Apna colledge";
			account1.email="janki.radadiya@gmail.com";
			account1.setPassword("abcd");      //showing error before so created getter and setter to access private 
            System.out.println(account1.getpassword());			
			
		}			
	}

	
