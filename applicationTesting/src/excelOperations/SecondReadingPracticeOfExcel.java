package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondReadingPracticeOfExcel {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("./excelFile/practice Excel.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("Sheet1");
	
int	totalRowCount=sheet.getLastRowNum();

	for (int row=0;row<=totalRowCount;row++)
	{
	Row	eachRow=sheet.getRow(row);
	
	
int	totalCellCount=eachRow.getLastCellNum();
for (int cell=0;cell<totalCellCount;cell++)
{
Cell	eachCell=eachRow.getCell(cell);

String totalData=eachCell.getStringCellValue();
System.out.print(totalData);
	
}
System.out.println();

		
	}
}
}
