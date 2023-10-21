package methodsOfWebelemwnts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRectMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://demoapps.qspiders.com");
	
	//identify email text box
	 WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));
	
	//get the location
	 Point loc = emailTextBox.getLocation();
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	
	System.out.println("location of email box :"+xaxis+" : "+yaxis);
	
	//getsize 
	Dimension size = emailTextBox.getSize();
	int height = size.getHeight();
	int width = size.getWidth();
	System.out.println(emailTextBox.getCssValue("height")+"  "+emailTextBox.getCssValue("width"));
	System.out.println("Size of email box :"+height+" : "+width);
	
	Rectangle rect = emailTextBox.getRect();
	System.out.println(rect.getX()+" : "+rect.getY());
	System.out.println(rect.getHeight()+" : "+rect.getWidth());
	
	
	}

}
