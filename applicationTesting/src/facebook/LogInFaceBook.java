package facebook;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInFaceBook {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	WebDriver driver;
	driver =new ChromeDriver();
String	applicatiopnUrlAddress="https://www.facebook.com/";
	driver.get(applicatiopnUrlAddress);
	FileInputStream file=new FileInputStream("./src/properties/faceBook.properties");
	Properties prop=new Properties();
	prop.load(file);
//WebElement	userNameElement=driver.findElement(By.id("userName"));
//userNameElement.sendKeys("Obulesh123");
WebElement passWordElement=driver.findElement(By.id(prop.getProperty("passWord")));
passWordElement.sendKeys("obul");
}
}

