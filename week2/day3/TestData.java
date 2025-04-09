package week2.day3;

public class TestData {
	
	public void enterCredentials()
	{
		System.out.println("This enterCredentials method from super class");
	
	}
	
	public void navigateToHomePage()
	{
		System.out.println("This navigateToHomePage method from super class");
	}

	public static void main(String[] args) {
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();

	}

}
