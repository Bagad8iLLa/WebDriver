package AssigementSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PatymMumToDelSS {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://paytm.com/");
	driver.findElement(By.xpath("//div[@id=\"from\"]")).click();//click for choicefor delhi
	driver.findElement(By.xpath("//div[@class=\"_3pmv2 _2Ca-d\"][1]")).click();//to select delhi
	driver.findElement(By.xpath("//span[@id=\"destCode\"]")).click();//to select dest
	driver.findElement(By.xpath("//div[@class=\"_3pmv2 _2Ca-d\"][1]")).click();//to select mumbai
	driver.findElement(By.xpath("//span[text()=\"Departure Date\"]")).click();//to click select date
	driver.findElement(By.xpath("//div[@class='_1Jfqy']//div[1]//table[1]/..//div[contains(text(),'25')]")).click();//to 25 day
	driver.findElement(By.xpath("//span[@id=\"addReturn\"]")).click();//to click add return date
	driver.findElement(By.xpath("//div[@class='_2Gsc8']//div[2]//table[1]/..//div[contains(text(),'23')]")).click();//to select 23as return date
	driver.findElement(By.xpath("//div[@class=\"_1l0GT\"]")).click();//to search
	
	//for screenshot
	TakesScreenshot t = (TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshot/paytmflight.png");
	Files.copy(src, dest);
	
}
}
