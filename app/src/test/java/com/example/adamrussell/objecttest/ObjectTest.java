package com.example.adamrussell.objecttest;

import org.junit.Test;

import static org.junit.Assert.*;



import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;



public class   ObjectTest{

    private AndroidDriver driver;

    @Before
    public void testCaseSetupEM()throws  Exception
    {

        DesiredCapabilities capabilities=new DesiredCapabilities();
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
        driver = new AndroidDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub	"),capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);



    }




    @Test

    public void testCaseLogin() throws  Exception

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

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }




}
