package methodofwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
		
   WebDriver	driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("http://127.0.0.1/login.do");
   
   WebElement ele = driver.findElement(By.name("username"));
         System.out.println("ele");
         ele.sendKeys("admin");
   
   
	}

}
