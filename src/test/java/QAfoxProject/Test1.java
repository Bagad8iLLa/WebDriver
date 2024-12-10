package QAfoxProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Test1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		driver.switchTo().frame(frame1);
		WebElement text = driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
		System.out.println(text.getText());
		/*TakesScreenshot t = (TakesScreenshot)driver;
		File ss = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Test1.png");
		Files.copy(ss, dest);*/
		File ss = text.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Test1.png");
		Files.copy(ss, dest);
		
		
		
		
		
		
		
	}

}
