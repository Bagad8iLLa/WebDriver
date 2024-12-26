package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddenHandleOnly {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		opt.addArguments("--disable--notifications");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();
		//driver.findElement(By.id("img2Nex")).click();
		driver.findElement(By.xpath("//div[@class=\"box1\"]/descendant::li[@id=\"fiv_4_27/02/2025\"]")).click();
		
	

	}

}
