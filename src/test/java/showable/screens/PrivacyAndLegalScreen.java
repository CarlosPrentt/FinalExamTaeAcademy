package showable.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PrivacyAndLegalScreen extends BaseScreen {

    public PrivacyAndLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").text(\"Privacy Policy\")")
    private AndroidElement privacyPolicyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").text(\"Terms of Use\")")
    private AndroidElement termsOfUseButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").text(\"Supplemental Terms and Conditions\")")
    private AndroidElement supplementalTermsAndConditionsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").text(\"Legal Notices\")")
    private AndroidElement legalNoticesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").text(\"Property Rules\")")
    private AndroidElement propertyRulesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").text(\"Electronic Communications Disclosure\")")
    private AndroidElement electronicCommunicationsDisclosureButton;

    public boolean privacyPolicyIsDisplayed() {
        return isElementAvailable(privacyPolicyButton);
    }

    public boolean termsOfUseIsDisplayed() {
        return isElementAvailable(termsOfUseButton);
    }

    public boolean supplementalTermsIsDisplayed() {
        return isElementAvailable(supplementalTermsAndConditionsButton);
    }

    public boolean legalNoticesIsDisplayed() {
        return isElementAvailable(legalNoticesButton);
    }

    public boolean propertyRulesIsDisplayed() {
        return isElementAvailable(propertyRulesButton);
    }

    public boolean electronicCommunicationsIsDisplayed() {
        return isElementAvailable(electronicCommunicationsDisclosureButton);
    }

}
