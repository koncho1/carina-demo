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
package com.zebrunner.carina.demo.gui.pages.common;

import com.zebrunner.carina.demo.gui.components.ShopItem;
import com.zebrunner.carina.demo.gui.pages.desktop.LoginPage;
import com.zebrunner.carina.demo.gui.pages.desktop.SearchPage;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

import java.util.List;

public abstract class HomePageBase extends AbstractPage {


    public HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    private ExtendedWebElement loginButton;

    private List<ShopItem> itemsList;

    public abstract List<ShopItem> getItemsList();

    private ExtendedWebElement searchButton;

    public abstract ExtendedWebElement getLoginButton();

    public abstract LoginPage getLoginPage();

    public abstract SearchPage getSearchPage(String searchText);

    private ExtendedWebElement button;

    private ExtendedWebElement cartTotal;

    private List<ExtendedWebElement> currencyList;

    private ExtendedWebElement addToCartButton;

    private ExtendedWebElement cartItemCount;

    public abstract ExtendedWebElement getCartItemCount();

    public abstract ExtendedWebElement getCartTotal();

    public abstract ExtendedWebElement getAddToCartButton();

    public abstract List<ExtendedWebElement> getCurrencyList();

    public abstract ExtendedWebElement getButton();

    @Override
    public void open() {
        super.open();
    }

}
