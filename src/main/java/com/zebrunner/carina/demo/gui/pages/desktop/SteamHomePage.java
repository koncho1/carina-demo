package com.zebrunner.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.config.WebDriverConfiguration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Locale;

public class SteamHomePage extends AbstractPage {

    @FindBy(xpath = "//span[contains(@class, 'pulldown global_action_link')]")
    ExtendedWebElement languageSelector;

    @FindBy(xpath = "//div[contains(@id, 'language_dropdown')]//div//a")
    List<ExtendedWebElement> langList;

    public SteamHomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://store.steampowered.com/");
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
    }

    public SteamLocalePage goToSteamLocalePage(WebDriver driver){
        openLangList();
        if (!langList.isEmpty()) {
            for (ExtendedWebElement languageBtn : langList) {
                String localeStr = Configuration.getRequired(WebDriverConfiguration.Parameter.LOCALE);
                Locale locale = parseLocale(localeStr);
                if(languageBtn.getText().equals("Zgłoś problem z tłumaczeniem")){
                    break;
                }
                String lang=(languageBtn.getAttribute("onclick").replaceAll("[^']*(?:'(.*?)')?.*", "$1").substring(0,2));
                if (lang.equals(locale.getLanguage())) {
                    languageBtn.click();
                    return new SteamLocalePage(driver);
                }
            }
        }
        throw new RuntimeException("No language ref was found");
    }

    public void openLangList(){
        languageSelector.click();
    }



    private Locale parseLocale(String localeToParse) {
        String[] localeSetttings = localeToParse.trim().split("_");
        String lang, country = "";
        lang = localeSetttings[0];
        if (localeSetttings.length > 1) {
            country = localeSetttings[1];
        }

        return new Locale(lang, country);
    }


}
