package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGTestOne {
  
  @BeforeClass
  public void launchbrowser() {
	  System.out.println("launch Firefox browser");
  }
  
  @BeforeMethod
	public void login() {
		System.out.println("login to app");
	}
  
  @Test
	public void composemail() {
		System.out.println("composed mail test");
	}
	
	@Test
	public void deletemain() {
		System.out.println("mail deleted test");
	}
	
	@Test
	public void searchmail() {
		System.out.println("search mail test");
	}
	
	@AfterMethod
	public void loginout() {
		System.out.println("login out to mail");
	}
	
	@AfterClass
	public void quitbrowser() {
		System.out.println("");
	}

}
