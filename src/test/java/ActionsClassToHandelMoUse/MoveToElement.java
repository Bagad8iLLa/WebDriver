package ActionsClassToHandelMoUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args)  {
WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
	 WebElement hover = driver.findElement(By.xpath("//img[@src=\"/assets/message-hint-J20Zlhln.png\"]"));
	Actions a =new Actions(driver);
	a.moveToElement(hover).perform();
	
	
}
}
