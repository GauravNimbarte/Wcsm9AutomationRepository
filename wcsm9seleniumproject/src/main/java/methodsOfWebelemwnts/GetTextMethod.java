package methodsOfWebelemwnts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(2000);
		 List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		 Thread.sleep(2000);
		
		for(WebElement phone:allIphone)
		{
			String print = phone.getText();
			Thread.sleep(2000);
			System.out.println(print);
		}
		
		
	}

}
