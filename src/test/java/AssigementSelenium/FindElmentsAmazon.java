package AssigementSelenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmentsAmazon {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/s?k=samsung+s24+ultra+5g+mobile&crid=2H3Q0HUG2VI7E&sprefix=samsun%2Caps%2C480&ref=nb_sb_ss_ts-doa-p_2_6");
	
	ArrayList <String> SamsungList = new ArrayList<String>();
	SamsungList.add("Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)_Without Offer");
	SamsungList.add("Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 256GB Storage)");
	SamsungList.add("Samsung Galaxy S23 Ultra 5G AI Smartphone (Green, 12GB, 256GB Storage)");
	SamsungList.add("Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 512GB Storage)");
	SamsungList.add("Samsung Galaxy S23 Ultra 5G AI Smartphone (Cream, 12GB, 256GB Storage)");
	SamsungList.add("Samsung Galaxy S23 Ultra 5G AI Smartphone (Phantom Black, 12GB, 256GB Storage)");
	
	
	for(String list : SamsungList) {
		String path ="//span[text()='"+list+"']/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]";
		String Price = driver.findElement(By.xpath(path)).getText();
		System.out.println(list+" " +Price);
		//span[contains(text(),'iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; D')]/ancestor::div[@class="a-section a-spacing-small a-spacing-top-small"]/descendant::span[@class="a-price-whole"]
	}
}
}
