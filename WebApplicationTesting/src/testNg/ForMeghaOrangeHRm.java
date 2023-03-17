package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ForMeghaOrangeHRm {
public static void main(String[] args) {
	

	WebDriver driver;
	driver=new EdgeDriver();
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
String orangehrmapplicationurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

driver.get(orangehrmapplicationurl);
}	
	
	
}


