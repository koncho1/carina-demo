package com.zebrunner.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.pages.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy (xpath = "//span[contains(text(), 'Account Login')]")
    private ExtendedWebElement sectionText;

    @FindBy (xpath = "//input[contains(@name, 'loginname')]")
    private ExtendedWebElement loginField;

    @FindBy (xpath = "//input[contains(@name, 'password')]")
    private ExtendedWebElement passwordField;

    @FindBy (xpath = "//button[contains(@title, 'Login')]")
    private ExtendedWebElement loginButton;

    @FindBy (xpath = "//div[contains(@class, 'alert alert-error alert-danger')]")
    private ExtendedWebElement errorMessage;

    @FindBy (xpath = "//a[contains(text(), 'Forgot your password?')]")
    private ExtendedWebElement forgotPasswordButton;

    @FindBy (xpath = "//input[contains(@name, 'email')]")
    private ExtendedWebElement emailField;

    @FindBy (xpath = "//button[contains(@title, 'Continue')]")
    private ExtendedWebElement continueButton;

    public ExtendedWebElement getContinueButton(){
        return this.continueButton;
    }

    public ExtendedWebElement getEmailField(){
        return this.emailField;
    }

    public ExtendedWebElement getForgotPasswordButton(){
        return this.forgotPasswordButton;
    }

    public ExtendedWebElement getErrorMessage(){
        return this.errorMessage;
    }

    public ExtendedWebElement getLoginButton(){
        return this.loginButton;
    }

    public ExtendedWebElement getPasswordField(){
        return this.passwordField;
    }

    public ExtendedWebElement getLoginField(){
        return this.loginField;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(sectionText);
    }


}
