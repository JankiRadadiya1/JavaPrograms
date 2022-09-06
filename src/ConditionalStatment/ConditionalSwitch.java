package ConditionalStatment;
//always key->expected result
//using break in switch program.
//switch->it will not allow dublicate condition.
//it will directly jump into condition that will match.
//we cannot able to write same condition two times.

public class ConditionalSwitch {

	public static void main(String[] args) {
	
		String need = "seleuinm";  //expected result
		switch (need) {
		case "automation":
			System.out.println("conatct naresh");
			break;
		case "concelling":
			System.out.println("contact sweta");
			break;
		case "manual testing":
			System.out.println("contact kiran");			
			break;
		default:
			System.out.println("contact sukumar");
			break;
		}

	}

}
