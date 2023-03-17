package orangeHrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileScript {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
String	applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(applicationUrlAddress);
FileInputStream profile=new FileInputStream("./src/properties/orangeHrm.properties");
Properties prop=new Properties();
prop.load(profile);
WebElement userNameElement=driver.findElement(By.id(prop.getProperty("userName")));
userNameElement.sendKeys("obul123");
WebElement  passWordElement=driver.findElement(By.id(prop.getProperty("passWord")));
passWordElement.sendKeys("Obul123");
}
}
