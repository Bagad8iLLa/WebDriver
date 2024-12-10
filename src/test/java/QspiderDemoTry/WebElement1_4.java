package QspiderDemoTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		boolean name = driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).isEnabled();
		System.out.println("Is place holder is present for Name text field "+name);
		
		boolean email = driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).isEnabled();
		System.out.println("Is place holder is present for Email text field "+email);
		
		boolean password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).isEnabled();
		System.out.println("Is place holder is present for Password text field "+password);
	}

}
