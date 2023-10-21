package synchonaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoClickOnButton {

	public static void main(String[] args) {
     WebDriver  driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("http://omayo.blogspot.com/");
     
     driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
     driver.findElement(By.xpath("//a[text()='Flipkart']")).click();

	}

}
