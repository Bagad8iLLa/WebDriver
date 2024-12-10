package AssigementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAss {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@class='sc-bxivhb dsDRlf']")).sendKeys("ISBT Kashmiri Gate, Delhi");//by attribute
		driver.findElement(By.xpath("//input[@tabindex='-1' and @id='dest'] ")).sendKeys("Mumbai");//by multi attri
		driver.findElement(By.xpath("//div[@class=\"sc-fjdhpX elUAqf\"]")).click();//calander
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 gigHYE']")).click();//date
		driver.findElement(By.xpath("//button[@id='search_button']")).click();//search
		WebElement x = driver.findElement(By.xpath("//*[@id=\"33600543\"]/div/div[1]/div[1]/div[1]"));//search
		System.out.println(x.getText());
		
	}

}
