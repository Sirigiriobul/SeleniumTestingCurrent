package orangeHrm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws IOException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
driver=new ChromeDriver();
	String	applicationURL="https://www.google.com/search?q=gog&rlz=1C1RXQR_enIN1020IN1020&oq=gog&aqs=chrome..69i57j0i271l3j69i60.1425j0j7&sourceid=chrome&ie=UTF-8";
driver.get(applicationURL);
//File googleNoInternet=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(googleNoInternet, new File("./screenshot/NOINTERNET.png"));



}
}
