package LocatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkIt {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://blinkit.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement button = driver.findElement(By.xpath("//button[text()='Detect my location']"));
	button.click();
	Thread.sleep(5000);
	WebElement search = driver.findElement(By.xpath("//div[contains(@class,'SearchBar__AnimationW')]"));
	search.click();
	Thread.sleep(5000);
	WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more"));
	Thread.sleep(2000);
	search2.sendKeys("vegetables");
	
	// zomato search roti click on suggestion 1 sardar g malai chaap  click on reviews  click on follw enter thhe signup option  for crate acc and create the new acc
}
}








