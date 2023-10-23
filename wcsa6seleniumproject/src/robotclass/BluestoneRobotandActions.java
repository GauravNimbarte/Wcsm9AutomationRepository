package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneRobotandActions {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		//perform movehover actions on watch jewellery
		Actions act = new Actions(driver);
		//act.moveToElement(target);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[.='Band']")).click();
		Thread.sleep(2000);
		
		WebElement filterBy = driver.findElement(By.xpath("//span[@class='f-by']"));
		
		
		
		for(int i=0;i<=2;i++)
		{
			act.doubleClick(filterBy).perform();
			
		    act.contextClick(filterBy).perform();
		}
		//copy the filter by text
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		//paste the filter by text
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit_search")).submit();
		
		
		
		
		
		
		
		
	}
	

}
