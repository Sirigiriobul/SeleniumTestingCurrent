package propertiesScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInByPropertiesFile {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	String faceBookUrl="https://www.facebook.com/";
	driver.get(faceBookUrl);
	FileInputStream profile=new FileInputStream("./src/properties/faceBook.Properties");
Properties prop=new Properties();
prop.load(profile);
// id="email
WebElement userNameElement=driver.findElement(By.id(prop.getProperty("userName")));
userNameElement.sendKeys("Obul123");	
	driver.close();
	}

	
}
