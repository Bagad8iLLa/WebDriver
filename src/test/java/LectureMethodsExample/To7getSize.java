package LectureMethodsExample;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To7getSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
	}

}
