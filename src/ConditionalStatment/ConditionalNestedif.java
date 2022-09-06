package ConditionalStatment;
//if->it will allow duplicate condition.
//if condition not matching it will go through all conditions.

public class ConditionalNestedif {
// this is nested if
	public static void main(String[] args) {
            String need="automation";
      if (need.equalsIgnoreCase("automation")||need.equalsIgnoreCase("selenium")){
            System.out.println("contact naresh");
     }else if (need.equalsIgnoreCase("concelling")){
             System.out.println("contact sweta");
	} else if(need.equalsIgnoreCase("manual testing")){
             System.out.println("contact kiran");
    } else {
           	System.out.println("contact sukmar");
}			
  }
 	}
	    


