package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		Thread.sleep(2000);
		
		WebElement frameElement = driver.findElement(By.name("app"));
		driver.switchTo().frame(frameElement);
		
		Thread.sleep(2000);
		
		
		WebElement mapIcon = driver.findElement(By.xpath("//span[text()='Maps']"));
		mapIcon.click();
  








  }
}
