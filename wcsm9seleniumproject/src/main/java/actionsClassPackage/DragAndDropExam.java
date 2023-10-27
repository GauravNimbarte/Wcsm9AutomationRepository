package actionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExam {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement t1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement t2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement t3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement t4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		
		WebElement tr1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement tr2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		WebElement tr3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement tr4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(t1, tr1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(t2, tr2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(t3, tr3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(t4, tr4).perform();
		
	}

}
