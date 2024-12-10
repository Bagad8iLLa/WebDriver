package LectureMethodsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://student.qspiders.com/login");
		WebElement SearchTextByName = driver.findElement(By.name("email"));
		SearchTextByName.sendKeys("9893368780");
		WebElement SearchTextById = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		SearchTextById.sendKeys("Qwert@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[@class='font-bold']")).click();
	}
}
