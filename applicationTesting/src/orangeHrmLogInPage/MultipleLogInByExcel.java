
package orangeHrmLogInPage;


import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLogInByExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
WebDriver driver=new ChromeDriver();
String orangeHrmUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(orangeHrmUrlAddress);

FileInputStream file =new FileInputStream("./excelFile/Read Operation.xlsx");
XSSFWorkbook workBook =new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");
int totalRowCount=sheet.getLastRowNum();
for (int row=1;row<totalRowCount;row++)
{
	Row sheetRow=sheet.getRow(row);

	{	Cell userName=sheetRow.getCell(1);
	String	userNamedata=userName.getStringCellValue();
System.out.println("The username data is :-"+userNamedata);
WebElement userNameElement=driver.findElement(By.id("txtUsername"));
userNameElement.sendKeys(userNamedata);

		Cell passWord=sheetRow.getCell(2);
	String	passWordData=passWord.getStringCellValue();
WebElement passWordElement=driver.findElement(By.id("txtPassword"));
passWordElement.sendKeys(passWordData);
System.out.println(passWordData);
WebElement logInButton=driver.findElement(By.id("btnLogin"));
logInButton.click();

	}System.out.println();}
driver.close();}}
/*
for(int row=1;row<=rowsCount;row++)
{	//going to all the active Rows
		Row sheetRow=sheet.getRow(row);
//GETTING THE USERNAME AND PASSWORD FROM EXCEL WORKBOOK	
				//USERNAME
	            Cell userName=sheetRow.getCell(06);
	            String userNameData=userName.getStringCellValue();
				System.out.println("The UserName is :- "+userNameData);
				//PASSWORD
				Cell passWord=sheetRow.getCell(07);
				String passWordData=passWord.getStringCellValue();
				System.out.println("The PassWord is :- "+passWordData);
*/

