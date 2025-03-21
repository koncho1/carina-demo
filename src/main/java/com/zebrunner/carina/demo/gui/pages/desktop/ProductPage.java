package com.zebrunner.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.demo.gui.pages.common.ProductPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends ProductPageBase {

    @FindBy (xpath = "//h1[contains(@class, 'productname')]//span")
    private ExtendedWebElement productName;

    @FindBy (xpath = "//input[contains(@name, 'quantity')]")
    private ExtendedWebElement itemQuantity;

    public ExtendedWebElement getItemQuantity(){
        return this.itemQuantity;
    }

    @FindBy (xpath = "//span[contains(@class, 'total-price')]")
    private ExtendedWebElement totalPrice;

    public ExtendedWebElement getTotalPrice(){
        return this.totalPrice;
    }

    public ExtendedWebElement getProductName(){
        return this.productName;
    }

    public ProductPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(productName);
    }
}
