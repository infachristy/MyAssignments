package week2.day3;

public class LoginTestData extends TestData {
	
	public void enterUsername()
	{
		System.out.println("This is enterUsername from subclass");
	}
	
	public void enterPassword()
	{
		System.out.println("This is enterPassword from subclass");
	}

	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterPassword();
		ltd.enterUsername();
		ltd.navigateToHomePage();
	}

}
