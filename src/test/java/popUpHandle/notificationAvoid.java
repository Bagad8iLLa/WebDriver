package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationAvoid {

	public static void main(String[] args) {
		ChromeOptions noti = new ChromeOptions();
		noti.addArguments("--incognito");
		//noti.addArguments("--disable--notifications");
		WebDriver driver = new ChromeDriver(noti);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.findElement(By.id("browNotButton")).click();
		
		
		
		

	}

}
