package popUpHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationHandle {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Robot r = new Robot();
		
		/*	r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);*/
		
	
		
		




	}
}
