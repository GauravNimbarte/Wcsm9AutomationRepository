package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	
	driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('name').value='Gaurav'");
	jse.executeScript("document.getElementById('email').value='Gaurav@1234'");
	jse.executeScript("document.getElementById('password').value='123456789'");
	
	//click on diable button
	WebElement diabutton = driver.findElement(By.xpath("//button[text()='Register']"));
	
	Thread.sleep(2000);
	if(diabutton.isDisplayed())
	{
		jse.executeScript("arguments[0].click()",diabutton);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[text()='Login']")));
		System.out.println("Click");
	}
	else
	{
		System.out.println("Not Click");
	
	}
	
	
	}

}
