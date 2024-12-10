package QspiderDemoTry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Disabled']")).click();
		Thread.sleep(2000);
		WebElement disabledTextField = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = 'Watsup Bitches';", disabledTextField);
        //disabledTextField.sendKeys("Navdeep Singh Siddhu");
	
}
}
