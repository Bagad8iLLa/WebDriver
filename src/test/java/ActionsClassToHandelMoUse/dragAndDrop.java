package ActionsClassToHandelMoUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
	WebElement dragM = driver.findElement(By.xpath("//*[@id=\"dragElement2\"]"));
	WebElement dragM1 = driver.findElement(By.xpath("//*[@id=\"dragElement4\"]"));
	WebElement dragL = driver.findElement(By.xpath("//*[@id=\"dragElement1\"]"));
	WebElement dragL1 = driver.findElement(By.xpath("//*[@id=\"dragElement3\"]"));
	WebElement dropL = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]"));
	WebElement dropm = driver.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/div/div/section[2]/div[1]"));
	Actions a = new Actions(driver);
	a.dragAndDrop(dragL, dropL).perform();
	a.dragAndDrop(dragL1, dropL).perform();
	a.dragAndDrop(dragM1, dropm).perform();
	a.dragAndDrop(dragM, dropm).perform();
	
	
}
}
