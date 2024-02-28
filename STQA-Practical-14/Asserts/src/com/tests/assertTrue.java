package com.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class assertTrue {
  @Test
  public void testAssertFunctions() {
	  System.setProperty("webdriver.gecko.driver","D:\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();	
	  
	  driver.navigate().to("https://www.browserstack.com/");
	  
	  Boolean VerifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	  
	  Assert.assertTrue(VerifyTitle);
  }
}
