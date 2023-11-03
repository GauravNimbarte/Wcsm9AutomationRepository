package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay1Ele {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[4]"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/laptop.jpg");
		Files.copy(src, dest);
		
		
		
	}

}
