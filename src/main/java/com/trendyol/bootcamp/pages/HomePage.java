package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private By componentListBy = By.className("component-list");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(componentListBy));
    }
}
