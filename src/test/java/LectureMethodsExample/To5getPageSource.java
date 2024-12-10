package LectureMethodsExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To5getPageSource {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String P_source = driver.getPageSource();
	System.out.println(P_source);
}
}
