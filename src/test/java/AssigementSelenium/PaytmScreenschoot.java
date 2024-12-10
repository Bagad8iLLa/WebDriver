package AssigementSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PaytmScreenschoot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://paytm.com/");
	driver.findElement(By.xpath("//img[contains(@src,'https://assetscdn1.paytm.com/images/catalog/view_item/733295')]")).click();
	driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Noida");
	driver.findElement(By.xpath("//a[@href='/movies/noida']")).click();
	driver.findElement(By.xpath("//div[text()='Pushpa 2: The Rule']")).click();
	driver.findElement(By.xpath("//input[@id='Telugu-index-selection-dialog']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'Button')]")).click();
	driver.findElement(By.xpath("//div[text()='8']")).click();
	
	TakesScreenshot t = (TakesScreenshot) driver;//explict type casting because no relation
	File src = t.getScreenshotAs(OutputType.FILE);//file should be make in web driver rigth click folder, folder name
	File dest = new File("./Screenshot/patym.png");
	Files.copy(src, dest);
	
	WebElement img = driver.findElement(By.xpath("//img[contains(@src,'https://asset')]"));
	File src1 = img.getScreenshotAs(OutputType.FILE);//file should be make in web driver rigth click folder, folder name
	File dest1 = new File("./Screenshot/pushpaPoster.png");
	Files.copy(src1, dest1);
	

	
}
}
