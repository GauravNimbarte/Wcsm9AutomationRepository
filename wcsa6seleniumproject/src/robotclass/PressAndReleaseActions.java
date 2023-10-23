package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class PressAndReleaseActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.quit();
		
		
		robot.keyRelease(KeyEvent.VK_P);
		
	}

}
