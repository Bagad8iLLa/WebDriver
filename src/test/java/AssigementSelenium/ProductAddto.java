package AssigementSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductAddto {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	 WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	search.sendKeys("Computing and Internet");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
}
}
