package com.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void testAssertFunctions() {
	  System.setProperty("webdriver.gecko.driver", "D:\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("https://www.browserstack.com/");
	  String ActualTitle = driver.getTitle();
	  String verifyAssertNull=null;
	  String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	  Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	  Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
	  assertEquals(ExpectedTitle, ActualTitle);
	  assertNotEquals(ExpectedTitle, "browserstack");
	  assertTrue(verifyTitleIsPresent);
	  assertFalse(verifyTitleIsChanged);
	  assertNotNull(verifyTitleIsPresent);
	  assertNull(verifyAssertNull);

  }
}
