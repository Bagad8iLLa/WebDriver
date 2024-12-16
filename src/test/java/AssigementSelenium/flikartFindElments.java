package AssigementSelenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flikartFindElments {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	ArrayList<String>IphoneList =new ArrayList<>();
	IphoneList.add("Apple iPhone 15 (Black, 128 GB)");
	IphoneList.add("Apple iPhone 15 (Green, 128 GB)");
	IphoneList.add("Apple iPhone 15 Plus (Black, 128 GB)");
	
	for(String list : IphoneList) {
		String path = "//div[text()='"+list+"']/ancestor::div[@class='yKfJKb row']/descendant::div[@class=\"Nx9bqj _4b5DiR\"]";
		String price = driver.findElement(By.xpath(path)).getText();
		System.out.println(list +" " +price);
			
	}
	//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class="Nx9bqj _4b5DiR"]
}
}
