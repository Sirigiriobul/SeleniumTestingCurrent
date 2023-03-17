package selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NaukriSelection {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
driver=new ChromeDriver();
String naukriApplicationUrlAddress="https://www.naukri.com/mnjuser/homepage";
driver.get(naukriApplicationUrlAddress);

// class="nI-gNb-sb__placeholder"
WebElement searchElement=driver.findElement(By.className("nI-gNb-sb__placeholder"));
searchElement.click();
//class="nI-gNb-dd"
WebElement experienceBoxElement=driver.findElement(By.className("nI-gNb-dd"));
experienceBoxElement.click();
Thread.sleep(1000);
Select selection=new Select(experienceBoxElement);
selection.selectByIndex(2);
Thread.sleep(2000);
driver.close();
}
}
