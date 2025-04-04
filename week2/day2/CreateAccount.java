package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Clicking Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		// Entering details and submit
		driver.findElement(By.id("accountName")).sendKeys("Tester1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("numberEmployees")).sendKeys("50");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Validating the title
		String title = driver.getTitle();
		if (title.contains("Account Details")) {
			System.out.println("Account Succesfully Created");
			
		} else {
			System.out.println("Account Creation Failed");

		}
		//closing browser
		driver.close();
		
		
	}

}
