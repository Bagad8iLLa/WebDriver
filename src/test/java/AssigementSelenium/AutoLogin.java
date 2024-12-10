package AssigementSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AutoLogin {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://student.qspiders.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("xxxxxxxx");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("xxxxxx");
	
	driver.findElement(By.className("pl-1 pr-1 text-md font-medium text-md font-medium")).click();
	
	
}
}
