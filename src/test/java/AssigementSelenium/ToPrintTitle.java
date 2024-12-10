package AssigementSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToPrintTitle {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://qspiders.com/");
	String a=driver.getTitle();
	String url=driver.getCurrentUrl();
	System.out.println("THE TITILE OF THE LINK IS "+a);
	System.out.println("THE URL OF LINK IS "+url);
	
}
} 