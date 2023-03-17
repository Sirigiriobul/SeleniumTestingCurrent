package orangeHrm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfOrangeHrm {
	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
	String	orangeApplicationUrlAddres="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(orangeApplicationUrlAddres);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

File	orangeHrm=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(orangeHrm, new File("./screenshot/ORANGE.PNG"));
	Thread.sleep(1000);
		driver.close();
	}

}
