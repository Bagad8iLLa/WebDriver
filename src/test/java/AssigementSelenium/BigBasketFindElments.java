package AssigementSelenium;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketFindElments {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bigbasket.com/ps/?q=vegetable&nc=as");
	//driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("vegetables",Keys.ENTER);
	
	ArrayList<String>vegeList =new ArrayList<>();
	vegeList.add("Cucumber (Loose)");
	vegeList.add("Ladies' Fingers (Loose)");
	vegeList.add("Carrot - Orange (Loose)");
	
	for(String List : vegeList) {
		String path = "//h3[text()='"+List+"']/ancestor::div[contains(@class,\"SK\")]/descendant::span[contains(@class,\"Label-sc-15v1nk5-0 Pricing___StyledLabel-\")]";
		String price= driver.findElement(By.xpath(path)).getText();
		System.out.println(List+" " +price);
		//String path = "//div[text()='
	}
}
}
