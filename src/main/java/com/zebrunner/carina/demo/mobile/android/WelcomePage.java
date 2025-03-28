package com.zebrunner.carina.demo.mobile.android;

import com.zebrunner.carina.demo.mobile.common.WelcomePageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends WelcomePageBase {

    @FindBy (id="productTV")
    private ExtendedWebElement text;

    @FindBy (id="start5IV")
    private ExtendedWebElement ratingButton;

    @FindBy (id="closeBt")
    private ExtendedWebElement closeRatingInfoButton;

    @FindBy(id="twitterIV")
    private ExtendedWebElement twitterButton;

    @FindBy(id="menuIV")
    private ExtendedWebElement menuButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Product Price']")
    private ExtendedWebElement firstItemPriceLabel;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Login Menu Item']")
    private ExtendedWebElement loginButton;

    @FindBy (xpath = "(//android.widget.ImageView[@content-desc='Product Image'])")
    private ExtendedWebElement firstItemImage;

    @FindBy (xpath = "//android.widget.TextView[@content-desc='Product Title']")
    private ExtendedWebElement firstItemName;

    @FindBy(id="sortIV")
    private ExtendedWebElement sortButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Price - Descending']")
    private ExtendedWebElement sortPriceDescendingButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Price - Ascending']")
    private ExtendedWebElement sortPriceAscendingButton;

    public boolean isFirstElementPriceCorrect(String expectedPrice){
        return firstItemPriceLabel.getText().equals(expectedPrice);
    }

    public void sortItemsByPriceDescending(){
        sortButton.click();
        sortPriceDescendingButton.click();
    }

    public String getProductPrice(){
        return firstItemPriceLabel.getText();
    }

    public String getProductName(){
        return firstItemName.getText();
    }

    public void sortItemsByPriceAscending(){
        sortButton.click();
        sortPriceAscendingButton.click();
    }

    public void rateAPRoduct(){
        ratingButton.click();
    }

    public LoginPage goToLoginPage(){
        menuButton.click();
        loginButton.click();
        return new LoginPage(driver);
    }

    public ProductPage goToProductPage(){
        firstItemImage.click();
        return new ProductPage(driver);
    }


    public boolean isReviewSubmittedPopupVisible(){
        return closeRatingInfoButton.isPresent();
    }

    public WelcomePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(text);
    }
}
