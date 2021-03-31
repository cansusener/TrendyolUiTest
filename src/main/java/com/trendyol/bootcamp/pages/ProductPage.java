package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class ProductPage extends BaseMethods {

    private By addBasket = By.className("add-to-basket-button");
    private By productName = By.className("prdct-desc-cntnr-name");
    private By basketButton = By.className("account-basket");
    private By productSizeInBasket = By.className("counter-content");
    private By productDetailAmount = By.className("prc-dsc");
    List<WebElement> product;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addToBasketProduct(){
        List<WebElement> productList =  webDriver.findElements(addBasket);
        productList.get(0).click();
    }

    public String getProductTitle(){
        List<WebElement> list = webDriver.findElements(productName);
        String title = list.get(0).getAttribute("title");
        return title;
    }

    public BasketPage clickBasket(){
        click(basketButton,5);
        return new BasketPage(webDriver);
    }

    public String getproductSizeInBasket()
    {
        WebElement element = webDriver.findElement(productSizeInBasket);
        String product = element.getText();
        return product;
    }

    public String getProductAmount ()
    {
        WebElement element = webDriver.findElement(productDetailAmount);
        String productDetailAmount = element.getText();
        return productDetailAmount;
    }
}
