package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/singleselectdropdown.html");
		
		//single select dropdown
		WebElement dropdown1 = driver.findElement(By.id("menu"));
		
		//handal the dropdown
		
		Select sel = new Select(dropdown1);
		sel.selectByValue("v3");
		Thread.sleep(2000);
		//get the option which is selected first
		WebElement firstOp = sel.getFirstSelectedOption();
		//get the text of firstop
		
		System.out.println(firstOp.getText());
		
		
		driver.navigate().to("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
		
		WebElement dropdown2 = driver.findElement(By.id("menu"));
		
		Select sel2 = new Select(dropdown2);
		
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
			
		}
		
		Thread.sleep(2000);
		
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
	}

}
