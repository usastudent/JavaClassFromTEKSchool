package week8Day2Abstraction;

public class TestCaseA implements TestCasesBasicFunctions, SecondInterface{

	/////// whatever else
	
	String testCaseName;
	
	public TestCaseA() {
		super();
		this.testCaseName = "";
		
	}
	
	public void someMethodOfthisClass() {
		
	}
	
	@Override
	public void printResult() {
		System.out.println("result" + x);
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getTestResult() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String generateTestCaseInfo(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void methodsOfSecondInterface1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodsOfSecondInterface2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodsOfSecondInterface3() {
		// TODO Auto-generated method stub
		
	}

}
