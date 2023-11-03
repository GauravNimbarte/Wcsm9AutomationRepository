package popuphandaling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoAlertpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
	    driver.findElement(By.id("alert1")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    //alert.accept();
	    String al = alert.getText();
	    System.out.println(al);
	    Thread.sleep(2000);
	    alert.dismiss();
		
		
		
		
	}

}
