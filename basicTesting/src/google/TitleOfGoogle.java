package google;

import org.openqa.selenium.edge.EdgeDriver;

public class TitleOfGoogle {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.google.com/");


	}

}
