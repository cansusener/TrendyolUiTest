package com.trendyol.bootcamp.pages;

import com.trendyol.bootcamp.users.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BaseMethods {

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By registerEmailBy = By.id("register-email");
    private By registerPasswordBy = By.id("register-password-input");
    private By registerSubmitButton= By.className("q-primary q-fluid q-button-medium q-button submit");
    private String signUpUrl = "https://www.trendyol.com/uyelik";

    public void goSignInPage(){
        webDriver.get(signUpUrl);
    }

    public HomePage signIn(String email, String password) {
        sendKeys(registerEmailBy, email);
        sendKeys(registerPasswordBy, password);
        click(registerSubmitButton, 5);

        HomePage homePage = new HomePage(webDriver);

        return homePage;
    }
}
