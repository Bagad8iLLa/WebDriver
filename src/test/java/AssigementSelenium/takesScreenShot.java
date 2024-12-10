package AssigementSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takesScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot t = (TakesScreenshot) driver;//explict type casting because no relation
		File src = t.getScreenshotAs(OutputType.FILE);//file should be make in web driver rigth click folder, folder name
		File dest = new File("./Screenshot/facebook.png");
		Files.copy(src, dest);
	}

}
