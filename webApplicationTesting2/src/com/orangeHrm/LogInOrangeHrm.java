package com.orangeHrm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LogInOrangeHrm {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("D:\\Desktop\\TestingSeleniumWorking\\webApplicationTesting2\\excelOperation\\ExcelOperation.xlsx");
	XSSFWorkbook workBook =new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("sheet1");
	Row row=sheet.getRow(0);
Cell	cell=row.getCell(0);
String data=cell.getStringCellValue();
System.out.println(data);
	
}
}
