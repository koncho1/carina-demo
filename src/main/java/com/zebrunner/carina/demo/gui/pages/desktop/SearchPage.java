package com.zebrunner.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.pages.common.SearchPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class SearchPage extends SearchPageBase {

    @FindBy (xpath = "//span[contains(text(), 'Search')]")
    private ExtendedWebElement sectionText;

    @FindBy (xpath = "//div[contains(@class, 'input-group')]//input")
    private ExtendedWebElement keywordField;

    @FindBy (xpath = "//div[contains(text(), 'There is no product that matches the search criteria.')]")
    private ExtendedWebElement noProductMessage;

    public ExtendedWebElement getNoProductMessage() {
        return noProductMessage;
    }

    public ExtendedWebElement getKeywordField(){
        return this.keywordField;
    }

    public SearchPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(sectionText);
    }
}
