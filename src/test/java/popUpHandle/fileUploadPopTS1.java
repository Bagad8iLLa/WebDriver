package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadPopTS1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	WebElement chosetoUpload = driver.findElement(By.id("fileInput"));
	
	chosetoUpload.sendKeys("C:\\Users\\navde\\eclipse-workspace2\\sjjas.txt");
	WebElement filename = driver.findElement(By.xpath("//p[@class=\"me-2\"]"));
	System.out.println(filename.getText());
}
}
