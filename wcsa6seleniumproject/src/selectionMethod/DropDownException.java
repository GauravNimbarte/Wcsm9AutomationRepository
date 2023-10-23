package selectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownException {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/singleselectdropdown.html");
        
		WebElement dropdownEle = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdownEle);		
		
		Thread.sleep(2000);
		sel.selectByIndex(3);
		
		//deselect the option from single select dropdown
		Thread.sleep(2000);
		sel.deselectByIndex(3);
		
		
	}

}
