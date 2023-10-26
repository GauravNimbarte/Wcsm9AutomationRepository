package actionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		WebElement target = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		WebElement target1 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
		WebElement target2 = driver.findElement(By.xpath("//button[text()='1']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		act.doubleClick(target1).perform();
		Thread.sleep(2000);
		act.doubleClick(target2).perform();
		
		WebElement dis = driver.findElement(By.xpath("//span[text()='You selected \"1\"']"));
		boolean displayed = dis.isDisplayed();
		System.out.println(displayed);
	
	
	
	
	
  }

}
