package com.zebrunner.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    private ExtendedWebElement sectionText;

    public LoginPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    private ExtendedWebElement loginField;

    public abstract ExtendedWebElement getLoginField();

    private ExtendedWebElement passwordField;

    public abstract ExtendedWebElement getPasswordField();

    private ExtendedWebElement loginButton;

    public abstract ExtendedWebElement getLoginButton();

    private ExtendedWebElement errorMessage;

    public abstract ExtendedWebElement getErrorMessage();

    private ExtendedWebElement forgotPasswordButton;

    public abstract ExtendedWebElement getForgotPasswordButton();

    private ExtendedWebElement emailField;

    public abstract ExtendedWebElement getEmailField();

    private ExtendedWebElement continueButton;

    public abstract ExtendedWebElement getContinueButton();

    @Override
    public void open() {
        super.open();
    }

}
