package showable.screens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.InvalidSelectorException;

public class MenuScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").text(\"My Profile\")")
    private AndroidElement profileButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").text(\"Property Rules\")")
    private AndroidElement propertyRulesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").text(\"Link to Account\")")
    private AndroidElement linkToAccountButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").text(\"Help\")")
    private AndroidElement helpButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").text(\"Privacy & Legal\")")
    private AndroidElement privacyAndLegalButton;

    public MenuScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void scroll(){
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
        } catch (InvalidSelectorException e) {

        }
    }

    public boolean profileIsDisplayed() {
        return isElementAvailable(profileButton);
    }

    public boolean rulesIsDisplayed() {
        return isElementAvailable(propertyRulesButton);
    }

    public boolean linkToAccountIsDisplayed() {
        return isElementAvailable(linkToAccountButton);
    }

    public boolean helpIsDisplayed() {
        return isElementAvailable(helpButton);
    }

    public boolean privacyAndLegalIsDisplayed() {
        return isElementAvailable(privacyAndLegalButton);
    }

    public PrivacyAndLegalScreen goToPrivacyScreen() {
        if (this.isElementAvailable(privacyAndLegalButton, 25)){
            click(privacyAndLegalButton);
        }
        return new PrivacyAndLegalScreen(driver);
    }

}

