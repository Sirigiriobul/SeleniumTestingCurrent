package excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperationsExample {

	public static void main(String[] args) throws IOException {
FileInputStream file =new FileInputStream("./excelFile/Write Operations.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");
Row row=sheet.createRow(0);
Cell cell=row.createCell(0);
cell.setCellValue("Testing");

FileOutputStream fileData=new FileOutputStream("./excelFile/Write Operations.xlsx");
workBook.write(fileData);


System.out.println(fileData);

}

}

