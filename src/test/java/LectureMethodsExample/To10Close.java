package LectureMethodsExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To10Close {                 
public static void main(String[] args) throws InterruptedException {
	                                    // throws is liye add hua h ki thrad sleep use hua hai
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	//click on pop window
	
	driver.findElement(By.linkText("Open a popup window")).click();
	Thread.sleep(2000);
	// close method
	
	driver.close();
	// quite method
	Thread.sleep(2000);
	driver.quit();
	
	
	
}
}
