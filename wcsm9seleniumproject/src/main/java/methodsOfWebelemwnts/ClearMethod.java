package methodsOfWebelemwnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		
		WebElement userTB = driver.findElement(By.xpath("//input[@name='username']"));
		userTB.sendKeys("admin");
		
		WebElement passTB = driver.findElement(By.xpath("//input[@name='pwd']"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		
		userTB.clear();
		passTB.clear();
		
	}

}
