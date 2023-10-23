package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {
	
	
public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	Thread.sleep(2000);
	
	//this chat box is design under the frame
	//handle frame first by identify it..
	
	//driver.switchTo().frame(3);...we handel frame by using index
	//driver.switchTo().frame("fc_widget");//...we handel frame by using name and id
   WebElement frameElement = driver.findElement(By.id("fc_widget"));
   driver.switchTo().frame(frameElement);
	
	
	
     WebElement chatBox = driver.findElement(By.id("chat-icon"));
     
     chatBox.click();
   
     //switch control to main page
     
   //  driver.switchTo().defaultContent();
     
     //switch control to parent page
     driver.switchTo().parentFrame();
     
     driver.findElement(By.id("chat-fc-name")).sendKeys("Gaurav");
     driver.findElement(By.id("chat-fc-email")).sendKeys("gaurav@gmail.com");
     driver.findElement(By.id("chat-fc-phone")).sendKeys("7773998100");






    }

}
