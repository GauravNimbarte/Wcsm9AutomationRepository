package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginUsingDataDriven {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	
	FileInputStream fis = new FileInputStream("./src/main/resources/ActiTimeTestData.xlsx");		
	//to make the file ready to read
	Workbook wb = WorkbookFactory.create(fis);
	//to get into particular sheet
	Sheet sheet = wb.getSheet("sheet1");
	//to get the no of row
	int rc = sheet.getLastRowNum();
	
	for(int i=1;i<=rc;i++)
	{
		 Row row1 = sheet.getRow(i);  //to get into perticular row 
		    Cell cell = row1.getCell(0);  //to get into perticular column
		    String username = cell.getStringCellValue(); 
		    driver.findElement(By.name("username")).sendKeys(username);
		    
		    for(int j=1;j<=1;j++)
		    {
		    	Row row = sheet.getRow(i);  //to get into perticular row 
			    Cell cell1 = row.getCell(j);  //to get into perticular column
			    String password = cell1.getStringCellValue(); 
			    driver.findElement(By.name("pwd")).sendKeys(password);
			    driver.findElement(By.id("loginButton")).click();
			    
		    }
		    
		    driver.findElement(By.name("username")).clear();
		    driver.findElement(By.name("pwd")).clear();
		
	      }
		
		
		
	}

}
