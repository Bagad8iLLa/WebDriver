package AssigementSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RegistrationAuto {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	WebElement f_name = driver.findElement(By.xpath("//input[@id='FirstName']"));
	f_name.sendKeys("NAVDEEP");
	
	WebElement l_name = driver.findElement(By.xpath("//input[@id='LastName']"));
	l_name.sendKeys("SINGH");
	
	Random r = new Random();
	int no = r.nextInt(10);
	String emailId ="deep"+no+"@gamil.com";
	WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
	email.sendKeys(emailId);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	password.sendKeys("deep123");
	
	WebElement c_password= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	c_password.sendKeys("deep123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	WebElement l_email = driver.findElement(By.xpath("//input[@id='Email']"));
	l_email.sendKeys("deep780@gmail.com");
	WebElement l_pass = driver.findElement(By.xpath("//input[@id='Password']"));
	l_pass.sendKeys("deep123");
	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
	
	
	
}
}
