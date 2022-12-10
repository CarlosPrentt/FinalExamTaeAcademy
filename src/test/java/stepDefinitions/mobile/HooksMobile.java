package stepDefinitions.mobile;

import configuration.mobile.ConfigCapabilities;
import configuration.mobile.DriverMobile;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HooksMobile {
    private static DriverMobile driver;

    /**
     * Before hook for initializing the driver.
     */
    @Before
    public void environmentSetUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ConfigCapabilities.deviceSetUp(capabilities);
        ConfigCapabilities.applicationSetUp(capabilities);
        try {
            driver = new DriverMobile(new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * After hook for closing the app.
     */
    @After
    public void mobileApplicationEnd() {
        driver.getDriver().quit();
    }

    /**
     * Allow to get the current driver instance.
     * @return Current AndroidDriver instance
     */
    public static AndroidDriver<AndroidElement> getDriver() {
        return driver.getDriver();
    }
}
