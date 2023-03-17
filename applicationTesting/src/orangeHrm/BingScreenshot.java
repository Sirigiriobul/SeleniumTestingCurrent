package orangeHrm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
driver=new ChromeDriver();
	String	bingUrlAddress="https://www.bing.com/";
driver.get(bingUrlAddress);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
File bingApplicationScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(bingApplicationScreenshot, new File("./screenshot/bingScreenshot.png"));
Thread.sleep(2000);

}
}
