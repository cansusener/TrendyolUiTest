package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseMethods {
    Actions actions;
    //url's
    private String homePageUrl = "https://www.trendyol.com/";
    private String loginUpUrl = "https://www.trendyol.com/uyelik";
    private By homePagePopUp = By.className("fancybox-close");

    private By accountButtonBy = By.className("account-user");

    //product properties
    private By electronicField = By.cssSelector("a[href='/butik/liste/elektronik']");
    private By tvDisplayAndSound = By.partialLinkText("TV & Görüntü & Ses");

    private By componentListBy = By.className("component-list");

    //searchBox properties
    private By searchBoxBy = By.className("search-box");
    private By suggestionTitleBy = By.className("suggestion-title");


    public HomePage(WebDriver webDriver) {
        super(webDriver);
        actions = new Actions(webDriver);
    }

    public void goHomePage(){
        webDriver.get(homePageUrl);
        click(homePagePopUp,3);
    }
   public void goLoginPage(){
        webDriver.get(loginUpUrl);
        click(homePagePopUp,3);
    }

    public String getAccountText() {
        return getText(accountButtonBy);
    }

    public ProductPage goToTvSound(){
        moveElement(electronicField);
        click(tvDisplayAndSound,3);
        return new ProductPage(webDriver);
    }
}
