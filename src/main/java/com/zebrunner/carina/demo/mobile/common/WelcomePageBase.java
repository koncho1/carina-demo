package com.zebrunner.carina.demo.mobile.common;

import com.zebrunner.carina.demo.mobile.android.LoginPage;
import com.zebrunner.carina.demo.mobile.android.ProductPage;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WelcomePageBase extends AbstractPage {

    public abstract boolean isFirstElementPriceCorrect(String expectedPrice);

    public abstract void sortItemsByPriceDescending();

    public abstract void sortItemsByPriceAscending();

    public abstract void rateAPRoduct();

    public abstract LoginPage goToLoginPage();

    public abstract ProductPage goToProductPage();

    @Override
    public void open() {
        super.open();
    }

    public WelcomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

}
