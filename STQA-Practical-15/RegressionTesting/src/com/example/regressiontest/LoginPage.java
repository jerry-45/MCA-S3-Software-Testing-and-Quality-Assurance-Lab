package com.example.regressiontest;

import java.util.Scanner;

public class LoginPage {

	private String username;
    private String password;

    public void displayLoginPage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login Page");
        System.out.print("Enter Username: ");
        username = scanner.nextLine();

        System.out.print("Enter Password: ");
        password = scanner.nextLine();
    }

    public boolean authenticate() {
        // For simplicity, let's consider the login is successful if both username and password are non-empty
        return !username.isEmpty() && !password.isEmpty();
    }

}
