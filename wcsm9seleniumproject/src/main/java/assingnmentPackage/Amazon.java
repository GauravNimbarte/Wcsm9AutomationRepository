package assingnmentPackage;

import java.io.Serial;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the browsername which u want to launch");
		String browservalue = sc.next();
	   if (browservalue.equalsIgnoreCase("chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   else if(browservalue.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }   
	   else if(browservalue.equalsIgnoreCase("edge"))
	   {
		   driver=new EdgeDriver();
	   } 
	   else 
	   {
		   System.out.println("This not a browser value");
	   } 
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
	}
	
	public static void searchproduct(String product)
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys(product);
		driver.findElement(By.name("url")).click();
		driver.findElement(By.xpath("//option[text()='Watchesa']")).click();
		
		
	}

}
