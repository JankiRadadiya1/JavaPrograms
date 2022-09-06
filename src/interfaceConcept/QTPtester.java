package interfaceConcept;
//now for qtp we have to hire person
//implementations are different in both bank & testers
//methods are same 
//qtptester->class
public class QTPtester implements Automationtester {

	public void manualtesting() {	
		System.out.println("qtp tester-->Waterfall");
	}

	public void automationtool() {
		System.out.println("qtp tester-->UFT");
			
	}
	public void decfectmanagment() {
		System.out.println("qtp tester--> QC");
		
	}
	
}

