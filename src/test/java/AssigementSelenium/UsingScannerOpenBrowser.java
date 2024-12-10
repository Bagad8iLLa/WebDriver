/*package AssigementSelenium;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingScannerOpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("PRESS 1- FOR MICROSOFT EDGE BROWSER");
		System.out.println("PRESS 2- FOR CHROME BROWSER");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		
		if(a==1) {
			//System.out.println("1print");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.speedtest.net/");
			String titel=driver.getTitle();
			System.out.println(titel);
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/span[4]")) .click();
		}
		
		else if(a==2){
			//System.out.println("2print");
				WebDriver driver = new ChromeDriver();
				Thread.sleep(2000);
				driver.get("https://fast.com/");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='spinner']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@id='speed-progress-indicator-icon']")).click();
				//driver.findElement(By.xpath("//div[@id='speed-value']").isDisplayed();
				Thread.sleep(2000);
				driver.quit();
		}
		else {
			System.out.println("invalid input");
		}
		sc.close();
		
}
	
}
*/