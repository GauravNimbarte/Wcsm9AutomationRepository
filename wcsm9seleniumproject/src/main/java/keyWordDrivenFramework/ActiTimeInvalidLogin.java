package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		//to launch browser and close browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read the data from excel file
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,INVALIDCREDS_SHEET);
		
		//String invalidPass;
		for(int i=1;i<=rc;i++)
		{
		
		
		//identify user name and password
		
		WebElement userTB = driver.findElement(By.name("username"));
		userTB.sendKeys(  flib.readExcelData(EXCEL_PATH,INVALIDCREDS_SHEET,i,0));
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readExcelData(EXCEL_PATH,INVALIDCREDS_SHEET,i,1));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		
		}
		bt.closeBrowser();
		
	}

}
