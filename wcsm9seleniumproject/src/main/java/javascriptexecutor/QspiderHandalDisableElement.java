package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderHandalDisableElement {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement textbox = driver.findElement(By.xpath("//select[contains(@class,'b')]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",textbox);
		jse.executeScript("arguments[0].click();",textbox);
		
		
	}

}
