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
public class Swip extends AppiumTesting{
    public static void main(String[] args) throws MalformedURLException{
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
    driver.findElement(By.xpath("//*[@content-desc='9']")).click();
    //SWIP
    TouchAction t = new TouchAction(driver);
    //Long Press //on element//2 sec// ove to another element and you release
    WebElement first =driver.findElement(By.xpath("//*[@content-desc='15']"));
    WebElement second =driver.findElement(By.xpath("//*[@content-desc='45']"));
    t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();

    
}
}
