package com.Gooogle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BingTitle {
	public static void main(String[] args) {
		WebDriver driver;
	
System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
 driver =new ChromeDriver();
String expectedUrlAddress="https://www.bing.com/";
driver.get( expectedUrlAddress);
String actualUrlAddress=driver.getCurrentUrl();
System.out.println(actualUrlAddress);

String expectedTitle="bing";
String actualTitle=driver.getTitle();
System.out.println(actualTitle);
if (actualTitle.equalsIgnoreCase(expectedTitle))
	System.out.println("True");
else
	System.out.println("False");
driver.close();
	}

}


