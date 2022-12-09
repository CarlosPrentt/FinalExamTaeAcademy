package stepDefinitions.web;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHook {
    protected static ChromeDriver driver;

    public static ChromeDriver getDriver(){
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
    public void closeBrowser(){
        driver.close();
    }


}
