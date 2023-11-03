package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {
	public static void main(String[] args) throws IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	
	RemoteWebDriver rwd = (RemoteWebDriver)driver;
	File src = rwd.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./Screenshots/actitime.jpg");
	Files.copy(src, dest);
	
	
	
	
	}

}
