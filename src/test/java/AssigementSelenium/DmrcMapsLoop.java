package AssigementSelenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DmrcMapsLoop {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://delhimetrorail.com/");//wesite open
	driver.findElement(By.id("buttonDismiss1")).click();//popupclose
	driver.findElement(By.id("FromStation")).click();//fromststion
	driver.findElement(By.xpath("//div[text()='BOTANICAL GARDEN']")).click();//select violet line
	driver.findElement(By.xpath("//a[@id=\"clearfix3\"]")).click();//select palam station
	driver.findElement(By.xpath("//input[@id=\"ToStation\"]")).click();//click to station
	driver.findElement(By.xpath("//div[@class=\"popup-result-location ael\"]")).click();//select orangeline
	driver.findElement(By.xpath("//a[@id=\"clearfix4\"]")).click();//click airpot t3
	driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();//click show route
	driver.findElement(By.xpath("//button[@id=\"buttonDismiss1\"]")).click();//popupclose
	WebElement loop = driver.findElement(By.xpath("//div[@class=\"map-zoom\"]//ul//li[1]"));//zoom 5times
	
	for (int i = 1; i <= 5; i++) {
		loop.click();
	}
	TakesScreenshot t =(TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./DMRCSS/dmrc.png");
	Files.copy(src, dest);
	
}
}
