package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestingReadingExcelOperations {
public static void main(String[] args) throws IOException {
//	Finding the file
	FileInputStream file =new FileInputStream("./excelFile/Read Operation.xlsx");
//  Finding the workbook
	XSSFWorkbook workBook=new XSSFWorkbook(file);
//  Finding the sheet
	XSSFSheet sheet =workBook.getSheet("sheet1") ;
//  Finding ROW data
	Row row=sheet.getRow(0);
//Finding cell/column data
	Cell cell=row.getCell(0);

//  Getting data from the ROW of a CELL
String	sampleData=cell.getStringCellValue();

	 System.out.println(sampleData);
	 
	
	
}
}
