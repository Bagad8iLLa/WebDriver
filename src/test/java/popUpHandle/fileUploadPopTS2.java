package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadPopTS2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
	WebElement upload = driver.findElement(By.xpath("//div[text()='Upload File']"));
	upload.sendKeys("C:\\Users\\navde\\eclipse-workspace2\\sjjas.txt");
}
}
