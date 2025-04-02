package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ChromeDriver driver =new ChromeDriver(); // Launch Browser				
				
				driver.get("http://leaftaps.com/opentaps"); //Load the url				
				
				driver.manage().window().maximize();//Maximize the window				

				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");				//Enter the username				
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter the password				
				
				driver.findElement(By.className("decorativeSubmit")).click();//Click on the Login button				
				
				driver.findElement(By.linkText("CRM/SFA")).click();//Click on the CRMSFA link				
				
				driver.findElement(By.linkText("Leads")).click();//Click on the Leads links				
				
				WebElement findElement = driver.findElement(By.linkText("Create Lead"));//Click on Create Lead link
				findElement.click();				
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");//To enter the companyName				
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Infa");//To enter the firstname				
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Christy");//To enter the lastname				
				
				//To handle the Dropdown				
				WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));			
				Select option=new Select(sourceElement);		
				option.selectByValue("LEAD_DIRECTMAIL");
				
				WebElement sourceElement1 = driver.findElement(By.id("createLeadForm_industryEnumId"));			
				Select option1=new Select(sourceElement1);		
				option1.selectByValue("IND_FINANCE");

	}

}
