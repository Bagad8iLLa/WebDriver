package LocatorsExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartialLinkLocators {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 Thread.sleep(2000);
		 WebElement input = driver.findElement(By.partialLinkText("Web Tab"));
		 input.click();
	}
}