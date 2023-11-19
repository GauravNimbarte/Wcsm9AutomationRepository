package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData(String excelpath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.getStringCellValue();
		return data;
		
	}
	
	public void writeExcelData(String excelpath,String sheetName,int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream( excelpath); // provied the path of excel file 
		Workbook wb = WorkbookFactory.create(fis);  // make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // get into the sheet 
		Row row = sheet.getRow(rowNo);  // get into the desired row 
		Cell cell = row.createCell(cellNo);  // create the desired cell 
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
	
}
