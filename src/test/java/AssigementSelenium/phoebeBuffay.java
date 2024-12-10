package AssigementSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class phoebeBuffay {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	WebElement text = driver.findElement(By.className("gLFyf"));
	text.sendKeys("phoebe buffay");
	text.sendKeys(Keys.ENTER);
	driver.findElement(By.className("lNPNe")).click();
	
		
	}

}
