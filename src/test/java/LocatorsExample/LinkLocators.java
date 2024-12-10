package LocatorsExample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LinkLocators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	 Thread.sleep(2000);
	 WebElement input = driver.findElement(By.linkText("Link"));
	 input.click();
}
}
