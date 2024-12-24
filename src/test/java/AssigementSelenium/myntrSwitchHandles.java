package AssigementSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntrSwitchHandles {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.myntra.com/");
	WebElement a = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
	a.sendKeys("Bata Slipper For Men",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"20446318\"]/a/div[2]/h4[1]")).click();
	
	Set<String> allid = driver.getWindowHandles();
	for(String id:allid) {
		driver.switchTo().window(id);
		if(driver.getTitle().equals("Buy Bata Men Tan Thong Flip Flops  - Flip Flops for Men 20446318 | Myntra"));
		{
			break;
		}
		
	}
	driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[2]/div[1]/button/p")).click();
	driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[3]/div/div[1]")).click();
	
}
}
