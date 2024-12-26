package ActionsClassToHandelMoUse;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
	 WebElement hold = driver.findElement(By.id("circle"));
	 Actions a = new Actions(driver);
	 a.clickAndHold(hold).perform();
	 
	 //a.release();
	
}
}
