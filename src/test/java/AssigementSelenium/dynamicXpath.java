package AssigementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {
public static void main(String[] args) {////h1[text()='Coronavirus Cases:']/..div[@id='maincounter-wrap']
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	WebElement cases= driver.findElement(By.xpath("//h1[normalize-space()='Coronavirus Cases:']//following::span[normalize-space()='704,753,890']"));
	
	System.out.println(cases.getText());
WebElement recover = driver.findElement(By.xpath("//h1[normalize-space()='Recovered:']/..//span[contains(text(),'675,619,811')]"));
	
	System.out.println(recover.getText());
	
}
}
