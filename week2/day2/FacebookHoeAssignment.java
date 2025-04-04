package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHoeAssignment {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//Clicking create new Button
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Entering the details
		
		driver.findElement(By.name("firstname")).sendKeys("Infa");		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mathew");		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2345123456");		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("infamathew");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select optionDay = new Select (day);
		optionDay.selectByVisibleText("24");
		
		WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select optionMon = new Select (mon);
		optionMon.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearOption = new Select(year);
		yearOption.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//close browser

		driver.close();
	}

}
