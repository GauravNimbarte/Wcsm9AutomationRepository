package dropDownHandaling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateElementByTreeSet {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDownElement);
		
		//to handal dropdown by eliminate dublocate we use tree set
	TreeSet<String>	ts=new TreeSet<String>();
	
	//read the options from drop down
	List<WebElement> allOps = sel.getOptions();
		//read the options
	for(int i=0;i<allOps.size();i++)
	{
		//read the text of options
		
		
		String opt = allOps.get(i).getText();
		
		ts.add(opt);
		
	}
	Thread.sleep(4000);
	
     for(String ops:ts)
     {
    	 Thread.sleep(2000);
    	 System.out.println(ops);
     }
		
		
		
	}
}
