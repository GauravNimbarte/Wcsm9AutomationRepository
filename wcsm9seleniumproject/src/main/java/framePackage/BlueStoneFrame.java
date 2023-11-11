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
	
	driver.findElement(By.id("denyBtn")).click();
	
	
	
	//switch the control
	WebElement chat = driver.findElement(By.id("fc_widget"));
	
	driver.switchTo().frame(chat);//by webelement , xpath
	//driver.switchTo().frame("fc_widget");//by id 
	Thread.sleep(2000);
	
	//click on chat
	driver.findElement(By.id("chat-icon")).click();
	
	//handal all the text box
	//all the text box are design under main page
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("chat-fc-name")).sendKeys("gaurav");
	driver.findElement(By.id("chat-fc-email")).sendKeys("gaurav@gmail.com");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
	driver.findElement(By.partialLinkText("Start Chat")).click();
	
	
		
		
		
	}
}
