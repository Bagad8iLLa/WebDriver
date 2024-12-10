package QspiderDemoTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Navdeep Singh Siddhu");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("navd234@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("deep123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/section[1]/main[1]/section[1]/article[1]/aside[1]/article[1]/aside[2]/div[1]/div[1]/form[1]/div[3]/section[1]/span[1]/span[1]/*[name()='svg'][1]")).click();
		
		
		
	}
}
