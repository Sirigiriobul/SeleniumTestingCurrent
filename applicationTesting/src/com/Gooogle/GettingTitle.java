package com.Gooogle;

import org.openqa.selenium.chrome.ChromeDriver;


public class GettingTitle {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./bowserDriverFiles/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
String titleOfGoogle=driver.getTitle();
System.out.println(titleOfGoogle);

driver.close();
	}

	
}
