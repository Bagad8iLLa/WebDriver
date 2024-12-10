package AssigementSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Registration2 {
public static void main(String[] args) {
	String a ="//a[normalize-space()='Register']";
	String b ="//li[normalize-space()='The specified email already exists']";
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	if(a.equals("//a[normalize-space()='Register']")) {
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		WebElement f_name = driver.findElement(By.xpath("//input[@id='FirstName']"));
		f_name.sendKeys("NAVDEEP");
		
		WebElement l_name = driver.findElement(By.xpath("//input[@id='LastName']"));
		l_name.sendKeys("SINGH");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("deep780@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("deep123");
		
		WebElement c_password= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		c_password.sendKeys("deep123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	}
	else if  (b.equals("//li[normalize-space()='The specified email already exists']")){
		
	}
}
}
