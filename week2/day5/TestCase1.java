package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TestCase1 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver(); // Step1 : Launch Browser				
		
		driver.get("https://www.pvrcinemas.com/"); //Step2 : Load the url				
		
		driver.manage().window().maximize();//Maximize the window
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[Contains(text()='Vijaya Mall')]")).click();
		driver.findElement(By.xpath("//span[Contains(text()='Tomorrow')]")).click();
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='Robinhood']")).click();
		driver.findElement(By.xpath("//span[text()='01:20 PM']")).click();
		
		
		
		
		}

}
