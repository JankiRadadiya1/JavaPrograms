package ControlFlow;

public class SwitchCaseSatement {

	public static void main(String[] args) {
		// when you have to check multiple conditions and when expressions evaluate to constant value like month is constant value and we can evaluate from month 
		//    in if else expression evaluate boolean value 
		
		int month = 5;	
		String monthString;          //to store name of month 
		

	       switch (month) {        // supplying int value as month 
		case 1:
			monthString = "january";
			break;                        // break is keyword use to break the control of usesage of current block-- when don't want to excute other code it jump out of code from {}
		case 2:
			monthString = "Febuary";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
			
		default:
				monthString = "invaild month";
				break;
		}
	       System.out.println("the month is :- "   +monthString);
		}
		

	}


