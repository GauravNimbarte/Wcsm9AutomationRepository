package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipalData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//provide the path of excel file
				FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");		
				//to make the file ready to read
				Workbook wb = WorkbookFactory.create(fis);
				//to get into particular sheet
				Sheet sheet = wb.getSheet("IPL");
				//to get the no of row
				int rc = sheet.getLastRowNum();
				
				for(int i=1;i<=rc;i++) 
				{
					
			    Row row1 = sheet.getRow(i);  //to get into perticular row 
			    Cell cell = row1.getCell(0);  //to get into perticular column
			    String data = cell.getStringCellValue();  //
			   // Thread.sleep(2000);
			    System.out.println(data);
				
				
				}
		
	    }
	
    }
