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
public class Drag_Drop extends AppiumTesting{
    public static void main(String[] args) throws MalformedURLException{
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); 
    driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
    TouchAction t = new TouchAction(driver);
    //Long Press //move// release into destination
    WebElement first =driver.findElements(By.className("android.view.View")).get(0);
    WebElement second =driver.findElements(By.className("android.view.View")).get(2);
    t.longPress(longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();
    //t.longPress(element(first)).moveTo(element(second)).release().perform();

    
}
    }

