package ActionsClassToHandelMoUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://cps-check.com/double-click-test#google_vignette");
	
	WebElement doubleClick = driver.findElement(By.xpath("//button[@id='clicker']"));
	Actions a = new Actions(driver);
	
	for (int i = 0; i< 50; i++) {
		a.doubleClick(doubleClick).perform();
	}
}
}
