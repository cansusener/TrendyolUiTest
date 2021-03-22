package com.trendyol.bootcamp;

import com.trendyol.bootcamp.pages.HomePage;
import com.trendyol.bootcamp.pages.LoginPage;
import com.trendyol.bootcamp.users.User;
import com.trendyol.bootcamp.users.UserPool;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    /**
     * 1- inheritance
     * 2- encapsulation
     * 3- interface
     * <p>
     * case 1
     * ------
     * 1- browseri actim
     * 2- www.trendyol.com'a gittim
     * 3- popupu kapatmak gerekecek
     * 4- searchbar'a telefon yazdim
     * 5- entera bastim
     * 6- sayfanin ust kisminda telefon yazdigini kontrol ettim
     * <p>
     * user actions
     * ------
     * click
     * input
     * scroll
     * url'e gider
     * hover yapabilir
     * surukle birak (click)
     * speech recognition
     * read
     * *
     */

    @Test
    public void shouldLogin() {
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = homePage.getLoginPage();

        User user = UserPool.getUser1();
        homePage = loginPage.login(user);

        String accountButtonText = homePage.getAccountText();
        assertEquals(accountButtonText, "Hesabım");
    }

    @Test
    public void shouldLogin2() {
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = homePage.getLoginPage();

        User user = UserPool.getUser2();
        homePage = loginPage.login(user);

        String accountButtonText = homePage.getAccountText();
        assertEquals(accountButtonText, "Hesabım");
    }
}
