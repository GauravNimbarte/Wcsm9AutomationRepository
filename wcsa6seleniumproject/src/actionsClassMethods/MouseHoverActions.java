package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//handel popup notification
		driver.findElement(By.id("denyBtn")).click();
		//identify watch jewellery
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		//perform movehover actions on watch jewellery
		Actions act = new Actions(driver);
		//act.moveToElement(target);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[.='Band']")).click();
		
	}

}
