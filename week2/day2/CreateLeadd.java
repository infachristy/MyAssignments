package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadd {

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
				
				//Clicking Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				// Entering details and submit
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Automation Tester1");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijay");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
				driver.findElement(By.className("smallSubmit")).click();
				
				//Validating the title
				String title = driver.getTitle();
				if (title.contains("View Lead")) {
					System.out.println("Lead Succesfully Created");
					
				} else {
					System.out.println("Lead Creation Failed");

				}
				//closing browser
				driver.close();
				

	}

}
