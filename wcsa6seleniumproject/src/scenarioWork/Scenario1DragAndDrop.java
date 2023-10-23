package scenarioWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1DragAndDrop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		WebElement src = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//	wait.until(ExpetedConditions.visibility)
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
	}

}
