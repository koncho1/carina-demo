package com.zebrunner.carina.demo.mobile.android;

import com.zebrunner.carina.demo.mobile.common.LoginPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginPageBase {

    @FindBy(id="loginTV")
    private ExtendedWebElement loginTextLabel;

    @FindBy(id="loginBtn")
    private ExtendedWebElement loginButton;

    @FindBy(id="nameET")
    private ExtendedWebElement loginInput;

    @FindBy(id="passwordET")
    private ExtendedWebElement passwordInput;

    @FindBy(id="nameErrorTV")
    private ExtendedWebElement usernameErrorText;

    @FindBy(id="passwordErrorTV")
    private ExtendedWebElement passwordErrorText;

    public boolean isUserLockedOutTextPresent(){
        return passwordErrorText.getText().equals("Sorry this user has been locked out.");
    }

    public void enterLogin(String login){
        loginInput.click();
        loginInput.type(login);
    }

    public void enterPassword(String password){
        passwordInput.click();
        passwordInput.type(password);
    }

    public void submitCredentials(){
        loginButton.click();
    }

    public boolean isUsernameErrorPresent(){
        return usernameErrorText.isPresent();
    }

    public boolean isPasswordErrorPresent(){
        return passwordErrorText.isPresent();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(loginTextLabel);
    }
}
