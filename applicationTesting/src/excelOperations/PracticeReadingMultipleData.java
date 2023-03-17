package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeReadingMultipleData {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("./excelFile/Multilple Read operation.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("Sheet1");
int	totalRowsCount=sheet.getLastRowNum();
	for(int row=0;row<totalRowsCount;row++)
	{
	Row	eachRow=sheet.getRow(row);
	
int	totalCellCount=eachRow.getLastCellNum();	

for(int cell=0;cell<totalCellCount;cell++)
{
   Cell eachcell=eachRow.getCell(cell);
  String eachCellData=eachcell.getStringCellValue();
	System.out.println(eachCellData);
	
	}

System.out.println();
	}
	
	
	
			
	
	
	
}
}
