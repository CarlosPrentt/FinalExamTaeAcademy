package configuration.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverMobile {
    private final AndroidDriver<AndroidElement> driver;

    /**
     * Constructor method.
     */

    public DriverMobile(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    /**
     * Allows to get the WebDriver.
     * @return WebDriver
     */
    public AndroidDriver<AndroidElement> getDriver() {
        return this.driver;
    }
}
