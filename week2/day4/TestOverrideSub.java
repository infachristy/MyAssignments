package week2.day4;

public class TestOverrideSub extends TestOverRiding{
	
	public void takeSnap()
	{
		super.takeSnap();
		super.reportStep();
		System.out.println("take snap sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverrideSub subclass = new TestOverrideSub();
		
		subclass.takeSnap();
	}

}
