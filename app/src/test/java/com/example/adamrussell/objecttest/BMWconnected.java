package com.example.adamrussell.objecttest;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.common.TestObject;
import org.testobject.appium.junit.TestObjectAppiumSuite;
import org.testobject.appium.junit.TestObjectTestResultWatcher;
import org.openqa.selenium.By;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.common.TestObject;
import org.testobject.appium.junit.TestObjectAppiumSuite;
import org.testobject.appium.junit.TestObjectTestResultWatcher;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by adamrussell on 03/05/16.
 */


@TestObject(testObjectApiKey = "E002DE1B7D3E4E51B42FC502863F8215", testObjectSuiteId = 7)
@RunWith(TestObjectAppiumSuite.class)



public class BMWconnected {


    private AndroidDriver driver;


    @Rule
    public TestName testName = new TestName();

    @Rule
    public TestObjectTestResultWatcher resultWatcher = new TestObjectTestResultWatcher();

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("testobject_api_key", resultWatcher.getApiKey());
        capabilities.setCapability("testobject_test_report_id", resultWatcher.getTestReportId());
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("appPackage", "com.bmw.remote");
        capabilities.setCapability("fullReset", "true");
        driver = new AndroidDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub	"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        resultWatcher.setAppiumDriver(driver);


    }


    @Test

    public void testCaseLogin1() throws Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("Bic12kayak");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/selectVehicleBtn\").text(\"Select\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Status\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Maps\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().descriptionContains(\"More options\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/title\").text(\"Settings\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/settingsItemSubtitle\").text(\"Metric\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"English\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.scrollTo("REMOTE CONTROL");
        //       driver.tap(1, driver.findElement(By.id("com.bmw.remote:id/deactivateDepartureTimeButton")), 2000);
        //       TimeUnit.SECONDS.sleep(45);

        //      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
        //      driver.longPressKeyCode(1);
        //      TimeUnit.SECONDS.sleep(10);


    }

    @Test

    public void testCaseLogin2() throws Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("Bic12kayak");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/selectVehicleBtn\").text(\"Select\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Status\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Maps\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().descriptionContains(\"More options\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/title\").text(\"Settings\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/settingsItemSubtitle\").text(\"Metric\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"English\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.scrollTo("REMOTE CONTROL");


    }

    public void testCaseLogin3() throws Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("Bic12kayak");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/selectVehicleBtn\").text(\"Select\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Status\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Maps\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().descriptionContains(\"More options\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/title\").text(\"Settings\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/settingsItemSubtitle\").text(\"Metric\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"English\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.scrollTo("REMOTE CONTROL");


    }

    public void testCaseLogin4() throws Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("Bic12kayak");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/selectVehicleBtn\").text(\"Select\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Status\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Maps\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().descriptionContains(\"More options\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/title\").text(\"Settings\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/settingsItemSubtitle\").text(\"Metric\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"English\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.scrollTo("REMOTE CONTROL");


    }

    public void testCaseLogin5() throws Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("Bic12kayak");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/selectVehicleBtn\").text(\"Select\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Status\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Maps\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();


        driver.findElementByAndroidUIAutomator("new UiSelector().descriptionContains(\"More options\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/title\").text(\"Settings\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/settingsItemSubtitle\").text(\"Metric\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"English\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/heroTabText\").text(\"Remote\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/menuHistory\")").click();
//      driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.scrollTo("REMOTE CONTROL");


    }
}

