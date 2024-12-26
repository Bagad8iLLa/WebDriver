package DropDownSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
	WebElement LaptopDrag = driver.findElement(By.xpath("//div[normalize-space()='Laptop Cover']"));
	WebElement drop1 = driver.findElement(By.xpath("//section//section[2]//div[2]"));
	Actions a = new Actions(driver);
	a.dragAndDrop(LaptopDrag, drop1);

	
	
	
	
	
	
	
	
}
}

