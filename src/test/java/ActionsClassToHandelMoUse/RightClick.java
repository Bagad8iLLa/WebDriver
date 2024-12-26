package ActionsClassToHandelMoUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://cps-check.com/right-button-click-test");
	WebElement button = driver.findElement(By.id("clicker"));
	Actions a = new Actions(driver);
	a.contextClick(button).perform();
	/*for (int i = 0; i<57; i++) {
		a.contextClick(button).perform();
	}*/
	
}
}
