package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAss {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("denyBtn")).click();
	WebElement watch = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	Actions act = new Actions(driver);
	act.moveToElement(watch).perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	Thread.sleep(2000);
	 WebElement filter = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));

	Thread.sleep(2000);
	
	for(int i=1;i<=2;i++)
	{
    
	act.doubleClick(filter).perform();
	Thread.sleep(2000);
	act.clickAndHold(filter).perform();
	
	}
	
	//copy the filter by text
	Robot robot = new Robot();
	
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	
	
	driver.findElement(By.id("search_query_top_elastic_search")).click();
	
	// paste the filter By Text
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	Thread.sleep(2000);
	driver.findElement(By.name("submit_search")).submit();
	
	
  }
}
