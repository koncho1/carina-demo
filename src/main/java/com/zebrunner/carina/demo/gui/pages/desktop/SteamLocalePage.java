package com.zebrunner.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.checkerframework.checker.i18n.qual.Localized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SteamLocalePage extends AbstractPage {

    @Localized
    @FindBy (xpath = "//a[contains(@class, 'global_action_link')]")
    ExtendedWebElement loginButton;

    @Localized
    @FindBy (xpath = "//a[contains(text(), '{L10N:SteamLocalePage.storeSelector}')]")
    ExtendedWebElement shopSelector;

    @Localized
    @FindBy (xpath = "//a[contains(text(), '{L10N:SteamLocalePage.communitySelector}')]")
    ExtendedWebElement communitySelector;

    @Localized
    @FindBy (xpath = "//div[contains(@class, 'supernav_container')]//a[contains(text(), '{L10N:SteamLocalePage.aboutSelector}')]")
    ExtendedWebElement aboutSelector;

    @Localized
    @FindBy (xpath = "//a[contains(text(), '{L10N:SteamLocalePage.supportSelector}')]")
    ExtendedWebElement supportSelector;

    @Localized
    @FindBy (xpath = "//h2[contains(@class, 'home_page_content_title')]")
    ExtendedWebElement contentTitleLabel;

    @Localized
    @FindBy (xpath = "//div[contains(@class, 'header_installsteam_btn_content')]")
    ExtendedWebElement downloadButton;

    public SteamLocalePage(WebDriver driver) {
        super(driver);
    }

    public String getDownloadButtonText(){
      return downloadButton.getText();
    }

    public String getSupportSelectorText(){
        return supportSelector.getText();
    }

    public String getAboutSelectorText(){
        return aboutSelector.getText();
    }

    public String getCommunitySelectorText(){
        return communitySelector.getText();
    }

    public String getShopSelectorText(){
        return shopSelector.getText();
    }

    public String getLoginButtonText(){
        return loginButton.getText();
    }

    public String getContentTitleLabelText(){
        return contentTitleLabel.getText();
    }

}
