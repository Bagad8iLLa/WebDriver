package AssigementSelenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraFindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/snekers?rawQuery=Sneakers");
		//driver.findElement(By.className("desktop-searchBar")).sendKeys("Sneakers",Keys.ENTER);
		ArrayList <String> ShoesList = new ArrayList<>();
		ShoesList.add("Men Samba OG Casual Shoes");
		ShoesList.add("Men Galaxium Sneakers");
		ShoesList.add("Unisex Back To School Shoes");
		ShoesList.add("Men Colourblocked Sneakers");
		
		for(String list : ShoesList) {
			String path = "//h4[text()='"+list+"']/ancestor::div[@class=\"product-productMetaInfo\"]/descendant::div[@class=\"product-price\"]";
			String price = driver.findElement(By.xpath(path)).getText();
			System.out.println(list+" " +price);
		}
		
		
	}

}
