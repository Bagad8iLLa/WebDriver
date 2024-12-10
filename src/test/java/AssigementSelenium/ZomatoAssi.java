package AssigementSelenium;
//zomato search roti click on suggestion 1 sardar g malai chaap  click on reviews  click on follw enter thhe signup option  for crate acc and create the new acc
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ZomatoAssi {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com/");
	
	
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
	search.sendKeys("roti");
	
    search.click();
    
   
    
    WebElement Suggestion = driver.findElement(By.xpath("//div[@class='sc-hgzKov sc-hCbubC fiHXXM']"));
    Suggestion.click();
    
    
    WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
    
    search2.sendKeys("Domino's Pizza");
    
    search2.click();
    
    WebElement clicksuggestion = driver.findElement(By.xpath("//div[@class='sc-kWHCRG dqbsug']//div[1]//div[1]//img[1]"));
    clicksuggestion.click();
    
    
    
    WebElement review = driver.findElement(By.linkText("Reviews"));
    review.click();
    
    
    
    WebElement followClick= driver.findElement(By.xpath("//p[normalize-space()='Hardeep']/../../../..//span[@class='sc-1kx5g6g-3 dkwpEa'][normalize-space()='Follow']"));
    Thread.sleep(1000);
    followClick.click();
    
   
    
    WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"auth-login-ui\"]"));
     driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("//span[@class='sc-iGgWBj elhLRJ']")).click();//creetAccS
    
   
    
    driver.findElement(By.xpath("//section[@label='Full Name']//input[@type='text']")).sendKeys("NAVDEEP SINGH SIDDHU");//name
    driver.findElement(By.xpath("//section[@label='Email']//input[@type='text']")).sendKeys("navdeepss496@gmail.com");//email
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();//checkbox
    driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']")).click();//cratebutton
    
    
}
}
