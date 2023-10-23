package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/Confirmationpopup.html");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Alert al = driver.switchTo().alert();
		
	Thread.sleep(2000);
	
	//al.accept(); to accepts the 
	//al.dismiss();
	System.out.println(al.getText());
	al.accept();
	Thread.sleep(2000);
	driver.close();
	
	
	

	}

}
