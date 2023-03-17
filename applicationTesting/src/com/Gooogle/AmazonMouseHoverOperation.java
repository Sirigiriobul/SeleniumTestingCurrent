package com.Gooogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AmazonMouseHoverOperation {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
driver=new ChromeDriver();
String urlAddress="https://www.amazon.in/";
driver.get(urlAddress);
Actions act=new Actions(driver);
WebElement amazonSignInElement=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//	act.moveToElement(amazonSignInElement).build().perform();
	
// WebElement	yourOrdersElement=driver.findElement(By.className("nav-text"));
//
// yourOrdersElement.click();
	
	
	}

}
