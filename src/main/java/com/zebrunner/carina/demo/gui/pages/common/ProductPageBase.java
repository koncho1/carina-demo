package com.zebrunner.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractPage {

    private ExtendedWebElement productName;

    private ExtendedWebElement itemQuantity;

    public abstract ExtendedWebElement getItemQuantity();

    private ExtendedWebElement totalPrice;

    public abstract ExtendedWebElement getTotalPrice();

    public abstract ExtendedWebElement getProductName();

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }
}
