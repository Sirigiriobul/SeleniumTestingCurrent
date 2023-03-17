package alerts;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsInApsrtc {
public static void main(String[] args) throws InterruptedException {
	Alert alt;
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String applicationUrlAddress ="https://www.apsrtconline.in/oprs-web/";
	driver.get(applicationUrlAddress);
//checkAvaliabilityElement id="searchBtn"
WebElement	checkAvailabilityElement=driver.findElement(By.id("searchBtn"));
	checkAvailabilityElement.click();
	alt=driver.switchTo().alert();
	Thread.sleep(2000);
	alt.accept();
	Thread.sleep(2000);
	
//alt.dismiss();

	
	driver.close();
	}


}
