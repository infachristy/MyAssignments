package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("crisby.ia@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Gerss123");
		driver.findElement(By.id("loginbutton")).click();
	}

}
