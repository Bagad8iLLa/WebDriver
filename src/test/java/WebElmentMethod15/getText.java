package WebElmentMethod15;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement text = driver.findElement(By.xpath("//h1[contains(@class,'text-[2')]"));
		System.out.println(text.getText());
		System.out.println(text.getCssValue("font-family"));
		System.out.println(text.getTagName());
		System.out.println(text.getLocation());
		System.out.println(text.getAttribute("class"));
		System.out.println(text.getSize());
		System.out.println(text.getRect());
		System.out.println(text.isDisplayed());
		System.out.println(text.isEnabled());
		System.out.println(text.isSelected());// for check box
		driver.quit();
		
		
	}

}
