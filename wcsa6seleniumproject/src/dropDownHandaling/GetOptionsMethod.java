package dropDownHandaling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//single select dropdown...
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/singleselectdropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDownElement);
		
		//to read all option from dropdown
		List<WebElement> allOptions = sel.getOptions();
		
		//to read the list of webelement use for loop
	/*	for(int i=0;i<allOptions.size();i++)
		{
			String opt = allOptions.get(i).getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}*/
		
		// use for each loop
	/*	for(WebElement opt:allOptions)
		{
			String op = opt.getText();
			Thread.sleep(2000);
			System.out.println(op);
		}*/
		
		
		for(int i=0;i<allOptions.size();i++)
		{
			if (allOptions.get(i).getText().equals("tea"))
			{
				Thread.sleep(2000);
				allOptions.get(i).click();
				break;
			}
		}
		

  }
	
}
