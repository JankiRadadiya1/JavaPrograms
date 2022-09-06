package InheritanceConcepts;

public class ParentCar extends  GrandparentVehicle1 {                                                //parent class

  public void start(){
	  System.out.println("car --->start");
  }
   public void stop(){
	   System.out.println("car----->stop");
   }
   public void refuel(){
	   System.out.println("car------->refuel");
   }
}