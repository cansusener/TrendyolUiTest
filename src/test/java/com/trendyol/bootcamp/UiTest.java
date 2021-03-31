package com.trendyol.bootcamp;

import com.trendyol.bootcamp.pages.BasketPage;
import com.trendyol.bootcamp.pages.HomePage;
import com.trendyol.bootcamp.pages.ProductPage;
import com.trendyol.bootcamp.pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UiTest extends BaseTest {
    @Test
    public void exampleUiTest(){


        HomePage homePage = new HomePage(webDriver);
        homePage.goHomePage();

        ProductPage productList =  homePage.goToTvSound();

        SearchResultPage searchResultPage = new SearchResultPage(webDriver);
        String searchResultText = searchResultPage.getResultText();
        assertEquals("TV Görüntü Ses Sistemleri", searchResultText);

        productList.addToBasketProduct();
        String productTitle = productList.getProductTitle();
        String productDetailAmount = productList.getProductAmount();
        BasketPage basketPage = productList.clickBasket();

        SignInTest signInTest = new SignInTest();
        signInTest.shouldSignUp();

        // Sepete atılan ürünün adıni kontrol etsin
        String productTitleInBasket = basketPage.getProductBasket();
        Assert.assertTrue(productTitleInBasket.contains(productTitle));

        Assert.assertEquals(productDetailAmount, productList.getProductAmount());
        Assert.assertEquals("1", productList.getproductSizeInBasket());

    }
}
