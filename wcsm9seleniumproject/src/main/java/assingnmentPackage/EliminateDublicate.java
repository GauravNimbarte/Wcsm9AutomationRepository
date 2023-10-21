package assingnmentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDublicate {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
	
	WebElement dropdown = driver.findElement(By.id("menu"));
	Select sel = new Select(dropdown);
	
    //handal dropdown by eliminate duplicate
	
//	TreeSet<String> ts = new TreeSet<String>();
	HashSet<String> hs = new HashSet<String>();
	
	//read ops from dropdown
	List<WebElement> allOps = sel.getOptions();
	
	for(int i=0;i<allOps.size();i++)
	{
		
		String option = allOps.get(i).getText();
		Thread.sleep(2000);
		System.out.println(option);
		hs.add(option);
	}
	Thread.sleep(2000);
	
	for(String ops:hs)
	{
		Thread.sleep(2000);
		System.out.println(ops);
		
	}
		
		
	}

}
