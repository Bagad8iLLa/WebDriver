package LectureMethodsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseExplicitlyWait {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("C");
	WebElement search = driver.findElement(By.name("q"));
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
	//w.until(ExpectedConditions.elementToBeClickable(By.))
}
}
