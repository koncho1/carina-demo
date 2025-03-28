package com.zebrunner.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    public abstract boolean isUserLockedOutTextPresent();

    public abstract void enterLogin(String login);

    public abstract void enterPassword(String password);

    public abstract void submitCredentials();

    public abstract boolean isUsernameErrorPresent();

    public abstract boolean isPasswordErrorPresent();

    @Override
    public void open() {
        super.open();
    }

    public LoginPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }
}
