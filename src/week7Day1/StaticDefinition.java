package week7Day1;

public class StaticDefinition {

	public static void main(String[] args) {
		
		StaticConcept kazem = new StaticConcept();
		kazem.eid=4;
		kazem.salary=2000;
		kazem.ceo="hi";
		
		
		StaticConcept maryam = new StaticConcept();
		maryam.eid=3;
		maryam.salary=4000;
		maryam.ceo="booooom";
		
		kazem.show();
		maryam.show();

	
	
	}
}

public class StaticConcept {

	int eid;
	int salary;
	static String ceo;
	
	public void show() {
		System.out.println("eid: "+eid+"salary: "+salary+"ceo: "+ceo);
	}
}

/*
 * if variable is static is not going to heap(object) memory, it is going to be save in loader
 * memory part. and we cannot make object of it.
 */