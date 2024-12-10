package QspiderDemoTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebE_Butto1_1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='btn']")).click();
	driver.findElement(By.xpath("//button[@id='btn2']")).click();
	driver.findElement(By.xpath("//button[@id='btn7']")).click();
}
}
