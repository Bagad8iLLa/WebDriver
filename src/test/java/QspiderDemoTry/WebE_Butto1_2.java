package QspiderDemoTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebE_Butto1_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(2000);
		boolean a = driver.findElement(By.xpath("//span[contains(@class,'text-g')]")).isEnabled();////span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']
		System.out.println(a);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		boolean b = driver.findElement(By.xpath("//article[2]//span[1]")).isEnabled();////span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']
		System.out.println(b);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn7']")).click();
		Thread.sleep(2000);
		boolean c = driver.findElement(By.xpath("(//span[normalize-space()='You selected \"5\"'])[1]")).isEnabled();////span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']
		Thread.sleep(2000);
		System.out.println(c);
	
	}
}
