package WebElmentMethod15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownHandle {

	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
			//to select +91
			WebElement dropMobile=driver.findElement(By.id("select1"));
			Select s1 = new Select (dropMobile);
			s1.selectByIndex(4);
			//to enter mobile no.
			driver.findElement(By.id("phone")).sendKeys("9893368781");
			//to select gender
			WebElement dropGendr = driver.findElement(By.id("select2"));
			Select s2 = new Select(dropGendr);
			s2.selectByValue("male");
			//country
			WebElement dropcontry = driver.findElement(By.id("select3"));
			Select s3 = new Select(dropcontry);
			s3.selectByVisibleText("India");
			//State
			WebElement dropState = driver.findElement(By.id("select5"));
			Select s4 = new Select(dropState);
			s4.selectByVisibleText("Madhya Pradesh");
			//city
			WebElement dropcity = driver.findElement(By.id("CityOpt33"));
			dropcity.click();
			Select s5 = new Select(dropcity);
			s5.selectByIndex(31);
			
			
			
			
		}

	}


