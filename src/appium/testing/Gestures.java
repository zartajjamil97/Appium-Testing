/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appium.testing;

import static appium.testing.AppiumTesting.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author zartaj.jamil
 */
public class Gestures extends AppiumTesting{
    public static void main(String[] args) throws MalformedURLException, InterruptedException{
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
    //Tap
    TouchAction t = new TouchAction(driver);
    WebElement expendList=driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
    t.tap(tapOptions().withElement(element(expendList))).perform();
    //LongPress
    driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
    WebElement pm =driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));

    t.longPress(longPressOptions().withElement(element(pm)).withDuration(ofSeconds(2))).release().perform();
    //Thread.sleep(2000);
    System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
    driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']")).click();
    
}
}
