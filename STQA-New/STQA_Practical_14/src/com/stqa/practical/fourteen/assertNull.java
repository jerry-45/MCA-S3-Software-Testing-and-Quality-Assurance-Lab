package com.stqa.practical.fourteen;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class assertNull {
	@Test
	  public void testAssertFunctions() {
		  System.setProperty("webdriver.gecko.driver","E:\\\\Study Materials\\\\Academics\\\\MCA\\\\MCA SEM III\\\\# Repos\\\\MCA-Software-Testing-and-Quality-Assurance-Lab\\\\Required Tools & Software\\\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();	
		  
		  driver.navigate().to("https://www.browserstack.com/");
		  
		  Boolean VerifyAssertNull = null;
		  
		  Assert.assertNull(VerifyAssertNull);
	  }
}