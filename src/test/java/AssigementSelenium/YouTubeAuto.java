package AssigementSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class YouTubeAuto {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("//input[@id='search']"));
		input.sendKeys("honey singh");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}

}
