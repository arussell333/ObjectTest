package com.example.adamrussell.objecttest;

/**
 * Created by adamrussell on 03/05/16.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;


/**
 * Created by adamrussell on 03/05/16.
 */

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;



public class   ChargeNowTest {

    private AndroidDriver driver;

    @Before
    public void testCaseSetupEM()throws  Exception
    {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "LT25i");
        capabilities.setCapability("plafformVersion", "4.4.4");
        capabilities.setCapability("app", ("/Users/adamrussell/Downloads/ChargeNow_v1.1.1.apk"));
        capabilities.setCapability("appPackage", "com.chargenow.client");
        capabilities.setCapability("fullReset", "true");
        capabilities.setCapability("appActivity", "com.bmw.chargenow.ui.activity.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);



    }




    @Test

    public void testCaseLogin() throws  Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/dismiss_button\").text(\"Got it!\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"Satellite View\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"List View\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"Filter Options\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();


    }



    @Test

    public void mapFunctions() throws  Exception

    {
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/dismiss_button\").text(\"Got it!\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/list_poi\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/right_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/login_button\").text(\"Login\")").click();


    }




    @After
    public void tearDown() throws Exception {
        driver.quit();
    }




}