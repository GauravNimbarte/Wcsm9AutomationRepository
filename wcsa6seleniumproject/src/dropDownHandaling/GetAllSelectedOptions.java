package dropDownHandaling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Multi  select dropdown...
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDownElement);
		//select the options fro, dropdown
		for (int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(4000);
		
		// to read the option that are selected
		List<WebElement> allopts = sel.getAllSelectedOptions();
		//  print the option that are selected
		for(WebElement opt:allopts)
		{
			Thread.sleep(3000);
			System.out.println(opt.getText());
		}
		
	}

}
