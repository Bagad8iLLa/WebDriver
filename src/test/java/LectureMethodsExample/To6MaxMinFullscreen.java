package LectureMethodsExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To6MaxMinFullscreen {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");// fullscreen() maximize() minimize()
	driver.manage().window().maximize();
}
}
