package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

    private By resultTextBy = By.cssSelector(".dscrptn > h1");

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getResultText() {
        return webDriver.findElement(resultTextBy).getText();
    }
}
