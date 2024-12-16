package AssigementSelenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonIphoneFindeElememnt {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/s?k=iphonepro+max&crid=EI0P8Q1IK09S&sprefix=iphonepro%2Caps%2C503&ref=nb_sb_noss_2");
	
	ArrayList <String> iphoneList = new ArrayList<String>();
	iphoneList.add("iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium");
	iphoneList.add("iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Black Titanium");
	iphoneList.add("iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Natural Titanium");
	iphoneList.add("iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; White Titanium");
	
	
	for(String list:iphoneList) {
		String path = "//span[contains(text(),'"+list+"')]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]";
		String price = driver.findElement(By.xpath(path)).getText();
		System.out.println(list+" RS" +price);
	}
}
}
