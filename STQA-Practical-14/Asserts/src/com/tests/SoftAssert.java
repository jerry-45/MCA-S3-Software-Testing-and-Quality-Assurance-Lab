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

public class SoftAssert {
  @Test
  public void softAssert() {
	  System.setProperty("webdriver.gecko.driver", "D:\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  //SoftAssert softAssert = new SoftAssert();
	  driver.navigate().to("https://www.browserstack.com/");
	  String getActualTitle = driver.getTitle();
	  Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	  assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	  assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	  assertNull(verifyTitle);
	  assertNotNull(verifyTitle);
	  assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
	  assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
	  //assertAll();

  }
}
