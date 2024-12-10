package AssigementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mynta2Ass {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/casual-shoes/highlander/highlander-men-lace-up-sneakers/11097160/buy");
	driver.manage().window().maximize();  ////div[@class='pdp-price-info']/child::h1[@class='pdp-title']
	WebElement ShoesName = driver.findElement(By.xpath("//div[@class='pdp-price-info']/..//h1[normalize-space()='HIGHLANDER']"));
	System.out.println("Shoes Brand Name is "+ShoesName.getText());  ////div[@class='pdp-price-info']/..//h1[normalize-space()='HIGHLANDER']
	
	
	
	WebElement Price = driver.findElement(By.xpath("//div[@class='pdp-price-info']/..//strong[contains(text(),'₹597')]"));
	System.out.println("Shoes Price is "+Price.getText());
	driver.quit();
}
}
