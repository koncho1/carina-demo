package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.pages.common.LoginPageBase;
import com.zebrunner.carina.demo.gui.pages.desktop.LoginPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest implements IAbstractTest {

    //Tests if login page opens properly
    @Test
    public void testLoginOpens(){
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginPageBase loginPage = homePage.getLoginPage();
        Assert.assertTrue(loginPage.isPageOpened());
    }
    //Tests if error shows after entering incorrect credentials
    @Test
    public void testIncorrectCredentials() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginPageBase loginPage = homePage.getLoginPage();
        Assert.assertTrue(loginPage.isPageOpened());
        ExtendedWebElement loginField= loginPage.getLoginField();
        loginField.click();
        loginField.type("abc");
        loginPage.getPasswordField().click();
        loginPage.getPasswordField().type("aaa");
        loginPage.getLoginButton().click();
        Assert.assertTrue(loginPage.getErrorMessage().isPresent());
    }


    //Tests if error shows after entering an email that hasn't been registered
    @Test
    public void testForgotPassword(){
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginPageBase loginPage = homePage.getLoginPage();
        Assert.assertTrue(loginPage.isPageOpened());
        loginPage.getForgotPasswordButton().click();
        loginPage.getLoginField().click();
        loginPage.getLoginField().type("aaa");
        loginPage.getEmailField().click();
        loginPage.getEmailField().type("abc@gmail.com");
        loginPage.getContinueButton().click();
        Assert.assertTrue(loginPage.getErrorMessage().isPresent());
    }
}
