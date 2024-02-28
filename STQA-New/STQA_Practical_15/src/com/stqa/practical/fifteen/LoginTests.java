package com.stqa.practical.fifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver, e.g., ChromeDriver
        System.setProperty("webdriver.gecko.driver", "E:\\\\Study Materials\\\\Academics\\\\MCA\\\\MCA SEM III\\\\# Repos\\\\MCA-Software-Testing-and-Quality-Assurance-Lab\\\\Required Tools & Software\\\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("C:\\Users\\Administrator\\OneDrive\\Desktop\\login.html"); // Replace with the actual path
    }

    @Test
    public void testValidLogin() {
        // Perform valid login
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("validUsername");
        passwordInput.sendKeys("validPassword");
        loginButton.click();

        // Verify login success (adjust the assertion based on your application)
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='success']"));
        Assert.assertTrue(successMessage.isDisplayed());
    }

    @Test
    public void testInvalidLogin() {
        // Perform invalid login
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("invalidUsername");
        passwordInput.sendKeys("invalidPassword");
        loginButton.click();

        // Verify login failure (adjust the assertion based on your application)
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error']"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

//    @AfterClass
//    public void tearDown() {
//        // Close the WebDriver
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
