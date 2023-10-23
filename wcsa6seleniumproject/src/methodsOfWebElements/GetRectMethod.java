package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//identify login button
	Rectangle loginRect = driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
	int xaxis = loginRect.getX();
	int yaxis = loginRect.getY();
	
	
	int h = loginRect.getHeight();
	int w = loginRect.getWidth();
	System.out.println(xaxis+" "+yaxis+" "+h+" "+w);
	
	
	
	
	}

}
