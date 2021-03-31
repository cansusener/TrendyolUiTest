package com.trendyol.bootcamp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseMethods {
    protected WebDriver webDriver;

    WebDriverWait wait = new WebDriverWait(webDriver,20);

    protected Actions actions;


    public BaseMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.actions = new Actions(this.webDriver);
    }
    public void sendKeys(By byElement, String text) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).sendKeys(text);
    }

    public void click(By byElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).click();
    }

    public String getText(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();
    }

    public void moveElement(By byElement) {

        WebElement element = webDriver.findElement(byElement);
        String strJavaScript = "var element = arguments[0]; var mouseEventObj = document.createEvent('MouseEvents'); mouseEventObj.initEvent( 'mouseover', true, true ); element.dispatchEvent(mouseEventObj);";
        ((JavascriptExecutor) webDriver).executeScript(strJavaScript, element);

    }

    public void scrollPage(){
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,1000)");
    }
    //  "arguments[0].scrollIntoView(true);"

    public List<WebElement> findElements(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElements(by);
    }




}
