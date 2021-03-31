package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BaseMethods {

    private String url = "https://10minutemail.net/?lang=tr";
    private By mail = By.id("fe_text");

    public MailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String takeMail(){

        webDriver.get(url);
        return webDriver.findElement(mail).getAttribute("value");
    }
}
