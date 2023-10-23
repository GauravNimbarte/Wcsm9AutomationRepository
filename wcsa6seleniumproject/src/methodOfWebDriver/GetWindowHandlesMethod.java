package methodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		String parentW = driver.getWindowHandle();
		WebElement childW = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)",childW);
		
		childW.click();
		
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle)
		{
			if(!parentW.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		
		
	}

}
