package utils.mobile;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {

    private static final ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();

    private AndroidDriverManager(){}

    public static AndroidDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(AndroidDriver driver){
        AndroidDriverManager.driver.set(driver);
    }

}
