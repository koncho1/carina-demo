package com.zebrunner.carina.demo.mobile.android;

import com.zebrunner.carina.demo.mobile.common.ProductPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends ProductPageBase {

    @FindBy (id="productTV")
    private ExtendedWebElement productNameText;

    @FindBy (id="start3IV")
    private ExtendedWebElement rating3starButton;

    @FindBy (id="sortTV")
    private ExtendedWebElement reviewFinishText;

    @FindBy (id="priceTV")
    private ExtendedWebElement productPriceText;

    public String getProductPrice(){
        return productPriceText.getText();
    }

    public String getProductName(){
        return productNameText.getText();
    }

    public void rate3starts(){
        rating3starButton.click();
    }

    public boolean isReviewSent(){
        return reviewFinishText.isPresent();
    }


    public ProductPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productNameText);
    }
}
