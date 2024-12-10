package LectureMethodsExample;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class To3GetTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
}
}
