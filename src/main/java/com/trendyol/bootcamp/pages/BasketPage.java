package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends  BaseMethods {

    By basket = By.className("pb-item");
    By basketAmount = By.className("pb-basket-item-price");
    By basketButton = By.className("btn Basket_CheckoutButton");
    private By productSizeInBasket  = By.className("counter-content");
    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getProductBasket(){
        return webDriver.findElement(basket).getAttribute("title");
    }

    public String getProductAmount(){
        return webDriver.findElement(basketAmount).getText();
    }

    public void clickBasketButton(){
        click(basketButton,1);
    }
}
