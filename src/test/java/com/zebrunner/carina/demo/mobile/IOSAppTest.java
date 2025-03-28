package com.zebrunner.carina.demo.mobile;

import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/*public class IOSAppTest implements IAbstractTest {
    @Test
    public void TestProductRatingFromMainPage(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        welcomePage.rateAPRoduct();
        Assert.assertTrue(welcomePage.isReviewSubmittedPopupVisible());
    }

    @Test
    public void TestLoginWithoutCredentials(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        LoginPage loginPage= welcomePage.goToLoginPage();
        loginPage.submitCredentials();
        Assert.assertTrue(loginPage.isUsernameErrorPresent());

    }

    @Test
    public void TestLoginWithoutPassword(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        LoginPage loginPage= welcomePage.goToLoginPage();
        loginPage.enterLogin("abc");
        loginPage.submitCredentials();
        Assert.assertTrue(loginPage.isPasswordErrorPresent());
    }

    @Test
    public void TestLockedOutUser(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        LoginPage loginPage= welcomePage.goToLoginPage();
        loginPage.enterLogin("alice@example.com");
        loginPage.enterPassword("123");
        loginPage.submitCredentials();
        Assert.assertTrue(loginPage.isUserLockedOutTextPresent());

    }

    @Test
    public void TestSortItemsByPriceDescending(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        Assert.assertTrue(welcomePage.isFirstElementPriceCorrect("$ 29.99"));
        welcomePage.sortItemsByPriceDescending();
        Assert.assertTrue(welcomePage.isFirstElementPriceCorrect("$ 49.99"));
    }

    @Test
    public void TestSortItemsByPriceAscending(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        Assert.assertTrue(welcomePage.isFirstElementPriceCorrect("$ 29.99"));
        welcomePage.sortItemsByPriceAscending();
        Assert.assertTrue(welcomePage.isFirstElementPriceCorrect("$ 7.99"));
    }

    @Test
    public void TestOpenProductPage(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        ProductPage productPage = welcomePage.goToProductPage();
        Assert.assertTrue(productPage.isPageOpened());
    }

    @Test
    public void TestPriceHomePageMatchesPriceProductPage(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        String homePagePrice= welcomePage.getProductPrice();
        ProductPage productPage = welcomePage.goToProductPage();
        Assert.assertTrue(productPage.isPageOpened());
        String productPagePrice= productPage.getProductPrice();
        Assert.assertEquals(productPagePrice,homePagePrice);
    }

    @Test
    public void TestProductNameHomePageMatchesNameProductPage(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        String homePageName= welcomePage.getProductName();
        ProductPage productPage = welcomePage.goToProductPage();
        Assert.assertTrue(productPage.isPageOpened());
        String productPageName= productPage.getProductName();
        Assert.assertEquals(productPageName,homePageName);
    }

    @Test
    public void TestRateProductFromProductPage(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened());
        ProductPage productPage = welcomePage.goToProductPage();
        Assert.assertTrue(productPage.isPageOpened());
        productPage.rate3starts();
        Assert.assertTrue(productPage.isReviewSent());
    }
}*/
