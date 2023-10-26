package actionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAss {
	
	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
	
	   WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
	      Actions coins = new Actions(driver);
	      coins.moveToElement(coin).perform();
	      
	      driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
	      
//	      WebElement dis = driver.findElement(By.xpath("//h1[text()=' Lakshmigoldcoins ']"));
//	       boolean displayed = dis.isDisplayed();
//	       System.out.println(displayed);
	      
	      if(driver.findElement(By.xpath("//h1[text()=' Lakshmigoldcoins ']")).isDisplayed())
	      {
	    	  System.out.println("Lakshmigoldcoins is displayed!!!");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Lakshmigoldcoins is not displayed!!");
	      }
	
	}

}
