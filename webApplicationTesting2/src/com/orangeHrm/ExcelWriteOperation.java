package com.orangeHrm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperation {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("D:\\Desktop\\TestingSeleniumWorking\\webApplicationTesting2\\excelOperation\\Write Operation Megha.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("sheet1");
Row row=sheet.createRow(1);
Cell cell=row.createCell(0);
cell.setCellValue("MeghaGulli");
FileOutputStream fileSaving=new FileOutputStream("D:\\Desktop\\TestingSeleniumWorking\\webApplicationTesting2\\excelOperation\\Write Operation Megha.xlsx");
workBook.write(fileSaving);

System.out.println("megha");
}
}
