package interfaceConcept;
//we have to create reference for a class to call methods .not of interface.
//one (automation) object taking multiple forms is  called polymorphism.
//interface-> comman methods define in someplace is interface.
public class Testinginterface {
	

	public static void main(String[] args) {
	//Selenuimtester st =  new Selenuimtester();
		Automationtester at=new Selenuimtester();
		at.manualtesting();
		at.automationtool();
		at.decfectmanagment();
   	//QTPtester qt=new QTPtester();
		at=new QTPtester();
	    at.manualtesting();
	    at.automationtool();
	    at.decfectmanagment();

	}

}
