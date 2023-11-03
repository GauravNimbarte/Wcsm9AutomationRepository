package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay4 {
	public static void main(String[] args) throws IOException {
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://github.com/GauravNimbarte");
	
          EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
          ewf.getScreenshotAs(OutputType.FILE);
          
          File src = ewf.getScreenshotAs(OutputType.FILE);
          File dest = new File("./Screenshots/github.jpg");
	     Files.copy(src, dest);
	}

}
