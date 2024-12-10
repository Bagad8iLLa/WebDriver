package LectureMethodsExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To4getCurrentUrl {
public static void main(String[] args) {
	String actual_url = "https://www.facebook.com/";
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String current = driver.getCurrentUrl();
	
	if(current.equals(actual_url)) {
		System.out.println("EXPECTED URL");
	}
	else {
		System.out.println("UNEXPECTED URL");
	}
}
}
