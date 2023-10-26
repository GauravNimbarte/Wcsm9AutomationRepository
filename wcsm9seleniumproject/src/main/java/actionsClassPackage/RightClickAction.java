package actionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		WebElement target = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		WebElement target1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
		WebElement target2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
		Actions act = new Actions(driver);
		act.contextClick(target1).perform();
		Thread.sleep(2000);
		act.contextClick(target2).perform();
		Thread.sleep(2000);
		act.contextClick(target).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		WebElement dis = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		boolean displayed = dis.isDisplayed();
		System.out.println(displayed);
		
		
	}

}
