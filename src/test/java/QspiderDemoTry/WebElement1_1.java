package QspiderDemoTry;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_1 {
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

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(emailId);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("deep123");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();


	}
}
