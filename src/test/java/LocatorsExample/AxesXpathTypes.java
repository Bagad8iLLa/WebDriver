package LocatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpathTypes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement a =driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		a.sendKeys("Nike Shoes");
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER);	
		WebElement b = driver.findElement(By.xpath("//h4[@class='product-product']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice']"));
		System.out.println(b.getText());
		//h4[@class='product-product']/ancestor:://div[@class='product-productMetaInfo']
		//*[@id="30191704"]/a/div[2]/h4[1]	
		//html/body/div[2]/div/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/a/div[2]/h4[1]
			
		
				
		
	}

}
