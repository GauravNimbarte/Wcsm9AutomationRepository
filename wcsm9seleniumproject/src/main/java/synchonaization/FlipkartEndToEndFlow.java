package synchonaization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	
	//get the address of parent window
	String parentHandle = driver.getWindowHandle();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	//get the address of all the windows
	Set<String> allHandles = driver.getWindowHandles();
	
	for(String wh:allHandles)
	{
		if(!parentHandle.equals(wh))
		{
			driver.switchTo().window(wh);
		}
	}
	
	driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='256 GB']")).click();
	driver.findElement(By.id("pincodeInputId")).sendKeys("445102");
	driver.findElement(By.xpath("//span[text()='Check']")).click();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
	Point loc = removeButton.getLocation();
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(4000);
	
	jse.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//div[text()='Remove']")).click();
	
	}
	

}
