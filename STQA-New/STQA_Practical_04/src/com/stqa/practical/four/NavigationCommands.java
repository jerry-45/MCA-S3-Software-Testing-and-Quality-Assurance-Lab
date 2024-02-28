package com.stqa.practical.four;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// List of Navigation Commands
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().to("https://artoftesting.com/");	// 1
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().back();	// 2
		String str1 = driver.getCurrentUrl();
		System.out.println(str1);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().forward();	// 3
		String str2 = driver.getCurrentUrl();
		System.out.println(str2);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().refresh();	// 4
		String str3 = driver.getCurrentUrl();
		System.out.println(str3);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.quit();
	}

}
