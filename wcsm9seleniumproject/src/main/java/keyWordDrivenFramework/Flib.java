package keyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//it is use to store generic reuseable method and all the generic reusable method are non Static
	
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = null;
		if(cell.getCellType()==cell.getCellType().STRING)
		{
			data=cell.getStringCellValue();
		}
		else if(cell.getCellType()==cell.getCellType().NUMERIC)
		{
			data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
			
		}
		return data;
	
	}
	
	public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream( excelpath); // provied the path of excel file 
		Workbook wb = WorkbookFactory.create(fis);  // make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // get into the sheet 
		Row row = sheet.getRow(rowCount);  // get into the desired row 
		Cell cell = row.createCell(cellCount);  // create the desired cell 
		cell.setCellValue(data); //enter the data into the created cell 
		
		FileOutputStream fos = new FileOutputStream(excelpath);// provied the path of excel file 
		wb.write(fos); //write the data in the excel file 
		
	}

	  public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException {
		 
		  FileInputStream fis = new FileInputStream( excelpath);
			Workbook wb = WorkbookFactory.create(fis);  //make the file ready to read
			Sheet sheet = wb.getSheet(sheetName); // get into the sheet
			 int rc = sheet.getLastRowNum(); // get the no row present into the sheet
			return rc;
		  
			 
	  }
	  
	  public String readDataFromProperty(String propath,String key) throws IOException {
		  
		 FileInputStream fis = new FileInputStream(propath);
		 Properties prop = new Properties();
		 prop.load(fis);
		 String data = prop.getProperty(key);
		 return data;
		  
		  	
	  }
}
