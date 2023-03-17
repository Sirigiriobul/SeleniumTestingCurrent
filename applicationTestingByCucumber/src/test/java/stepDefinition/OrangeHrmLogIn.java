package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrmLogIn {
	WebDriver driver;
	@Given("^user should open a browser on the system$")
	public void user_should_open_a_browser_on_the_system() {
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TestingSeleniumWorking\\applicationTestingByCucumber\\browserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("^user enters orangeHrm url address$")
	public void user_enters_orangeHrm_url_address() {
String		applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(applicationUrlAddress);
	
	}

	@Then("^user should be able to navigate to orangeHrm application$")
	public void user_should_be_able_to_navigate_to_orangeHrm_application() {
	
	System.out.println("user succesfully entered login page");}

	@Then("^user should close the application$")
	public void user_should_close_the_application() {
		
		driver.close();
	}


	
	
}
