
package com.Gooogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomatingSignInElement {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
String applicationUrlAddress="https://www.amazon.in/";
driver.get(applicationUrlAddress);

//The Element having Anchor tag,so we used linktext to automate it.
WebElement signIn=driver.findElement(By.partialLinkText("sign in"));
//To get signIn element text
String signInElementText=signIn.getText();
System.out.println(signInElementText);

signIn.click();

driver.close();
	}

}
