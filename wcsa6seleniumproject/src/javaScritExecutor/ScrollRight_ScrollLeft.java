package javaScritExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight_ScrollLeft {
	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriver	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
			
			//Explicit type casting into javascripexecutor
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			
			
			//perform scrollright 
			
			for(int i=0;i<=1;i++)
			{
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(5000,0)");
			}
			
			
			//perform scroll Left
			
			for(int i=0;i<=1;i++)
			{
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(-5000,0)");
			}
			
			
	}

}
