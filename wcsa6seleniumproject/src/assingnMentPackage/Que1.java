package assingnMentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		//scroll till open popup window link
		WebElement childB = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",childB);
		
		//click on link
		childB.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}

}
