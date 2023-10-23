package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandelMethod {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		//get the adress of parent window 
		String parentHandle = driver.getWindowHandle();
		
		System.out.println(parentHandle);
	}

}
