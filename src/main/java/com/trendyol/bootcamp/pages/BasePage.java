package com.trendyol.bootcamp.pages;

import com.trendyol.bootcamp.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper {

    private By searchBoxBy = By.className("search-box");
    private By suggestionTitleBy = By.className("suggestion-title");
    private By accountButtonBy = By.className("account-user");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage getLoginPage() {
        click(accountButtonBy, 10);
        return new LoginPage(webDriver);
    }

    public String getAccountText() {
        return getText(accountButtonBy);
    }

    public SearchResultPage search(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword + Keys.ENTER);
        return new SearchResultPage(webDriver);
    }

    public void enterSearchKeyword(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword);
    }

    public boolean isSuggestionDisplayed() {
        return webDriver.findElement(suggestionTitleBy).isDisplayed();
    }
}
