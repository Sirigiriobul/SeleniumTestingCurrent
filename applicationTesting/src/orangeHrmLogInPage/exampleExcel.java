package orangeHrmLogInPage;

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


public class exampleExcel {

	 
public static void main(String[] args) throws IOException {
	

			WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		String	applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
		driver.get(applicationUrlAddress);//Getting The Data from The ExcelWorkbook
			 //Identifying The File
	FileInputStream testData=new FileInputStream("./excelFile/Read Operation.xlsx");
			
			 //Identifying the Workbook
			 XSSFWorkbook workbook=new XSSFWorkbook(testData);
			 
			 //IDentifying the Sheet in the WorkBook
			 XSSFSheet sheet=workbook.getSheet("Sheet1");
			 
			
			 //Identifying the Active rows in the Sheet
				int rowsCount=sheet.getLastRowNum();
				System.out.println("The Active Rows In The Sheet Are:-"+rowsCount);
				
			for(int row=1;row<=rowsCount;row++)
			{
					//going to all the active Rows
					Row sheetRow=sheet.getRow(row);

							//USERNAME
   Cell userName=sheetRow.getCell(1);
   String userNameData=userName.getStringCellValue();
   WebElement   userNameElement= driver.findElement(By.id("txtUsername"));
	userNameElement.sendKeys(userNameData);
	System.out.println("The UserName is :- "+userNameData);
							
	             //PASSWORD
	Cell passWord=sheetRow.getCell(2);
	String passWordData=passWord.getStringCellValue();
	WebElement	passWordElement=driver.findElement(By.id("txtPassword"));
    passWordElement.sendKeys(passWordData); 
									
	System.out.println("The PassWord is :- "+passWordData);
				 
	WebElement	logInButton=driver.findElement(By.id("btnLogin"));	
		logInButton.click();
			}
			
}
}
								
									
			//PROPERTY OF WELCOME ADMIN ELEMENT
		/*						
								Cell expected_HomePageText=sheetRow.getCell(8);
								String expectedHomePageText=expected_HomePageText.getStringCellValue();
								//System.out.println("The Expected HomePage Title:- "+expectedHomePageText);
								log.info("The Expected HomePage Title:- "+expectedHomePageText);
								
								By welcomeAdminElement=By.id("welcome");
								WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
								String actualHomePageText=welcomeAdminL.getText();
								Cell actual_HomepageText=sheetRow.createCell(9);
								actual_HomepageText.setCellValue(actualHomePageText);
								//System.out.println("The Actual HomePage Title:- "+actualHomePageText);
								log.info("The Actual HomePage Title:- "+actualHomePageText);
								
								
								if(actualHomePageText.contains(expectedHomePageText))
								{
									//System.out.println("HomePage Titles Are Matching-PASS");
									log.info("HomePage Titles Are Matching-PASS");
									Cell homepageTitleResult=sheetRow.createCell(10);
									homepageTitleResult.setCellValue("HomePage Titles Are Matching-PASS");
									
									welcomeAdminL.click();
									Thread.sleep(2000);
									
									//PROPERTY OF LOGOUT ELEMENT
									By logOutElement=By.linkText(pr.getProperty("logOutElement"));
									WebElement logOutL=driver.findElement(logOutElement);
									logOutL.click();
									
								}
								else
								{
									//System.out.println("Failed To Login-FAIL");	
									log.error("Failed To Login-FAIL");
									Cell failedHomepageTitleResult=sheetRow.createCell(10);
									failedHomepageTitleResult.setCellValue("Failed To Login-FAIL");
									
								
									
								}
						}
					}
					catch(Exception errorcode)
					{
						//System.out.println("Failed To Login-FAIL");	
						log.error("Failed To Login-FAIL");
						Cell failedHomepageTitleResult=sheetRow.createCell(10);
						failedHomepageTitleResult.setCellValue("Failed To Login-FAIL");
						
						System.out.println(errorcode);
						
					}
			
			
			}
			
			FileOutputStream testResults= new FileOutputStream("C:\\Users\\bijja\\OneDrive\\Desktop\\AutomationTesting\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\LogInTestResults5.xlsx");
			workbook.write(testResults);
			
		*/

