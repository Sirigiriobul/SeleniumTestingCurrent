package com.orangeHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogInPage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
String	orangeApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(orangeApplicationUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement userNameElement=driver.findElement(By.id("txtUsername"));
userNameElement.click();

}
}
