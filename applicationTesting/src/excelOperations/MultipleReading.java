package excelOperations;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleReading {
public static void main(String[] args) throws IOException {
	FileInputStream multileFile=new FileInputStream("./excelFile/practice Excel.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(multileFile);
	XSSFSheet sheet=workBook.getSheet("Sheet1");
	
	int rowCount=sheet.getLastRowNum();
//	System.out.println(lastRowNumber);
	
	for (int row=0;row<rowCount;row++)
	{
	Row eachRow=sheet.getRow(row);
	int cellCount =eachRow.getLastCellNum();
	for (int cell=0;cell<cellCount;cell++)
	{
	Cell eachcell=eachRow.getCell(cell);
	
String	allData=eachcell.getStringCellValue();
	System.out.print(allData+"     ");
		}
	System.out.println();
}
}
}