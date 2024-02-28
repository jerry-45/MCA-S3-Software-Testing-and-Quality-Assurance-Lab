package com.stqa.practical.fourteen;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class assertEquals {
	 @Test
	  public void testAssertFunctions() {
		  System.setProperty("webdriver.gecko.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();	
		  
		  driver.navigate().to("https://www.browserstack.com/");
		  
		  String ActualTitle = driver.getTitle();
		  String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		  
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
	  }
}
