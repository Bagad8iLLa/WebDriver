package QspiderDemoTry;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_5 {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		int no = r.nextInt(10000);
		String emailId = "navdeep"+no+"@gamil.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Navdeep Singh Siddhu");
		String NameValue = name.getAttribute("value");
		System.out.println("The value enter is "+NameValue);
		//OR
		//System.out.println("The value enter is "+name.getAttribute("value"));

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(emailId);
		String EmailValue = email.getAttribute("value");
		System.out.println("The value enter is "+EmailValue);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("deep123");
		String PasswordValue = password.getAttribute("value");
		System.out.println("The value enter is "+PasswordValue);
		
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();

	}
}
