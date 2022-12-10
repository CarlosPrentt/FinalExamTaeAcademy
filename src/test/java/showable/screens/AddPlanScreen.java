package showable.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddPlanScreen extends BaseScreen {
    public AddPlanScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/actionSheetItemText\").text(\"Check Dining Availability\")")
    private AndroidElement checkDiningAvailability;

    public boolean diningAvailabilityIsDisplayed() {
        return isElementAvailable(checkDiningAvailability);
    }
}