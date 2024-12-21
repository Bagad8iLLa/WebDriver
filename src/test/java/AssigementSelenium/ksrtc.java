package AssigementSelenium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ksrtc {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ksrtc.in/");
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();//from click
		driver.findElement(By.xpath("//*[@id='fromCity_chosen']/div/ul/li[3]")).click();// destination click
		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();//dept click
		driver.findElement(By.xpath("//label[text()='Going To']/ancestor::div[@class=\"input-left-box\"]/descendant::li[text()='Bengaluru']")).click();//dept city select
		//label[text()='Going To']/ancestor::div[@class="input-left-box"]/descendant::li[text()='Bengaluru'] ancestor and descendant vala
		//*[@id=\"toCity_chosen\"]/div/ul/li[3] chromeXpath By copy method
		driver.findElement(By.xpath("//input[@id=\"departDate\"]")).click();//date click
		driver.findElement(By.xpath("//span[text()='December']/ancestor::div[contains(@class,'ui-datepicker-group ui-datepicker-group-first')]/descendant::a[text()='30']")).click();//date select
		driver.findElement(By.className("search--btn")).click();//search button click
		TakesScreenshot t = (TakesScreenshot) driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/ksrtc.png");
		Files.copy(scr, dest);
		
	////////////////////
		WebElement sc = driver.findElement(By.xpath("//span[text()='2131MNTMYS']/ancestor::div[@class=\"listinng-block-left\"]"));
		File scr1= sc.getScreenshotAs(OutputType.FILE);
		File dest1 =new File("./Screenshot/Elemnt.png");
		Files.copy(scr1, dest1);
		
		
}
}