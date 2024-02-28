package com.example.regressiontest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.example.regressiontest.LoginPage;

public class LoginTest {
	@Test
    public void testLoginSuccess() {
        LoginPage loginPage = new LoginPage();
        
        // Mock user input for testing purposes
        System.setIn(new java.io.ByteArrayInputStream("user123\npassword123".getBytes()));

        loginPage.displayLoginPage();
        boolean isAuthenticated = loginPage.authenticate();

        Assert.assertTrue(isAuthenticated, "Login failed for valid credentials");
    }

    @Test
    public void testLoginFailure() {
        LoginPage loginPage = new LoginPage();
        
        // Mock user input for testing purposes
        System.setIn(new java.io.ByteArrayInputStream("\n".getBytes()));

        loginPage.displayLoginPage();
        boolean isAuthenticated = loginPage.authenticate();

        Assert.assertFalse(isAuthenticated, "Login succeeded for empty credentials");
    }
}
