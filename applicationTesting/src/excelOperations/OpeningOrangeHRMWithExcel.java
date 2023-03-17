package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningOrangeHRMWithExcel {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
String	applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(applicationUrlAddress);
FileInputStream file =new FileInputStream("./excelFile/Read Operation.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");
Row row=sheet.getRow(0);
Row row1=sheet.getRow(1);
Cell cell=row.getCell(0);
Cell cell1=row1.getCell(0);
//String readData=cell.getStringCellValue();
String userName=cell.getStringCellValue();
System.out.println(userName);

String passWord=cell1.getStringCellValue();
System.out.println(passWord);

WebElement userNameElement=driver.findElement(By.id("txtUsername"));
userNameElement.sendKeys(userName);
WebElement passWordElement=driver.findElement(By.id("txtPassword"));
passWordElement.sendKeys(passWord);
WebElement logInButton=driver.findElement(By.id("btnLogin"));
Thread.sleep(3000);
logInButton.click();

Thread.sleep(2000);
driver.close();
}
}
