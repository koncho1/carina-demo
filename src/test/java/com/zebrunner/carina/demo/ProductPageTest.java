package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.gui.components.ShopItem;
import com.zebrunner.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.pages.common.ProductPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductPageTest implements IAbstractTest {


    //Checks if the product page opens properly
    @Test
    public void testClickProduct(){
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        List<ShopItem> items = homePage.getItemsList();
        ProductPageBase productPage = items.get(0).getProductPage();
        Assert.assertTrue(productPage.getProductName().isPresent());
    }


    //Checks if changing the quantity also changes price
    @Test
    public void testChangeQuantityChangePrice(){
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        List<ShopItem> items = homePage.getItemsList();
        ProductPageBase productPage = items.get(0).getProductPage();
        Assert.assertTrue(productPage.getProductName().isPresent());
        ExtendedWebElement itemQuantity = productPage.getItemQuantity();
        Assert.assertEquals(itemQuantity.getAttribute("value"),"1");
        Assert.assertEquals(productPage.getTotalPrice().getText(),"$29.50");
        itemQuantity.click();
        itemQuantity.type("2");
        Assert.assertEquals(itemQuantity.getAttribute("value"),"2");
        Assert.assertEquals(productPage.getTotalPrice().getText(),"$59.00");
    }

}
