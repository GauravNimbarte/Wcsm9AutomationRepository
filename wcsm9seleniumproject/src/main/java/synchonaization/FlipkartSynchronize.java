package synchonaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//a[@class='_3RX0a-' and (@title='Cart')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _1sbqEe _3AWRsL')]")).click();
		
		

	}

}
