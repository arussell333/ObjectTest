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

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by adamrussell on 03/05/16.
 */

@TestObject(testObjectApiKey = "E002DE1B7D3E4E51B42FC502863F8215", testObjectSuiteId = 7)
@RunWith(TestObjectAppiumSuite.class)



public class CompleteTestSetup {


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
        capabilities.setCapability("testobject_device", "LG_Nexus_4_E960_real");
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("appPackage", "com.bmw.remote");
        capabilities.setCapability("appActivity", "base.ui.commonwidgets.StartupActivity");
        driver = new AndroidDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub	"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        resultWatcher.setAppiumDriver(driver);


    }


    @Test
    public void testMethod()

    {


        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("********@gmail.com");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/password\")").sendKeys("********");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/login_btn\").text(\"Login\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/pinKeyboardView\")").sendKeys("");


    }
}
