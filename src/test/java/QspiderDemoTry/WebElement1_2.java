package QspiderDemoTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Deep");//for NAme
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nav12@gmal.com");//For meail
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("3tf3t");// for pass
	}

}
