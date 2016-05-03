package com.example.adamrussell.objecttest;


import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;



import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.rules.TestName;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.junit.TestObjectTestResultWatcher;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;




/**
 * Created by adamrussell on 03/05/16.
 */




public class WatcherTestSetup {


    /* This is the key piece of our test, since it allows us to
   * connect to the device we will be running the app onto.*/
    private AndroidDriver driver;

    /* Sets the test name to the name of the test method. */
    @Rule
    public TestName testName = new TestName();

    /* Takes care of sending the result of the tests over to TestObject. */
    @Rule
    public TestObjectTestResultWatcher resultWatcher = new TestObjectTestResultWatcher();

    /* This is the setup that will be run before the test. */
    @Before
    public void setUp() throws Exception {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("testobject_api_key", "E002DE1B7D3E4E51B42FC502863F8215");
        capabilities.setCapability("testobject_app_id", "1");
        capabilities.setCapability("testobject_device", "LG_Nexus_4_E960_real");
        capabilities.setCapability("automationName", "appium");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("deviceName", "Android Emulator");
//		capabilities.setCapability("plafformVersion", "5.1.1");
//		capabilities.setCapability("app", ("/Users/adamrussell/Downloads/My_BMW_Remote.apk"));
        capabilities.setCapability("appPackage", "com.bmw.remote");
        //capabilities.setCapability("noReset", "true");
        capabilities.setCapability("appActivity", "base.ui.commonwidgets.StartupActivity");
        driver = new AndroidDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub	"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        /* IMPORTANT! We need to provide the Watcher with our initialized AppiumDriver */
        resultWatcher.setAppiumDriver(driver);


    }

    @Test
    public void testMethod()

    {


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("Bic12kayak");
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");





    }

}
