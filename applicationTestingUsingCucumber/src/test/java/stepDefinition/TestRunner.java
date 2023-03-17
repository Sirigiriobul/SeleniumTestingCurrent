package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestRunner {
WebDriver driver;
String orangeHrmUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@Given("^user should open a browser on the system$")
public void user_should_open_a_browser_on_the_system() {
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@When("^user enters orangehrm url address$")
public void user_enters_orangehrm_url_address() {
	driver.get(orangeHrmUrlAddress);
}

@Then("^user should log into Home page$")
public void user_should_log_into_Home_page() {

}

@Then("^user should close the orange Hrm application$")
public void user_should_close_the_orange_Hrm_application() {
	
}


}
