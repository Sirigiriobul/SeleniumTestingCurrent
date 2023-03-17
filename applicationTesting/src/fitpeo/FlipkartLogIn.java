package fitpeo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLogIn {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
//	https://www.flipkart.com/
	String applicationUrlAddress="https://www.flipkart.com/";
	driver.get(applicationUrlAddress);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("successfully launched Flipkart");
Actions act =new Actions(driver);
	

act.sendKeys(Keys.ESCAPE).build().perform();
	
	
WebElement	searchBox=driver.findElement(By.className("_3704LK"));
	searchBox.sendKeys("ipad");
WebElement	searchButton=driver.findElement(By.className("L0Z3Pu"));
	searchButton.click();
	//Parent window
		String	parentHandle=driver.getWindowHandle();
		System.out.println("parent ="+parentHandle);

WebElement	appleIpad=driver.findElement(By.className("_4rR01T"));
appleIpad.click();

Set <String>allWindowHandles=driver.getWindowHandles();
int handleCount=allWindowHandles.size();
System.out.println("TOtal windows count"+handleCount);
//Handling new window using Windows handling	
for (String child:allWindowHandles)
{
	if (parentHandle.equalsIgnoreCase(child))
	{
		driver.switchTo().window(child);
	String
	newPageUrl=driver.getCurrentUrl();
		System.out.println(newPageUrl);
		WebElement ipadSelection=driver.findElement(By.className("col col-7-12"));
		ipadSelection.click();
		Thread.sleep(2000);
		driver.findElement(By.className("_2KpZ6l _2U9uOA ihZ75k _3AWRsL")).click();
driver.close();
	}
driver.switchTo().window(parentHandle);
System.out.println(parentHandle);

		
	
	
	
}



}

}
