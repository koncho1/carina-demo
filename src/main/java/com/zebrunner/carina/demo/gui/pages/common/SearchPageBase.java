package com.zebrunner.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SearchPageBase extends AbstractPage {

    private ExtendedWebElement sectionText;

    private ExtendedWebElement keywordField;

    private ExtendedWebElement noProductMessage;

    public abstract ExtendedWebElement getNoProductMessage();

    public abstract ExtendedWebElement getKeywordField();

    public SearchPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }
    @Override
    public void open() {
        super.open();
    }
}
