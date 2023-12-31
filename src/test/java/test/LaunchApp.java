package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LaunchApp {
    public static void main(String[] args) {
        AppiumDriver<MobileElement>  appiumDriver = null;
        Exception exception = null;
        try {
            // Desired Capabilities
            DesiredCapabilities desiredCaps = new DesiredCapabilities();
            desiredCaps.setCapability("platformName", "Android");
            desiredCaps.setCapability("automationName", "uiautomator2");
            desiredCaps.setCapability("udid", "3300d7d864c3a331");
            desiredCaps.setCapability("appPackage", "com.yourrentals");
            desiredCaps.setCapability("appActivity", "com.yourrentals.MainActivity");
            // Init appium session
            URL appiumServer = new URL("http://localhost:4723/wd/hub");
            appiumDriver = new AndroidDriver<MobileElement>(appiumServer,desiredCaps);

            Thread.sleep(3000);
        } catch (Exception e){
            exception = e;
        }
        if(appiumDriver == null){
            throw   new RuntimeException(exception.getMessage());
        }
    }
}
