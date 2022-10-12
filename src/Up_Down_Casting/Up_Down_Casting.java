package Up_Down_Casting;
//complusory we have to do first upcasting (parent refvar to child object) (not works child refvar to parent object)then only we can do down casting 
  class SuperClass{
	  public void show() {
		   System.out.println("This is Parent class method");
	  }	  
  }
	class SubClass extends SuperClass{
		public void wow() {
			System.out.println("This is a child class method");
		}
	}	
public class Up_Down_Casting {
	public static void main(String[] args) {             //dynamic polymorphism(run time polymorphism) overriding methods
	       SuperClass s1 = new SubClass();           //create parent refernece variable (s1) and pass child class object as (new SubClass();) ->upcasting
	       s1.show();                                      //we can only able to call parent class methods and variables  and also overridden method which is in both class    
//	       s1.wow();                                        not call a child class method or varaiable but yes if it is overridden in both class same method
	       
	       SubClass s2 = (SubClass)s1;                  //static polymor (compile time polymorphism) method overloading
	        s2.wow();                          //now we can call boths(parent and childs classes) methods and variables now 
	        s2.show();                         
//giving parent object back to child we are doing opposite         
//what if we want to call child class methods? what to do  ->Down casting             
// child class object which we kept in parent class refernce but now give the refernce back to child class
//but we have to let it know we are passing in child  (SubClass)	       
	       
	       
		}
	}