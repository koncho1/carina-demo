/*******************************************************************************
 * Copyright 2020-2023 Zebrunner Inc (https://www.zebrunner.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.zebrunner.carina.demo.gui.pages.desktop;

import java.lang.invoke.MethodHandles;
import java.util.List;

import com.zebrunner.carina.demo.gui.components.ShopItem;
import com.zebrunner.carina.demo.gui.pages.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//div[contains(@class, 'thumbnails list-inline')]//div")
    private List<ShopItem> itemsList;

    public List<ShopItem> getItemsList(){
        return this.itemsList;
    }

    @FindBy(xpath = "//a[contains(@class, 'dropdown-toggle')]")
    private ExtendedWebElement button;

    @FindBy(xpath = "//ul[contains(@class, 'dropdown-menu currency')]")
    private List<ExtendedWebElement> currencyList;

    public List<ExtendedWebElement> getCurrencyList(){
        return this.currencyList;
    }

    @FindBy (xpath = "//i[contains(@class, 'fa fa-cart-plus fa-fw')]")
    private ExtendedWebElement addToCartButton;

    public ExtendedWebElement getAddToCartButton(){
        return this.addToCartButton;
    }

    @FindBy (xpath = "//div[contains(@class, 'block_7')]//span[contains(@class , 'label label-orange font14')]")
    private ExtendedWebElement cartItemCount;

    public ExtendedWebElement getCartItemCount(){
        return this.cartItemCount;
    }

    @FindBy (xpath = "//span[contains(@class, 'cart_total')]")
    private ExtendedWebElement cartTotal;

    public ExtendedWebElement getCartTotal(){
        return this.cartTotal;
    }

    @FindBy(xpath = "//div[contains(@class, 'navbar-header header-logo')]")
    private ExtendedWebElement logo;

    public ExtendedWebElement getButton(){
        return this.button;
    }

    @FindBy (xpath="//a[text()='Login or register']")
    private ExtendedWebElement loginButton;

    @FindBy (xpath = "//input[contains(@name, 'filter_keyword')]")
    private ExtendedWebElement searchField;

    @FindBy (xpath = "//i[contains(@class, 'fa fa-search')]")
    private ExtendedWebElement searchButton;

    public ExtendedWebElement getLoginButton(){
        return this.loginButton;
    }

    public LoginPage getLoginPage(){
        loginButton.click();
        return new LoginPage(driver);
    }

    public SearchPage getSearchPage(String searchText){
        searchField.click();
        searchField.type(searchText);
        searchButton.click();
        return new SearchPage(driver);
    }





    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(logo);
    }





}
