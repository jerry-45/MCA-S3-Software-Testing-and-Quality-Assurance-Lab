package com.stqa.practical.two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/default.asp");
		driver.manage().window().maximize();
	}

}
