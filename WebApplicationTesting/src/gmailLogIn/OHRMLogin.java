package gmailLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRMLogin {
WebDriver driver;

@Test
public void setUp() {

	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
String	applicationUrl="https://www.facebook.com/";
driver=new EdgeDriver();
driver.get(applicationUrl);

}
}