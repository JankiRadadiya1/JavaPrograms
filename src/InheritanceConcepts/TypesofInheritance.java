package InheritanceConcepts;
//with help of inheritance reusebility will be more we no need to write same attributes and methods again and again.
//there are 4 types of inheritance in java:-> NOTE:-multiple inheritance in classes form in java is not there only in c++ we use interface to implement

//1)single inheritance->base class--->derived class
//2)Multilevel inher --> base class ---->derived class ------>derived class
//3)Hierarchial Inheritance -->one Base class and multiple derived class inhertied same base class
//4)Hybrid inher--> when all types of inheritance in one place 

  class Shapes1{
	       public void area(){
	         System.out.println("Display area of shape");
	           }
  class Triangle extends Shapes1{            //syntax-->Single level inheritance:- Derived Class (Shape) extends Base Class Triangle
	       public void area(int l, int h) {
	        	 System.out.println(1/2*l*h);
	         }
 class EquilateralTriangle extends Triangle{
	        public void area(int l, int h) { //multi level inheritance:->Base class(Shape)--> Derived class(Triangle)--> Derived class (Equilateral Traingle)
	        	 System.out.println(1/2*l*h);
	        	 
class Circle extends Shapes1{
	   public void area(int r) {
		   System.out.println(3.14*r*r);   //Hierarchial inheritance baseclass extends to multiple derived class
}
}
	}	 	 
  }   
 }
}

public class TypesofInheritance {

	public static void main(String[] args) {
		

	}

}
