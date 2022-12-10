package stepDefinitions.web;

import configuration.mobile.ConfigCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    protected static ChromeDriver driver;


    public static ChromeDriver getDriver() {
        return driver;
    }

    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud\n");
        driver.manage().window().maximize();
    }


    @After
    public void closeBrowser() {
        driver.close();
    }


}
