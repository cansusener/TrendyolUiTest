package com.trendyol.bootcamp;

import com.trendyol.bootcamp.pages.HomePage;
import com.trendyol.bootcamp.pages.SignInPage;
import com.trendyol.bootcamp.pages.MailPage;
import com.trendyol.bootcamp.users.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test
    public void shouldSignUp(){

        MailPage takeMail = new MailPage(webDriver);
        User user = new User();
        user.setEmail(takeMail.takeMail());

        SignInPage signInPage = new SignInPage(webDriver);
        signInPage.goSignInPage();
        HomePage homePage = signInPage.signIn(user.getEmail(),user.getPassword());
        String customerText= homePage.getAccountText();

        Assert.assertEquals(customerText,"Hesabım");

    }
}
