package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {
	public static void main(String[] args) throws IOException {
	RemoteWebDriver	rwd=new ChromeDriver();
	rwd.manage().window().maximize();
	rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	rwd.get("https://demoapps.qspiders.com/");
	
	File src = rwd.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/demoapp.jpg");
	
	Files.copy(src, dest);
	
	
	}

}
