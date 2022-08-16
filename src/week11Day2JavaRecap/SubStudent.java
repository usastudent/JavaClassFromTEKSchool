package week11Day2JavaRecap;

public class SubStudent extends Student{

	
	String str;
	
	public SubStudent() {
		super();
		
	}
	
	@Override
	public String getName() {
		return "new version "+ super.getName() ;
	}
}
