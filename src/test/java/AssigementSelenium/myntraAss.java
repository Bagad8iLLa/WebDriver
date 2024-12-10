package AssigementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraAss {// myntra shoes serch print title rate
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	search.sendKeys("shoes");
	Thread.sleep(1000);             ////li[@id='16127744']//div[@class='product-productMetaInfo']/..//div[@class='product-price']//span[@class=\"product-discountedPrice\"]
	search.sendKeys(Keys.ENTER); ////li[@id='16127744']//div[@class='product-productMetaInfo']/..//div[@class='product-price']
	Thread.sleep(1000);
	WebElement shoesPrice = driver.findElement(By.xpath("li[@id='16127744']//div[@class='product-productMetaInfo']/..//div[@class='product-price']//span[@class=\\\"product-discountedPrice\\\"]"));
	Thread.sleep(1000);
	System.out.println("SHOES PRICE IS "+shoesPrice.getText());     ////li[@id='16127744']/descendant::span[@class="product-discountedPrice"]
	//..........................................................................................................
	////li[@id='16127744']//div[@class='product-productMetaInfo']/..//h3[@class='product-brand']
	
	WebElement shoesName = driver.findElement(By.xpath("li[@id='16127744']//div[@class='product-productMetaInfo']/..//h3[@class='product-brand']"));
	System.out.println("SHOES NAME IS" +shoesName.getText());
	
}
}
