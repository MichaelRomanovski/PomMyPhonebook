import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumConfiguration {


    //          "platformName": "Android",
//          "deviceName": "Xiaomi 221113117PG",
//          "platformVersion": "13.0",
//          "appPackage": "com.sheygam.contactapp",
//          "appActivity": ".SplashActivity"

    public static AppiumDriver<MobileElement>mobileDriver;


    @BeforeSuite
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Xiaomi 221113117PG");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("appPackage", "com.sheygam.contactapp");
        capabilities.setCapability("appActivity", ".SplashActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/Artem Sokolov/Downloads/contacts-android.apk");
        mobileDriver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }


    @AfterSuite
    public void closeapp() {
        mobileDriver.quit();

    }


}

