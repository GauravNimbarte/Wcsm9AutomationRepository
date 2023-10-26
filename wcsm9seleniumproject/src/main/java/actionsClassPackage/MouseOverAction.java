package actionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) {
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("denyBtn")).click();
	
	WebElement watchj = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	
	Actions wj = new Actions(driver);
	wj.moveToElement(watchj).perform();
	
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	
	WebElement watch = driver.findElement(By.xpath("//a[@title='Watch Band Jewellery']"));
	boolean display = watch.isDisplayed();
	System.out.println(display);

	}

}
