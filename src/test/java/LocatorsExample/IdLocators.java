package LocatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("DEEP");
}
}
