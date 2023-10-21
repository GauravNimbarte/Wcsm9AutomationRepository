package assingnmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("laptos");
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	driver.findElement(By.xpath("//div[text()='HP'and(@class='_3879cV')]")).click();
	driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Windows 11' and(@class='_3879cV')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	//identify name of laptop
	List<WebElement> allSuggetions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	//identify price of laptop
	 List<WebElement> allpricesugg = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	// to highlight parent /../.. use in xpath finder
	for(int i=0;i<allSuggetions.size();i++)
	{
		String nameOfLaptop= allSuggetions.get(i).getText();
		Thread.sleep(2000);
		for(int j=i;j<=i;j++)
		{
			String nameOfPrice = allpricesugg.get(j).getText();
			System.out.println(nameOfLaptop+"  :  "+nameOfPrice);
			
		}
	 }
	
	}

 }
