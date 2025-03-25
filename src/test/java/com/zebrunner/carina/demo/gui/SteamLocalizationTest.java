package com.zebrunner.carina.demo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.pages.desktop.SteamHomePage;
import com.zebrunner.carina.demo.gui.pages.desktop.SteamLocalePage;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.config.WebDriverConfiguration;
import com.zebrunner.carina.utils.resources.L10N;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Locale;

public class SteamLocalizationTest implements IAbstractTest {

    @BeforeClass
    public void testLocaleLoad() {
        Locale locale = L10N.getLocale();
        String loadedLocale = locale.getLanguage() + "_" + locale.getCountry();
        String configLocale = Configuration.getRequired(WebDriverConfiguration.Parameter.LOCALE);
        Assert.assertEquals(loadedLocale, configLocale);
    }

    @Test(dataProvider = "lang")
    public void DownloadButtonTextTest(String locale){
        SteamHomePage steamPage =new SteamHomePage(getDriver());
        steamPage.open();
        Assert.assertTrue(steamPage.isPageOpened(), "Home page is not opened");
        L10N.setLocale(locale);
        L10N.load();
        SteamLocalePage steamLocalePage= steamPage.goToSteamLocalePage(getDriver());
        Assert.assertEquals(L10N.getText("SteamLocalePage.downloadButton"),steamLocalePage.getDownloadButtonText());
        L10N.assertAll();
    }

    @Test(dataProvider = "lang")
    public void TopMenuTest(String locale){
        SteamHomePage steamPage =new SteamHomePage(getDriver());
        steamPage.open();
        Assert.assertTrue(steamPage.isPageOpened(), "Home page is not opened");
        L10N.setLocale(locale);
        L10N.load();
        SteamLocalePage steamLocalePage= steamPage.goToSteamLocalePage(getDriver());
        Assert.assertEquals(L10N.getText("SteamLocalePage.supportSelector"),steamLocalePage.getSupportSelectorText());
        Assert.assertEquals(L10N.getText("SteamLocalePage.aboutSelector").toUpperCase(),steamLocalePage.getAboutSelectorText());
        Assert.assertEquals(L10N.getText("SteamLocalePage.communitySelector"),steamLocalePage.getCommunitySelectorText());
    }

    @Test(dataProvider = "lang")
    public void LoginButtonTest(String locale){
        SteamHomePage steamPage =new SteamHomePage(getDriver());
        steamPage.open();
        Assert.assertTrue(steamPage.isPageOpened(), "Home page is not opened");
        L10N.setLocale(locale);
        L10N.load();
        SteamLocalePage steamLocalePage= steamPage.goToSteamLocalePage(getDriver());
        Assert.assertEquals(L10N.getText("SteamLocalePage.loginButton"),steamLocalePage.getLoginButtonText());
    }

    @Test(dataProvider = "lang")
    public void ContentTitleLabelTest(String locale){
        SteamHomePage steamPage =new SteamHomePage(getDriver());
        steamPage.open();
        Assert.assertTrue(steamPage.isPageOpened(), "Home page is not opened");
        L10N.setLocale(locale);
        L10N.load();
        SteamLocalePage steamLocalePage= steamPage.goToSteamLocalePage(getDriver());
        Assert.assertEquals(L10N.getText("SteamLocalePage.contentTitleLabel"),steamLocalePage.getContentTitleLabelText());
    }

    @Test(dataProvider = "lang")
    public void PageTitleTest(String locale){
        SteamHomePage steamPage =new SteamHomePage(getDriver());
        steamPage.open();
        Assert.assertTrue(steamPage.isPageOpened(), "Home page is not opened");
        L10N.setLocale(locale);
        L10N.load();
        SteamLocalePage steamLocalePage= steamPage.goToSteamLocalePage(getDriver());
        Assert.assertEquals(steamLocalePage.getTitle(),L10N.getText("SteamLocalePage.pageTitle"));
    }

    @DataProvider(name = "lang")
    public Object[][] provideLocale() {
        return new Object[][] {
                {"en_US"},
                {"fr_FR"},
                {"it_IT"},
        };
    }

}
