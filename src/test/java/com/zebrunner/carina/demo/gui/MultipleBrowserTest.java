package com.zebrunner.carina.demo;
import com.zebrunner.carina.core.IAbstractTest;

import com.zebrunner.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.ChromeCapabilities;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleBrowserTest implements IAbstractTest {

    @Test
    public void multipleBrowserTest() {
        HomePageBase chromeHomePage = initPage(getDriver("chrome", new ChromeCapabilities().getCapability("Chrome Test")), HomePageBase.class);
        chromeHomePage.open();
        Assert.assertTrue(chromeHomePage.isPageOpened(), "Chrome home page is not opened!");
        chromeHomePage.clickAddToCartButton();
        chromeHomePage.clickAddToCartButton();
        chromeHomePage.clickAddToCartButton();
        Assert.assertTrue(chromeHomePage.isCartItemCountCorrect("3"));

        HomePageBase firefoxHomePage = initPage(getDriver("firefox",
                new FirefoxCapabilities().getCapability("Firefox Test")), HomePageBase.class);
        firefoxHomePage.open();
        Assert.assertTrue(firefoxHomePage.isPageOpened(), "Firefox home page is not opened!");
        firefoxHomePage.clickAddToCartButton();
        firefoxHomePage.clickAddToCartButton();
        firefoxHomePage.clickAddToCartButton();
        Assert.assertTrue(firefoxHomePage.isCartItemCountCorrect("3"));
    }
}

