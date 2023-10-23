package javaScritExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_ScrollUp {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev");
	
	//Explicit type casting into javascripexecutor
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	
	//perfect scroll down...
	
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	
	//perform scrollup
	jse.executeScript("window.scrollBy(0,-500)");
	
	
	
	
	
	}

}
