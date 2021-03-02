/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appium.testing;

import static appium.testing.AppiumTesting.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author zartaj.jamil
 */
public class Uiautomatortest extends AppiumTesting{
    public static void main(String[] args) throws MalformedURLException{
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.findElementByAndroidUIAutomator("attribute("value")");
    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
    
 //Validate Clickable options for all options
    
    //driver.findElementByAndroidUIAutomator("new UiSelector().property(value)");
    System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    
    }
}
