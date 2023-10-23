package assingnMentPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
	
	//scroll till particular Webelement
	//webelement is news text
	
	
	WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
	
	Point loc = newsElement.getLocation();
	
	//perform scrolling till newselement
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	//jse.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()-90)+")");
	
	//by passing the inpute as js code
	
	jse.executeScript("arguments[0].scrollIntoView(false)",newsElement);//false for up
	
	//take screenshot
	Thread.sleep(2000);
	 File src = newsElement.getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("./Screenshots/newsElement.png");
	 Files.copy(src, dest);
	
	
	}

}
