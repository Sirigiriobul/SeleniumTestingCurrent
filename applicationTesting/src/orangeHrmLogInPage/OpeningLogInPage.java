
package orangeHrmLogInPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningLogInPage {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
String	orangeHrmLogInPageUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(orangeHrmLogInPageUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//File logInPageScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(logInPageScreenshot,new File("./screenshot/logInPageScreenShot.png") );
//name="txtUsername
 WebElement userNameElement=driver.findElement(By.name("txtUsername"));
userNameElement.sendKeys("Obul123");
//id="txtPassword"
WebElement  passWordElement=driver.findElement(By.id("txtPassword"));
passWordElement.sendKeys("Obulobul@123");
//class="button
 WebElement logInButton=driver.findElement(By.className("button"));
logInButton.click();

Thread.sleep(2000);
//File homePageScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(logInPageScreenshot, new File("./screenshot/orangeHRMHomePageScreenshot.png") );
Actions act=new Actions(driver);

WebElement adminElement=driver.findElement(By.linkText("Admin"));
act.moveToElement(adminElement).build().perform();
WebElement PIMElement=driver.findElement(By.linkText("PIM"));
act.moveToElement(PIMElement).build().perform();
WebElement leaveElement=driver.findElement(By.linkText("Leave"));
leaveElement.click();
WebElement recruitmentElement=driver.findElement(By.linkText("Recruitment"));
recruitmentElement.click();

//*[@id="candidateSearch_keywords"]
//id="candidateSearch_keywords"
//       /html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[6]/input
WebElement keyWordElement=driver.findElement(By.xpath("//*[@id='candidateSearch_keywords']"));
keyWordElement.sendKeys("12345");
//*[@id="candidateSearch_fromDate"]
/*WebElement calendarElement=driver.findElement(By.xpath("//*[@id=\"candidateSearch_fromDate\"]"));
calendarElement.click();
calendarElement.sendKeys("2021-09-21");*/
WebElement  calendarElement=driver.findElement(By.className("ui-datepicker-trigger"));
calendarElement.click();

Thread.sleep(2000);



driver.close();

}
}
