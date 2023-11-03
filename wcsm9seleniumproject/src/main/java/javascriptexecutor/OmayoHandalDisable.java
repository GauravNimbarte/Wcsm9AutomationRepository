package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoHandalDisable {
	public static void main(String[] args) throws IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement text = driver.findElement(By.id("tb2"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",text);
		
		jse.executeScript("document.getElementById('tb2').value='automation class'");
		
		File src = text.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/textbox.jpg");
		Files.copy(src, dest);
		
		driver.quit();
		
	}

}
