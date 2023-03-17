package handlingScrollBarInApsrtc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
WebDriver driver;
driver=new ChromeDriver();
String applicationUrlAddress="https://apsrtconline.in/oprs-web/guest/home.do?h=1";
driver.get(applicationUrlAddress);
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



}
}
