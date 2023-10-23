package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssigmentOnRobotandActions {
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		act.contextClick(target).perform();
		Thread.sleep(2000);
		Robot robot = new Robot();
		Thread.sleep(2000);
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
		}
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.quit();
	
	
	
	
   }
}
