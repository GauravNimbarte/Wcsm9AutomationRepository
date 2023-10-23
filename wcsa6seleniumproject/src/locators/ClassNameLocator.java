package locators;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https.//www.google.com/");

// Swich the control to active elements
driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
driver.findElement(By.className("lNPNe")).click();

}
}
