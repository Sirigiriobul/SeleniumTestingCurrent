package com.Gooogle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
String expectedGoogleUrlAddress="https://www.google.com/";
driver.get(expectedGoogleUrlAddress);
String actualgoogleUrlAddress=driver.getCurrentUrl();
		System.out.println(actualgoogleUrlAddress);
		if(actualgoogleUrlAddress.equals(actualgoogleUrlAddress))
		{		System.out.println("The actual Title is:"+actualgoogleUrlAddress);;
		}
		else
			System.out.println("False Title");
		
		
		driver.close();
		
		
	}

}
